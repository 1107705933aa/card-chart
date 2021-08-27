package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

/**
 * 多段柱形图DTO
 */
public class HistogramOfMultiSagment extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 3232313418506587492L;

    private String type; //分类名称

    private String month; //Y坐标

    private Integer value; //数量
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
