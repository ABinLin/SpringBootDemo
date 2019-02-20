package com.linjb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.linjb.model.p.College;
import com.linjb.model.p.CollegeRepository;

@RestController
@RequestMapping(value = "/college")
public class CollegeController {

	@Autowired
	private CollegeRepository collegeRepository;
	
	@RequestMapping(value="/findAll", method=RequestMethod.POST) 
	public List<College> findAll(){
		return collegeRepository.findAll();
	}
}
