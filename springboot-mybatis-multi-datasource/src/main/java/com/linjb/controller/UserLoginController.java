package com.linjb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.linjb.dao.cluster.UserLoginDao;
import com.linjb.model.UserLogin;

@RestController
@RequestMapping(value="/userLogin") 
public class UserLoginController {

	@Autowired
	private UserLoginDao userLoginDao;
	@RequestMapping(value = "/findByUsername", method = RequestMethod.POST)
    public String findCollegeByName(@RequestBody UserLogin userLogin) {
        UserLogin result=userLoginDao.findByUsername(userLogin.getUserName());
        if(userLogin.getPwd().equals(result.getPwd())){
        	return "success";
        }
		return "false";
    }
}
