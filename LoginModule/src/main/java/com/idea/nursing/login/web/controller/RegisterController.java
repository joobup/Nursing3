package com.idea.nursing.login.web.controller;

import com.idea.nursing.core.generic.ResultData;
import com.idea.nursing.core.util.MD5Util;
import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.NoSuchAlgorithmException;

/**
 * Created by 10238 on 2016/10/11.
 */
@Controller
@RequestMapping("/login/register")
public class RegisterController {
    @Autowired
    private LoginService loginService;

    /**
     * 用户注册
     * @param login
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user_register" ,method = RequestMethod.POST)
    public ResultData userRegister(Login login) throws NoSuchAlgorithmException {
        login.setLoginPassword(MD5Util.MD5(login.getLoginPassword()));
        if(loginService.userRegister(login)){
            return ResultData.build();
        }else{
            return ResultData.build().error();
        }

    }

    /**
     * 商家注册
     * @param login
     * @return
     */
    @ResponseBody
    @RequestMapping(value="seller_register",method = RequestMethod.POST)
    public ResultData sellerRegister(Login login) throws NoSuchAlgorithmException {
        login.setLoginPassword(MD5Util.MD5(login.getLoginPassword()));
        if(loginService.sellerRegister(login)){
            return ResultData.build();
        }else{
            return ResultData.build().error();
        }
    }


}
