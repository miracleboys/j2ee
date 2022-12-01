package me.spring.service;

import java.util.List;

import me.spring.entity.User;

// 服务层
public interface UserService {
	public List<User> listAll();
	
	// 账号注册
    public int add(User user);
    public int setUserRole(User user);
    
    // 账号登录
    public List<User> find(User user);
    
}
