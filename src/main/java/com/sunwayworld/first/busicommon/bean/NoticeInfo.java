package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.data.annotation.Transient;
import com.sunwayworld.framework.support.domain.AbstractBaseData;

public class NoticeInfo extends AbstractBaseData {
    @Transient
    private static final long serialVersionUID = 5232313418506587491L;

    private String infoCategory;
    private String title;
    private String createdTime;

    public NoticeInfo() {
    }

    public NoticeInfo(String infoCategory, String title, String createdTime) {
        this.infoCategory = infoCategory;
        this.title = title;
        this.createdTime = createdTime;
    }

    public String getInfoCategory() {
        return infoCategory;
    }

    public void setInfoCategory(String infoCategory) {
        this.infoCategory = infoCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
}
