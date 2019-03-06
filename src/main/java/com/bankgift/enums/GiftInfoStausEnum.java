package com.bankgift.enums;

import lombok.Getter;

@Getter
public enum GiftInfoStausEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    GiftInfoStausEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
