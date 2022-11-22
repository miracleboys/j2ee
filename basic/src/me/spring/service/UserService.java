package me.spring.service;

import java.util.List;

import me.spring.entity.User;

// 服务层
public interface UserService {
	public List<User> listAll();
    public int add(User user);
    
}
