package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

public class GroupStatesDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 3232313418506587491L;

    public GroupStatesDTO() {
    }

    public GroupStatesDTO(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public GroupStatesDTO(String name, String value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    private String name;
    private String value;
    private String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
