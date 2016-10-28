package com.idea.nursing.bed.web.domain.pojo;

public class Room {
    private Long id;

    private Long entranceId;

    private Byte floorNum;

    private Integer roomNum;

    private Byte bedToalNum;

    private Long roomTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Long entranceId) {
        this.entranceId = entranceId;
    }

    public Byte getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Byte floorNum) {
        this.floorNum = floorNum;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Byte getBedToalNum() {
        return bedToalNum;
    }

    public void setBedToalNum(Byte bedToalNum) {
        this.bedToalNum = bedToalNum;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }
}