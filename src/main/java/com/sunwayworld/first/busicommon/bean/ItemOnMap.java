package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

import java.math.BigDecimal;

public class ItemOnMap extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 5232313418506587491L;
    /**
     * 地区名称
     */
    private String name;
    /**
     * 地区数值
     */
    private BigDecimal value;
    /**
     * 标签文案
     */
    private String text;
    /**
     * 纬度
     */
    private BigDecimal latitude;
    /**
     * 经度
     */
    private BigDecimal longitude;

    public ItemOnMap() {
    }

    public ItemOnMap(String name, BigDecimal value, String text, BigDecimal latitude, BigDecimal longitude) {
        this.name = name;
        this.value = value;
        this.text = text;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
