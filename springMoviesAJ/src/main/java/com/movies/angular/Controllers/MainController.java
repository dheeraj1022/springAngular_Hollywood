package com.movies.angular.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	
	@RequestMapping(value="/display")
    public String getRegisterPage() {
		
		
        return "display";
    }
	
	@RequestMapping(value="/")
    public String getRegister() {
		
		
        return "index";
    }
	
	@RequestMapping(value="/insert")
    public String insertPage() {
		
		
        return "insertMovie";
    }
	
	
	@RequestMapping(value="/home")
    public String routePage() {
		
		
        return "home";
    }
}
