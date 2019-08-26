package com.angular.user.jwt.server.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthToken {
	private String token;
    private String username;
    
    public AuthToken(String token){
        this.token = token;
    }
}
