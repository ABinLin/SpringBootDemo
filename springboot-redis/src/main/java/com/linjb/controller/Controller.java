package com.linjb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.linjb.model.User;

@RestController
@RequestMapping(value="/users") 
public class Controller {

	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	@Autowired
    private RedisTemplate<String, User> redisTemplate;
	@RequestMapping(value="/saveStr", method=RequestMethod.POST)
	public String saveStr(@RequestParam String key,String value){
		System.out.println("key:"+key);
		System.out.println("value:"+value);
		stringRedisTemplate.opsForValue().set(key, value);
		return "success";
	}
	
	@RequestMapping(value="/getStr", method=RequestMethod.POST)
	public String getStr(@RequestParam String key){
		System.out.println("key:"+key);
		String result=stringRedisTemplate.opsForValue().get(key);
		return result;
	}
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public String saveUser(@RequestBody User user){
		System.out.println(user);
		redisTemplate.opsForValue().set(user.getUsername(),user);
		return "success";
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.POST)
	public String getUser(@RequestParam String key){
		System.out.println("key:"+key);
		return redisTemplate.opsForValue().get(key).toString();
	}
	
	
	
}
