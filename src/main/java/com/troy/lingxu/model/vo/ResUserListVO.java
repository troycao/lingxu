package com.troy.lingxu.model.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author caoqiang
 * @date 2020-08-26 14:53
 * @desc
 */
@Data
@ApiModel(value = "用户列表展示")
public class ResUserListVO {

    @ApiModelProperty(value = "用户ID")
    private Long id;

    @ApiModelProperty(value = "用户姓名")
    private String username;
}
