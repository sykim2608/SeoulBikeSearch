package com.example.SeoulBikeSearch.model;

/**
 * 현재 위치의 위도 및 경도 정보 모델
 * @author sykim@ntels.com
 */
public class CurrentLocation {
    /**
     * 경도
     */
    public static String curRow = "37.518179175067885";
    /**
     * 위도
     */
    public static String curCol = "127.05097054121767";

    public static String getCurRow() {
        return curRow;
    }

    public static void setCurRow(String curRow) {
        CurrentLocation.curRow = curRow;
    }

    public static String getCurCol() {
        return curCol;
    }

    public static void setCurCol(String curCol) {
        CurrentLocation.curCol = curCol;
    }

}
