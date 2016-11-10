package com.idea.nursing.oldpeople.web.domain.vo;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;

public class ServicePeopleVO {
    private Long id;

    private String servicePeopleName;

    private Byte servicePeopleAge;

    private Byte servicePeopleSex;

    private Byte servicePeopleRelation;

    private Long servicePeoplePicture;

    private String servicePeopleAttention;

    private Long userId;

    private String servicePeopleTel;

    private Long servicePeopleStateId;

    private Long servicePeopleTypeId;

    private Long nursingLeave;

    private CommentPicture mainPicture;

    private Long isHaveServicePeopleRegister;

    @Override
    public String toString() {
        return "ServicePeopleVO{" +
                "id=" + id +
                ", servicePeopleName='" + servicePeopleName + '\'' +
                ", servicePeopleAge=" + servicePeopleAge +
                ", servicePeopleSex=" + servicePeopleSex +
                ", servicePeopleRelation=" + servicePeopleRelation +
                ", servicePeoplePicture=" + servicePeoplePicture +
                ", servicePeopleAttention='" + servicePeopleAttention + '\'' +
                ", userId=" + userId +
                ", servicePeopleTel='" + servicePeopleTel + '\'' +
                ", servicePeopleStateId=" + servicePeopleStateId +
                ", servicePeopleTypeId=" + servicePeopleTypeId +
                ", nursingLeave=" + nursingLeave +
                ", mainPicture=" + mainPicture +
                ", isHaveServicePeopleRegister=" + isHaveServicePeopleRegister +
                '}';
    }

    public CommentPicture getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(CommentPicture mainPicture) {
        this.mainPicture = mainPicture;
    }

    public Long getIsHaveServicePeopleRegister() {
        return isHaveServicePeopleRegister;
    }

    public void setIsHaveServicePeopleRegister(Long isHaveServicePeopleRegister) {
        this.isHaveServicePeopleRegister = isHaveServicePeopleRegister;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicePeopleName() {
        return servicePeopleName;
    }

    public void setServicePeopleName(String servicePeopleName) {
        this.servicePeopleName = servicePeopleName == null ? null : servicePeopleName.trim();
    }

    public Byte getServicePeopleAge() {
        return servicePeopleAge;
    }

    public void setServicePeopleAge(Byte servicePeopleAge) {
        this.servicePeopleAge = servicePeopleAge;
    }

    public Byte getServicePeopleSex() {
        return servicePeopleSex;
    }

    public void setServicePeopleSex(Byte servicePeopleSex) {
        this.servicePeopleSex = servicePeopleSex;
    }

    public Byte getServicePeopleRelation() {
        return servicePeopleRelation;
    }

    public void setServicePeopleRelation(Byte servicePeopleRelation) {
        this.servicePeopleRelation = servicePeopleRelation;
    }

    public Long getServicePeoplePicture() {
        return servicePeoplePicture;
    }

    public void setServicePeoplePicture(Long servicePeoplePicture) {
        this.servicePeoplePicture = servicePeoplePicture;
    }

    public String getServicePeopleAttention() {
        return servicePeopleAttention;
    }

    public void setServicePeopleAttention(String servicePeopleAttention) {
        this.servicePeopleAttention = servicePeopleAttention == null ? null : servicePeopleAttention.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getServicePeopleTel() {
        return servicePeopleTel;
    }

    public void setServicePeopleTel(String servicePeopleTel) {
        this.servicePeopleTel = servicePeopleTel == null ? null : servicePeopleTel.trim();
    }

    public Long getServicePeopleStateId() {
        return servicePeopleStateId;
    }

    public void setServicePeopleStateId(Long servicePeopleStateId) {
        this.servicePeopleStateId = servicePeopleStateId;
    }

    public Long getServicePeopleTypeId() {
        return servicePeopleTypeId;
    }

    public void setServicePeopleTypeId(Long servicePeopleTypeId) {
        this.servicePeopleTypeId = servicePeopleTypeId;
    }

    public Long getNursingLeave() {
        return nursingLeave;
    }

    public void setNursingLeave(Long nursingLeave) {
        this.nursingLeave = nursingLeave;
    }
}