package io.jboot.admin.service.entity.model;

import io.jboot.admin.service.entity.status.system.DataStatus;
import io.jboot.db.annotation.Table;
import io.jboot.admin.service.entity.model.base.BaseFacAgency;

import java.util.Objects;

/**
 * Generated by Jboot.
 */
@Table(tableName = "fac_agency", primaryKey = "id")
public class FacAgency extends BaseFacAgency<FacAgency> {

    public void setStatus(java.lang.String status) {
        if (Objects.equals(status, DataStatus.USED)) {
            setIsEnable(true);
        } else {
            setIsEnable(false);
        }
    }

    public java.lang.String getStatus() {
        if (this.getIsEnable()) {
            return DataStatus.USED;
        } else {
            return DataStatus.UNUSED;
        }
    }

    private boolean isInvite;

    public void setIsInvite(boolean isInvite) {
        this.isInvite = isInvite;
    }

    public boolean getIsInvite() {
        return this.isInvite;
    }
}
