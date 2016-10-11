package com.idea.nursing.login.web.controller;

import com.idea.nursing.core.generic.ResultData;
import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/user_register")
    public ResultData userRegister(Login login){
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
    @RequestMapping("/seller_register")
    public ResultData sellerRegister(Login login){
        if(loginService.sellerRegister(login)){
            return ResultData.build();
        }else{
            return ResultData.build().error();
        }
    }


}
