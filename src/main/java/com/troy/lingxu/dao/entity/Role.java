package com.troy.lingxu.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author caoqiang
 * @date 2020-08-27 10:48
 * @desc
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    public Role(String roleName){
        this.roleName = roleName;
    }

    private Long id;
    private String roleName;
}
