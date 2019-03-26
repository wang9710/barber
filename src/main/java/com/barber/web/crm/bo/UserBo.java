package com.barber.web.crm.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: UserBo
 * @Version: 1.0
 */
@Data
public class UserBo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String realname;

    private String username;

    private Byte status;
}
