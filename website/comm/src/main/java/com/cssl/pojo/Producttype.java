package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品类型表
 */
@Getter
@Setter
public class Producttype {
    private int Pt_id;          //编号
    private String Pt_name;     //名
    private int Pt_parent;      //父级
}
