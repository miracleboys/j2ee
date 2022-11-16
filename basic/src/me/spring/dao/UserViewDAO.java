package me.spring.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import me.spring.entity.UserView;
@Repository
@Mapper
public interface UserViewDAO {
   /* @Select("SELECT" + 
            "   `u`.`id` AS `id`," + 
            "   `u`.`username` AS `username`," + 
            "   `u`.`caption` AS `caption`," + 
            "   `u`.`password` AS `password`," + 
            "   `ur`.`roleCode` AS `roleCode`," + 
            "   `cr`.`caption` AS `roleCaption`" + 
            "FROM" + 
            "   ((" + 
            "           `t_user` `u`" + 
            "           LEFT JOIN `t_userrole` `ur` ON ((" + 
            "                   `u`.`username` = `ur`.`username` " + 
            "               )))" + 
            "       LEFT JOIN `t_coderole` `cr` ON ((" + 
            "           `ur`.`roleCode` = `cr`.`code` " + 
            "   ))) where `u`.`caption` like #{userView.caption}")
    public List<UserView> getByCaption(@Param("userView") UserView userView);*/

    @Select("<script>select * from V_User <where> " +
	        "   <if test=\"userView.username != ''\">" +
	        "       and username = #{userView.username}" +
	        "   </if>" +
	        "   <if test=\"userView.roleCode != ''\">" +
	        "    and roleCode = #{userView.roleCode}" +
	        "   </if></where>" +
	        "</script>")
    public List<UserView> getIf(@Param("userView") UserView userView);
    
    @Select("SELECT * from V_User where caption like #{userView.caption}")
    public List<UserView> getByCaption(@Param("userView") UserView userView);
}