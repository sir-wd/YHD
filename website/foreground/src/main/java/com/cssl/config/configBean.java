package com.cssl.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {

    @Bean
    @LoadBalanced   //Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    @Primary
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }



    /*
     * 使用自定义策略要注释该策略
     */
    @Bean
    public IRule getRule() {
        return new RoundRobinRule();	//轮询
        //return new RandomRule();		//随机
        //return new RetryRule();			//重试(碰到下线或服务断开)
    }
}
