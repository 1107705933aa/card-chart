package com.sunwayworld.first.busicommon.bean;

import java.util.List;
import java.util.Map;

public class DataGridDTO {
    private List<Title> titles;
    private List<Map<String, Object>> data;
    private Integer hrefColIndex;

    public DataGridDTO() {
    }

    public DataGridDTO(List<Title> titles, List<Map<String, Object>> data, Integer hrefColIndex) {
        this.titles = titles;
        this.data = data;
        this.hrefColIndex = hrefColIndex;
    }

    public Integer getHrefColIndex() {
        return hrefColIndex;
    }

    public void setHrefColIndex(Integer hrefColIndex) {
        this.hrefColIndex = hrefColIndex;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }
}
