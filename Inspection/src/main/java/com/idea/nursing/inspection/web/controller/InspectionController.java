package com.idea.nursing.inspection.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspection;
import com.idea.nursing.inspection.web.service.InspectionItemInspectionService;
import com.idea.nursing.inspection.web.service.InspectionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/inspection")
public class InspectionController extends GenericController {
    @Autowired
    private InspectionService inspectionService;
    @Autowired
    private InspectionItemInspectionService inspectionItemInspectionService;

    /**
        * 添加检查表
        * @param inspection
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Inspection inspection){

        try {
                inspectionService.insert(inspection);
            for (String inspectionItem:inspection.getInspectionItemList().split(",")){
                InspectionItemInspection inspectionItemInspection = new InspectionItemInspection();
                inspectionItemInspection.setInspectionId(inspection.getId());
                inspectionItemInspection.setInspectionItemId(Long.parseLong(inspectionItem));
                inspectionItemInspectionService.insert(inspectionItemInspection);
            }


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除检查表
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                inspectionService.delete(id);
                inspectionItemInspectionService.delByInspectionId(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改检查表
    * @param inspection
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Inspection inspection){
        try {
            inspectionService.update(inspection);
            inspectionItemInspectionService.delByInspectionId(inspection.getId());
            for (String inspectionItem:inspection.getInspectionItemList().split(",")){

                InspectionItemInspection inspectionItemInspection = new InspectionItemInspection();
                inspectionItemInspection.setInspectionId(inspection.getId());
                inspectionItemInspection.setInspectionItemId(Long.parseLong(inspectionItem));
                inspectionItemInspectionService.insert(inspectionItemInspection);
            }
        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有检查表
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(inspectionService.findAllVO(currentPage,limit));
    }

}