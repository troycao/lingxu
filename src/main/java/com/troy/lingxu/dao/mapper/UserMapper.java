package com.troy.lingxu.dao.mapper;

import com.troy.lingxu.dao.entity.User;

import java.util.List;

/**
 * @author caoqiang
 * @date 2020-08-26 20:49
 * @desc
 */
public interface UserMapper {

    User selectByPrimaryKey(Long id);

    List<User> listUser();

    int insert(User user);
}
