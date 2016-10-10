package com.idea.nursing.login.web.service;

import com.idea.nursing.login.web.domain.pojo.Login;

/**
 * Created by 10238 on 2016/10/10.
 */
public interface LoginService {

    /**
     * 登录
     */
    public boolean login(Login login);
}
