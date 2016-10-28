package com.idea.nursing.bed.web.domain.pojo;

public class Entrance {
    private Long id;

    private String entranceName;

    private Byte entranceToalNum;

    private Byte floorToalNum;

    private Byte entranceNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntranceName() {
        return entranceName;
    }

    public void setEntranceName(String entranceName) {
        this.entranceName = entranceName == null ? null : entranceName.trim();
    }

    public Byte getEntranceToalNum() {
        return entranceToalNum;
    }

    public void setEntranceToalNum(Byte entranceToalNum) {
        this.entranceToalNum = entranceToalNum;
    }

    public Byte getFloorToalNum() {
        return floorToalNum;
    }

    public void setFloorToalNum(Byte floorToalNum) {
        this.floorToalNum = floorToalNum;
    }

    public Byte getEntranceNum() {
        return entranceNum;
    }

    public void setEntranceNum(Byte entranceNum) {
        this.entranceNum = entranceNum;
    }
}