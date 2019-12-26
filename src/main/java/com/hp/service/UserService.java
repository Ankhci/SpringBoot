package com.hp.service;

import com.hp.mapper.UserMapper;
import com.hp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserService
 * @Description Service层
 * @Author Ankhci
 * @Date 2019/12/26 12:25
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long i) {
        return userMapper.selectByPrimaryKey(i);
    }

    @Transactional
    public void deleteUserById(Long i) {
        userMapper.deleteByPrimaryKey(i);
    }

    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }
}
