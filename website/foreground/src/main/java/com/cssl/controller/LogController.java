package com.cssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
public class LogController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://127.0.0.1:98";

    @RequestMapping("/login")
    public boolean Log(HttpServletRequest request){
        String[] values = new String[2];
        String name =  request.getParameter("credentials.username");
        String pass =  request.getParameter("credentials.password");
        values[0] = name;
        values[1] = pass;

        return restTemplate.postForObject(URL+"/service/login",values,boolean.class);
    }

}
