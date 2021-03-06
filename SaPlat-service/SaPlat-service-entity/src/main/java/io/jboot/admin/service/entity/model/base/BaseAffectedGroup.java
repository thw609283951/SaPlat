package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAffectedGroup<M extends BaseAffectedGroup<M>> extends JbootModel<M> implements IBean {

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

	public void setPersonID(java.lang.Long personID) {
		set("personID", personID);
	}
	
	public java.lang.Long getPersonID() {
		return getLong("personID");
	}

	public void setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
	}
	
	public java.util.Date getBirthday() {
		return get("birthday");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setPoliticsID(java.lang.Long politicsID) {
		set("politicsID", politicsID);
	}
	
	public java.lang.Long getPoliticsID() {
		return getLong("politicsID");
	}

	public void setNationID(java.lang.Long nationID) {
		set("nationID", nationID);
	}
	
	public java.lang.Long getNationID() {
		return getLong("nationID");
	}

	public void setNationalityID(java.lang.Long nationalityID) {
		set("nationalityID", nationalityID);
	}
	
	public java.lang.Long getNationalityID() {
		return getLong("nationalityID");
	}

	public void setEducationID(java.lang.Long educationID) {
		set("educationID", educationID);
	}
	
	public java.lang.Long getEducationID() {
		return getLong("educationID");
	}

	public void setOthername(java.lang.String othername) {
		set("othername", othername);
	}
	
	public java.lang.String getOthername() {
		return getStr("othername");
	}

	public void setDutyID(java.lang.Long dutyID) {
		set("dutyID", dutyID);
	}
	
	public java.lang.Long getDutyID() {
		return getLong("dutyID");
	}

	public void setResidence(java.lang.String residence) {
		set("residence", residence);
	}
	
	public java.lang.String getResidence() {
		return getStr("residence");
	}

	public void setMail(java.lang.String mail) {
		set("mail", mail);
	}
	
	public java.lang.String getMail() {
		return getStr("mail");
	}

	public void setResume(java.lang.String resume) {
		set("resume", resume);
	}
	
	public java.lang.String getResume() {
		return getStr("resume");
	}

	public void setChildren(java.lang.String children) {
		set("children", children);
	}
	
	public java.lang.String getChildren() {
		return getStr("children");
	}

	public void setMaritalstatus(java.lang.String maritalstatus) {
		set("maritalstatus", maritalstatus);
	}
	
	public java.lang.String getMaritalstatus() {
		return getStr("maritalstatus");
	}

	public void setCensus(java.lang.String census) {
		set("census", census);
	}
	
	public java.lang.String getCensus() {
		return getStr("census");
	}

	public void setOccupationID(java.lang.Long occupationID) {
		set("occupationID", occupationID);
	}
	
	public java.lang.Long getOccupationID() {
		return getLong("occupationID");
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
