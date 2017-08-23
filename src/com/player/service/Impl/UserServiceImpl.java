package com.player.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.mapper.UserMapper;
import com.player.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired(required=true)
	private UserMapper userMapper;
	public String userIsExist(String username) {
		
		return userMapper.userIsExist(username);
	}

}
