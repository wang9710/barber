package com.barber.web.crm.service;


import com.barber.web.utils.ApiResult;
import com.barber.web.crm.bo.OpenBo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface OrderService {

    /**
     * @return a
     * @Description 微信公众号获取openid
     * @Param
     **/
    ApiResult getOpenId(OpenBo openBo, HttpServletResponse res);
    /**
     * @return a
     * @Description 微信支付
     * @Param
     **/
    ApiResult ToPay(String OrderNum, String wxnotify, String projectUrl, HttpServletRequest request, HttpServletResponse res);

}
