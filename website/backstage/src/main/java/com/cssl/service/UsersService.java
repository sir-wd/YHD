package com.cssl.service;

import org.apache.ibatis.annotations.Param;

public interface UsersService {

    //登陆
    public boolean Log(@Param("name") String name, @Param("pass") String pass);
}
