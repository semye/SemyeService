package com.cms.semye.bean;

import java.io.Serializable;

/**
 * Created by semye on 2017/11/24.
 * 商品基类
 */
public class BaseCommodity implements Serializable {

    /**
     * 商品名
     */
    private String name;
    /**
     * 商品编号
     */
    private String number;

    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
