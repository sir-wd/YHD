package com.cssl;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@EnableAutoConfiguration
public class Foreground_APP {

    public static void main(String[] args) {
        SpringApplication.run(Foreground_APP.class,args);
    }
}
