package com.idea.nursing.oldpeople.web.domain.pojo;

public class ServicePeopleType {
    private Long id;

    private String serviceTypePeopleName;

    private Byte serviceTypePeopleLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceTypePeopleName() {
        return serviceTypePeopleName;
    }

    public void setServiceTypePeopleName(String serviceTypePeopleName) {
        this.serviceTypePeopleName = serviceTypePeopleName == null ? null : serviceTypePeopleName.trim();
    }

    public Byte getServiceTypePeopleLevel() {
        return serviceTypePeopleLevel;
    }

    public void setServiceTypePeopleLevel(Byte serviceTypePeopleLevel) {
        this.serviceTypePeopleLevel = serviceTypePeopleLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}