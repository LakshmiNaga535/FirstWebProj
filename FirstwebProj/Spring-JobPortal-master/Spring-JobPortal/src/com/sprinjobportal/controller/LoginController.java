/**
 * 
 */
package com.sprinjobportal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sprinjobportal.model.ErrorDO;
import com.sprinjobportal.model.UserBO;



/**
 * @author Viresh
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model, HttpSession session){
		System.out.println("LoginController.login()");	
		model.addAttribute("user",new UserBO());
		return "login";
	}
	
	@RequestMapping(value="/submit", method = RequestMethod.POST)
	public String submitLogin(Model model, HttpSession httpSession , @ModelAttribute(value="user") UserBO userBO){
		System.out.println(userBO);
		if("admin".equals(userBO.getUserName()) && "admin123".equals(userBO.getPassword())){
			httpSession.setAttribute("sessionuser", "userBO");
			return "adminIndex";
		}
		ErrorDO errorDO = new ErrorDO();
		errorDO.setUiErrorMessage("User Name or Password is invalid try login again");
		model.addAttribute("errors", errorDO);	
		return "login";
	}
}
