package me.spring.service;
import java.util.List;
import me.spring.entity.UserView;
public interface UserViewService {
    public List<UserView> listSome(UserView userView);

	public List<UserView> listIf(UserView userView);
}