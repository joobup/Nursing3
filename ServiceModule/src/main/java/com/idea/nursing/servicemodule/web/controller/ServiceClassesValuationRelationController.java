package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationRelation;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationRelationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_classes_valuation_relation")
public class ServiceClassesValuationRelationController extends GenericController {
    @Autowired
    private ServiceClassesValuationRelationService serviceclassesvaluationrelationService;

    /**
        * 添加服务计价类型
        * @param serviceclassesvaluationrelation
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServiceClassesValuationRelation serviceclassesvaluationrelation){

        try {
                serviceclassesvaluationrelationService.insert(serviceclassesvaluationrelation);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务计价类型
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                serviceclassesvaluationrelationService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务计价类型
    * @param serviceclassesvaluationrelation
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServiceClassesValuationRelation serviceclassesvaluationrelation){
        try {
            serviceclassesvaluationrelationService.update(serviceclassesvaluationrelation);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务计价类型
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(serviceclassesvaluationrelationService.findAll(currentPage,limit));
    }

}