package io.jboot.admin.service.entity.model;

import io.jboot.db.annotation.Table;
import io.jboot.admin.service.entity.model.base.BaseProject;

/**
 * Generated by Jboot.
 */
@Table(tableName = "project", primaryKey = "id")
public class Project extends BaseProject<Project> {
    private String typeName;
    private String reply;
    private boolean isReceive;
    private double maxAmount;
    private double minAmount;
    private boolean isUpload;
    private Long fileID;

    public Long getFileID() {
        return fileID;
    }

    public void setFileID(Long fileID) {
        this.fileID = fileID;
    }

    public boolean getIsUpload() {
        return isUpload;
    }

    public void setIsUpload(boolean isUpload) {
        this.isUpload = isUpload;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public boolean getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(boolean isReceive) {
        this.isReceive = isReceive;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }


}


