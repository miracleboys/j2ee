package me.spring.entity;

import javax.validation.constraints.AssertTrue;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.validator.constraints.NotBlank;

public class User {
	// id
	private static final long serialVersionUID = 1L;
	// 登录名称
	@NotBlank(message="登录名称不能为空")
	private String username="";

	@NotBlank(message="用户昵称不能为空")
	// 用户昵称
    private String caption="";
	
    // 密码
    private String password="";
    // 确认密码
    private String rpassword="";
    
    @AssertTrue(message = "两次密码必须一致")
    public boolean isValid() {
    	return password.equals(rpassword);
    } 
    private boolean valid;
 
   
	// 电话号码
    @NotBlank(message="电话不能为空")
    private String telephone="";
    
   
	// 默认权限
    private String roleCode="01";

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getCaption() {
		return caption;
	}


	public void setCaption(String caption) {
		this.caption = caption;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		if(!password.equals("")) {
		this.password = DigestUtils.sha1Hex(password);
		}
		else {
			this.password = password;
		}
	}


	public String getRpassword() {
		return rpassword;
	}


	public void setRpassword(String rpassword) {
		if(!rpassword.equals("")) {
			this.rpassword = DigestUtils.sha1Hex(rpassword);
			}
			else {
				this.rpassword = rpassword;
			}
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getRoleCode() {
		return roleCode;
	}


	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	

 
    
}
