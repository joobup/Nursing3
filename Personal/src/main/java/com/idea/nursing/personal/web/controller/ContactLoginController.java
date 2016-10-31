package com.idea.nursing.personal.service;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.personal.web.dao.ContactLogin;
import com.idea.nursing.personal.web.domain.pojo.ContactLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/contact_login")
public class ContactLoginController extends GenericController {
    @Autowired
    private ContactLoginService contactloginService;

    /**
        * 添加联系方式登录关系
        * @param contactlogin
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ContactLogin contactlogin){

        try {
                contactloginService.insert(contactlogin);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除联系方式登录关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                contactloginService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改联系方式登录关系
    * @param contactlogin
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ContactLogin contactlogin){
        try {
            contactloginService.update(contactlogin);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有联系方式登录关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(contactloginService.findAll(currentPage,limit));
    }

}