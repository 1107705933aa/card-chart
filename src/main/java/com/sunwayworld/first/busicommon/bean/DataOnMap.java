package com.sunwayworld.first.busicommon.bean;

import java.util.List;

public class DataOnMap {

    private List<RuleOfMapColor> rulesOfColor;
    private List<ItemOnMap> data;

    public DataOnMap() {
    }

    public DataOnMap(List<RuleOfMapColor> rulesOfColor, List<ItemOnMap> data) {
        this.rulesOfColor = rulesOfColor;
        this.data = data;
    }

    public List<RuleOfMapColor> getRulesOfColor() {
        return rulesOfColor;
    }

    public void setRulesOfColor(List<RuleOfMapColor> rulesOfColor) {
        this.rulesOfColor = rulesOfColor;
    }

    public List<ItemOnMap> getData() {
        return data;
    }

    public void setData(List<ItemOnMap> data) {
        this.data = data;
    }
}
