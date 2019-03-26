package com.barber.web.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * 验证码日志实体
 */
@Data
public class VdtCodes implements Serializable {

    private Integer id;

    private String mobile;

    private String code;

    private String type;

    //过期日期
    private Date       expTime;
    //发送ip
    private BigInteger ip;
    // 是否使用
    private byte  checked;

    private Date createTime;

    private Date updateTime;
}