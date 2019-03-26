package com.barber.web.crm.bo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @ClassName: loginBo
 * @Version: 1.0
 */
@Data
public class LoginBo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String username;
    private Long gacode;
    private String password;

    private BigInteger lastIp;
}
