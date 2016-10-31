package com.idea.nursing.order.web.domain.pojo;

public class ExceptionType {
    private Long id;

    private String exceptionTypeName;

    private Byte exceptionTypeLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExceptionTypeName() {
        return exceptionTypeName;
    }

    public void setExceptionTypeName(String exceptionTypeName) {
        this.exceptionTypeName = exceptionTypeName == null ? null : exceptionTypeName.trim();
    }

    public Byte getExceptionTypeLevel() {
        return exceptionTypeLevel;
    }

    public void setExceptionTypeLevel(Byte exceptionTypeLevel) {
        this.exceptionTypeLevel = exceptionTypeLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}