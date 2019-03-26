package com.barber.web.utils;


import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.submail.config.AppConfig;
import com.submail.lib.MessageSend;
import com.submail.utils.ConfigLoader;

/**
 * @ClassName: SmsHelp
 * @Version: 1.0
 */
public class SmsHelp {
    private static Logger logger = LoggerFactory.getLogger(SmsHelp.class);


    /**
     * 发送手机短信
     * @param phoneNum
     * @return
     */
    public  static Boolean sendMessage (String phoneNum,String content,String appid,String appkey,String signtype) throws Exception{

        if (null!=phoneNum&&!"".equals(phoneNum)) {
            AppConfig config = ConfigLoader.createConfig(appid,appkey,signtype);
            MessageSend submail = new MessageSend(config);
            submail.addTo(phoneNum);
            submail.addContent(content);
            String send = submail.send();
            JSONObject resultJson = JSONObject.parseObject(send);
            if("success".equals(resultJson.getString("status"))){
                return true;
            }else{
                return false;
            }

        }else{
            logger.info("填写手机号为空");
            return false;
        }

      }

    /**
     * 验证短信验证码
     * @param
     * @return
     */
    public static Boolean checkMessage (String validateCode, HttpServletRequest request, HttpServletResponse response) throws Exception {

        if (null != validateCode && !"".equals(validateCode)) {
            String validateCodeString = String.valueOf(request.getSession().getAttribute("validateCode"));
            if(validateCodeString.equals(validateCode)){
                //验证成功后清空session对应的验证码信息
                request.getSession().removeAttribute("validateCode");
                return true;

            }else{
                return false;
            }
        } else {
            logger.info("填写验证码为空");
            return false;
        }
    }

}
