package com.idea.nursing.servicemodule.web.domain.pojo;

public class ServiceClassesValuation {
    private Long id;

    private String classesValuationName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassesValuationName() {
        return classesValuationName;
    }

    public void setClassesValuationName(String classesValuationName) {
        this.classesValuationName = classesValuationName == null ? null : classesValuationName.trim();
    }
}