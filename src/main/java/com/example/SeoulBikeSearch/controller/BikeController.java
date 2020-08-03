package com.example.SeoulBikeSearch.controller;

import com.example.SeoulBikeSearch.model.bike.Row;
import com.example.SeoulBikeSearch.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Page 출력 Controller
 * @author sykim@ntels.com
 */
@Controller
public class BikeController {
    /**
     * Bike Service
     */
    @Autowired
    BikeService bikeService;

    /**
     * 기본 페이지
     * @return index.jsp
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String searchMap() {
        return "index";
    }

    /**
     * 자전거 대여정보 조회
     * @return 자전거 대여 정보 리스트
     */
    @RequestMapping(value = "/bike", method = RequestMethod.GET)
     public @ResponseBody List<Row> getBike() {
        List<Row> list = bikeService.searchBike();
        return list;
    }

}
