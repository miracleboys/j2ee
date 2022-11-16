package me.spring.entity;

public class UserRole extends IdEntity {
    private static final long serialVersionUID = 1L;
    private String username = "";
    private String roleCode = "";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}