package me.spring.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.spring.bean.Result;
import me.spring.dao.UserDAO;
import me.spring.dao.UserRoleDAO;
import me.spring.entity.User;
import me.spring.entity.UserRole;
import me.spring.service.UserService;
@Service
public class UserImp implements UserService {
    @Autowired
    UserDAO userDAO;
    @Autowired
    UserRoleDAO userRoleDAO;
    @Override
    public List<User> listAll() {      
        return userDAO.findAll();
    }
    @Override
    public int add(User user) {
        return userDAO.insert(user);
    }
    @Override
    public int update(User user) {
        return userDAO.update(user);
    }
    @Override
    public int delete(User user) {
        return userDAO.delete(user);
    }
	@Override
	public User getById(User user) {
		// TODO Auto-generated method stub
		return userDAO.getById(user);
	}
	@Override
	public void updateSet(User user) {
	    userDAO.updateSet(user);
	}
	@Override
	@Transactional
	public Result changeUsername(User user) {
	    Result result = new Result(); 
	    User oldUser = userDAO.getById(user);
	    UserRole oldUserRole = new UserRole();
	    oldUserRole.setUsername(oldUser.getUsername());
	    int updateUserCount = userDAO.update(user);
	    if (updateUserCount > 0) {
	        result.setCode(0);
	        result.setMsg("用户信息更新成功");
	    } else {
	        result.setCode(-1);
	        result.setMsg("用户信息更新失败");
	    }
	    if (updateUserCount > 0) {
	        UserRole newUserRole = new UserRole();
	        newUserRole.setUsername(user.getUsername());
	        int updateUserRoleCount = userRoleDAO.update(oldUserRole, newUserRole);
	        if (updateUserRoleCount > 0) {
	            result.setCode(0);
	            result.setMsg(result.getMsg()+"|用户角色更新成功");
	        } else {
	            result.setCode(-2);
	            result.setMsg(result.getMsg()+"|用户角色更新失败");
	        }
	    }
	    return result;
	}
}