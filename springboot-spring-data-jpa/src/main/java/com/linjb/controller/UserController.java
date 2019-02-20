package com.linjb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.linjb.model.User;
import com.linjb.model.UserRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/user") 
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@ApiOperation(value="获取用户列表", notes="查询所有")
	@RequestMapping(value={"/findAll"},method=RequestMethod.POST)
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	@ApiOperation(value="创建用户", notes="根据 User 对象创建政治面貌")
    @ApiImplicitParam(name = "user", value = "用户对象", required = true, dataType = "User")
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@RequestBody User user){
		if(user==null){
			return "User==null";
		}
		userRepository.save(user);
		return "success";
	}
	
	@ApiOperation(value="根据名称获取用户列表", notes="全名查询")
	@RequestMapping(value="/findByUsername",method=RequestMethod.POST)
	public List<User> findByUsername(@RequestParam(value = "username",required = false) String username){
		System.out.println("username="+username);
		return userRepository.findByUsername(username);
	}
	
	@ApiOperation(value="模糊查询_根据名称用户列表", notes="模糊查询")
	@RequestMapping(value="/findByUsernameLike",method=RequestMethod.POST)
	public List<User> findByUsernameLike(@RequestBody String username){
		System.out.println("username="+username);
		return userRepository.findByUsernameLike(username);
	}
	
	@ApiOperation(value="根据名称获取用户列表", notes="全名查询")
	@RequestMapping(value="/findUserByName",method=RequestMethod.POST)
	public List<User> findUserByName(@RequestBody String username){
		System.out.println("username="+username);
		return userRepository.findUserByName(username);
	}
}
