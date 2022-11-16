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
@Repository
@Mapper
public interface UserDAO {
	 @Select("Select * from t_user")
	    public List<User> findAll();
	 @Insert("Insert into t_user(username,password) values(#{user.username},#{user.password})")
	    public int insert(@Param("user") User user);
	 @Update("Update t_user set username = #{user.username},password = #{user.password} where id = #{user.id} ")
	    public int update(@Param("user") User user);
	 @Delete("Delete from t_user where id = #{user.id} ")
	    public int delete(@Param("user") User user);
	 @Select("Select * from t_user where id = #{user.id} ")
	public User getById(@Param("user")User user);

	 @Select("<script>update T_User "+
            "<set>" + 
            "   <if test=\"user.username != ''\">" + 
            "          username = #{user.username}," + 
            "   </if>" + 
            "   <if test=\"user.caption != ''\">" + 
            "          caption = #{user.caption}," + 
            "   </if>" + 
            "   <if test=\"user.password != ''\">" + 
            "          password = #{user.password}," + 
            "   </if>" + 
            "</set>  " +           
            " where id = #{user.id}" +     
            "</script>")
    public void updateSet(@Param("user") User user);
}
