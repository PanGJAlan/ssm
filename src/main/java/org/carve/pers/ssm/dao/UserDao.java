package org.carve.pers.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.carve.pers.ssm.pojo.User;

public interface UserDao {
	public User findById(@Param("id")int id);

}
