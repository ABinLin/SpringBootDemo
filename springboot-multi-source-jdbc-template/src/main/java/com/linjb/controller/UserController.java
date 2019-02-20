package com.linjb.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.linjb.model.User;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;
	
	@RequestMapping(value="/insertUser", method=RequestMethod.POST) 
    public String insertUser2(){
    	// 往第一个数据源中插入两条数据
        jdbcTemplate1.update("insert into user(id,username,age) values(?, ?, ?)", 5, "aaa", 20);
        jdbcTemplate2.update("insert into user(id,username,age) values(?, ?, ?)", 5, "aaa", 20);
        return "success";
    }
	
	@RequestMapping(value="/findAllUser1", method=RequestMethod.POST) 
    public List<User> findAllUser1(){
        return jdbcTemplate1.query("select id,username,age from user ", new UserInfo());
    }
	
	public class UserInfo implements RowMapper<User>{
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User userInfo = new User();
			userInfo.setId(rs.getInt("id"));
			userInfo.setUsername(rs.getString("username"));
			userInfo.setAge(rs.getInt("age"));
			return userInfo;
		}
	}
}
