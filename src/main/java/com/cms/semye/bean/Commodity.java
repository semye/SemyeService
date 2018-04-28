package com.cms.semye.bean;

import java.io.Serializable;

/**
 * Created by semye on 2017/11/26.
 */
public class Commodity implements Serializable {

    private int id;
    private String commodity_name;
    private int commodity_number;
    private int commodity_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public int getCommodity_number() {
        return commodity_number;
    }

    public void setCommodity_number(int commodity_number) {
        this.commodity_number = commodity_number;
    }

    public int getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(int commodity_type) {
        this.commodity_type = commodity_type;
    }
}
