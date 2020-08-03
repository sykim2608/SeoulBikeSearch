package com.example.SeoulBikeSearch.util;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Http Util
 * @author sykim@ntels.com
 */
@Component
public class HttpUtil {
    /**
     * Http 요청
     * @param start 요청 시작 위치
     * @param end 요청 종료 위치
     * @return 자전거 대여 정보 모델
     */
    public String requestApi(int start, int end) {
        String url = "http://openapi.seoul.go.kr:8088/6b626571456b73793937744c426e76/json/bikeList/";
        String link;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        link = new StringBuilder(url).append(start).append("/").append(end).toString();

        System.out.println("url: "+link);

        ResponseEntity<String> responseEntity = restTemplate.exchange(link, HttpMethod.GET, entity, String.class);

        return responseEntity.getBody();
    }

}
