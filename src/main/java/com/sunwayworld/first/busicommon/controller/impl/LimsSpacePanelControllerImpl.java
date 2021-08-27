package com.sunwayworld.first.busicommon.controller.impl;


import com.sunwayworld.first.busicommon.controller.LimsSpacePanelController;
import com.sunwayworld.framework.log.annotation.Log;
import com.sunwayworld.framework.log.annotation.LogType;
import com.sunwayworld.framework.spring.annotation.GikamBean;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Base64;

@Controller
@GikamBean
public class LimsSpacePanelControllerImpl implements LimsSpacePanelController {

    @Override
    @Log(value = "工作空间用户模块页面", type = LogType.CONTROLLER)
    public String indexUserPage() {
        return "first/busicommon/user";
    }

    @Override
    @Log(value = "工作空间实验室任务统计模块页面", type = LogType.CONTROLLER)
    public String indexLaboratoryTaskStatisticPage() {
        return "first/busicommon/laboratory-task-statistic";
    }

    @Override
    @Log(value = "工作空间各岗位待测试任务模块页面", type = LogType.CONTROLLER)
    public String indexPostOrderTaskPage() {
        return "first/busicommon/post-order-task";
    }

    @Override
    @Log(value = "工作空间检验任务类型模块页面", type = LogType.CONTROLLER)
    public String indexTaskCategoryPage() {
        return "first/busicommon/task-category";
    }

    @Override
    @Log(value = "工作空间出厂报告数量模块页面", type = LogType.CONTROLLER)
    public String indexFactoryReportStatisticPage() {
        return "first/busicommon/factory-report-statistic";
    }

    @Override
    @Log(value = "工作空间合格率统计模块页面", type = LogType.CONTROLLER)
    public String indexQualifiedRateStatisticPage() {
        return "first/busicommon/qualified-rate-statistic";
    }

    @Override
    @Log(value = "工作空间关键点趋势图模块页面", type = LogType.CONTROLLER)
    public String indexKeyPointTrendPage() {
        return "first/busicommon/key-point-trend";
    }

    @Override
    @Log(value = "业务流程图", type = LogType.CONTROLLER)
    public String businessDiagramPage() {
        return "first/busicommon/business-process-diagram";
    }

    @Override
    @Log(value = "关键点正态分布图", type = LogType.CONTROLLER)
    public String indexTestpanelPage() {
        return "first/busicommon/key-point-distribution";
    }

    @Override
    @Log(value = "待办事项页面", type = LogType.CONTROLLER)
    public String indexTodoPanelNewPage() {
        return "first/busicommon/todo-panel-new";
    }

    @Override
    @Log(value = "监控仪表盘页面", type = LogType.CONTROLLER)
    public String indexMonitoringInstrumentBoardPage() {
        return "first/busicommon/monitoring-instrument-board";
    }

    @Override
    @Log(value = "通知公告页面", type = LogType.CONTROLLER)
    public String indexNoticePanelNewPage() {
        return "first/busicommon/notice-panel-new";
    }

    @Override
    @Log(value = "样品检验进度页面", type = LogType.CONTROLLER)
    public String indexSampleProgressStatisticPage() {
        return "first/busicommon/sample-progress-statistic";
    }

    @Override
    @Log(value = "装置合格率页面", type = LogType.CONTROLLER)
    public String indexDeviceRateStatisticPage() {
        return "first/busicommon/device-rate-statistic";
    }

    @Override
    @Log(value = "阳性位置页面", type = LogType.CONTROLLER)
    public String indexPositivePositionPage() {
        return "first/busicommon/positivePosition";
    }

    @Override
    @Log(value = "春防页面", type = LogType.CONTROLLER)
    public String indexSpringDefensePage() {
        return "first/busicommon/springDefense";
    }

    @Override
    public String indexCurrentUserInfoPage() {
        return "first/busicommon/current-user-info";
    }

    @Override
    @Log(value = "阳性检测单页面", type = LogType.CONTROLLER)
    public String indexPositiveTestPage() {
        return "first/busicommon/positive-test";
    }

    @Override
    @Log(value = "报告数量页面", type = LogType.CONTROLLER)
    public String indexReportCountPage() {
        return "first/busicommon/report-count";
    }

    @Override
    @Log(value = "待办事项页面", type = LogType.CONTROLLER)
    public String indexTodoPanelAdcPage() {
        return "first/busicommon/todo-panel-adc";
    }

    @Override
    @Log(value = "检测进度页面", type = LogType.CONTROLLER)
    public String indexTestProgressPage() {
        return "first/busicommon/test-progress";
    }

    @Override
    @Log(value = "系统提醒", type = LogType.CONTROLLER)
    public String indexSystemNoticePage() {
        return "first/busicommon/system-notice";
    }

    @Override
    @Log(value = "数量统计提醒", type = LogType.CONTROLLER)
    public String indexCardHeadPage() {
        return "first/busicommon/card-head";
    }

    @Override
    @Log(value = "轮播图页面", type = LogType.CONTROLLER)
    public String indexRotationChartPage() {
        return "first/busicommon/rotation_chart";
    }

    @Override
    @Log(value = "人员当前工作量页面", type = LogType.CONTROLLER)
    public String indexPersonWorkCountPage() {
        return "first/busicommon/person-work-count";
    }

    @Override
    @Log(value = "设备排程页面", type = LogType.CONTROLLER)
    public String indexEquipmentSchedulePage() {
        return "first/busicommon/equipment_schedule";
    }

    @Override
    @Log(value = "水波图页面", type = LogType.CONTROLLER)
    public String indexWaterWavePage() {
        return "first/busicommon/water-wave";
    }

    @Override
    @Log(value = "水波图页面", type = LogType.CONTROLLER)
    public String indexWaterWaveQmsPage() {
        return "first/busicommon/water-wave-qms";
    }

    @Override
    public String indexWaterWaveDynamic() {
        return "first/busicommon/water-wave-dynamic";
    }

    @Override
    @Log(value = "人员当前工作量页面", type = LogType.CONTROLLER)
    public String indexPersonWorkCountQmsPage() {
        return "first/busicommon/person-work-count-qms";
    }

    @Override
    @Log(value = "数量统计提醒", type = LogType.CONTROLLER)
    public String indexCardHeadQmsPage() {
        return "first/busicommon/card-head-qms";
    }

    @Override
    @Log(value = "任务统计", type = LogType.CONTROLLER)
    public String indexTaskStatisticQmsPage() {
        return "first/busicommon/task-statistic-qms";
    }

    @Override
    @Log(value = "月度样品数量", type = LogType.CONTROLLER)
    public String indexSampleCountQmsPage() {
        return "first/busicommon/sample-count-qms";
    }

    @Override
    @Log(value = "通知公告页面", type = LogType.CONTROLLER)
    public String indexNoticePanelQmsPage() {
        return "first/busicommon/notice-panel-qms";
    }

    @Override
    @Log(value = "甘特图页面", type = LogType.CONTROLLER)
    public String indexGanteTuQmsOnePage() {
        return "first/busicommon/gantetu1-qms";
    }

    @Override
    @Log(value = "甘特图页面", type = LogType.CONTROLLER)
    public String indexGanteTuQmsTwoPage() {
        return "first/busicommon/gantetu2-qms";
    }

    @Override
    @Log(value = "测试类型页面", type = LogType.CONTROLLER)
    public String indexTestCategoryQmsTwoPage() {
        return "first/busicommon/test-category-qms";
    }

    @Override
    public String cardTitle() {
        return "first/busicommon/card-title";
    }

    @Override
    public String indexCard() {
        return "first/busicommon/index-card";
    }

    @Override
    public String areaChart() {
        return "first/busicommon/area-chart";
    }

    @Override
    public String dataGrid() {
        return "first/busicommon/public-table";
    }

    @Override
    public String redirect(String url) throws IOException {
        return "redirect:" + (new String(Base64.getDecoder().decode(url)));
    }

    @Override
    public String ganttChart(String type) {
        return "first/busicommon/gantt-chart";
    }

    @Override
    public String orderStatistic(String type) {
        return "first/busicommon/order-statistic";
    }

    @Override
    public String itemList(String type, String beginDate, String endDate) {
        return "first/busicommon/item-list";
    }

    @Override
    public String selectMessages(String type) {
        return "first/busicommon/message";
    }
    
    @Override
    @Log(value = "ADC饼状图", type = LogType.CONTROLLER)
    public String indexPieChartAdc() {
        return "first/busicommon/pie_chart_adc";
    }

    @Override
    @Log(value = "报工", type = LogType.CONTROLLER)
    public String indexReportWork() {
        return "first/busicommon/report-work";
    }

    @Override
    @Log(value = "我的待办", type = LogType.CONTROLLER)
    public String myToDoCard() {
        return "first/busicommon/my-todo";
    }

    @Override
    @Log(value = "各类检验情况统计", type = LogType.CONTROLLER)
    public String inspectionStatisticCard() {
        return "first/busicommon/inspection-statistic";
    }

    @Override
    @Log(value = "检验业务情况", type = LogType.CONTROLLER)
    public String inspectionConditionCard() {
        return "first/busicommon/inspection-condition";
    }

    @Override
    @Log(value = "业务增长量", type = LogType.CONTROLLER)
    public String businessGrowthCard() {
        return "first/busicommon/business-growth";
    }

    @Override
    @Log(value = "销售市场情况", type = LogType.CONTROLLER)
    public String salesSituationCard() {
        return "first/busicommon/sales-situation";
    }

    @Override
    @Log(value = "资源使用情况", type = LogType.CONTROLLER)
    public String resourceUsageCard() {
        return "first/busicommon/resource-usage";
    }

    @Override
    @Log(value = "同期发票增长对比", type = LogType.CONTROLLER)
    public String invoiceGrowthCard() {
        return "first/busicommon/invoice-growth";
    }

    @Override
    @Log(value = "各部门客户统计", type = LogType.CONTROLLER)
    public String customerStatisticsCard() {
        return "first/busicommon/customer-statistics";
    }

    @Override
    @Log(value = "同期客户增长对比", type = LogType.CONTROLLER)
    public String customerGrowthCard() {
        return "first/busicommon/customer-growth";
    }

    @Override
    @Log(value = "仪器使用情况", type = LogType.CONTROLLER)
    public String instrumentUsageCard() {
        return "first/busicommon/instrument-usage";
    }

    @Override
    @Log(value = "人员工作量情况", type = LogType.CONTROLLER)
    public String staffWorkloadCard() {
        return "first/busicommon/staff-workload";
    }

    @Override
    @Log(value = "抽检情况", type = LogType.CONTROLLER)
    public String samplingInspectionCard() {
        return "first/busicommon/sampling-inspection";
    }

    @Override
    @Log(value = "各部门发票统计", type = LogType.CONTROLLER)
    public String invoiceDeptStatisticCard() {
        return "first/busicommon/invoice-dept-statistic";
    }

    @Override
    @Log(value = "各检所检验情况统计", type = LogType.CONTROLLER)
    public String inspectionDeptStatisticCard() {
        return "first/busicommon/inspection-dept-statistic";
    }
}
