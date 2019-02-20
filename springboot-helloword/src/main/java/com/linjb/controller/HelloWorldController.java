package com.linjb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * restful接口 
  * @Copyright Copyright (C) 2019 linjb  
  * @author linjb
  * @version 1.0
  * @CreateDate 2019年1月31日下午10:27:31
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}
