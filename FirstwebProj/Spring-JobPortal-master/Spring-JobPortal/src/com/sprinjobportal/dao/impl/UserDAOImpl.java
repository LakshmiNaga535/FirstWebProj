/**
 * 
 */
package com.sprinjobportal.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sprinjobportal.bean.UserBean;
import com.sprinjobportal.dao.IUserDAO;

/**
 * @author Viresh
 *
 */
@Repository
@Transactional
public class UserDAOImpl implements IUserDAO{

	@Autowired
    protected SessionFactory sessionFactory;
	
	public boolean saveUserDetails(UserBean user) {
		getCurrentSession().save(user);
		return true;
	}
	
	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
