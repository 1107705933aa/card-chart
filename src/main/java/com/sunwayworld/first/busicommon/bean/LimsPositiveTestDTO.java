package com.sunwayworld.first.busicommon.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 阳性检测单DTO
 */
public class LimsPositiveTestDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 3232313418506587493L;

    private String folderNo; //受理单号

    private String locationName; //厂名

    private String testName; //检测项目

    private String menuId; //超链接用到的菜单ID
    
    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate testDate; //检验日期
    
    private Integer qty; //阳性数

    public String getFolderNo() {
        return folderNo;
    }

    public void setFolderNo(String folderNo) {
        this.folderNo = folderNo;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
