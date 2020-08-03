package com.example.SeoulBikeSearch.model.bike;

import java.util.List;

/**
 * RentBikeStatus 모델
 * @author sykim@ntels.com
 */
public class RentBikeStatus {
    /**
     * 총 데이터 건수
     */
    private String list_total_count;
    /**
     * 요청 결과
     */
    private Result RESULT;
    /**
     * 자전거 대여 정보
     */
    private List<Row> row;

    public String getList_total_count() {
        return list_total_count;
    }

    public void setList_total_count(String list_total_count) {
        this.list_total_count = list_total_count;
    }

    public Result getRESULT() {
        return RESULT;
    }

    public void setRESULT(Result RESULT) {
        this.RESULT = RESULT;
    }

    public List<Row> getRow() {
        return row;
    }

    public void setRow(List<Row> row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "RentBikeStatus{" +
                "list_total_count='" + list_total_count + '\'' +
                ", RESULT=" + RESULT +
                ", row=" + row +
                '}';
    }
}
