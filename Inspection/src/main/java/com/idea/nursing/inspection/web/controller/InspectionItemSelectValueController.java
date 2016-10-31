package com.idea.nursing.inspection.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemSelectValue;
import com.idea.nursing.inspection.web.service.InspectionItemSelectValueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/inspection_item_select_value")
public class InspectionItemSelectValueController extends GenericController {
    @Autowired
    private InspectionItemSelectValueService inspectionitemselectvalueService;

    /**
        * 添加检查项目选项值表
        * @param inspectionitemselectvalue
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(InspectionItemSelectValue inspectionitemselectvalue){

        try {
                inspectionitemselectvalueService.insert(inspectionitemselectvalue);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除检查项目选项值表
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                inspectionitemselectvalueService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改检查项目选项值表
    * @param inspectionitemselectvalue
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(InspectionItemSelectValue inspectionitemselectvalue){
        try {
            inspectionitemselectvalueService.update(inspectionitemselectvalue);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有检查项目选项值表
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(inspectionitemselectvalueService.findAll(currentPage,limit));
    }

}