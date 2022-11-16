package me.spring.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import me.spring.entity.UserRole;
@Repository
@Mapper
public interface UserRoleDAO {
    @Update("Update t_userrole set username = #{newUserRole.username} where username = #{oldUserRole.username} ")
    public int update(@Param("oldUserRole") UserRole oldUserRole, @Param("newUserRole") UserRole newUserRole);
}