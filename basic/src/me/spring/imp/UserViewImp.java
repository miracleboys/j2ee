package me.spring.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.spring.dao.UserViewDAO;

import me.spring.entity.UserView;
import me.spring.service.UserViewService;
@Service
public class UserViewImp implements UserViewService{
	
    @Autowired
    UserViewDAO userViewDAO;
    
	@Override
	public List<UserView> listSome(UserView userView) {
		
		return userViewDAO.getByCaption(userView);
	}

	

//	@Override
//	public List<UserView> listIf(UserView userView) {     
//	    return userViewDAO.getIf(userView);
//	}
//
//	@Override
//	public List<UserView> listChoose(UserView userView) {     
//	    return userViewDAO.getChoose(userView);
//	}
}
