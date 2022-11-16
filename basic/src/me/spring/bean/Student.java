package me.spring.bean;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotEmpty  
    @Size(min=7,max =7)
    private String code = "0000001";
	@NotEmpty
    private String name = "张三";
	private	int gender = 1;
	private Date birth = new Date(0);
    private float height = 1.75f;
	private Course course;
	private String[] myHobby = new String[]{"01","03"};
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String[] getMyHobby() {
		return myHobby;
	}
	public void setMyHobby(String[] myHobby) {
		this.myHobby = myHobby;
	}


	
}
