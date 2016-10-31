package com.idea.nursing.order.service;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.order.web.dao.ServiceOrderUser;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_order_user")
public class ServiceOrderUserController extends GenericController {
    @Autowired
    private ServiceOrderUserService serviceorderuserService;

    /**
        * 添加订单服务对象关系
        * @param serviceorderuser
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServiceOrderUser serviceorderuser){

        try {
                serviceorderuserService.insert(serviceorderuser);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除订单服务对象关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                serviceorderuserService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改订单服务对象关系
    * @param serviceorderuser
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServiceOrderUser serviceorderuser){
        try {
            serviceorderuserService.update(serviceorderuser);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有订单服务对象关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(serviceorderuserService.findAll(currentPage,limit));
    }

}