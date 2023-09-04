package sis.com.map.service;

import java.util.List;

public interface MapService {

    List<NoticeVO> noticeList() throws Exception;

    JsonVO getTopojson(String target) throws Exception;

    List<JsonVO> getCityGMLInfo() throws Exception;

    CodeVO getJijuk(String jusoCode) throws Exception;
}
