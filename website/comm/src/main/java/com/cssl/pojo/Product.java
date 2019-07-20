package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品表
 */
@Getter
@Setter
public class Product {
    private int P_id;               //编号
    private String P_name;          //名
    private int P_cid;              //一级分类，外键
    private int P_ccid;             //二级分类，外键
    private double P_dis;           //折扣
    private double P_price;         //价格
    private String P_picture;       //图片
    private int P_inventory;        //库存
    private String P_info;          //简介
    private int P_count;            //购买次数
}
