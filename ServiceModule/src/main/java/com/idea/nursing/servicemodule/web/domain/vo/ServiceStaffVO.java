package com.idea.nursing.servicemodule.web.domain.vo;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;

/**
 * Created by 10238 on 2016/10/25.
 */
public class ServiceStaffVO {
    private Long id;

    private String staffName;

    private Byte staffSex;

    private Long staffPost;

    private String staffSkillLevel;

    private CommentPicture staffPicture;

    private Long staffDepartment;

    private String staffCardId;

    private String staffCall1;

    private String staffCall2;

    private Byte staffRank;

    private Byte staffStatus;

    @Override
    public String toString() {
        return "ServiceStaffVO{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", staffSex=" + staffSex +
                ", staffPost=" + staffPost +
                ", staffSkillLevel='" + staffSkillLevel + '\'' +
                ", staffPicture=" + staffPicture +
                ", staffDepartment=" + staffDepartment +
                ", staffCardId='" + staffCardId + '\'' +
                ", staffCall1='" + staffCall1 + '\'' +
                ", staffCall2='" + staffCall2 + '\'' +
                ", staffRank=" + staffRank +
                ", staffStatus=" + staffStatus +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Byte getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(Byte staffSex) {
        this.staffSex = staffSex;
    }

    public Long getStaffPost() {
        return staffPost;
    }

    public void setStaffPost(Long staffPost) {
        this.staffPost = staffPost;
    }

    public String getStaffSkillLevel() {
        return staffSkillLevel;
    }

    public void setStaffSkillLevel(String staffSkillLevel) {
        this.staffSkillLevel = staffSkillLevel;
    }

    public CommentPicture getStaffPicture() {
        return staffPicture;
    }

    public void setStaffPicture(CommentPicture staffPicture) {
        this.staffPicture = staffPicture;
    }

    public Long getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(Long staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffCardId() {
        return staffCardId;
    }

    public void setStaffCardId(String staffCardId) {
        this.staffCardId = staffCardId;
    }

    public String getStaffCall1() {
        return staffCall1;
    }

    public void setStaffCall1(String staffCall1) {
        this.staffCall1 = staffCall1;
    }

    public String getStaffCall2() {
        return staffCall2;
    }

    public void setStaffCall2(String staffCall2) {
        this.staffCall2 = staffCall2;
    }

    public Byte getStaffRank() {
        return staffRank;
    }

    public void setStaffRank(Byte staffRank) {
        this.staffRank = staffRank;
    }

    public Byte getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Byte staffStatus) {
        this.staffStatus = staffStatus;
    }
}
