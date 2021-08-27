package com.sunwayworld.first.busicommon.bean;

import com.sunwayworld.framework.support.domain.AbstractBaseData;

public class ItemInfo extends AbstractBaseData {
    private String itemName;
    private String menuId;
    private String itemValue;
    private String icon;

    public ItemInfo() {
    }

    public ItemInfo(String itemName, String itemValue, String menuId, String icon) {
        this.itemName = itemName;
        this.menuId = menuId;
        this.itemValue = itemValue;
        this.icon = icon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
