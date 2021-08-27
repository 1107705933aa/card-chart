package com.sunwayworld.first.busicommon.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@RequestMapping({"/first/busicommon/page"})
public interface LimsSpacePanelController {

    @RequestMapping("/user")
    String indexUserPage();

    @RequestMapping("/laboratory-task-statistic")
    String indexLaboratoryTaskStatisticPage();

    @RequestMapping("/post-order-task")
    String indexPostOrderTaskPage();

    @RequestMapping("/task-category")
    String indexTaskCategoryPage();

    @RequestMapping("/factory-report-statistic")
    String indexFactoryReportStatisticPage();

    @RequestMapping("/qualified-rate-statistic")
    String indexQualifiedRateStatisticPage();

    @RequestMapping("/key-point-trend")
    String indexKeyPointTrendPage();

    @RequestMapping("/business-process-diagram")
    String businessDiagramPage();
    
    @RequestMapping("/key-point-distribution")
    String indexTestpanelPage();
    
    @RequestMapping("/todo-panel-new")
    String indexTodoPanelNewPage();
    
    @RequestMapping("/monitoring-instrument-board")
    String indexMonitoringInstrumentBoardPage();
    
    @RequestMapping("/notice-panel-new")
    String indexNoticePanelNewPage();
    
    @RequestMapping("/sample-progress-statistic")
    String indexSampleProgressStatisticPage();
    
    @RequestMapping("/device-rate-statistic")
    String indexDeviceRateStatisticPage();
    
    @RequestMapping("/positive-position")
    String indexPositivePositionPage();
    
    @RequestMapping("/spring-defense")
    String indexSpringDefensePage();
    
    @RequestMapping("/current-user-info")
    String indexCurrentUserInfoPage();
    
    @RequestMapping("/positive-test")
    String indexPositiveTestPage();
    
    @RequestMapping("/report-count")
    String indexReportCountPage();
    
    @RequestMapping("/todo-panel-adc")
    String indexTodoPanelAdcPage();
    
    @RequestMapping("/test-progress")
    String indexTestProgressPage();
    
    @RequestMapping("/system-notice")
    String indexSystemNoticePage();
    
    @RequestMapping("/card-head")
    String indexCardHeadPage();
    
    @RequestMapping("/rotation_chart")
    String indexRotationChartPage();
    
    @RequestMapping("/person-work-count")
    String indexPersonWorkCountPage();
    
    @RequestMapping("/equipment_schedule")
    String indexEquipmentSchedulePage();
    
    @RequestMapping("/water-wave")
    String indexWaterWavePage();
    
    @RequestMapping("/water-wave-qms")
    String indexWaterWaveQmsPage();

    @RequestMapping("/water-wave-dynamic")
    String indexWaterWaveDynamic();

    @RequestMapping("/person-work-count-qms")
    String indexPersonWorkCountQmsPage();
    
    @RequestMapping("/card-head-qms")
    String indexCardHeadQmsPage();
    
    @RequestMapping("/task-statistic-qms")
    String indexTaskStatisticQmsPage();
    
    @RequestMapping("/sample-count-qms")
    String indexSampleCountQmsPage();
    
    @RequestMapping("/notice-panel-qms")
    String indexNoticePanelQmsPage();
    
    @RequestMapping("/gantetu1-qms")
    String indexGanteTuQmsOnePage();
    
    @RequestMapping("/gantetu2-qms")
    String indexGanteTuQmsTwoPage();
    
    @RequestMapping("/test-category-qms")
    String indexTestCategoryQmsTwoPage();

    @RequestMapping("/card-title")
    String cardTitle();

    @RequestMapping("/index-card")
    String indexCard();

    @RequestMapping("/area-chart")
    String areaChart();

    @RequestMapping("/data-grid")
    String dataGrid();

    @RequestMapping("/redirect/{url}")
    String redirect(@PathVariable String url) throws IOException;

    @RequestMapping("/gantt-chart")
    String ganttChart(@RequestParam(value = "type", required = false) String type);

    @RequestMapping("/order-statistic")
    String orderStatistic(@RequestParam(value = "type", required = false) String type);

    @RequestMapping("/item-list")
    String itemList(@RequestParam(value = "type", required = false) String type,
                    @RequestParam(value = "beginDate", required = false) String beginDate,
                    @RequestParam(value = "endDate", required = false) String endDate);

    @RequestMapping("/messages")
    String selectMessages(@RequestParam(value = "type", required = false) String type);
    
    @RequestMapping("/pie_chart_adc")
    String indexPieChartAdc();
    
    @RequestMapping("/report-work")
    String indexReportWork();

    @RequestMapping("/my-todo")
    String myToDoCard();

    @RequestMapping("/inspection-statistic")
    String inspectionStatisticCard();

    @RequestMapping("/inspection-condition")
    String inspectionConditionCard();

    @RequestMapping("/business-growth")
    String businessGrowthCard();

    @RequestMapping("/sales-situation")
    String salesSituationCard();

    @RequestMapping("/resource-usage")
    String resourceUsageCard();

    @RequestMapping("/invoice-growth")
    String invoiceGrowthCard();

    @RequestMapping("/customer-statistics")
    String customerStatisticsCard();

    @RequestMapping("/customer-growth")
    String customerGrowthCard();

    @RequestMapping("/instrument-usage")
    String instrumentUsageCard();

    @RequestMapping("/staff-workload")
    String staffWorkloadCard();

    @RequestMapping("/sampling-inspection")
    String samplingInspectionCard();

    @RequestMapping("/invoice-dept-statistic")
    String invoiceDeptStatisticCard();

    @RequestMapping("/inspection-dept-statistic")
    String inspectionDeptStatisticCard();

}
