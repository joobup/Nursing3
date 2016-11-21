package com.idea.nursing.cost.web.domain.pojo;

public class CostType {
    private Long id;

    private String costTypeName;

    private Byte costTypeLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCostTypeName() {
        return costTypeName;
    }

    public void setCostTypeName(String costTypeName) {
        this.costTypeName = costTypeName == null ? null : costTypeName.trim();
    }

    public Byte getCostTypeLevel() {
        return costTypeLevel;
    }

    public void setCostTypeLevel(Byte costTypeLevel) {
        this.costTypeLevel = costTypeLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}