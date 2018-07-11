package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFacAgency<M extends BaseFacAgency<M>> extends JbootModel<M> implements IBean {

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

	public void setOrgID(java.lang.Long orgID) {
		set("orgID", orgID);
	}
	
	public java.lang.Long getOrgID() {
		return getLong("orgID");
	}

	public void setRegDocsFilePath(java.lang.String regDocsFilePath) {
		set("regDocsFilePath", regDocsFilePath);
	}
	
	public java.lang.String getRegDocsFilePath() {
		return getStr("regDocsFilePath");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setResume(java.lang.String resume) {
		set("resume", resume);
	}
	
	public java.lang.String getResume() {
		return getStr("resume");
	}

	public void setPrincipal(java.lang.String principal) {
		set("principal", principal);
	}
	
	public java.lang.String getPrincipal() {
		return getStr("principal");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setCredit(java.lang.String credit) {
		set("credit", credit);
	}
	
	public java.lang.String getCredit() {
		return getStr("credit");
	}

	public void setScope(java.lang.String scope) {
		set("scope", scope);
	}
	
	public java.lang.String getScope() {
		return getStr("scope");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setStart(java.util.Date start) {
		set("start", start);
	}
	
	public java.util.Date getStart() {
		return get("start");
	}

	public void setPerson(java.lang.String person) {
		set("person", person);
	}
	
	public java.lang.String getPerson() {
		return getStr("person");
	}

	public void setCapital(java.lang.Double capital) {
		set("capital", capital);
	}
	
	public java.lang.Double getCapital() {
		return getDouble("capital");
	}

	public void setPictrue(java.lang.String pictrue) {
		set("pictrue", pictrue);
	}
	
	public java.lang.String getPictrue() {
		return getStr("pictrue");
	}

	public void setWebsite(java.lang.String website) {
		set("website", website);
	}
	
	public java.lang.String getWebsite() {
		return getStr("website");
	}

	public void setCoordinate(java.lang.String coordinate) {
		set("coordinate", coordinate);
	}
	
	public java.lang.String getCoordinate() {
		return getStr("coordinate");
	}

	public void setLandline(java.lang.String landline) {
		set("landline", landline);
	}
	
	public java.lang.String getLandline() {
		return getStr("landline");
	}

	public void setScale(java.lang.Integer scale) {
		set("scale", scale);
	}
	
	public java.lang.Integer getScale() {
		return getInt("scale");
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
		return getBoolean("isEnable");
	}

}
