package com.idea.nursing.cost.web.domain.pojo;

import java.util.Date;

public class Cost {
    private Long id;

    private Long costNum;

    private Byte costType;

    private Byte costInOut;

    private Date costDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCostNum() {
        return costNum;
    }

    public void setCostNum(Long costNum) {
        this.costNum = costNum;
    }

    public Byte getCostType() {
        return costType;
    }

    public void setCostType(Byte costType) {
        this.costType = costType;
    }

    public Byte getCostInOut() {
        return costInOut;
    }

    public void setCostInOut(Byte costInOut) {
        this.costInOut = costInOut;
    }

    public Date getCostDate() {
        return costDate;
    }

    public void setCostDate(Date costDate) {
        this.costDate = costDate;
    }
}