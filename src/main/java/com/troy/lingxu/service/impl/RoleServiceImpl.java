package com.troy.lingxu.service.impl;

import com.troy.lingxu.dao.entity.Role;
import com.troy.lingxu.dao.entity.User;
import com.troy.lingxu.dao.mapper.RoleMapper;
import com.troy.lingxu.dao.mapper.UserMapper;
import com.troy.lingxu.service.RoleService;
import com.troy.lingxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author caoqiang
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> listForCondition(Role condition) {
        return roleMapper.listRole();
    }

    @Override
    public int save(Role role) {
        return roleMapper.insert(role);
    }
}
