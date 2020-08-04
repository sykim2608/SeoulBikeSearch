package com.example.SeoulBikeSearch.service;

import com.example.SeoulBikeSearch.model.ApiResponse;
import com.example.SeoulBikeSearch.model.bike.Row;
import com.example.SeoulBikeSearch.util.HttpUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {
    /**
     * Http Util
     */
    @Autowired
    HttpUtil httpUtil;

    @Override
    public List<Row> searchBike() {
        Gson gson = new Gson();
        String str1 = httpUtil.requestApi(1,1000);
        String str2 = httpUtil.requestApi(1001,2000);

        List<Row> list1 = gson.fromJson(str1, ApiResponse.class).getRentBikeStatus().getRow();
        List<Row> list2 = gson.fromJson(str2, ApiResponse.class).getRentBikeStatus().getRow();

        list1.addAll(list2);

        return list1;
    }
}
