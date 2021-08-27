package com.sunwayworld.first.busicommon.enums;

/**
 * 上海地区枚举
 */
public enum ShangHaiAreas {
	QingPU("青浦区"),
	FENGXIAN("奉贤区"),
	PUDONG("浦东新区"),
	SONGJIANG("松江区"),
	XUHUI("徐汇区"),
	BAOSHAN("宝山区"),
	JIADING("嘉定区"),
	HUANGPU("黄浦区"),
	MINHANG("闵行区"),
	CHONGMING("崇明区"),
	PUTUO("普陀区"),
	JINGAN("静安区"),
	HONGKOU("虹口区"),
	CHANGNING("长宁区"),
	JINSHAN("金山区"),
	YANGPU("杨浦区");

	private ShangHaiAreas(String area) {
		this.area = area;
	}
	
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public static void main(String[] args) {
		System.out.println(ShangHaiAreas.HONGKOU.getArea());
	}
}
