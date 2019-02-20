package com.linjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
  * Spring Boot应用启动类
  * @Copyright Copyright (C) 2019 linjb  
  * @author linjb
  * @version 1.0
  * @CreateDate 2019年1月31日下午10:25:16
 */
@SpringBootApplication
public class Application /*extends SpringBootServletInitializer*/{

	public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		
//		return builder.sources(Application.class);
//	}
}

