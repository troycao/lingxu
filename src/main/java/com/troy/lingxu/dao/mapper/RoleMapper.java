package com.troy.lingxu.dao.mapper;

import com.troy.lingxu.dao.entity.Role;
import com.troy.lingxu.dao.entity.User;

import java.util.List;

/**
 * @author caoqiang
 * @date 2020-08-26 20:49
 * @desc
 */
public interface RoleMapper {

    Role selectByPrimaryKey(Long id);

    List<Role> listRole();

    int insert(Role role);
}
