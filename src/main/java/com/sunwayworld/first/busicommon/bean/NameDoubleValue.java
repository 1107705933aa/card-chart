package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

/**
 *  按年或者月查询条件
 * */
public class NameDoubleValue extends AbstractBaseData {

    @Transient
    private static final long serialVersionUID = 3930330952549648581L;

    private String type;
    private String name;
    private Double value;

    public NameDoubleValue() {
    }

    public NameDoubleValue(String type, String name, Double value) {
        this.type = type;
        this.name = name;
        this.value = value;
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
