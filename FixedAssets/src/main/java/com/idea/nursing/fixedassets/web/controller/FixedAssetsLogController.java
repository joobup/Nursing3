package com.idea.nursing.fixedassets.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsLog;
import com.idea.nursing.fixedassets.web.service.FixedAssetsLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/fixed_assets_log")
public class FixedAssetsLogController extends GenericController {
    @Autowired
    private FixedAssetsLogService fixedassetslogService;

    /**
        * 添加固定资产日志
        * @param fixedassetslog
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(FixedAssetsLog fixedassetslog){

        try {
                    fixedassetslogService.insert(fixedassetslog);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除固定资产日志
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    fixedassetslogService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改固定资产日志
    * @param fixedassetslog
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(FixedAssetsLog fixedassetslog){
        try {
            fixedassetslogService.update(fixedassetslog);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有固定资产日志
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(fixedassetslogService.findAll(currentPage,limit));
    }


}