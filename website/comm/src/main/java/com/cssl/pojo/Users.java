package com.cssl.pojo;


import lombok.Getter;
import lombok.Setter;

/**
 * 用户表
 */
@Getter
@Setter
public class Users {
    private int U_id;                           //编号
    private String U_name;                      //名
    private String U_password;                  //密码
    private String U_idCode;                    //身份证
    private String U_email;                     //邮箱
    private String U_mobile;                    //手机号
    private String U_address;                   //地址
    private int U_jid;                          //权限
}
