package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

/**
 * 报告数量DTO
 */
public class LimsReportDataDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 3232313418506587492L;

    private String type; //分类名称

    private String month; //月份

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
