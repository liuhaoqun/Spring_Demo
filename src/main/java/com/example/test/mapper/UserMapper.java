package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //登录时信息核对
    UserBean getInfo(@Param("name") String name,@Param("password") String password);

    //根据ID查询用户信息
    UserBean selectUserById(@Param("id") String id);

    //插入新的用户
    int insertUser(@Param("userBean") UserBean userBean);

    //删除用户
    int deleteUser(@Param("id") String id);

    //修改用户
    int updateUser(@Param("userBean") UserBean userBean);

    //查询所有用户
    List<UserBean> getAllUser();

}
