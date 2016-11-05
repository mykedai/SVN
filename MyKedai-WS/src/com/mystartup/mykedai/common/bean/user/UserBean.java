package com.mystartup.mykedai.common.bean.user;

import java.util.Date;

import com.mystartup.mykedai.common.bean.core.UserTypeEnum;

public class UserBean {	
	
    private Integer id;
    private Integer publicId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private boolean flagActive = false;
    private boolean flagLocked = true;
    private Date lastlogin;
    private String token;
    private Integer roleGroupId;
    private RoleGroupBean roleGroup;
    private int statusId;
    private Date timestampStatus;
    private UserTypeEnum userType;
    private Integer referenceId;
    private int lastUpdatedBy;

    public UserBean() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPublicId() {
		return publicId;
	}

	public void setPublicId(Integer publicId) {
		this.publicId = publicId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isFlagActive() {
		return flagActive;
	}

	public void setFlagActive(boolean flagActive) {
		this.flagActive = flagActive;
	}

	public boolean isFlagLocked() {
		return flagLocked;
	}

	public void setFlagLocked(boolean flagLocked) {
		this.flagLocked = flagLocked;
	}

	public Date getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getRoleGroupId() {
		return roleGroupId;
	}

	public void setRoleGroupId(Integer roleGroupId) {
		this.roleGroupId = roleGroupId;
	}

	public RoleGroupBean getRoleGroup() {
		return roleGroup;
	}

	public void setRoleGroup(RoleGroupBean roleGroup) {
		this.roleGroup = roleGroup;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Date getTimestampStatus() {
		return timestampStatus;
	}

	public void setTimestampStatus(Date timestampStatus) {
		this.timestampStatus = timestampStatus;
	}

	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}

	public Integer getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}

	public int getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
}