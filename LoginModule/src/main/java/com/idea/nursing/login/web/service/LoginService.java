package com.idea.nursing.login.web.service;

import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.domain.pojo.Role;

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
    public Login userLogin(Login login);

    /**
     * 商家登录
     * @param login
     * @return
     */
    public boolean sellerLogin(Login login);

    /**
     * 唯一验证
     * @param tel 电话号码
     * @return
     */
    public boolean uniqueVerify(String tel);

    /**
     * 通过用户Id 查询角色
     * @param usetId
     * @return
     */
    public Role selectUserRole(Long usetId);

}
