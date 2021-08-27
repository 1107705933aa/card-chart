package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

/**
 * 报告数量DTO
 */
public class LimsTaskStatisticsDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 1212313418506587492L;

    private String category; //检验大类

    private String subclass; //检验小类
    
    private String testName; //检验名称

    private Integer value; //数量


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
}
