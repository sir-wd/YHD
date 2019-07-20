package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 一级分类
 */
@Getter
@Setter
public class Classify {
    private int C_id;       //编号
    private String C_name;  //名
    private int C_ccid;     //父级
}
