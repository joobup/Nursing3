package com.idea.nursing.fixedassets.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsType;
import com.idea.nursing.fixedassets.web.service.FixedAssetsTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/fixed_assets_type")
public class FixedAssetsTypeController extends GenericController {
    @Autowired
    private FixedAssetsTypeService fixedassetstypeService;

    /**
        * 添加固定资产类型
        * @param fixedassetstype
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(FixedAssetsType fixedassetstype){

        try {
                    fixedassetstypeService.insertLevel(fixedassetstype);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除固定资产类型
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    fixedassetstypeService.deleteLevel(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改固定资产类型
    * @param fixedassetstype
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(FixedAssetsType fixedassetstype){
        try {
            fixedassetstypeService.update(fixedassetstype);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有固定资产类型
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(fixedassetstypeService.findAll(currentPage,limit));
    }


    /**
    * 按级别查询服务类别
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "findTreeAll",method = RequestMethod.GET)
    public ResultData findTreeAll(){
        return ResultData.build().put("aaData",fixedassetstypeService.findTree());
    }

}