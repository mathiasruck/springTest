package com.separated.spring.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Profiles {

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${active.profile.property}")
    private String profileProperty;

    @RequestMapping("/profile")
    private String homeProfiles(){
        return profile + "\n" ;
    }

    @RequestMapping("/profileProperty")
    private String profileProperty(){
        return profileProperty;
    }


}

