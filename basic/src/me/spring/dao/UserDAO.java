package me.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import me.spring.entity.User;

// 数据访问层
@Repository
@Mapper
public interface UserDAO {
	
	 // 查询所有
	 @Select("Select * from t_user")
	 public List<User> findAll();
	 
	 // 插入数据
	 @Insert("Insert into t_user(username,caption,password,telephone) values(#{user.username},#{user.caption},#{user.password},#{user.telephone})")
	 public int insert(@Param("user") User user);
	 
	 // 更新数据
	 @Update("Update t_user set username = #{user.username},password = #{user.password} where id = #{user.id} ")
	 public int update(@Param("user") User user);
	 
	 // 删除数据
	 @Delete("Delete from t_user where id = #{user.id} ")
	 public int delete(@Param("user") User user);

	
	
}
