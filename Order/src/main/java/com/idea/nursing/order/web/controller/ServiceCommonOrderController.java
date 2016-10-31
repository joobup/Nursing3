package com.idea.nursing.order.service;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.order.web.dao.ServiceCommonOrder;
import com.idea.nursing.order.web.domain.pojo.ServiceCommonOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_common_order")
public class ServiceCommonOrderController extends GenericController {
    @Autowired
    private ServiceCommonOrderService servicecommonorderService;

    /**
        * 添加服务工单
        * @param servicecommonorder
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServiceCommonOrder servicecommonorder){

        try {
                servicecommonorderService.insert(servicecommonorder);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务工单
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                servicecommonorderService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务工单
    * @param servicecommonorder
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServiceCommonOrder servicecommonorder){
        try {
            servicecommonorderService.update(servicecommonorder);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务工单
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicecommonorderService.findAll(currentPage,limit));
    }

}