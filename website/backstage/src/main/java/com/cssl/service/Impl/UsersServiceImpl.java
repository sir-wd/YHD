package com.cssl.service.Impl;

import com.cssl.dao.UsersDao;
import com.cssl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersDao usersDao;

    @Override
    public boolean Log(String name, String pass) {
        if(usersDao.Log(name,pass)>0)
            return true;
        return false;
    }
}
