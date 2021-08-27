package com.sunwayworld.first.busicommon.bean;

public class Title {
    private String name;
    private String code;
    private String width;

    public Title() {
    }

    public Title(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Title(String name, String code, String width) {
        this.name = name;
        this.code = code;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
