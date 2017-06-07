package com.separated.spring.example.controller;

import com.separated.spring.example.services.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerClass {

    @Autowired
    private ServiceClass serviceClass;

    @RequestMapping("/autoWired")
    public String showAutoWiredWorking(){
        return serviceClass.toString();
    }
}
