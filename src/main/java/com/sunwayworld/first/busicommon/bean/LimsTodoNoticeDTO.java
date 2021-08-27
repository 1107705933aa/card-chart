package com.sunwayworld.first.busicommon.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 待办数量/系统提醒DTO
 */
public class LimsTodoNoticeDTO extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 3232313418506587494L;

    private String id;

    private String modularName; //模块/类型

    private String contentName; //名称

    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate currentDate; //日期

    /**
     * 发布者
     */
    private String publisher;

    public LimsTodoNoticeDTO() {
    }

    public LimsTodoNoticeDTO(String id, String modularName, String contentName, LocalDate currentDate, String publisher) {
        this.id = id;
        this.modularName = modularName;
        this.contentName = contentName;
        this.currentDate = currentDate;
        this.publisher = publisher;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModularName() {
        return modularName;
    }

    public void setModularName(String modularName) {
        this.modularName = modularName;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
