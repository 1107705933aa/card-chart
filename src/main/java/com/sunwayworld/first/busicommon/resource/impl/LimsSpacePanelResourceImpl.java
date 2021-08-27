package com.sunwayworld.first.busicommon.resource.impl;

import com.sunwayworld.first.busicommon.bean.*;
import com.sunwayworld.first.busicommon.resource.LimsSpacePanelResource;
import com.sunwayworld.first.busicommon.service.LimsSpacePanelService;
import com.sunwayworld.framework.data.page.Page;
import com.sunwayworld.framework.log.annotation.Log;
import com.sunwayworld.framework.log.annotation.LogModule;
import com.sunwayworld.framework.log.annotation.LogType;
import com.sunwayworld.framework.restful.data.RestJsonWrapperBean;
import com.sunwayworld.framework.spring.annotation.GikamBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@LogModule("面板数据查询")
@RestController
@GikamBean
public class LimsSpacePanelResourceImpl implements LimsSpacePanelResource {
    @Autowired
    private LimsSpacePanelService limsSpacePanelService;

    @Log(value = "查询监控仪表盘", type = LogType.SELECT)
    @Override
    public List<LimsMonitoringInstrumentDTO> selectMonitoringInstrumentDTOSet(@PathVariable String type) {
        return limsSpacePanelService.selectMonitoringInstrumentDTOSet(type);
    }

    @Log(value = "查询样品检验进度", type = LogType.SELECT)
    @Override
    public List<ProgressInfoDTO> progressInfo(@PathVariable String type) {
        return limsSpacePanelService.progressInfo(type);
    }

    @Log(value = "查询装置合格率", type = LogType.SELECT)
    @Override
    public List<HistogramOfMultiItemDTO> histogramOfMultiItem(String year, String type,DateCondition dateCondition) {
        return limsSpacePanelService.histogramOfMultiItem(year, type, dateCondition);
    }

    @Log(value = "分段柱形图", type = LogType.SELECT)
    @Override
    public List<HistogramOfMultiSagment> histogramOfMultiSegment(@PathVariable String mtlType, DateCondition dateCondition) {
        return limsSpacePanelService.histogramOfMultiSagment(mtlType, dateCondition);
    }

    @Log(value = "查询检测进度", type = LogType.SELECT)
    @Override
    public List<ProgressInfoDTO> selectTestProgressSet(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectTestProgressSet(type,dateCondition);
    }

    @Log(value = "查询阳性检测单", type = LogType.SELECT)
    @Override
    public List<LimsPositiveTestDTO> selectPositiveTestDTOSet(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectPositiveTestDTOSet(type, dateCondition);
    }

    @Log(value = "查询待办事项", type = LogType.SELECT)
    @Override
    public List<LimsTodoNoticeDTO> selectLimsTodoSet(@PathVariable String type) {
        return limsSpacePanelService.selectLimsTodoSet(type);
    }

    @Log(value = "查询系统提醒", type = LogType.SELECT)
    @Override
    public List<LimsTodoNoticeDTO> selectLimsNoticeSet(@PathVariable String type) {
        return limsSpacePanelService.selectLimsNoticeSet(type);
    }

    @Log(value = "查询最后登录时间", type = LogType.SELECT)
    @Override
    public UserCard userInfo(@PathVariable String type) {
        return limsSpacePanelService.userInfo(type);
    }

    @Log(value = "查询轮播图", type = LogType.SELECT)
    @Override
    public List<Map<String, String>> selectRotationchartSet(@PathVariable String type) {
        return limsSpacePanelService.selectRotationchartSet(type);
    }

    @Log(value = "查询柱形图数据信息", type = LogType.SELECT)
    @Override
    public List<GroupStatesDTO> histogramInfo(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.histogramInfo(type, dateCondition);
    }

    @Log(value = "查询顶部数量", type = LogType.SELECT)
    @Override
    public Map<String, GroupStatesDTO> selectHeadCountSet(@PathVariable String type) {
        return limsSpacePanelService.selectHeadCountSet(type);
    }

    @Log(value = "查询设备排程", type = LogType.SELECT)
    @Override
    public List<EquipmentscheduleDto> selectequipmentscheduleSet(@PathVariable String type) {
        return limsSpacePanelService.selectequipmentscheduleSet(type);
    }

    @Log(value = "查询春防数据", type = LogType.SELECT)
    @Override
    public DataOnMap tagOnMap(@PathVariable String type, DateCondition dateCondition) {
        return (DataOnMap) limsSpacePanelService.tagOnMap(type,dateCondition);
    }

    /**
     * 查询热点地图数据
     *
     * @param type
     * @return
     */
    @Override
    public List<Map<String, Object>> selectHotPointMapData(String type) {
        return limsSpacePanelService.selectHotPointMapData(type);
    }

    @Log(value = "查询水波图", type = LogType.SELECT)
    @Override
    public List<Map<String, Object>> selectWaterWaveSet(@PathVariable String type) {
        return limsSpacePanelService.selectWaterWaveSet(type);
    }

    @Log(value = "查询QMS水波图", type = LogType.SELECT)
    @Override
    public List<Map<String, Object>> selectWaterWaveQmsSet(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectWaterWaveQmsSet(type, dateCondition);
    }

    @Log(value = "查询NgWafer", type = LogType.SELECT)
    @Override
    public List<Map<String, Object>> selectNgWaferQmsSet(@PathVariable String type) {
        return limsSpacePanelService.selectNgWaferQmsSet(type);
    }

    @Log(value = "月度样品数量", type = LogType.SELECT)
    @Override
    public List<Map<String, Object>> selectSampleCountQmsSet(@PathVariable String type) {
        return limsSpacePanelService.selectSampleCountQmsSet(type);
    }

    @Log(value = "测试数量", type = LogType.SELECT)
    @Override
    public List<Map<String, Object>> selectTaskStatisticQmsSet(@PathVariable String type) {
        return limsSpacePanelService.selectTaskStatisticQmsSet(type);
    }

    @Log(value = "甘特图设备集合", type = LogType.SELECT)
    @Override
    public Page<EquipmentscheduleDto> ganttChartSummary(String type, RestJsonWrapperBean wrapper) {
        return limsSpacePanelService.selecteGantetuDevice(type, wrapper);
    }

    @Log(value = "甘特图单个设备schedule", type = LogType.SELECT)
    @Override
    public List<EquipmentscheduleDto> selectGantetuScheduleSet(String type, RestJsonWrapperBean wrapper) {
        return limsSpacePanelService.selectGantetuScheduleSet(type, wrapper);
    }

    @Log(value = "任务统计", type = LogType.SELECT)
    @Override
    public List<PieDataDTO> pieInfo(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.pieInfo(type, dateCondition);
    }

    @Log(value = "ADC饼图", type = LogType.SELECT)
    @Override
    public List<PieDataDTO> pieChartInfo(String type, DateCondition dateCondition) {
        return limsSpacePanelService.pieChartInfo(type, dateCondition);
    }

    @Log(value = "各类检验情况统计", type = LogType.SELECT)
    @Override
    public List<PieDataDTO> selectInspectionStatisticInfo(String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectInspectionStatisticInfo(type, dateCondition);
    }

    /**
     * 查询卡片标题的数据
     * @return
     */
    @Override
    public Map<String, GroupStatesDTO> selectCardTitle(@PathVariable String type) {
        return limsSpacePanelService.selectCardTitle(type);
    }

    @Override
    public List<GroupStatesDTO> indexCard(String type) {
        return limsSpacePanelService.indexCard(type);
    }

    @Override
    public List<KeyNumberDTO> selectAreaChart(@PathVariable("type") String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectAreaChart(type, dateCondition);
    }

    @Override
    public List<NoticeInfo> noticeInfo(@PathVariable String type) {
        return limsSpacePanelService.noticeInfo(type);
    }

    @Override
    public DataGridDTO dataGridInfo(String type, DateCondition dateCondition) {
        return limsSpacePanelService.dataGridInfo(type, dateCondition);
    }

    @Override
    public List<OrderStatis> orderStatistic() {
        return limsSpacePanelService.orderStatistic();
    }

    @Override
    public List<ItemInfo> itemList(String type, String datetype, DateCondition dateCondition) {
        return limsSpacePanelService.itemList(type, datetype, dateCondition);
    }

    @Override
    public List<LimsTodoNoticeDTO> selectMessages(String type) {
        return limsSpacePanelService.selectMessages(type);
    }

    @Override
    public int msgFinished(String id) {
        limsSpacePanelService.msgFinished(id);
        return 1;
    }

    @Log(value = "业务增长量数据", type = LogType.SELECT)
    @Override
    public List<ObjectGrowthDTO> selectBusinessGrowthInfo(DateCondition dateCondition) {
        return limsSpacePanelService.selectBusinessGrowthInfo(dateCondition);
    }

    @Log(value = "同期发票增长对比数据", type = LogType.SELECT)
    @Override
    public List<ObjectDoubleGrowthDTO> selectInvoiceGrowthInfo(DateCondition dateCondition) {
        return limsSpacePanelService.selectInvoiceGrowthInfo(dateCondition);
    }

    @Log(value = "同期客户增长对比", type = LogType.SELECT)
    @Override
    public List<ObjectGrowthDTO> selectCustomerGrowthInfo(DateCondition dateCondition) {
        return limsSpacePanelService.selectCustomerGrowthInfo(dateCondition);
    }

    @Log(value = "抽样整体完成情况水波图", type = LogType.SELECT)
    @Override
    public LimsMonitoringInstrumentDTO selectSampingCompleteWaterwaveInfo(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectSampingCompleteWaterwaveInfo(type,dateCondition);
    }

    @Log(value = "抽检情况：计划数/完成数", type = LogType.SELECT)
    @Override
    public List<NameValueDTO> selectSampingWaterwaveInfo(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectSampingWaterwaveInfo(type, dateCondition);
    }

    @Log(value = "抽检地域分布", type = LogType.SELECT)
    @Override
    public List<NameValueDTO> selectSampingAreaInfo(@PathVariable String type, DateCondition dateCondition) {
        return limsSpacePanelService.selectSampingAreaInfo(type,dateCondition);
    }

    @Log(value = "检所检验情况统计", type = LogType.SELECT)
    @Override
    public List<NameDoubleValue> selectInspectiondeptStatisticInfo(DateCondition dateCondition) {
        return limsSpacePanelService.selectInspectiondeptStatisticInfo(dateCondition);
    }

    @Log(value = "各部门发票统计", type = LogType.SELECT)
    @Override
    public List<InvoiceInfoDTO> selectInvoicedeptstatisticSet(DateCondition dateCondition) {
        return limsSpacePanelService.selectInvoicedeptstatisticSet(dateCondition);
    }

    @Log(value = "各部门客户统计", type = LogType.SELECT)
    @Override
    public List<ProgressInfoDTO> selectCustomerdeptstatisticSet(DateCondition dateCondition) {
        return limsSpacePanelService.selectCustomerdeptstatisticSet(dateCondition);
    }

    @Log(value = "仪器使用情况", type = LogType.SELECT)
    @Override
    public List<GroupStatesDTO> selectInstrumentusageSet(@PathVariable String type , DateCondition dateCondition) {
        return limsSpacePanelService.selectInstrumentusageSet(type, dateCondition);
    }
    @Log(value = "人员工作量情况", type = LogType.SELECT)
    @Override
    public List<GroupStatesDTO> selectStaffworkloadSet(@PathVariable String type , DateCondition dateCondition) {
        return limsSpacePanelService.selectStaffworkloadSet(type, dateCondition);
    }

    @Log(value = "待办数量", type = LogType.SELECT)
    @Override
    public NameValueDTO selectTodocount() {
        return limsSpacePanelService.selectTodocount();
    }
}
