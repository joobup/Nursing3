package com.idea.nursing.oldpeople.web.domain.pojo;

public class ServicePeopleState {
    private Long id;

    private String servicePeopleStateName;

    private Byte servicePeopleStateLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicePeopleStateName() {
        return servicePeopleStateName;
    }

    public void setServicePeopleStateName(String servicePeopleStateName) {
        this.servicePeopleStateName = servicePeopleStateName == null ? null : servicePeopleStateName.trim();
    }

    public Byte getServicePeopleStateLevel() {
        return servicePeopleStateLevel;
    }

    public void setServicePeopleStateLevel(Byte servicePeopleStateLevel) {
        this.servicePeopleStateLevel = servicePeopleStateLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}