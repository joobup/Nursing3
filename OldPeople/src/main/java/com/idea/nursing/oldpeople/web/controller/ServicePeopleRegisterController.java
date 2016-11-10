package com.idea.nursing.oldpeople.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegister;
import com.idea.nursing.oldpeople.web.service.ServicePeopleRegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_people_register")
public class ServicePeopleRegisterController extends GenericController {
    @Autowired
    private ServicePeopleRegisterService servicepeopleregisterService;

    /**
        * 添加服务对象信息登记
        * @param servicepeopleregister
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServicePeopleRegister servicepeopleregister){

        try {
                servicepeopleregisterService.insert(servicepeopleregister);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务对象信息登记
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                servicepeopleregisterService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务对象信息登记
    * @param servicepeopleregister
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServicePeopleRegister servicepeopleregister){
        try {
            servicepeopleregisterService.update(servicepeopleregister);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务对象信息登记
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicepeopleregisterService.findAll(currentPage,limit));
    }

    /**
     * 通过id获取信息
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value="findOne",method = RequestMethod.GET)
    public ResultData findOne(Long id){
        return ResultData.build().parseBean(servicepeopleregisterService.selectById(id));
    }

}