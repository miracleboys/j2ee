package me.spring.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.spring.dao.UserDAO;
import me.spring.entity.User;
import me.spring.service.UserService;

// 实现层
@Service
public class UserImp implements UserService{
	 @Autowired
	 UserDAO userDAO;

	@Override
	public List<User> listAll() {
		 return userDAO.findAll();
	}

	@Override
	public int add(User user) {
		return userDAO.insert(user);
	}
	 
}
