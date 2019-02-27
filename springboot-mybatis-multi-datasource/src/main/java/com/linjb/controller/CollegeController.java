package com.linjb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.linjb.dao.master.CollegeDao;
import com.linjb.model.College;

@RestController
@RequestMapping(value="/college") 
public class CollegeController {

	@Autowired
	private CollegeDao collegeDao;
	
	@RequestMapping(value = "/findCollegeByName", method = RequestMethod.GET)
    public College findCollegeByName(@RequestParam(value = "collegeName", required = true) String collegeName) {
        return collegeDao.findByName(collegeName);
    }
}