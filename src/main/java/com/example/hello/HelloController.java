package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/{mynumber}")  
    String index(@PathVariable String mynumber) {  

		return "You input "+mynumber+"!!!";  
}

}