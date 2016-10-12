package com.idea.nursing.login.web.controller;

import com.idea.nursing.core.generic.ResultData;
import com.idea.nursing.login.web.common.SessionConstant;
import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 10238 on 2016/10/10.
 */
@Controller
@RequestMapping("/login/login")
public class LoginCntroller {
    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param login
     * @return
     */
    @ResponseBody
    @RequestMapping(value="user_login",  method = RequestMethod.GET)
    public ResultData userLogin(Login login, HttpSession session){

        if(loginService.userLogin(login)){
            session.setAttribute(SessionConstant.SESSION_USER_BEAN,login);
            return ResultData.build();
        }else{
            return ResultData.build().error();
        }
    }

    @ResponseBody
    @RequestMapping(value = "seller_login", method = RequestMethod.GET)
    public ResultData sellerLogin(Login login,HttpSession session){
        if(loginService.sellerLogin(login)){
            session.setAttribute(SessionConstant.SESSION_USER_BEAN,login);
            return ResultData.build();
        }else{
            return ResultData.build().error();
        }
    }




}
