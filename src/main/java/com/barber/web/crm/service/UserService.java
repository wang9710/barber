package com.barber.web.crm.service;

import com.barber.web.entity.PeUsers;
import com.barber.web.utils.ApiResult;
import com.barber.web.crm.bo.LoginBo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: UserService
 * @Version: 1.0
 */
public interface UserService {



    ApiResult login(LoginBo loginBo, HttpServletRequest request);

    ApiResult crt_user(PeUsers peUsers);


    void QRCode(HttpServletRequest request, HttpServletResponse response, int width, int height, String format, String userName, String realmname);
}
