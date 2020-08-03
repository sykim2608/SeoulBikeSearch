package com.example.SeoulBikeSearch.model;

import com.example.SeoulBikeSearch.model.bike.RentBikeStatus;

/**
 * 응답 메시지 모델
 * @author sykim@ntels.com
 */
public class ApiResponse {
    /**
     * RentBikeStatus
     */
    private RentBikeStatus rentBikeStatus;

    public RentBikeStatus getRentBikeStatus() {
        return rentBikeStatus;
    }

    public void setRentBikeStatus(RentBikeStatus rentBikeStatus) {
        this.rentBikeStatus = rentBikeStatus;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "rentBikeStatus=" + rentBikeStatus +
                '}';
    }
}
