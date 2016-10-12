package com.idea.nursing.servicemodule.web.domain.pojo;

public class ServicePackPicture {
    private Long id;

    private Long servicePackId;

    private Long pictureId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServicePackId() {
        return servicePackId;
    }

    public void setServicePackId(Long servicePackId) {
        this.servicePackId = servicePackId;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }
}