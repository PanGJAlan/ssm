package org.carve.pers.ssm.service.impl;

import javax.annotation.Resource;

import org.carve.pers.ssm.dao.UserDao;
import org.carve.pers.ssm.pojo.User;
import org.carve.pers.ssm.service.IUserService;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private UserDao userDao;

	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userDao.findById(id);
	}

}
