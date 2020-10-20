package com.troy.lingxu.controller;

import com.troy.lingxu.biz.UserBizService;
import com.troy.lingxu.common.Result;
import com.troy.lingxu.dao.mapper.UserMapper;
import com.troy.lingxu.model.vo.UserQueryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户管理", tags = "用户管理")
public class UserController {

    @Autowired
    private UserBizService userBizService;

    @GetMapping("user/listUser")
    @ApiOperation(value = "获取用户信息")
    public Result listUser(@ApiParam @RequestBody @Validated UserQueryVO userQueryVO){
        /*if (true){
//            throw new LingXuException("test advice exception");
            throw new LingXuException(CodeEnum.USER_IS_NULL);
        }*/
        Result<?> result = userBizService.listForCondition(userQueryVO);
        return result;
    }

    @GetMapping("user/saveUser")
    @ApiOperation(value = "保存用户信息")
    public Result saveUser(@ApiParam @RequestBody @Validated UserQueryVO userQueryVO){
        Result<?> result = userBizService.saveUser(userQueryVO);
        return result;
    }

}
