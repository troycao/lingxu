package com.troy.lingxu.service;

import com.troy.lingxu.dao.entity.Role;
import com.troy.lingxu.dao.entity.User;

import java.util.List;

/**
 * @author caoqiang
 */
public interface RoleService {

    List<Role> listForCondition(Role condition);

    int save(Role role);
}
