package com.idea.nursing.stock.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.stock.web.domain.pojo.StockType;
import com.idea.nursing.stock.web.service.StockTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/stock_type")
public class StockTypeController extends GenericController {
    @Autowired
    private StockTypeService stocktypeService;

    /**
        * 添加库存类型
        * @param stocktype
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(StockType stocktype){

        try {
                    stocktypeService.insertLevel(stocktype);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除库存类型
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    stocktypeService.deleteLevel(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改库存类型
    * @param stocktype
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(StockType stocktype){
        try {
            stocktypeService.update(stocktype);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有库存类型
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(stocktypeService.findAll(currentPage,limit));
    }


    /**
    * 按级别查询服务类别
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "findTreeAll",method = RequestMethod.GET)
    public ResultData findTreeAll(){
        return ResultData.build().put("aaData",stocktypeService.findTree());
    }

}