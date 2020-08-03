package com.example.SeoulBikeSearch.service;

import com.example.SeoulBikeSearch.model.bike.Row;
import java.util.List;

/**
 * 자전거 대여 정보 조회
 * @author sykim@ntels.com
 */
public interface BikeService {
    /**
     * 자전거 대여 정보 요청에 따른 응답 처리
     * @return 자전거 대여 정보 리스트
     */
    List<Row> searchBike();

}
