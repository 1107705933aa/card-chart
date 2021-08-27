package com.sunwayworld.first.busicommon.bean;

public class OrderStatis {
    private String orderNo;
    private String orderName;
    private String waferId;
    private String receivedTime;
    private String status;

    public OrderStatis() {
    }

    public OrderStatis(String orderNo, String orderName, String waferId, String receivedTime, String status) {
        this.orderNo = orderNo;
        this.orderName = orderName;
        this.waferId = waferId;
        this.receivedTime = receivedTime;
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getWaferId() {
        return waferId;
    }

    public void setWaferId(String waferId) {
        this.waferId = waferId;
    }

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
