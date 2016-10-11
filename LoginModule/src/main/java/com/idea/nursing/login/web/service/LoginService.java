package com.idea.nursing.login.web.service;

import com.idea.nursing.login.web.domain.pojo.Login;

/**
 * Created by 10238 on 2016/10/10.
 */
public interface LoginService {


    /**
     *用户注册
     */
    public boolean userRegister(Login login);

    /**
     * 商家注册
     * @param login
     * @return
     */
    public boolean sellerRegister(Login login);
    /**
     * 个人登录
     */
    public boolean userLogin(Login login);

    /**
     * 商家登录
     * @param login
     * @return
     */
    public boolean sellerLogin(Login login);

}
