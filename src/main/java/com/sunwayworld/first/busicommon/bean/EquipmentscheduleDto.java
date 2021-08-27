package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

/**
 * 设备排程
 */
public class EquipmentscheduleDto extends AbstractBaseData{
    @Transient
    private static final long serialVersionUID = 5232313418506587491L;
    
    private String equipname; //设备名称
    
    private String step; //阶段
    
    private String startDate; //开始时间 (yyyy-MM-dd)
    
    private String endDate; //结束时间 (yyyy-MM-dd)
    
    private String equiptCode;//设备编号,唯一标识

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEquiptCode() {
        return equiptCode;
    }

    public void setEquiptCode(String equiptCode) {
        this.equiptCode = equiptCode;
    }
    
}
