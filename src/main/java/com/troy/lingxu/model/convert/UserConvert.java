package com.troy.lingxu.model.convert;

import com.google.common.collect.Lists;
import com.troy.lingxu.dao.entity.User;
import com.troy.lingxu.model.dto.UserDTO;
import com.troy.lingxu.model.vo.ResUserListVO;
import com.troy.lingxu.model.vo.UserQueryVO;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @author caoqiang
 */
public class UserConvert {

    /***
     * 用户查询条件转换为数据对象
     * @return
     */
    public static User queryCondition2Bo(UserQueryVO userQueryVO){
        User user = new User();
        if (!ObjectUtils.isEmpty(userQueryVO)){
            BeanUtils.copyProperties(userQueryVO, user);
        }
        return user;
    }

    /**
     * 将用户BO列表转换为VO列表
     * @param userList
     * @return
     */
    public static List<ResUserListVO> user2ResApiListVO(List<User> userList){
        List<ResUserListVO> resUserListVOList = Lists.newArrayList();
        for (User user : userList) {
            if (!ObjectUtils.isEmpty(user)){
                ResUserListVO resUserListVO = new ResUserListVO();
                BeanUtils.copyProperties(user, resUserListVO);
                resUserListVOList.add(resUserListVO);
            }
        }

        return resUserListVOList;
    }
}
