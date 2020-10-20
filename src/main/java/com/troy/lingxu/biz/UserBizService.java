package com.troy.lingxu.biz;

import com.troy.lingxu.common.Result;
import com.troy.lingxu.dao.entity.User;
import com.troy.lingxu.model.dto.UserDTO;
import com.troy.lingxu.model.vo.UserQueryVO;

/**
 * @author caoqiang
 */
public interface UserBizService {

    /***
     * 根据用户ID查询用户
     * @param id
     * @return
     */
    UserDTO getUser(Long id);

    /***
     * 条件查询
     * @param userQueryVO 查询用户条件
     * @return
     */
    Result<?> listForCondition(UserQueryVO userQueryVO);

    Result<?> saveUser(UserQueryVO userQueryVO);

}
