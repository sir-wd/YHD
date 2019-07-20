package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 权限表
 */
@Getter
@Setter
public class Jurisdiction {
    private int J_id;           //编号
    private String J_name;      //名
    private int J_parent;       //父级
}
