package com.idea.nursing.login.web.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.util.MD5Util;
import com.idea.nursing.login.web.dao.LoginMapper;
import com.idea.nursing.login.web.dao.LoginRoleMapper;
import com.idea.nursing.login.web.dao.RoleMapper;
import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.domain.pojo.LoginExample;
import com.idea.nursing.login.web.domain.pojo.LoginRole;
import com.idea.nursing.login.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by 10238 on 2016/10/10.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginDao;
    @Autowired
    private LoginRoleMapper loginRoleMapper;



    /**
     * 用户注册
     * @param login
     * @return
     */
    @Override
    public boolean userRegister(Login login) {
        int result =  loginDao.insertSelective(login);
        if(login.getId()==null){
            return false;
        }else{
           //添加普通用户角色
            loginRoleMapper.insertSelective(new LoginRole(2L,login.getId()));

            return true;
        }

    }

    /**
     * 商家注册
     * @param login
     * @return
     */
    @Override
    public boolean sellerRegister(Login login) {

        int result =  loginDao.insertSelective(login);
        if(login.getId()==null){
            return false;
        }else{
            //添加普通用户角色
            loginRoleMapper.insertSelective(new LoginRole(1L,login.getId()));

            return true;
        }
    }

    @Override
    public boolean userLogin(Login login)  {
        LoginExample loginExample = new LoginExample();
        try {
            loginExample.createCriteria().andLoginNameEqualTo(login.getLoginName()).andLoginPasswordEqualTo(MD5Util.MD5(login.getLoginPassword()));
            List<Login> loginList =loginDao.selectByExample(loginExample);
            if(loginList.size()==0){
                return false;
            }else{
                //查询用户详细信息
                return true;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean sellerLogin(Login login) {
        LoginExample loginExample = new LoginExample();
        try {
            loginExample.createCriteria().andLoginNameEqualTo(login.getLoginName()).andLoginPasswordEqualTo(MD5Util.MD5(login.getLoginPassword()));
            List<Login> loginList =loginDao.selectByExample(loginExample);
            if(loginList.size()==0){
                return false;
            }else{
                //查询商家详细信息
                return true;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }
}
