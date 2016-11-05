package com.mystartup.mykedai.common.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.mystartup.mykedai.common.bean.user.UserBean;

@Repository
public interface UserDao {

	@Delete("SELECT f_user_d(#{publicid},#{userid})")
    abstract void deleteById( 
    		@Param("publicid")int publicid,
    		@Param("userid")int userid) throws Exception;
    
    
    @Insert("SELECT f_user_i("
            + "#{username}," 
            + "#{password}," 
            + "#{email}," 
            + "#{phone}," 
            + "#{flagActive}," 
            + "#{flagLocked},"
            + "#{userType},"
            + "#{referenceId},"
            + "#{roleGroupId}," 
            + "#{lastUpdatedBy})")
    abstract void insert(UserBean bean) throws Exception;
    
    
    @Update("SELECT f_user_u("
    		+ "#{publicId},"
            + "#{username}," 
            + "#{password}," 
            + "#{email}," 
            + "#{phone}," 
            + "#{flagActive}," 
            + "#{flagLocked},"
            + "#{userType},"
            + "#{referenceId},"
            + "#{roleGroupId}," 
            + "#{lastUpdatedBy})")
    abstract void updateById(UserBean bean) throws Exception;
    
    @Select("SELECT * FROM tbl_user WHERE id=#{id}")
    abstract UserBean selectById(@Param("id") int id) throws Exception;

    @Select("SELECT * FROM vw_user WHERE publicid=#{publicid}")
    abstract UserBean selectByPublicId(@Param("publicid") int publicid) throws Exception;
    
    @Select("SELECT * FROM vw_user limit #{limit} offset #{offset}")
    abstract List<UserBean> selectPage(
            @Param("limit")int limit,
            @Param("offset") int offset) throws Exception;
    
    @Select("SELECT count(1) FROM tbl_user")
    abstract Integer selectCountAll() throws Exception;
}
