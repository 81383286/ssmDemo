package com.emr.entity;


public class Power_Role {
    private Integer roleId;

    private String roleName;

    private Short showRecord;

    private Short downloadRecord;

    private Short showPrint;

    private String remark;

    private Integer effective;

    private String createDate;

    private String creater;

    private String updateDate;

    private String updater;

    public Short getShowPrint() {
        return showPrint;
    }

    public void setShowPrint(Short showPrint) {
        this.showPrint = showPrint;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Short getShowRecord() {
        return showRecord;
    }

    public void setShowRecord(Short showRecord) {
        this.showRecord = showRecord;
    }

    public Short getDownloadRecord() {
        return downloadRecord;
    }

    public void setDownloadRecord(Short downloadRecord) {
        this.downloadRecord = downloadRecord;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Override
    public String toString() {
        return "Power_Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", showRecord=" + showRecord +
                ", downloadRecord=" + downloadRecord +
                ", showPrint=" + showPrint +
                ", remark='" + remark + '\'' +
                ", effective=" + effective +
                ", createDate='" + createDate + '\'' +
                ", creater='" + creater + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", updater='" + updater + '\'' +
                '}';
    }
}