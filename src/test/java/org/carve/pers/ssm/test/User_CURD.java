package org.carve.pers.ssm.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.carve.pers.ssm.pojo.User;
import org.carve.pers.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class User_CURD {
	 private  static Logger logger = Logger.getLogger(User_CURD.class);  
	@Resource
	private IUserService userService;
	@Test
	public void findById(){
		User user=this.userService.getUserById(1);
		System.err.println(user.getUsername());
		logger.info("username"+user.getUsername());
	}
}
