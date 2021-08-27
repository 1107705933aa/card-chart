package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;

import java.io.Serializable;

public class ObjectDoubleGrowthDTO implements Serializable {

    @Transient
    private static final long serialVersionUID = -5498848015401990894L;

    private String time; //时间

    private Double value; //值

    private String type; //类型

    public ObjectDoubleGrowthDTO() {
    }

    public ObjectDoubleGrowthDTO(String time, Double value, String type) {
        this.time = time;
        this.value = value;
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
