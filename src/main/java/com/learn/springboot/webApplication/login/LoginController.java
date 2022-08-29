package com.learn.springboot.webApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginPage(){
        return "login";
    }

    //http://localhost:8082/login?name=Abhigna
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
        if(authenticationService.authenticate(name,password)){
            modelMap.put("name", name);
            //modelMap.put("password", password);
            return "welcome";
        }
        else {
            modelMap.put("errorMessage", "Invalid Credentials! Please try again....");
            return "login";
        }
    }
}
