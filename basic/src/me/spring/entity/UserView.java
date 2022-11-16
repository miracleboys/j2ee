package me.spring.entity;
public class UserView extends IdEntity {
    private static final long serialVersionUID = 1L;
    private String username = "";
    private String caption = "";
    private String password = "";
    private String roleCode = "";
    private String roleCaption = "";
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
        this.password = password;
    }
    public String getRoleCode() {
        return roleCode;
    }
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    public String getRoleCaption() {
        return roleCaption;
    }
    public void setRoleCaption(String roleCaption) {
        this.roleCaption = roleCaption;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
