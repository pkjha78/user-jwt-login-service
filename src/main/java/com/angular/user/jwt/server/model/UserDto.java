package com.angular.user.jwt.server.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int age;
    private int salary;
}
