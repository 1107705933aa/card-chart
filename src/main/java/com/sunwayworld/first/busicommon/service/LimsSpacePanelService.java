package com.sunwayworld.first.busicommon.service;

import com.sunwayworld.first.busicommon.bean.*;
import com.sunwayworld.framework.data.page.Page;
import com.sunwayworld.framework.restful.data.RestJsonWrapperBean;

import java.util.List;
import java.util.Map;

public interface LimsSpacePanelService {

    List<LimsMonitoringInstrumentDTO> selectMonitoringInstrumentDTOSet(String type);

    List<ProgressInfoDTO> progressInfo(String type);

    List<HistogramOfMultiItemDTO> histogramOfMultiItem(String year, String type, DateCondition dateCondition);

    List<HistogramOfMultiSagment> histogramOfMultiSagment(String mtlType, DateCondition dateCondition);

    List<ProgressInfoDTO> selectTestProgressSet(String type, DateCondition dateCondition);

    List<LimsPositiveTestDTO> selectPositiveTestDTOSet(String type, DateCondition dateCondition);

    List<LimsTodoNoticeDTO> selectLimsTodoSet(String type);

    List<LimsTodoNoticeDTO> selectLimsNoticeSet(String type);

    UserCard userInfo(String type);

    List<Map<String, String>> selectRotationchartSet(String type);

    List<GroupStatesDTO> histogramInfo(String type, DateCondition dateCondition);

    Map<String, GroupStatesDTO> selectHeadCountSet(String type);

    List<EquipmentscheduleDto> selectequipmentscheduleSet(String type);

    DataOnMap tagOnMap(String type, DateCondition dateCondition);

    /**
     * 查询热点地图数据
     * @return
     */
    List<Map<String, Object>> selectHotPointMapData(String type);

    List<Map<String, Object>> selectWaterWaveSet(String type);

    List<Map<String, Object>> selectWaterWaveQmsSet(String type, DateCondition dateCondition);

    List<Map<String, Object>> selectNgWaferQmsSet(String type);

    List<Map<String, Object>> selectSampleCountQmsSet(String type);

    List<Map<String, Object>> selectTaskStatisticQmsSet(String type);

    Page<EquipmentscheduleDto> selecteGantetuDevice(String type, RestJsonWrapperBean wrapper);

    List<EquipmentscheduleDto> selectGantetuScheduleSet(String type, RestJsonWrapperBean wrapper);

    List<PieDataDTO> pieInfo(String type, DateCondition dateCondition);

    Map<String, GroupStatesDTO> selectCardTitle(String type);

    List<KeyNumberDTO> selectAreaChart(String type, DateCondition dateCondition);

    /**
     * 通知公告
     * @param type 根据url的type值返回不同类别的数据
     * @return
     */
    List<NoticeInfo> noticeInfo(String type);

    DataGridDTO dataGridInfo(String type, DateCondition dateCondition);

    List<OrderStatis> orderStatistic();

    List<ItemInfo> itemList(String type, String datetype, DateCondition dateCondition);

    /**
     * 查询消息中心信息
     * @param type
     * @return
     */
    List<LimsTodoNoticeDTO> selectMessages(String type);

    /**
     * 消息确认已读
     * @param id
     */
    void msgFinished(String id);

    List<GroupStatesDTO> indexCard(String type);

    List<PieDataDTO> pieChartInfo(String type, DateCondition dateCondition);

    List<ObjectGrowthDTO> selectBusinessGrowthInfo(DateCondition dateCondition);

    List<ObjectDoubleGrowthDTO> selectInvoiceGrowthInfo(DateCondition dateCondition);

    List<ObjectGrowthDTO> selectCustomerGrowthInfo(DateCondition dateCondition);

    List<PieDataDTO> selectInspectionStatisticInfo(String type, DateCondition dateCondition);

    LimsMonitoringInstrumentDTO selectSampingCompleteWaterwaveInfo(String type, DateCondition dateCondition);

    List<NameValueDTO> selectSampingWaterwaveInfo(String type, DateCondition dateCondition);

    List<NameValueDTO> selectSampingAreaInfo(String type, DateCondition dateCondition);

    List<NameDoubleValue> selectInspectiondeptStatisticInfo(DateCondition dateCondition);


    List<InvoiceInfoDTO> selectInvoicedeptstatisticSet(DateCondition dateCondition);

    List<ProgressInfoDTO> selectCustomerdeptstatisticSet(DateCondition dateCondition);

    List<GroupStatesDTO> selectInstrumentusageSet(String type, DateCondition dateCondition);

    List<GroupStatesDTO> selectStaffworkloadSet(String type, DateCondition dateCondition);

    NameValueDTO selectTodocount();
}
