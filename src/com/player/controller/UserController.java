package com.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.player.model.User;
import com.player.service.UserService;
import com.player.service.Impl.UserServiceImpl;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired(required=true)
	private UserServiceImpl userService;
	
	@RequestMapping(value="/userIsExist.action",method = RequestMethod.GET)
	@ResponseBody
	public String userIsExist(@RequestBody User user){
		String username=user.getUsername();
		System.out.println(userService.toString());
		System.out.println(userService.userIsExist("111"));
		return null;
	}

}
