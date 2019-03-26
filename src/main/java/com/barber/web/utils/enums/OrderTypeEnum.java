package com.barber.web.utils.enums;


import com.barber.web.config.BaseCodeEnum;
import lombok.Getter;

/**
 * 订单类型 1:包月服务 0 单次服务
 */
public enum OrderTypeEnum implements BaseCodeEnum {

    MONTHLY_SERVICE(1,"包月服务"),
    SINGLE_SERVICE(0,"单次服务");
    @Getter
    private int code;
    @Getter
    private String message;

    OrderTypeEnum(int code, String message) { this.code = code; this.message = message; }
    public static OrderTypeEnum get(int code) {
        String value = String.valueOf(code);
        return get(value);
    }

    public static OrderTypeEnum get(String code) {
        for (OrderTypeEnum e : values()) {
            if(String.valueOf(e.getCode()).equals(code)) {
                return e;
            }
        }
        return null;
    }
}
