package com.learn.springboot.webApplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("Abhigna");
        boolean isValidPassword = password.equalsIgnoreCase("qwerty");

        return isValidUsername && isValidPassword;
    }
}
