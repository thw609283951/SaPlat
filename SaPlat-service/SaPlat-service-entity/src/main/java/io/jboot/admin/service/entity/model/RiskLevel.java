package io.jboot.admin.service.entity.model;

import io.jboot.admin.service.entity.status.system.DataStatus;
import io.jboot.db.annotation.Table;
import io.jboot.admin.service.entity.model.base.BaseRiskLevel;

/**
 * Generated by Jboot.
 */
@Table(tableName = "risk_level", primaryKey = "id")
public class RiskLevel extends BaseRiskLevel<RiskLevel> {
    public void setStatus(java.lang.String status) {
        if (status == DataStatus.USED) {
            setIsEnable(true);
        } else {
            setIsEnable(false);
        }
    }

    public java.lang.String getStatus() {
        if(this.getIsEnable() == true)
            return DataStatus.USED;
        else
            return DataStatus.UNUSED;
    }
}