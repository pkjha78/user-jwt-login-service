package com.angular.user.jwt.server.service;

import java.util.List;

import com.angular.user.jwt.server.entity.User;
import com.angular.user.jwt.server.model.UserDto;

public interface UserService {
	
	User save(UserDto user);
	
    List<User> findAll();
    
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}