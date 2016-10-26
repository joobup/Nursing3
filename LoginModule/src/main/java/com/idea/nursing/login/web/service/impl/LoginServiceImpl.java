package com.idea.nursing.login.web.service.impl;


import com.idea.nursing.core.util.MD5Util;
import com.idea.nursing.login.web.dao.LoginMapper;
import com.idea.nursing.login.web.dao.LoginRoleMapper;
import com.idea.nursing.login.web.dao.RoleMapper;
import com.idea.nursing.login.web.domain.pojo.*;
import com.idea.nursing.login.web.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    @Autowired
    private RoleMapper roleMapper;




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
    public Login userLogin(Login login)  {
        LoginExample loginExample = new LoginExample();
        try {

            loginExample.createCriteria().andLoginTelEqualTo(login.getLoginTel()).andLoginPasswordEqualTo(MD5Util.MD5(login.getLoginPassword()));
            List<Login> loginList =loginDao.selectByExample(loginExample);
            if(loginList.size()==0){
                return new Login();
            }else{
                //查询用户详细信息
                return loginList.get(0);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return new Login();
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

    /**
     * 唯一验证
     * @param tel 电话号码
     * @return
     */
    @Override
    public boolean uniqueVerify(String tel) {

        LoginExample loginExample = new LoginExample();
        loginExample.createCriteria().andLoginTelEqualTo(tel);

        return loginDao.selectByExample(loginExample).size()==0;
    }

    /**
     * 通过用户id 查询角色
     * @param usetId
     * @return
     */
    @Override
    public Role selectUserRole(Long usetId) {
        LoginRoleExample loginRoleExample =  new LoginRoleExample();
        loginRoleExample.createCriteria().andLoginIdEqualTo(usetId);
        List<LoginRole> roles = loginRoleMapper.selectByExample(loginRoleExample);
        if(roles.size()==0){
            return new Role();
        }else{
            Role role =  roleMapper.selectByPrimaryKey(roles.get(0).getRoleId());
            if(role==null){
                return new Role();
            }else {
                return role;
            }

        }


    }
}
