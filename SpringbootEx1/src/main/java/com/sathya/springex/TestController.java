package com.sathya.springex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
   
	@RequestMapping("/test")
    public String marks() {
    	return "mark.html";
    }
}
