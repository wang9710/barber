package com.barber.web.app.controller;

import com.barber.web.app.service.PayQrCodeService;
import com.barber.web.config.SignatureAnnotation;
import com.barber.web.utils.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/app")
public class PayQrCodeController {

    private static Logger logger = LoggerFactory.getLogger(PayQrCodeController.class);

    @Autowired
    private PayQrCodeService payQrCodeService;

    @RequestMapping(value = "/pay/{payWay}")
    @SignatureAnnotation
    public ApiResult pay(HttpServletRequest request, HttpServletResponse response, Integer id, @PathVariable String payWay) throws IOException {
            logger.info("method pay params id:"+id +",支付方式："+payWay);
        return payQrCodeService.pay(request,response,id,payWay);
    }
}
