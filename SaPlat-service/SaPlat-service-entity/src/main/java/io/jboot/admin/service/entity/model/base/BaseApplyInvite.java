package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseApplyInvite<M extends BaseApplyInvite<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setSpell(java.lang.String spell) {
		set("spell", spell);
	}
	
	public java.lang.String getSpell() {
		return getStr("spell");
	}

	public void setModule(java.lang.Integer module) {
		set("module", module);
	}
	
	public java.lang.Integer getModule() {
		return getInt("module");
	}

	public void setProjectID(java.lang.Long projectID) {
		set("projectID", projectID);
	}
	
	public java.lang.Long getProjectID() {
		return getLong("projectID");
	}

	public void setStructID(java.lang.Long structID) {
		set("structID", structID);
	}
	
	public java.lang.Long getStructID() {
		return getLong("structID");
	}

	public void setUserID(java.lang.Long userID) {
		set("userID", userID);
	}
	
	public java.lang.Long getUserID() {
		return getLong("userID");
	}

	public void setUserSource(java.lang.Integer userSource) {
		set("userSource", userSource);
	}
	
	public java.lang.Integer getUserSource() {
		return getInt("userSource");
	}

	public void setApplyOrInvite(java.lang.Integer applyOrInvite) {
		set("applyOrInvite", applyOrInvite);
	}
	
	public java.lang.Integer getApplyOrInvite() {
		return getInt("applyOrInvite");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setReply(java.lang.String reply) {
		set("reply", reply);
	}
	
	public java.lang.String getReply() {
		return getStr("reply");
	}

	public void setDeadTime(java.util.Date deadTime) {
		set("deadTime", deadTime);
	}
	
	public java.util.Date getDeadTime() {
		return get("deadTime");
	}

	public void setCreateUserID(java.lang.Long createUserID) {
		set("createUserID", createUserID);
	}
	
	public java.lang.Long getCreateUserID() {
		return getLong("createUserID");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public void setLastUpdateUserID(java.lang.Long lastUpdateUserID) {
		set("lastUpdateUserID", lastUpdateUserID);
	}
	
	public java.lang.Long getLastUpdateUserID() {
		return getLong("lastUpdateUserID");
	}

	public void setLastAccessTime(java.util.Date lastAccessTime) {
		set("lastAccessTime", lastAccessTime);
	}
	
	public java.util.Date getLastAccessTime() {
		return get("lastAccessTime");
	}

	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setIsEnable(java.lang.Boolean isEnable) {
		set("isEnable", isEnable);
	}
	
	public java.lang.Boolean getIsEnable() {
		return get("isEnable");
	}

}
