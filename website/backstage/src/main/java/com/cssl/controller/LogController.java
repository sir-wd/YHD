package com.cssl.controller;

import com.cssl.service.UsersService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class LogController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/service/login")
    public boolean Log(@RequestBody String[] values){
        System.out.println("进入service");
        System.out.println(values[0]);
        System.out.println(values[1]);

        return usersService.Log(values[0],values[1]);
    };
}
