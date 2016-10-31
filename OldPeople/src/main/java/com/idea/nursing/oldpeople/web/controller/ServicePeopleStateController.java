package com.idea.nursing.oldpeople.service;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleState;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleStateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_people_state")
public class ServicePeopleStateController extends GenericController {
    @Autowired
    private ServicePeopleStateService servicepeoplestateService;

    /**
        * 添加服务对象状态
        * @param servicepeoplestate
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServicePeopleState servicepeoplestate){

        try {
                servicepeoplestateService.insert(servicepeoplestate);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务对象状态
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                servicepeoplestateService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务对象状态
    * @param servicepeoplestate
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServicePeopleState servicepeoplestate){
        try {
            servicepeoplestateService.update(servicepeoplestate);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务对象状态
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicepeoplestateService.findAll(currentPage,limit));
    }

}