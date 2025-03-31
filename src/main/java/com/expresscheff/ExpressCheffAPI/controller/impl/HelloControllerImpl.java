package com.expresscheff.ExpressCheffAPI.controller.impl;

//import lombok.extern.slf4j.Slf4j;
import com.expresscheff.ExpressCheffAPI.controller.HelloController;
import com.expresscheff.ExpressCheffAPI.response.HelloResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
//@Slf4j
public class HelloControllerImpl implements HelloController {
    @GetMapping("/sayhello")
    public HelloResponse sayHello(){
        return new HelloResponse("welcome to hello world");
    }

}