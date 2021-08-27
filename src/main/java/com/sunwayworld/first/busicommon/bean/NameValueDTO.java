package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

/**
 *  按年或者月查询条件
 * */
public class NameValueDTO extends AbstractBaseData {

    @Transient
    private static final long serialVersionUID = -6192248129439334402L;

    private String type;
    private String name;
    private Integer value;

    public NameValueDTO() {
    }

    public NameValueDTO(String type, String name, Integer value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public NameValueDTO(String name, Integer value) {
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
