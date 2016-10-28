package com.idea.nursing.bed.web.domain.pojo;

public class RoomType {
    private Long id;

    private String roomTypeName;

    private Byte roomTypeLeave;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName == null ? null : roomTypeName.trim();
    }

    public Byte getRoomTypeLeave() {
        return roomTypeLeave;
    }

    public void setRoomTypeLeave(Byte roomTypeLeave) {
        this.roomTypeLeave = roomTypeLeave;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}