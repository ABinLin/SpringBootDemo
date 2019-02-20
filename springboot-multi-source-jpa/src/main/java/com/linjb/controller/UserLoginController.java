package com.linjb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.linjb.model.s.UserLogin;
import com.linjb.model.s.UserLoginRepository;

@RestController
@RequestMapping(value = "/userLogin")
public class UserLoginController {

	@Autowired
	private UserLoginRepository userLoginRepository ;
	
	@RequestMapping(value="/login", method=RequestMethod.POST) 
	public String login(@RequestBody UserLogin userLogin){
		List<UserLogin> list=userLoginRepository.findByUsername(userLogin.getUsername());
		if(null != list){
			if(list.get(0).getPwd().equals(userLogin.getPwd())){
				return "success";
			}
		}
		return "false";
	}
}
