package com.idea.nursing.order.service;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.order.web.dao.OrderEvaluate;
import com.idea.nursing.order.web.domain.pojo.OrderEvaluateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/order_evaluate")
public class OrderEvaluateController extends GenericController {
    @Autowired
    private OrderEvaluateService orderevaluateService;

    /**
        * 添加订单评价关系
        * @param orderevaluate
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(OrderEvaluate orderevaluate){

        try {
                orderevaluateService.insert(orderevaluate);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除订单评价关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                orderevaluateService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改订单评价关系
    * @param orderevaluate
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(OrderEvaluate orderevaluate){
        try {
            orderevaluateService.update(orderevaluate);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有订单评价关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(orderevaluateService.findAll(currentPage,limit));
    }

}