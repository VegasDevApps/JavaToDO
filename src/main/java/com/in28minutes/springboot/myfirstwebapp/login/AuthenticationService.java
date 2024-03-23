package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUserName = "Vegas".equalsIgnoreCase(username);
        boolean isValidPassword = "qwerty".equals(password);
        return isValidUserName && isValidPassword;
    }
}
