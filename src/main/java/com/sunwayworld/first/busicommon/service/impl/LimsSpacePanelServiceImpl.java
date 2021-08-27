package com.sunwayworld.first.busicommon.service.impl;

import com.google.common.collect.Lists;
import com.sunwayworld.first.busicommon.bean.*;
import com.sunwayworld.first.busicommon.enums.ShangHaiAreas;
import com.sunwayworld.first.busicommon.service.LimsSpacePanelService;
import com.sunwayworld.framework.data.page.Page;
import com.sunwayworld.framework.mybatis.page.MybatisPageHelper;
import com.sunwayworld.framework.mybatis.page.PageRowBounds;
import com.sunwayworld.framework.restful.data.RestJsonWrapperBean;
import com.sunwayworld.framework.spring.annotation.GikamBean;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@GikamBean
@Repository
public class LimsSpacePanelServiceImpl implements LimsSpacePanelService {

    @Override
    public List<LimsMonitoringInstrumentDTO> selectMonitoringInstrumentDTOSet(String type) {
        List<LimsMonitoringInstrumentDTO> a = new ArrayList<>();
        LimsMonitoringInstrumentDTO dto = new LimsMonitoringInstrumentDTO();
        dto.setRateName("仪表1");
        dto.setCurrentValue(22);
        dto.setTotalValue(100);
        dto.setIndexItems(Lists.newArrayList(
                new GroupStatesDTO("已完成值", "8900元"),
                new GroupStatesDTO("目标值", "未设定")
        ));
        a.add(dto);
        LimsMonitoringInstrumentDTO dto1 = new LimsMonitoringInstrumentDTO();
        dto1.setRateName("仪表2");
        dto1.setCurrentValue(45);
        dto1.setTotalValue(100);
        dto1.setIndexItems(Lists.newArrayList(
                new GroupStatesDTO("已完成值", "5000元"),
                new GroupStatesDTO("目标值", "未设定")
        ));
        a.add(dto1);
        LimsMonitoringInstrumentDTO dto3 = new LimsMonitoringInstrumentDTO();
        dto3.setRateName("仪表3");
        dto3.setCurrentValue(95);
        dto3.setTotalValue(100);
        dto1.setIndexItems(Lists.newArrayList(
                new GroupStatesDTO("已完成值", "6000元"),
                new GroupStatesDTO("目标值", "未设定")
        ));
        a.add(dto3);
        LimsMonitoringInstrumentDTO dto4 = new LimsMonitoringInstrumentDTO();
        dto4.setRateName("仪表4");
        dto4.setCurrentValue(20);
        dto4.setTotalValue(70);
        dto1.setIndexItems(Lists.newArrayList(
                new GroupStatesDTO("已完成值", "7000元"),
                new GroupStatesDTO("目标值", "未设定")
        ));
        a.add(dto4);
        return a;
    }

    @Override
    public List<ProgressInfoDTO> progressInfo(String type) {
        List<ProgressInfoDTO> a = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            if (i <= 9) {
                ProgressInfoDTO dto = new ProgressInfoDTO();
                dto.setProgressName("样品" + i);
                dto.setCurrentValue(i * 10);
                dto.setTotalValue(100);
                a.add(dto);
            } else {
                ProgressInfoDTO dto = new ProgressInfoDTO();
                dto.setProgressName("样品" + i);
                dto.setCurrentValue((15 - i) * 10);
                dto.setTotalValue(100);
                a.add(dto);
            }
        }
        return a;
    }

    @Override
    public List<HistogramOfMultiItemDTO> histogramOfMultiItem(String year, String type, DateCondition dateCondition) {
        List<HistogramOfMultiItemDTO> a = new ArrayList<>();
        HistogramOfMultiItemDTO HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("脱硫");
        HistogramOfMultiItemDTO.setRateTime("2019-01");
        HistogramOfMultiItemDTO.setRateValue("35");
        a.add(HistogramOfMultiItemDTO);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO1 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO1.setRateName("脱氢");
        histogramOfMultiItemDTO1.setRateTime("2019-01");
        histogramOfMultiItemDTO1.setRateValue("25");
        a.add(histogramOfMultiItemDTO1);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO2 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO2.setRateName("盐水");
        histogramOfMultiItemDTO2.setRateTime("2019-01");
        histogramOfMultiItemDTO2.setRateValue("75");
        a.add(histogramOfMultiItemDTO2);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO3 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO3.setRateName("脱硫");
        histogramOfMultiItemDTO3.setRateTime("2019-02");
        histogramOfMultiItemDTO3.setRateValue("35");
        a.add(histogramOfMultiItemDTO3);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO4 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO4.setRateName("脱氢");
        histogramOfMultiItemDTO4.setRateTime("2019-02");
        histogramOfMultiItemDTO4.setRateValue("25");
        a.add(histogramOfMultiItemDTO4);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO5 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO5.setRateName("盐水");
        histogramOfMultiItemDTO5.setRateTime("2019-02");
        histogramOfMultiItemDTO5.setRateValue("55");
        a.add(histogramOfMultiItemDTO5);

        HistogramOfMultiItemDTO histogramOfMultiItemDTO6 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO6.setRateName("脱硫");
        histogramOfMultiItemDTO6.setRateTime("2019-03");
        histogramOfMultiItemDTO6.setRateValue("45");
        a.add(histogramOfMultiItemDTO6);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO7 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO7.setRateName("脱氢");
        histogramOfMultiItemDTO7.setRateTime("2019-03");
        histogramOfMultiItemDTO7.setRateValue("75");
        a.add(histogramOfMultiItemDTO7);
        HistogramOfMultiItemDTO histogramOfMultiItemDTO8 = new HistogramOfMultiItemDTO();
        histogramOfMultiItemDTO8.setRateName("盐水");
        histogramOfMultiItemDTO8.setRateTime("2019-03");
        histogramOfMultiItemDTO8.setRateValue("15");
        a.add(histogramOfMultiItemDTO8);

        HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("脱硫");
        HistogramOfMultiItemDTO.setRateTime("2019-04");
        HistogramOfMultiItemDTO.setRateValue("45");
        a.add(HistogramOfMultiItemDTO);
        HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("脱氢");
        HistogramOfMultiItemDTO.setRateTime("2019-04");
        HistogramOfMultiItemDTO.setRateValue("85");
        a.add(HistogramOfMultiItemDTO);
        HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("盐水");
        HistogramOfMultiItemDTO.setRateTime("2019-04");
        HistogramOfMultiItemDTO.setRateValue("65");
        a.add(HistogramOfMultiItemDTO);
        HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("脱硫");
        HistogramOfMultiItemDTO.setRateTime("2019-05");
        HistogramOfMultiItemDTO.setRateValue("45");
        a.add(HistogramOfMultiItemDTO);
        HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("脱氢");
        HistogramOfMultiItemDTO.setRateTime("2019-05");
        HistogramOfMultiItemDTO.setRateValue("55");
        a.add(HistogramOfMultiItemDTO);
        HistogramOfMultiItemDTO = new HistogramOfMultiItemDTO();
        HistogramOfMultiItemDTO.setRateName("盐水");
        HistogramOfMultiItemDTO.setRateTime("2019-05");
        HistogramOfMultiItemDTO.setRateValue("25");
        a.add(HistogramOfMultiItemDTO);
        return a;
    }

    @Override
    public List<HistogramOfMultiSagment> histogramOfMultiSagment(String mtlType, DateCondition dateCondition) {
        List<HistogramOfMultiSagment> a = new ArrayList<>();
        HistogramOfMultiSagment histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("十二月");
        histogramOfMultiSagment.setValue(390);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("十二月");
        histogramOfMultiSagment.setValue(190);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("十二月");
        histogramOfMultiSagment.setValue(900);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("十一月");
        histogramOfMultiSagment.setValue(190);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("十一月");
        histogramOfMultiSagment.setValue(90);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("十一月");
        histogramOfMultiSagment.setValue(500);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("十月");
        histogramOfMultiSagment.setValue(320);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("十月");
        histogramOfMultiSagment.setValue(110);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("十月");
        histogramOfMultiSagment.setValue(600);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("九月");
        histogramOfMultiSagment.setValue(120);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("九月");
        histogramOfMultiSagment.setValue(110);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("九月");
        histogramOfMultiSagment.setValue(80);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("八月");
        histogramOfMultiSagment.setValue(30);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("八月");
        histogramOfMultiSagment.setValue(90);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("八月");
        histogramOfMultiSagment.setValue(200);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("七月");
        histogramOfMultiSagment.setValue(290);
        a.add(histogramOfMultiSagment);
        HistogramOfMultiSagment histogramOfMultiSagment1 = new HistogramOfMultiSagment();
        histogramOfMultiSagment1.setType("兽");
        histogramOfMultiSagment1.setMonth("七月");
        histogramOfMultiSagment1.setValue(550);
        a.add(histogramOfMultiSagment1);
        HistogramOfMultiSagment histogramOfMultiSagment2 = new HistogramOfMultiSagment();
        histogramOfMultiSagment2.setType("其他");
        histogramOfMultiSagment2.setMonth("七月");
        histogramOfMultiSagment2.setValue(500);
        a.add(histogramOfMultiSagment2);
        HistogramOfMultiSagment histogramOfMultiSagment3 = new HistogramOfMultiSagment();
        histogramOfMultiSagment3.setType("禽");
        histogramOfMultiSagment3.setMonth("六月");
        histogramOfMultiSagment3.setValue(200);
        a.add(histogramOfMultiSagment3);
        HistogramOfMultiSagment histogramOfMultiSagment4 = new HistogramOfMultiSagment();
        histogramOfMultiSagment4.setType("兽");
        histogramOfMultiSagment4.setMonth("六月");
        histogramOfMultiSagment4.setValue(150);
        a.add(histogramOfMultiSagment4);
        HistogramOfMultiSagment histogramOfMultiSagment5 = new HistogramOfMultiSagment();
        histogramOfMultiSagment5.setType("其他");
        histogramOfMultiSagment5.setMonth("六月");
        histogramOfMultiSagment5.setValue(400);
        a.add(histogramOfMultiSagment5);
        HistogramOfMultiSagment histogramOfMultiSagment6 = new HistogramOfMultiSagment();
        histogramOfMultiSagment6.setType("禽");
        histogramOfMultiSagment6.setMonth("五月");
        histogramOfMultiSagment6.setValue(490);
        a.add(histogramOfMultiSagment6);
        HistogramOfMultiSagment histogramOfMultiSagment7 = new HistogramOfMultiSagment();
        histogramOfMultiSagment7.setType("兽");
        histogramOfMultiSagment7.setMonth("五月");
        histogramOfMultiSagment7.setValue(150);
        a.add(histogramOfMultiSagment7);
        HistogramOfMultiSagment histogramOfMultiSagment8 = new HistogramOfMultiSagment();
        histogramOfMultiSagment8.setType("其他");
        histogramOfMultiSagment8.setMonth("五月");
        histogramOfMultiSagment8.setValue(300);
        a.add(histogramOfMultiSagment8);
        HistogramOfMultiSagment histogramOfMultiSagment9 = new HistogramOfMultiSagment();
        histogramOfMultiSagment9.setType("禽");
        histogramOfMultiSagment9.setMonth("四月");
        histogramOfMultiSagment9.setValue(120);
        a.add(histogramOfMultiSagment9);
        HistogramOfMultiSagment histogramOfMultiSagment10 = new HistogramOfMultiSagment();
        histogramOfMultiSagment10.setType("兽");
        histogramOfMultiSagment10.setMonth("四月");
        histogramOfMultiSagment10.setValue(100);
        a.add(histogramOfMultiSagment10);
        HistogramOfMultiSagment histogramOfMultiSagment11 = new HistogramOfMultiSagment();
        histogramOfMultiSagment11.setType("其他");
        histogramOfMultiSagment11.setMonth("四月");
        histogramOfMultiSagment11.setValue(140);
        a.add(histogramOfMultiSagment11);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("三月");
        histogramOfMultiSagment.setValue(100);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("三月");
        histogramOfMultiSagment.setValue(190);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("三月");
        histogramOfMultiSagment.setValue(290);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("二月");
        histogramOfMultiSagment.setValue(80);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("二月");
        histogramOfMultiSagment.setValue(380);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("二月");
        histogramOfMultiSagment.setValue(120);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("禽");
        histogramOfMultiSagment.setMonth("一月");
        histogramOfMultiSagment.setValue(390);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("兽");
        histogramOfMultiSagment.setMonth("一月");
        histogramOfMultiSagment.setValue(190);
        a.add(histogramOfMultiSagment);
        histogramOfMultiSagment = new HistogramOfMultiSagment();
        histogramOfMultiSagment.setType("其他");
        histogramOfMultiSagment.setMonth("一月");
        histogramOfMultiSagment.setValue(1000);
        a.add(histogramOfMultiSagment);
        return a;
    }

    @Override
    public List<ProgressInfoDTO> selectTestProgressSet(String type, DateCondition dateCondition) {
        List<ProgressInfoDTO> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            ProgressInfoDTO dto = new ProgressInfoDTO();
            dto.setProgressName("检测单" + i);
            dto.setCurrentValue(i * 10);
            dto.setTotalValue(100);
            a.add(dto);
        }
        return a;
    }

    @Override
    public List<LimsPositiveTestDTO> selectPositiveTestDTOSet(String type, DateCondition dateCondition) {
        List<LimsPositiveTestDTO> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            LimsPositiveTestDTO dto = new LimsPositiveTestDTO();
            dto.setMenuId("2020042101"); //点击链接需要打开的菜单ID
            dto.setFolderNo("受理单号" + i);
            dto.setLocationName("场地" + i);
            dto.setTestName("测试" + i);
            dto.setTestDate(LocalDate.now());
            dto.setQty(i + 10);
            a.add(dto);
        }
        return a;
    }

    @Override
    public List<LimsTodoNoticeDTO> selectLimsTodoSet(String type) {
        List<LimsTodoNoticeDTO> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            LimsTodoNoticeDTO dto = new LimsTodoNoticeDTO();
            dto.setModularName("模块" + i);
            dto.setContentName("待办事项" + i);
            dto.setCurrentDate(LocalDate.now());
            a.add(dto);
        }
        return a;
    }

    @Override
    public List<LimsTodoNoticeDTO> selectLimsNoticeSet(String type) {
        List<LimsTodoNoticeDTO> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            LimsTodoNoticeDTO dto = new LimsTodoNoticeDTO();
            dto.setModularName("提醒类型" + i);
            dto.setContentName("提醒相关内容" + i);
            dto.setCurrentDate(LocalDate.now());
            a.add(dto);
        }
        return a;
    }

    @Override
    public UserCard userInfo(String type) {
        return new UserCard("/static/img/appDownload.png", "系统管理员", "2021年1月1日",
                "检验中心", "2020年12月31日 11点21分12秒");
    }

    @Override
    public List<Map<String, String>> selectRotationchartSet(String type) {
        List<Map<String, String>> aa = new ArrayList<>();
        Map<String, String> b = new HashMap<>();
        b.put("imageName", "图形1");
        b.put("imageUrl", "/static/icon/todo/001.png");
        aa.add(b);
        b = new HashMap<>();
        b.put("imageName", "图形2");
        b.put("imageUrl", "/static/icon/todo/002.png");
        aa.add(b);
        b = new HashMap<>();
        b.put("imageName", "图形3");
        b.put("imageUrl", "/static/icon/todo/003.png");
        aa.add(b);
        b = new HashMap<>();
        b.put("imageName", "图形4");
        b.put("imageUrl", "/static/icon/todo/004.png");
        aa.add(b);
        return aa;
    }

    @Override
    public List<GroupStatesDTO> histogramInfo(String type, DateCondition dateCondition) {
        return Lists.newArrayList(
                new GroupStatesDTO("杨幂", "15", "%"),
                new GroupStatesDTO("张学友", "40", "%"),
                new GroupStatesDTO("方大同", "50", "%"),
                new GroupStatesDTO("萧敬腾", "80", "%"),
                new GroupStatesDTO("侯佩岑", "46", "%"),
                new GroupStatesDTO("蔡依林", "35", "%"),
                new GroupStatesDTO("许嵩", "76", "%"),
                new GroupStatesDTO("杨颖", "16", "%")
        );
    }

    @Override
    public Map<String, GroupStatesDTO> selectHeadCountSet(String type) {
        Map<String, GroupStatesDTO> b = new HashMap<>(4);
        b.put("left1", new GroupStatesDTO("待办数量", "12"));
        b.put("left2", new GroupStatesDTO("已检数量", "5"));
        b.put("right1", new GroupStatesDTO("待检验数量", "200"));
        b.put("right2", new GroupStatesDTO("系统提醒", "23"));
        return b;
    }

    @Override
    public List<EquipmentscheduleDto> selectequipmentscheduleSet(String type) {
        List<EquipmentscheduleDto> a = new ArrayList<>();
        EquipmentscheduleDto b = new EquipmentscheduleDto();
        b.setEquipname("设备一");
        b.setStep("计划工期");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-05-10");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备一");
        b.setStep("可行性研究阶段");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-01-20");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备一");
        b.setStep("初步设计阶段");
        b.setStartDate("2020-01-20");
        b.setEndDate("2020-02-20");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备一");
        b.setStep("施工图设计阶段");
        b.setStartDate("2020-02-20");
        b.setEndDate("2020-02-30");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备一");
        b.setStep("项目实施阶段");
        b.setStartDate("2020-02-30");
        b.setEndDate("2020-03-20");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备一");
        b.setStep("项目验收阶段");
        b.setStartDate("2020-03-20");
        b.setEndDate("2020-04-25");
        a.add(b);

        b = new EquipmentscheduleDto();
        b.setEquipname("设备二");
        b.setStep("计划工期");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-05-01");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备二");
        b.setStep("可行性研究阶段");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-01-30");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备二");
        b.setStep("初步设计阶段");
        b.setStartDate("2020-01-30");
        b.setEndDate("2020-02-25");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备二");
        b.setStep("施工图设计阶段");
        b.setStartDate("2020-02-25");
        b.setEndDate("2020-03-28");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备二");
        b.setStep("项目实施阶段");
        b.setStartDate("2020-03-28");
        b.setEndDate("2020-04-25");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备二");
        b.setStep("项目验收阶段");
        b.setStartDate("2020-04-25");
        b.setEndDate("2020-05-03");
        a.add(b);
        return a;
    }

    @Override
    public DataOnMap tagOnMap(String type, DateCondition dateCondition) {
        List<ItemOnMap> items = Lists.newArrayList(
                new ItemOnMap(ShangHaiAreas.QingPU.getArea(), new BigDecimal(4), "药物残留检出：2/4", new BigDecimal(121.113021), new BigDecimal(31.151209)),
                new ItemOnMap(ShangHaiAreas.FENGXIAN.getArea(), new BigDecimal(8), "药物残留检出：3/8", new BigDecimal(121.458472), new BigDecimal(30.912345)),
                new ItemOnMap(ShangHaiAreas.PUDONG.getArea(), new BigDecimal(12), "药物残留检出：12/33", new BigDecimal(121.7795171), new BigDecimal(31.151209)),
                new ItemOnMap(ShangHaiAreas.SONGJIANG.getArea(), new BigDecimal(22), "药物残留检出：22/34", new BigDecimal(121.223543), new BigDecimal(31.03047)),
                new ItemOnMap(ShangHaiAreas.XUHUI.getArea(), new BigDecimal(32), "药物残留检出：32/64", new BigDecimal(121.43752), new BigDecimal(31.179973)),
                new ItemOnMap(ShangHaiAreas.BAOSHAN.getArea(), new BigDecimal(12), "药物残留检出：12/21", new BigDecimal(121.489934), new BigDecimal(31.398896)),
                new ItemOnMap(ShangHaiAreas.JIADING.getArea(), new BigDecimal(2), "药物残留检出：1/4", new BigDecimal(121.489934), new BigDecimal(31.398896)),
                new ItemOnMap(ShangHaiAreas.HUANGPU.getArea(), new BigDecimal(4), "药物残留检出：2/4", new BigDecimal(121.489934), new BigDecimal(31.398896)),
                new ItemOnMap(ShangHaiAreas.MINHANG.getArea(), new BigDecimal(4), "药物残留检出：2/4", new BigDecimal(121.489934), new BigDecimal(31.151209)),
                new ItemOnMap(ShangHaiAreas.CHONGMING.getArea(), new BigDecimal(4), "药物残留检出：2/4", new BigDecimal(121.113021), new BigDecimal(31.151209))
        );

        List<RuleOfMapColor> rules = Lists.newArrayList(
                new RuleOfMapColor(new BigDecimal(0),new BigDecimal(3),"#74D6FB"),
                new RuleOfMapColor(new BigDecimal(4),new BigDecimal(8),"#73C3FE"),
                new RuleOfMapColor(new BigDecimal(9),new BigDecimal(Integer.MAX_VALUE),"#B2A5FC")
        );
        return new DataOnMap(rules, items);
    }

    /**
     * 查询热点地图数据
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> selectHotPointMapData(String type) {
        List<Map<String, Object>> aa = new ArrayList<>();
        Map<String, Object> b = new HashMap<>();
        b.put("name", "青浦区");
        b.put("value", 4);
        b.put("latitude", 121.113021);
        b.put("longitude", 31.151209);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "奉贤区");
        b.put("value", 8);
        b.put("latitude", 121.458472);
        b.put("longitude", 30.912345);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "浦东新区");
        b.put("value", 33);
        b.put("latitude", 121.7795171);
        b.put("longitude", 31.13357039);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "松江区");
        b.put("value", 42);
        b.put("belowStandardNum", 22);
        b.put("text", "药物残留检出：22/42");
        b.put("latitude", 121.223543);
        b.put("longitude", 31.03047);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", ShangHaiAreas.XUHUI.getArea());
        b.put("value", 82);
        b.put("latitude", 121.43752);
        b.put("longitude", 31.179973);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", ShangHaiAreas.BAOSHAN.getArea());
        b.put("value", 52);
        b.put("latitude", 121.489934);
        b.put("longitude", 31.398896);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", ShangHaiAreas.JIADING.getArea());
        b.put("value", 2);
        b.put("latitude", 121.489934);
        b.put("longitude", 31.398896);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", ShangHaiAreas.HUANGPU.getArea());
        b.put("value", 12);
        b.put("belowStandardNum", 2);
        b.put("text", "药物残留检出：2/12");
        b.put("latitude", 121.489934);
        b.put("longitude", 31.398896);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", ShangHaiAreas.MINHANG.getArea());
        b.put("value", 22);
        b.put("latitude", 121.489934);
        b.put("longitude", 31.398896);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", ShangHaiAreas.CHONGMING.getArea());
        b.put("value", 75);
        b.put("latitude", 121.489934);
        b.put("longitude", 31.398896);
        aa.add(b);
        return aa;
    }

    @Override
    public List<Map<String, Object>> selectWaterWaveSet(String type) {
        List<Map<String, Object>> aa = new ArrayList<>();
        Map<String, Object> b = new HashMap<>();
        b.put("name", "测试1");
        b.put("value", 0.3);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "测试2");
        b.put("value", 0.6);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "测试3");
        b.put("value", 0.8);
        aa.add(b);
        return aa;
    }

    @Override
    public List<Map<String, Object>> selectWaterWaveQmsSet(String type, DateCondition dateCondition) {
        List<Map<String, Object>> aa = new ArrayList<>();
        Map<String, Object> b = new HashMap<>();
        b.put("name", "待接收");
        b.put("value", 80);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "待检测");
        b.put("value", 65);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "检测中");
        b.put("value", 68);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "处理中");
        b.put("value", 90);
        aa.add(b);
        b = new HashMap<>();
        b.put("name", "已完成");
        b.put("value", 48);
        aa.add(b);
        return aa;
    }

    @Override
    public List<Map<String, Object>> selectNgWaferQmsSet(String type) {
        List<Map<String, Object>> aa = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Map<String, Object> b = new HashMap<>();
            b.put("sort", i + "");
            b.put("name", "片盒" + i);
            b.put("wafer", "WaferlD" + i);
            aa.add(b);
        }
        return aa;
    }

    @Override
    public List<Map<String, Object>> selectSampleCountQmsSet(String type) {
        List<Map<String, Object>> aa = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Map<String, Object> b = new HashMap<>();
            b.put("name", "样品" + i);
            b.put("value", "" + i * 10);
            aa.add(b);
        }
        return aa;
    }

    @Override
    public List<Map<String, Object>> selectTaskStatisticQmsSet(String type) {
        List<Map<String, Object>> aa = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Map<String, Object> b = new HashMap<>();
            b.put("sort", i + "");
            b.put("name", "测试" + i);
            b.put("value", "" + i * 10);
            aa.add(b);
        }
        return aa;
    }

    @Override
    public Page<EquipmentscheduleDto> selecteGantetuDevice(String type, RestJsonWrapperBean wrapper) {
        PageRowBounds rowBounds = wrapper.extractPageRowBounds();
        List<EquipmentscheduleDto> a = new ArrayList<>();
        EquipmentscheduleDto b = new EquipmentscheduleDto();
        b.setEquipname("设备1");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-05-10");
        b.setEquiptCode("equiptCode1");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备2");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-01-20");
        b.setEquiptCode("equiptCode2");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备3");
        b.setStartDate("2020-01-20");
        b.setEndDate("2020-02-20");
        b.setEquiptCode("equiptCode3");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备4");
        b.setStartDate("2020-02-20");
        b.setEndDate("2020-02-30");
        b.setEquiptCode("equiptCode4");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备5");
        b.setStartDate("2020-02-30");
        b.setEndDate("2020-03-20");
        b.setEquiptCode("equiptCode5");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备6");
        b.setStartDate("2020-03-20");
        b.setEndDate("2020-04-25");
        b.setEquiptCode("equiptCode6");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备7");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-05-01");
        b.setEquiptCode("equiptCode7");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备8");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-01-30");
        b.setEquiptCode("equiptCode8");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备9");
        b.setStartDate("2020-01-30");
        b.setEndDate("2020-02-25");
        b.setEquiptCode("equiptCode9");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备10");
        b.setStartDate("2020-02-25");
        b.setEndDate("2020-03-28");
        b.setEquiptCode("equiptCode10");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备11");
        b.setStartDate("2020-03-28");
        b.setEndDate("2020-04-25");
        b.setEquiptCode("equiptCode11");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备12");
        b.setStartDate("2020-04-25");
        b.setEndDate("2020-05-03");
        b.setEquiptCode("equiptCode12");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备13");
        b.setStartDate("2020-01-01");
        b.setEndDate("2020-01-20");
        b.setEquiptCode("equiptCode13");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备14");
        b.setStartDate("2020-01-20");
        b.setEndDate("2020-02-20");
        b.setEquiptCode("equiptCode14");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备15");
        b.setStartDate("2020-02-20");
        b.setEndDate("2020-02-30");
        b.setEquiptCode("equiptCode15");
        a.add(b);
        b = new EquipmentscheduleDto();
        b.setEquipname("设备16");
        b.setStartDate("2020-02-30");
        b.setEndDate("2020-03-20");
        b.setEquiptCode("equiptCode16");
        a.add(b);
        rowBounds.setTotal(16);
        int pageNumber = rowBounds.getPageNumber();
        pageNumber = pageNumber - 1;
        int fromIndex = pageNumber * 6;
        int toIndex = ((pageNumber + 1) * 6);
        if (toIndex > 16) {
            toIndex = 16;
            fromIndex = 0;
        }
        List<EquipmentscheduleDto> subList = a.subList(fromIndex, toIndex);
        Page<EquipmentscheduleDto> page = MybatisPageHelper.get(rowBounds, () -> {
            return subList;
        });
        return page;
    }


    @Override
    public List<EquipmentscheduleDto> selectGantetuScheduleSet(String type, RestJsonWrapperBean wrapper) {
        String equiptCode = wrapper.getParamValue("equiptCode");
        List<EquipmentscheduleDto> a = new ArrayList<>();
        for (int i = 1; i < 17; i++) {
            if (i % 2 != 0) {
                EquipmentscheduleDto b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("计划工期");
                b.setStartDate("2020-01-01");
                b.setEndDate("2020-05-10");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("可行性研究阶段");
                b.setStartDate("2020-01-01");
                b.setEndDate("2020-01-20");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("初步设计阶段");
                b.setStartDate("2020-01-20");
                b.setEndDate("2020-02-20");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("施工图设计阶段");
                b.setStartDate("2020-02-20");
                b.setEndDate("2020-02-30");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("项目实施阶段");
                b.setStartDate("2020-02-30");
                b.setEndDate("2020-03-20");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("项目验收阶段");
                b.setStartDate("2020-03-20");
                b.setEndDate("2020-04-25");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
            } else {
                EquipmentscheduleDto b = new EquipmentscheduleDto();
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("计划工期");
                b.setStartDate("2020-04-02");
                b.setEndDate("2020-10-04");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("可行性研究阶段");
                b.setStartDate("2020-04-02");
                b.setEndDate("2020-04-30");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("初步设计阶段");
                b.setStartDate("2020-05-01");
                b.setEndDate("2020-05-15");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("施工图设计阶段");
                b.setStartDate("2020-05-16");
                b.setEndDate("2020-6-30");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("项目实施阶段");
                b.setStartDate("2020-07-01");
                b.setEndDate("2020-08-02");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
                b = new EquipmentscheduleDto();
                b.setEquipname("设备" + i);
                b.setStep("项目验收阶段");
                b.setStartDate("2020-08-03");
                b.setEndDate("2020-10-04");
                b.setEquiptCode("equiptCode" + i);
                a.add(b);
            }
        }
        return a.stream().filter(e -> e.getEquiptCode().equals(equiptCode)).collect(Collectors.toList());
    }

    @Override
    public List<PieDataDTO> pieInfo(String type, DateCondition dateCondition) {
        List<PieDataDTO> list = new ArrayList<PieDataDTO>();
        PieDataDTO dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("育成牛");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(10);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("育成牛");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("育成牛");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(20);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("牛");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(9);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("牛");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(8);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("牛");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(9);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("犊牛");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(18);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("犊牛");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("犊牛");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(3);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("种公牛");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(8);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("种公牛");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(9);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("种公牛");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(20);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("奶牛");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(18);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("奶牛");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("奶牛");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(3);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("生产奶牛");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(8);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("生产奶牛");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(9);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setSubclass("生产奶牛");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(20);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("育成犬");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(10);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("育成犬");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("育成犬");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(20);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("犬");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(9);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("犬");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(8);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("犬");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(9);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("犊犬");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(18);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("犊犬");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("犊犬");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(3);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("奶犬");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(28);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("奶犬");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(2);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setSubclass("奶犬");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(4);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("育成猪");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(10);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("育成猪");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("育成猪");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(9);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("犊猪");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(18);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("犊猪");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("犊猪");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(3);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("种公猪");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(28);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("种公猪");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(42);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("种公猪");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(23);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("野猪");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(8);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("野猪");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(13);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setSubclass("野猪");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(63);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("育成羊");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(10);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("育成羊");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(12);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("育成羊");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(20);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("犊羊");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(14);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("犊羊");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(8);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("犊羊");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(45);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("藏羚羊");
        dto.setTestName("口蹄疫抗体O型");
        dto.setValue(114);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("藏羚羊");
        dto.setTestName("口蹄疫抗体A型");
        dto.setValue(28);
        list.add(dto);
        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setSubclass("藏羚羊");
        dto.setTestName("布鲁氏菌病抗体");
        dto.setValue(5);
        list.add(dto);
        return list;
    }
    
    /**
     * ADC饼图
     * @return
     * @param type
     */
    @Override
    public List<PieDataDTO> pieChartInfo(String type, DateCondition dateCondition) {
        List<PieDataDTO> list = new ArrayList<PieDataDTO>();
        PieDataDTO dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setValue(30);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setValue(15);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setValue(12);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setValue(5);
        list.add(dto);
        
        dto = new PieDataDTO();
        dto.setCategory("鸡");
        dto.setValue(21);
        list.add(dto);
        
        dto = new PieDataDTO();
        dto.setCategory("鹅");
        dto.setValue(8);
        list.add(dto);
        
        dto = new PieDataDTO();
        dto.setCategory("马");
        dto.setValue(42);
        list.add(dto);
        return list;
    }

    @Override
    public List<PieDataDTO> selectInspectionStatisticInfo(String type, DateCondition dateCondition) {
        List<PieDataDTO> list = new ArrayList<PieDataDTO>();
        PieDataDTO dto = new PieDataDTO();
        dto.setCategory("牛");
        dto.setValue(30);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("犬");
        dto.setValue(15);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("猪");
        dto.setValue(12);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("羊");
        dto.setValue(5);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("鸡");
        dto.setValue(21);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("鹅");
        dto.setValue(8);
        list.add(dto);

        dto = new PieDataDTO();
        dto.setCategory("马");
        dto.setValue(42);
        list.add(dto);
        return list;
    }

    /**
     * 查询卡片标题数据
     * @return
     * @param type
     */
    @Override
    public Map<String, GroupStatesDTO> selectCardTitle(String type) {
        Map<String, GroupStatesDTO> b = new HashMap<>(4);
        switch (type){
            case "lostWarning":
                b.put("item1", new GroupStatesDTO("一周到两周未联系", "0个"));
                b.put("item2", new GroupStatesDTO("两周到一月未联系", "0个"));
                b.put("item1", new GroupStatesDTO("一月到两月未联系", "0个"));
                b.put("item1", new GroupStatesDTO("两月以上未联系", "665个"));
            case "customerChg":
                b.put("item1", new GroupStatesDTO("七天内新增客户", "5个"));
            default:
                b.put("title", new GroupStatesDTO("麦趣尔LIMS实验室信息管理系统", ""));
                b.put("image", new GroupStatesDTO("/static/lims/module/index/workspace/img/company-logo.png", ""));

                b.put("quality", new GroupStatesDTO("质量", "4.9"));
                b.put("server", new GroupStatesDTO("服务", "4.8"));
                b.put("efficiency", new GroupStatesDTO("效率", "4.8"));

                b.put("waitOfInspection", new GroupStatesDTO("待检测项目", "1962"));
                b.put("inspecting", new GroupStatesDTO("在检测项目", "62"));
                b.put("reported", new GroupStatesDTO("已发布报告", "4.8"));
                b.put("exception", new GroupStatesDTO("异常检测项目", "4.8"));
                b.put("waitOfEvaluated", new GroupStatesDTO("待评价", "4.8"));

                b.put("time", new GroupStatesDTO("时间", "2020121209 11：32 星期六"));
        }

        return b;
    }

    @Override
    public List<KeyNumberDTO> selectAreaChart(String type, DateCondition dateCondition) {
        return Lists.newArrayList(
                new KeyNumberDTO("11/15", new BigDecimal(18)),
                new KeyNumberDTO("11/16", new BigDecimal(100)),
                new KeyNumberDTO("11/17", new BigDecimal(75)),
                new KeyNumberDTO("11/18", new BigDecimal(60)),
                new KeyNumberDTO("11/19", new BigDecimal(70)),
                new KeyNumberDTO("11/20", new BigDecimal(26)),
                new KeyNumberDTO("11/21", new BigDecimal(28)),
                new KeyNumberDTO("11/22", new BigDecimal(45)),
                new KeyNumberDTO("11/23", new BigDecimal(66)),
                new KeyNumberDTO("11/24", new BigDecimal(78)),
                new KeyNumberDTO("11/25", new BigDecimal(100)),
                new KeyNumberDTO("11/26", new BigDecimal(90)),
                new KeyNumberDTO("11/27", new BigDecimal(75)),
                new KeyNumberDTO("11/28", new BigDecimal(60)),
                new KeyNumberDTO("11/29", new BigDecimal(70))
        );
    }

    /**
     * 通知公告
     *
     * @param type 根据url的type值返回不同类别的数据
     * @return
     */
    @Override
    public List<NoticeInfo> noticeInfo(String type) {
        if ("gzdt".equals(type)) {
            return Lists.newArrayList(
                    new NoticeInfo("任务", "国有企业文化问题根源及文化重塑任务已下达到各个部门。", "2020-12-19"),
                    new NoticeInfo("谈话", "我局新提拔任用干部党风廉政谈话工作开展的如火如荼。", "2020-12-15"),
                    new NoticeInfo("工作", "市大鹏半岛水源工程管理处负责人到现场观摩指导工作。", "2020-12-03")
            );
        } else if ("zcfg".equals(type)) {
            return Lists.newArrayList(
                    new NoticeInfo("学习", "水利部召开党组扩大会议学习十八大报告。", "2020-12-19"),
                    new NoticeInfo("政策", "水利部引发全面推进河长制工。", "2020-12-15"),
                    new NoticeInfo("扶贫", "水批捕召开2020年第五次扶贫工作总结会议。", "2020-12-03")
            );
        }

        return new ArrayList<>(0);
    }

    @Override
    public DataGridDTO dataGridInfo(String type, DateCondition dateCondition) {
        List<Title> titles = Lists.newArrayList(
                new Title("受理单号", "folderNo", "50"),
                new Title("采样点", "address", "100"),
                new Title("检测项目", "testName", "50"),
                new Title("检测日期", "testDate", "50")
        );


        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> record1 = new HashMap<>();
        record1.put("folderNo", "2020-WTO-03");
        record1.put("address", "养猪场");
        record1.put("testName", "口蹄疫C型病毒检测");
        record1.put("testDate", "2020-12-07");
        record1.put("href", 20200421);
        data.add(record1);

        Map<String, Object> record2 = new HashMap<>();
        record2.put("folderNo", "2020-WTO-04");
        record2.put("address", "养猪场");
        record2.put("testName", "口蹄疫D型病毒检测");
        record2.put("testDate", "2020-12-07");
        record1.put("href", 20200421);
        data.add(record2);

        Map<String, Object> record3 = new HashMap<>();
        record3.put("folderNo", "2020-WTO-05");
        record3.put("address", "养猪场");
        record3.put("testName", "口蹄疫E型病毒检测");
        record3.put("testDate", "2020-12-07");
        record1.put("href", 20200421);
        data.add(record3);
        return new DataGridDTO(titles, data, 2);
    }

    @Override
    public List<OrderStatis> orderStatistic() {
        return Lists.newArrayList(
                new OrderStatis("YSW0001", "沥青", "1001", "2021-02-01 09:31:00", "待检验"),
                new OrderStatis("YSW0001", "汽油", "1002", "2021-02-01 09:31:00", "待检验"),
                new OrderStatis("YSW0001", "柴油", "1003", "2021-02-01 09:31:00", "待检验"),
                new OrderStatis("YSW0001", "酒精", "1004", "2021-02-01 09:31:00", "待检验"),
                new OrderStatis("YSW0001", "重油", "1005", "2021-02-01 09:31:00", "待检验"));
    }

    @Override
    public List<ItemInfo> itemList(String type,String datetype, DateCondition dateCondition) {
        return Lists.newArrayList(
                new ItemInfo("总合同", "1000", "1", "/static/icon/todo/001.png"),
                new ItemInfo("已完成", "1000", "1", "/static/icon/todo/002.png"),
                new ItemInfo("未完成", "1000", "1", "/static/icon/todo/003.png"),
                new ItemInfo("即将超期", "1000", "1", "/static/icon/todo/004.png"),
                new ItemInfo("已超期", "1000", "1", "/static/icon/todo/005.png")
        );
    }

    @Override
    public List<LimsTodoNoticeDTO> selectMessages(String type) {
        return Lists.newArrayList(
                new LimsTodoNoticeDTO("1", "用章申请信息", "用章申请审核完成，用章编号：YZ2021001", LocalDate.now(), "系统管理员"),
                new LimsTodoNoticeDTO("2", "用章申请信息", "用章申请审核完成，用章编号：YZ2021002", LocalDate.now(), "安全测试")
        );
    }

    @Override
    public void msgFinished(String id) {
        //调用接口
    }

    @Override
    public List<GroupStatesDTO> indexCard(String type) {
        List<GroupStatesDTO> data = new ArrayList<>();
        switch (type) {
            case "lostWarning":
                data.add(new GroupStatesDTO("一周到两周未联系", "0个"));
                data.add(new GroupStatesDTO("两周到一月未联系", "0个"));
                data.add(new GroupStatesDTO("一月到两月未联系", "0个"));
                data.add(new GroupStatesDTO("两月以上未联系", "665个"));
            case "customerChg":
                data.add(new GroupStatesDTO("七天内新增客户", "5个"));
            default:
                data.add(new GroupStatesDTO("七天内新增客户", "5个"));
        }

        return data;
    }

    @Override
    public List<ObjectGrowthDTO> selectBusinessGrowthInfo(DateCondition dateCondition) {
        List<ObjectGrowthDTO> data = new ArrayList<>();
        data.add(new ObjectGrowthDTO("2021-01",560,"食品检验所"));
        data.add(new ObjectGrowthDTO("2021-02",345,"食品检验所"));
        data.add(new ObjectGrowthDTO("2021-03",246,"食品检验所"));
        data.add(new ObjectGrowthDTO("2021-04",368,"食品检验所"));
        data.add(new ObjectGrowthDTO("2021-05",689,"食品检验所"));
        data.add(new ObjectGrowthDTO("2021-01",780,"建材检验所"));
        return data;
    }

    @Override
    public List<ObjectDoubleGrowthDTO> selectInvoiceGrowthInfo(DateCondition dateCondition) {
        List<ObjectDoubleGrowthDTO> data = new ArrayList<>();
        data.add(new ObjectDoubleGrowthDTO("2021-01",561d,"2021"));
        data.add(new ObjectDoubleGrowthDTO("2021-02",245d,"2021"));
        data.add(new ObjectDoubleGrowthDTO("2021-03",146d,"2021"));
        data.add(new ObjectDoubleGrowthDTO("2021-04",268d,"2021"));
        data.add(new ObjectDoubleGrowthDTO("2021-05",589d,"2021"));
        data.add(new ObjectDoubleGrowthDTO("2020-01",180d,"2020"));
        data.add(new ObjectDoubleGrowthDTO("2020-02",200d,"2020"));
        data.add(new ObjectDoubleGrowthDTO("2020-03",4000d,"2020"));
        data.add(new ObjectDoubleGrowthDTO("2020-04",360d,"2020"));
        data.add(new ObjectDoubleGrowthDTO("2020-05",110d,"2020"));
        return data;
    }

    @Override
    public List<ObjectGrowthDTO> selectCustomerGrowthInfo(DateCondition dateCondition) {
        List<ObjectGrowthDTO> data = new ArrayList<>();
        data.add(new ObjectGrowthDTO("2021-01",561,"2021"));
        data.add(new ObjectGrowthDTO("2021-02",245,"2021"));
        data.add(new ObjectGrowthDTO("2021-03",146,"2021"));
        data.add(new ObjectGrowthDTO("2021-04",268,"2021"));
        data.add(new ObjectGrowthDTO("2021-05",589,"2021"));
        data.add(new ObjectGrowthDTO("2020-01",180,"2020"));
        data.add(new ObjectGrowthDTO("2020-02",200,"2020"));
        data.add(new ObjectGrowthDTO("2020-03",4000,"2020"));
        data.add(new ObjectGrowthDTO("2020-04",360,"2020"));
        data.add(new ObjectGrowthDTO("2020-05",110,"2020"));
        return data;
    }

    @Override
    public LimsMonitoringInstrumentDTO selectSampingCompleteWaterwaveInfo(String type, DateCondition dateCondition) {
        LimsMonitoringInstrumentDTO dto = new LimsMonitoringInstrumentDTO();
        dto.setCurrentValue(70);
        dto.setTotalValue(100);
        return dto;
    }

    @Override
    public List<NameValueDTO> selectSampingWaterwaveInfo(String type, DateCondition dateCondition) {
        return Lists.newArrayList(
                new NameValueDTO("未完成", "委托检验", 560),
                new NameValueDTO("未完成", "抽检检测", 300),
                new NameValueDTO("未完成", "监督抽查", 120),
                new NameValueDTO("未完成", "评价性检验", 480),
                new NameValueDTO("未完成", "评估检测", 320)
        );
    }

    @Override
    public List<NameValueDTO> selectSampingAreaInfo(String type, DateCondition dateCondition) {
        return Lists.newArrayList(
                new NameValueDTO("南宁市", 560),
                new NameValueDTO("桂林市", 300),
                new NameValueDTO("柳州市", 120),
                new NameValueDTO("梧州市", 480),
                new NameValueDTO("北海市", 320)
        );
    }

    @Override
    public List<NameDoubleValue> selectInspectiondeptStatisticInfo(DateCondition dateCondition) {
        return Lists.newArrayList(
                new NameDoubleValue("本期到样数", "食品检验所", (double)560),
                new NameDoubleValue("到样完成数", "食品检验所", (double)300),
                new NameDoubleValue("到样未完成数", "食品检验所", (double)260)
        );
    }

    @Override
    public List<InvoiceInfoDTO> selectInvoicedeptstatisticSet(DateCondition dateCondition) {
        List<InvoiceInfoDTO> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            InvoiceInfoDTO dto = new InvoiceInfoDTO();
            dto.setProgressName("发票" + i);
            dto.setCurrentValue(Double.valueOf(i * 10));
            dto.setTotalValue(100d);
            a.add(dto);
        }
        return a;
    }

    @Override
    public List<ProgressInfoDTO> selectCustomerdeptstatisticSet(DateCondition dateCondition) {
        List<ProgressInfoDTO> a = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            ProgressInfoDTO dto = new ProgressInfoDTO();
            dto.setProgressName("客户" + i);
            dto.setCurrentValue(i * 10);
            dto.setTotalValue(100);
            a.add(dto);
        }
        return a;
    }

    @Override
    public List<GroupStatesDTO> selectInstrumentusageSet(String type , DateCondition dateCondition) {
        return Lists.newArrayList(
                new GroupStatesDTO("天平", "15"),
                new GroupStatesDTO("示波器", "40"),
                new GroupStatesDTO("移液枪 ", "50"),
                new GroupStatesDTO("温度计", "80"),
                new GroupStatesDTO("台式机", "46"),
                new GroupStatesDTO("单标线吸管", "35"),
                new GroupStatesDTO("酒精计", "76"),
                new GroupStatesDTO("氮吹仪", "16")
        );
    }

    @Override
    public List<GroupStatesDTO> selectStaffworkloadSet(String type, DateCondition dateCondition) {
        return Lists.newArrayList(
                new GroupStatesDTO("杨幂", "15"),
                new GroupStatesDTO("张学友", "40"),
                new GroupStatesDTO("方大同", "50"),
                new GroupStatesDTO("萧敬腾", "80"),
                new GroupStatesDTO("侯佩岑", "46"),
                new GroupStatesDTO("蔡依林", "35"),
                new GroupStatesDTO("许嵩", "76"),
                new GroupStatesDTO("杨颖", "16")
        );
    }

    @Override
    public NameValueDTO selectTodocount() {
        return new NameValueDTO("count",133);
    }
}
