package com.idea.nursing.login.web.domain.pojo;

public class LoginRole {
    private Long id;

    private Long roleId;

    private Long loginId;
    public LoginRole(){

    }
    public LoginRole(Long roleId, Long loginId) {
        this.roleId = roleId;
        this.loginId = loginId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }
}