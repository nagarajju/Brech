/**
 * 
 */
package com.rbs.breach.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author user
 *
 */

@RestController
@PropertySource("classpath:application.properties")

@ConfigurationProperties
public class LoginController {
	@Value("${spring.datasource.username}")
	private String username1;
	@Value("${spring.datasource.password}")
	private String password2;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public String init(@RequestParam String username,@RequestParam String Password) {
	   if(username.equals(username1) && Password.equals("password2"))
	   {
		   return "login";
	   }
	   else
	   {
	    return "error";
	   }
	  }
}
