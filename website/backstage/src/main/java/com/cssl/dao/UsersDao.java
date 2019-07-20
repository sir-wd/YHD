package com.cssl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersDao {

    //登陆
    public int Log(@Param("name") String name,@Param("pass") String pass);
}
