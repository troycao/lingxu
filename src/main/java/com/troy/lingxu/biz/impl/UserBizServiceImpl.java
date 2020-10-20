package com.troy.lingxu.biz.impl;

import com.troy.lingxu.biz.UserBizService;
import com.troy.lingxu.common.Result;
import com.troy.lingxu.dao.entity.Role;
import com.troy.lingxu.dao.entity.User;
import com.troy.lingxu.model.convert.UserConvert;
import com.troy.lingxu.model.dto.UserDTO;
import com.troy.lingxu.model.vo.ResUserListVO;
import com.troy.lingxu.model.vo.UserQueryVO;
import com.troy.lingxu.service.RoleService;
import com.troy.lingxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author caoqiang
 */
@Service
public class UserBizServiceImpl implements UserBizService {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Override
    public UserDTO getUser(Long id) {
        UserDTO userDTO = new UserDTO("张三", "asdf1234");
        return userDTO;
    }

    @Override
    public Result<?> listForCondition(UserQueryVO userQueryVO) {
        // 将VO转换为BO
        User user = UserConvert.queryCondition2Bo(userQueryVO);
        // 调用service
        List<User> list = userService.listForCondition(user);
        // 将BO转换为VO
        List<ResUserListVO> resUserListVOS = UserConvert.user2ResApiListVO(list);

        System.out.println(roleService.listForCondition(new Role()));

        return Result.success(resUserListVOS);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> saveUser(UserQueryVO userQueryVO) {
        // 将VO转换为BO
        User user = UserConvert.queryCondition2Bo(userQueryVO);
        int save1 = userService.save(user);

        Role role = new Role(user.getUsername());
        int save = roleService.save(role);

        return Result.success();
    }
}
