package com.troy.lingxu.service;

import com.troy.lingxu.dao.entity.Role;
import com.troy.lingxu.dao.entity.User;

import java.util.List;

/**
 * @author caoqiang
 */
public interface UserService {

    List<User> listForCondition(User condition);

    int save(User user);
}
