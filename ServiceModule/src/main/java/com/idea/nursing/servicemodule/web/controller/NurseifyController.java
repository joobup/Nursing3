package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.Nurseify;
import com.idea.nursing.servicemodule.web.service.NurseifyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/nurseify")
public class NurseifyController extends GenericController {
    @Autowired
    private NurseifyService nurseifyService;

    /**
        * 添加护理级别
        * @param nurseify
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Nurseify nurseify){

        try {
                nurseifyService.insert(nurseify);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除护理级别
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                nurseifyService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改护理级别
    * @param nurseify
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Nurseify nurseify){
        try {
            nurseifyService.update(nurseify);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有护理级别
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(nurseifyService.findAll(currentPage,limit));
    }

}