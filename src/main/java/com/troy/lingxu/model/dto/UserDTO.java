package com.troy.lingxu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@ToString
@AllArgsConstructor
public class UserDTO {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
