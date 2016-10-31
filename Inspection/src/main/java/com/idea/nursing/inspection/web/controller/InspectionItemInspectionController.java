package com.idea.nursing.inspection.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspection;
import com.idea.nursing.inspection.web.service.InspectionItemInspectionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/inspection_item_inspection")
public class InspectionItemInspectionController extends GenericController {
    @Autowired
    private InspectionItemInspectionService inspectioniteminspectionService;

    /**
        * 添加检查健康状况项目关系表
        * @param inspectioniteminspection
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(InspectionItemInspection inspectioniteminspection){

        try {
                inspectioniteminspectionService.insert(inspectioniteminspection);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除检查健康状况项目关系表
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                inspectioniteminspectionService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改检查健康状况项目关系表
    * @param inspectioniteminspection
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(InspectionItemInspection inspectioniteminspection){
        try {
            inspectioniteminspectionService.update(inspectioniteminspection);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有检查健康状况项目关系表
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(inspectioniteminspectionService.findAll(currentPage,limit));
    }

}