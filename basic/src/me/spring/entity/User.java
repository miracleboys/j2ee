package me.spring.entity;

public class User extends IdEntity{
	private static final long serialVersionUID = 1L;
	private String caption;
	private String username;//属性名称必须与数据库字段一致 规范会让代码更简单
	private String password;
	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
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
	
}
