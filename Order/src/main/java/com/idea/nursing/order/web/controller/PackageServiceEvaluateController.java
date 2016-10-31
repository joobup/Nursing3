package com.idea.nursing.order.service;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.order.web.dao.PackageServiceEvaluate;
import com.idea.nursing.order.web.domain.pojo.PackageServiceEvaluateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/package_service_evaluate")
public class PackageServiceEvaluateController extends GenericController {
    @Autowired
    private PackageServiceEvaluateService packageserviceevaluateService;

    /**
        * 添加打包服务评价关系
        * @param packageserviceevaluate
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(PackageServiceEvaluate packageserviceevaluate){

        try {
                packageserviceevaluateService.insert(packageserviceevaluate);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除打包服务评价关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                packageserviceevaluateService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改打包服务评价关系
    * @param packageserviceevaluate
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(PackageServiceEvaluate packageserviceevaluate){
        try {
            packageserviceevaluateService.update(packageserviceevaluate);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有打包服务评价关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(packageserviceevaluateService.findAll(currentPage,limit));
    }

}