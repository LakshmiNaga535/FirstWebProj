/**
 * 
 */
package com.sprinjobportal.dao;

import com.sprinjobportal.bean.UserBean;

/**
 * @author Viresh
 *
 */
public interface IUserDAO {

	public boolean saveUserDetails(UserBean user);
}
