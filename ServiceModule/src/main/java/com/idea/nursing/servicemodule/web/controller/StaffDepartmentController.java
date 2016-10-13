package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffDepartment;
import com.idea.nursing.servicemodule.web.service.StaffDepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/staff_department")
public class StaffDepartmentController extends GenericController {
    @Autowired
    private StaffDepartmentService staffdepartmentService;

    /**
        * 添加服务人员职务
        * @param staffdepartment
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(StaffDepartment staffdepartment){

        try {
                staffdepartmentService.insert(staffdepartment);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务人员职务
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                staffdepartmentService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务人员职务
    * @param staffdepartment
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(StaffDepartment staffdepartment){
        try {
            staffdepartmentService.update(staffdepartment);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务人员职务
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(staffdepartmentService.findAll(currentPage,limit));
    }

}