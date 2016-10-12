package com.idea.nursing.servicemodule.web.domain.pojo;

public class Nurseify {
    private Long id;

    private String nursifyName;

    private Byte nursifyLeave;

    private Long nursifyTid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNursifyName() {
        return nursifyName;
    }

    public void setNursifyName(String nursifyName) {
        this.nursifyName = nursifyName == null ? null : nursifyName.trim();
    }

    public Byte getNursifyLeave() {
        return nursifyLeave;
    }

    public void setNursifyLeave(Byte nursifyLeave) {
        this.nursifyLeave = nursifyLeave;
    }

    public Long getNursifyTid() {
        return nursifyTid;
    }

    public void setNursifyTid(Long nursifyTid) {
        this.nursifyTid = nursifyTid;
    }
}