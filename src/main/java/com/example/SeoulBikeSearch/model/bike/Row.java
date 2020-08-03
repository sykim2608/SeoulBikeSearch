package com.example.SeoulBikeSearch.model.bike;

/**
 * Row 모델
 * @author sykim@ntels.com
 */
public class Row {
    /**
     * 거치대 개수
     */
    private String rackTotCnt;
    /**
     * 대여소 이름
     */
    private String stationName;
    /**
     * 자전고 주차 총 건수
     */
    private String parkingBikeTotCnt;
    /**
     * 거치율
     */
    private String shared;
    /**
     * 위도
     */
    private String stationLatitude;
    /**
     * 경도
     */
    private String stationLongitude;
    /**
     * 대여소 ID
     */
    private String stationId;

    public String getRackTotCnt() {
        return rackTotCnt;
    }

    public void setRackTotCnt(String rackTotCnt) {
        this.rackTotCnt = rackTotCnt;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getParkingBikeTotCnt() {
        return parkingBikeTotCnt;
    }

    public void setParkingBikeTotCnt(String parkingBikeTotCnt) {
        this.parkingBikeTotCnt = parkingBikeTotCnt;
    }

    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }

    public String getStationLatitude() {
        return stationLatitude;
    }

    public void setStationLatitude(String stationLatitude) {
        this.stationLatitude = stationLatitude;
    }

    public String getStationLongitude() {
        return stationLongitude;
    }

    public void setStationLongitude(String stationLongitude) {
        this.stationLongitude = stationLongitude;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @Override
    public String toString() {
        return "Row{" +
                "rackTotCnt='" + rackTotCnt + '\'' +
                ", stationName='" + stationName + '\'' +
                ", parkingBikeTotCnt='" + parkingBikeTotCnt + '\'' +
                ", shared='" + shared + '\'' +
                ", stationLatitude='" + stationLatitude + '\'' +
                ", stationLongitude='" + stationLongitude + '\'' +
                ", stationId='" + stationId + '\'' +
                '}';
    }
}
