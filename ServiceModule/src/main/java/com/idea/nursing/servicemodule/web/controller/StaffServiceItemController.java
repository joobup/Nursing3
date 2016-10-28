package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItem;
import com.idea.nursing.servicemodule.web.service.StaffServiceItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/staff_service_item")
public class StaffServiceItemController extends GenericController {
    @Autowired
    private StaffServiceItemService staffserviceitemService;

    /**
        * 添加服务人员服务项目关系
        * @param staffserviceitem
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(StaffServiceItem staffserviceitem,Long[] serviceIds){

        try {
                staffserviceitemService.inserts(staffserviceitem.getStaffId(),serviceIds);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务人员服务项目关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                staffserviceitemService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务人员服务项目关系
    * @param staffserviceitem
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(StaffServiceItem staffserviceitem){
        try {
            staffserviceitemService.update(staffserviceitem);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务人员服务项目关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(staffserviceitemService.findAll(currentPage,limit));
    }

}