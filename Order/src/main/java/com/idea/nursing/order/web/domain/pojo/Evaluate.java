package com.idea.nursing.order.web.domain.pojo;

public class Evaluate {
    private Long id;

    private String evaluateName;

    private Byte evaluateGradeMax;

    private Byte evaluateGradeMin;

    private Byte spanValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvaluateName() {
        return evaluateName;
    }

    public void setEvaluateName(String evaluateName) {
        this.evaluateName = evaluateName == null ? null : evaluateName.trim();
    }

    public Byte getEvaluateGradeMax() {
        return evaluateGradeMax;
    }

    public void setEvaluateGradeMax(Byte evaluateGradeMax) {
        this.evaluateGradeMax = evaluateGradeMax;
    }

    public Byte getEvaluateGradeMin() {
        return evaluateGradeMin;
    }

    public void setEvaluateGradeMin(Byte evaluateGradeMin) {
        this.evaluateGradeMin = evaluateGradeMin;
    }

    public Byte getSpanValue() {
        return spanValue;
    }

    public void setSpanValue(Byte spanValue) {
        this.spanValue = spanValue;
    }
}