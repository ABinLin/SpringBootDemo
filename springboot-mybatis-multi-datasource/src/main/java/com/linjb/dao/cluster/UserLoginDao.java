package com.linjb.dao.cluster;

import com.linjb.model.UserLogin;

public interface UserLoginDao {

	public UserLogin findByUsername(String username);
}
