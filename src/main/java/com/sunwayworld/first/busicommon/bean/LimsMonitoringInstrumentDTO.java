package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

import java.util.List;

/**
 * 监控仪表盘DTO
 */
public class LimsMonitoringInstrumentDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = -138614384967039741L;

    private String rateName; //及时率名称

    private Integer currentValue; //当前值

    private Integer totalValue; //总值

    private List<GroupStatesDTO> indexItems; //指标信息

    public String getRateName() {
        return rateName;
    }

    public void setRateName(String rateName) {
        this.rateName = rateName;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public Integer getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
    }

    public List<GroupStatesDTO> getIndexItems() {
        return indexItems;
    }

    public void setIndexItems(List<GroupStatesDTO> indexItems) {
        this.indexItems = indexItems;
    }
}
