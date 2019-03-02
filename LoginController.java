/**
 * 
 */
package com.rbs.breach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * @author user
 *
 */

@RestController
@PropertySource("classpath:application.properties")
public class LoginController {

	@Value("${spring.datasource.username}")
	private String username1;
	@Value("${spring.datasource.password}")
	private String password2;
	
    @Autowired
    LoginService service;

    @GetMapping("/login")
    public void loginmethod (@RequestParam String username,@RequestParam String password)
    {
    	System.out.println(username);
    	if(username.equals(username1) && password.equals("password2"))
 	   {
    	System.out.println("Intothat");	
    		}
 	   }
}

