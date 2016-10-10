package com.idea.nursing.login.web.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.login.web.dao.LoginMapper;
import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.domain.pojo.LoginExample;
import com.idea.nursing.login.web.service.LoginService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * Created by 10238 on 2016/10/10.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Resource
    private LoginMapper loginDao;



    @Override
    public boolean login(Login login) {
        LoginExample loginExample = new LoginExample();
        loginExample.createCriteria().andLoginNameEqualTo(login.getLoginName()).andLoginPasswordEqualTo(login.getLoginPassword());
        PageHelper.startPage(1,3);
        Page<Login> loginPage = (Page<Login>) loginDao.selectByExample(loginExample);
        System.out.println(loginPage.getResult().get(0));

        if(loginPage.getResult().size()==0){
            return false;
        }else{
            return true;
        }



    }
}
