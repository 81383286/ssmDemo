package com.emr.entity;

import java.io.Serializable;
import java.util.Date;

public class JswzhSendmessage implements Serializable {
    private String messId;

    private String fempid;

    private String fempname;

    private String fcardno;

    private String lxdh;

    private String sendLx;

    private String sendInfo;

    private Date pmdatetime;

    private Date sendTimeWx;

    private String sendResurtWx;

    private Date sendTimeMsg;

    private String sendResurtMsg;

    private static final long serialVersionUID = 1L;

    public String getMessId() {
        return messId;
    }

    public void setMessId(String messId) {
        this.messId = messId == null ? null : messId.trim();
    }

    public String getFempid() {
        return fempid;
    }

    public void setFempid(String fempid) {
        this.fempid = fempid == null ? null : fempid.trim();
    }

    public String getFempname() {
        return fempname;
    }

    public void setFempname(String fempname) {
        this.fempname = fempname == null ? null : fempname.trim();
    }

    public String getFcardno() {
        return fcardno;
    }

    public void setFcardno(String fcardno) {
        this.fcardno = fcardno == null ? null : fcardno.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getSendLx() {
        return sendLx;
    }

    public void setSendLx(String sendLx) {
        this.sendLx = sendLx == null ? null : sendLx.trim();
    }

    public String getSendInfo() {
        return sendInfo;
    }

    public void setSendInfo(String sendInfo) {
        this.sendInfo = sendInfo == null ? null : sendInfo.trim();
    }

    public Date getPmdatetime() {
        return pmdatetime;
    }

    public void setPmdatetime(Date pmdatetime) {
        this.pmdatetime = pmdatetime;
    }

    public Date getSendTimeWx() {
        return sendTimeWx;
    }

    public void setSendTimeWx(Date sendTimeWx) {
        this.sendTimeWx = sendTimeWx;
    }

    public String getSendResurtWx() {
        return sendResurtWx;
    }

    public void setSendResurtWx(String sendResurtWx) {
        this.sendResurtWx = sendResurtWx == null ? null : sendResurtWx.trim();
    }

    public Date getSendTimeMsg() {
        return sendTimeMsg;
    }

    public void setSendTimeMsg(Date sendTimeMsg) {
        this.sendTimeMsg = sendTimeMsg;
    }

    public String getSendResurtMsg() {
        return sendResurtMsg;
    }

    public void setSendResurtMsg(String sendResurtMsg) {
        this.sendResurtMsg = sendResurtMsg == null ? null : sendResurtMsg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messId=").append(messId);
        sb.append(", fempid=").append(fempid);
        sb.append(", fempname=").append(fempname);
        sb.append(", fcardno=").append(fcardno);
        sb.append(", lxdh=").append(lxdh);
        sb.append(", sendLx=").append(sendLx);
        sb.append(", sendInfo=").append(sendInfo);
        sb.append(", pmdatetime=").append(pmdatetime);
        sb.append(", sendTimeWx=").append(sendTimeWx);
        sb.append(", sendResurtWx=").append(sendResurtWx);
        sb.append(", sendTimeMsg=").append(sendTimeMsg);
        sb.append(", sendResurtMsg=").append(sendResurtMsg);
        sb.append("]");
        return sb.toString();
    }
}