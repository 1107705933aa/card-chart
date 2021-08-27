package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

import java.math.BigDecimal;

/**
 * 地图颜色规则
 */
public class RuleOfMapColor extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 5232313418506587491L;
    /**
     * 最小值
     */
    private BigDecimal minValue;
    /**
     * 最大值
     */
    private BigDecimal maxValue;
    /**
     * RGB值
     */
    private String color;

    public RuleOfMapColor() {
    }

    public RuleOfMapColor(BigDecimal minValue, BigDecimal maxValue, String color) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.color = color;
    }

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
