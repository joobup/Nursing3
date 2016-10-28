package com.idea.nursing.bed.web.domain.pojo;

public class BedType {
    private Long id;

    private String bedTypeName;

    private Byte bedTypeLeave;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBedTypeName() {
        return bedTypeName;
    }

    public void setBedTypeName(String bedTypeName) {
        this.bedTypeName = bedTypeName == null ? null : bedTypeName.trim();
    }

    public Byte getBedTypeLeave() {
        return bedTypeLeave;
    }

    public void setBedTypeLeave(Byte bedTypeLeave) {
        this.bedTypeLeave = bedTypeLeave;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}