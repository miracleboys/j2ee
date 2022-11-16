package me.spring.service;

import java.util.List;

import me.spring.bean.Result;
import me.spring.entity.User;

public interface UserService {
	public List<User> listAll();
    public int add(User user);
    public int update(User user);
    public int delete(User user);
	public User getById(User user);
	public void updateSet(User user);
	public Result changeUsername(User user);
}
