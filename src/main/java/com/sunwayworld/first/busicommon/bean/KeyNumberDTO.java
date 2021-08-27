package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

import java.math.BigDecimal;

public class KeyNumberDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 3232313418506587491L;

    public KeyNumberDTO() {
    }

    public KeyNumberDTO(String key, BigDecimal value) {
        this.key = key;
        this.value = value;
    }

    private String key;
    private BigDecimal value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
