package com.shypovskikh.controllers;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shypovskikh.models.User;

@Controller
public class LoginController {
	
	private static final Logger  logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView main() {
		return new ModelAndView("login", "user", new User());
	}
	
	@RequestMapping(value="/check-user", method = RequestMethod.POST)
	public String checkUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
			return "login";
		
		model.addAttribute("user", user);
		return "main";
	}
	
	@RequestMapping(value="/get-json-user", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User getJsonUser(@RequestParam("name") String name) {
		User user = new User();
		user.setEmail(name);
		return user;
	}
	
	@RequestMapping(value="/put-json-user", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> setJsonUser(@RequestBody User user){
		logger.info(user.getEmail());
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}

}


















