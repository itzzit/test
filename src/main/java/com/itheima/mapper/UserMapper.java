package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

public interface UserMapper {

     User selectUserById(Integer id);

     List<User> selectUserByName(String username);

     void insertUser(User user);

     List<User> reportOrders();

}
