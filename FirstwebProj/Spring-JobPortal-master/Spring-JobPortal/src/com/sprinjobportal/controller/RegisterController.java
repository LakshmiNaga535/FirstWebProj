/**
 * 
 */
package com.sprinjobportal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sprinjobportal.bean.UserBean;
import com.sprinjobportal.dao.IUserDAO;
import com.sprinjobportal.model.RegistrationBO;

/**
 * @author Viresh
 *
 */
@Controller
public class RegisterController {
	@Autowired
	private IUserDAO userDAOImpl;

	@RequestMapping(value="/registerReq", method=RequestMethod.POST)
	public String registerRequest(Model model, HttpSession session){
		model.addAttribute("registration", new RegistrationBO());
		return "register";
	}
	
	@RequestMapping(value="/registerSubmit", method=RequestMethod.POST)
	public String registerSubmit(Model modal, HttpSession session, 
			@ModelAttribute(value="registration") RegistrationBO registrationBO){
		System.out.println(registrationBO.toString());
		UserBean myBean = new UserBean();
		myBean.setAge(Integer.parseInt(registrationBO.getAge()));
		myBean.setEmail(registrationBO.getEmail());
		myBean.setName(registrationBO.getName());
		userDAOImpl.saveUserDetails(myBean);
		return "home";
	}
}
