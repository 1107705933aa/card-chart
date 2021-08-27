package com.sunwayworld.first.busicommon.resource;

import com.sunwayworld.first.busicommon.bean.*;
import com.sunwayworld.framework.data.page.Page;
import com.sunwayworld.framework.restful.data.RestJsonWrapperBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@RequestMapping("/first/busicommon")
public interface LimsSpacePanelResource {
    
    @RequestMapping(value = "/monitoringinstrument/queries/{type}", method = RequestMethod.POST)
    List<LimsMonitoringInstrumentDTO> selectMonitoringInstrumentDTOSet(@PathVariable String type);
    
    @RequestMapping(value = "/sampleprogress/queries/{type}", method = RequestMethod.POST)
    List<ProgressInfoDTO> progressInfo(@PathVariable String type);
    
    @RequestMapping(value = "/{year}/devicerate/queries/{type}", method = RequestMethod.POST)
    List<HistogramOfMultiItemDTO> histogramOfMultiItem(@PathVariable("year") String year, @PathVariable("type") String type, DateCondition dateCondition);
    
    @RequestMapping(value = "/{mtlType}/reportdata/queries", method = RequestMethod.POST)
    List<HistogramOfMultiSagment> histogramOfMultiSegment(String mtlType, DateCondition dateCondition);
    
    @RequestMapping(value = "/testprogress/queries/{type}", method = RequestMethod.POST)
    List<ProgressInfoDTO> selectTestProgressSet(@PathVariable String type, DateCondition dateCondition);
    
    @RequestMapping(value = "/positivetest/queries/{type}", method = RequestMethod.POST)
    List<LimsPositiveTestDTO> selectPositiveTestDTOSet(@PathVariable String type, DateCondition dateCondition);
    
    @RequestMapping(value = "/todo/queries/{type}", method = RequestMethod.POST)
    List<LimsTodoNoticeDTO> selectLimsTodoSet(@PathVariable String type);
    
    @RequestMapping(value = "/notice/queries/{type}", method = RequestMethod.POST)
    List<LimsTodoNoticeDTO> selectLimsNoticeSet(@PathVariable String type);
    
    @RequestMapping(value = "/lastLoginTime/queries/{type}", method = RequestMethod.POST)
    UserCard userInfo(@PathVariable String type);
    
    @RequestMapping(value = "/rotationchart/queries/{type}", method = RequestMethod.POST)
    List<Map<String,String>> selectRotationchartSet(@PathVariable String type);
    
    @RequestMapping(value = "/personworkcount/queries/{type}", method = RequestMethod.POST)
    List<GroupStatesDTO> histogramInfo(@PathVariable String type, DateCondition dateCondition);
    
    @RequestMapping(value = "/headcount/queries/{type}", method = RequestMethod.POST)
    Map<String, GroupStatesDTO> selectHeadCountSet(@PathVariable String type);
    
    @RequestMapping(value = "/equipmentschedule/queries/{type}", method = RequestMethod.POST)
    List<EquipmentscheduleDto> selectequipmentscheduleSet(@PathVariable String type);
    
    @RequestMapping(value = "/springdefense/queries/{type}", method = RequestMethod.POST)
    DataOnMap tagOnMap(@PathVariable String type, DateCondition dateCondition);

    /**
     * 查询热点地图数据
     * @return
     */
    @RequestMapping(value = "/hotPointMap/queries/{type}", method = RequestMethod.POST)
    List<Map<String, Object>> selectHotPointMapData(String type);
    
    @RequestMapping(value = "/waterwave/queries/{type}", method = RequestMethod.POST)
    List<Map<String,Object>> selectWaterWaveSet(@PathVariable String type);
    
    @RequestMapping(value = "/waterwaveqms/queries/{type}", method = RequestMethod.POST)
    List<Map<String,Object>> selectWaterWaveQmsSet(@PathVariable String type, DateCondition dateCondition);
    
    @RequestMapping(value = "/ngwafer/queries/{type}", method = RequestMethod.POST)
    List<Map<String,Object>> selectNgWaferQmsSet(@PathVariable String type);
    
    @RequestMapping(value = "/samplecountqms/queries/{type}", method = RequestMethod.POST)
    List<Map<String,Object>> selectSampleCountQmsSet(@PathVariable String type);
    
    @RequestMapping(value = "/taskstatisticqms/queries/{type}", method = RequestMethod.POST)
    List<Map<String,Object>> selectTaskStatisticQmsSet(@PathVariable String type);

    @RequestMapping(value = "/gantetudevice/queries/{type}", method = RequestMethod.POST)
    Page<EquipmentscheduleDto> ganttChartSummary(@PathVariable String type, RestJsonWrapperBean wrapper);
    
    @RequestMapping(value = "/gantetuschedule/queries/{type}", method = RequestMethod.POST)
    List<EquipmentscheduleDto> selectGantetuScheduleSet(@PathVariable String type, RestJsonWrapperBean wrapper);
    
    @RequestMapping(value = "/taskstatisticadc/queries/{type}", method = RequestMethod.POST)
    List<PieDataDTO> pieInfo(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping(value = "/cardTitle/queries/{type}", method = RequestMethod.POST)
    Map<String, GroupStatesDTO> selectCardTitle(@PathVariable String type);

    @RequestMapping(value = "/indexCard/queries/{type}", method = RequestMethod.POST)
    List<GroupStatesDTO> indexCard(@PathVariable String type);

    @RequestMapping(value = "/areaChart/queries/{type}", method = RequestMethod.POST)
    List<KeyNumberDTO> selectAreaChart(@PathVariable("type") String type, DateCondition dateCondition);

    @RequestMapping("/notice/{type}")
    List<NoticeInfo> noticeInfo(@PathVariable String type);

    @RequestMapping("/dataGridInfo/{type}")
    DataGridDTO dataGridInfo(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping("/orderStatistic")
    List<OrderStatis> orderStatistic();

    @RequestMapping(value = "/itemList/{type}/{datetype}", method = RequestMethod.POST)
    List<ItemInfo> itemList(@PathVariable String type,@PathVariable String datetype, DateCondition dateCondition);

    @RequestMapping(value = "/messages/{type}", method = RequestMethod.POST)
    List<LimsTodoNoticeDTO> selectMessages(@PathVariable String type);

    @RequestMapping(value = "/msgFinished/{id}", method = RequestMethod.POST)
    int msgFinished(@PathVariable String id);
    
    @RequestMapping(value = "/pieChartadc/queries/{type}", method = RequestMethod.POST)
    List<PieDataDTO> pieChartInfo(@PathVariable String type, DateCondition dateCondition);


    @RequestMapping(value = "/businessgrowth/queries", method = RequestMethod.POST)
    List<ObjectGrowthDTO> selectBusinessGrowthInfo(DateCondition dateCondition);

    @RequestMapping(value = "/invoicegrowth/queries", method = RequestMethod.POST)
    List<ObjectDoubleGrowthDTO> selectInvoiceGrowthInfo(DateCondition dateCondition);

    @RequestMapping(value = "/customergrowth/queries", method = RequestMethod.POST)
    List<ObjectGrowthDTO> selectCustomerGrowthInfo(DateCondition dateCondition);

    @RequestMapping(value = "/inspectionstatistic/queries/{type}", method = RequestMethod.POST)
    List<PieDataDTO> selectInspectionStatisticInfo(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping(value = "/sampingtotalwaterwave/queries{type}", method = RequestMethod.POST)
    LimsMonitoringInstrumentDTO selectSampingCompleteWaterwaveInfo(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping(value = "/sampingwaterwave/queries/{type}", method = RequestMethod.POST)
    List<NameValueDTO> selectSampingWaterwaveInfo(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping(value = "/sampingArea/queries/{type}", method = RequestMethod.POST)
    List<NameValueDTO> selectSampingAreaInfo(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping(value = "/inspectiondept-statistic/queries", method = RequestMethod.POST)
    List<NameDoubleValue> selectInspectiondeptStatisticInfo(DateCondition dateCondition);

    @RequestMapping(value = "/invoicedeptstatistic/queries", method = RequestMethod.POST)
    List<InvoiceInfoDTO> selectInvoicedeptstatisticSet(DateCondition dateCondition);

    @RequestMapping(value = "/customerdeptstatistic/queries", method = RequestMethod.POST)
    List<ProgressInfoDTO> selectCustomerdeptstatisticSet(DateCondition dateCondition);

    @RequestMapping(value = "/instrumentusage/queries/{type}", method = RequestMethod.POST)
    List<GroupStatesDTO> selectInstrumentusageSet(@PathVariable String type, DateCondition dateCondition);

    @RequestMapping(value = "/staffworkload/queries/{type}", method = RequestMethod.POST)
    List<GroupStatesDTO> selectStaffworkloadSet(@PathVariable String type , DateCondition dateCondition);

    @RequestMapping(value = "/todocount/queries", method = RequestMethod.POST)
    NameValueDTO selectTodocount();

}
