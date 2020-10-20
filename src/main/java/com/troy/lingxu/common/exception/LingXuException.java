package com.troy.lingxu.common.exception;

import com.troy.lingxu.common.enums.CodeEnum;
import lombok.Getter;

@Getter
public class LingXuException extends RuntimeException {

    private final String code;

    public LingXuException(String message){
        super(message);
        this.code = CodeEnum.SYSTEM_ERROR.getCode();
    }

    public LingXuException(CodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
    }



}
