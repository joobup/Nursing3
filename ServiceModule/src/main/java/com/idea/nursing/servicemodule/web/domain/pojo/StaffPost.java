package com.idea.nursing.servicemodule.web.domain.pojo;

public class StaffPost {
    private Long id;

    private String postName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }
}