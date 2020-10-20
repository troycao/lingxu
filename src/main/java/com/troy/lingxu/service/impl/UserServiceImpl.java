package com.troy.lingxu.service.impl;

import com.troy.lingxu.dao.entity.User;
import com.troy.lingxu.dao.mapper.UserMapper;
import com.troy.lingxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caoqiang
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> listForCondition(User condition) {
        return userMapper.listUser();
    }

    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

}
