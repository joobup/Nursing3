package com.idea.nursing.food.web.controller;

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialNutriment;
import com.idea.nursing.food.web.service.FoodMaterialNutrimentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/food_material_nutriment")
public class FoodMaterialNutrimentController extends GenericController {
    @Autowired
    private FoodMaterialNutrimentService foodmaterialnutrimentService;

    /**
        * 添加食材配料和营养物质关系
        * @param foodmaterialnutriment
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(FoodMaterialNutriment foodmaterialnutriment){

        try {
                foodmaterialnutrimentService.insert(foodmaterialnutriment);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除食材配料和营养物质关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                foodmaterialnutrimentService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改食材配料和营养物质关系
    * @param foodmaterialnutriment
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(FoodMaterialNutriment foodmaterialnutriment){
        try {
            foodmaterialnutrimentService.update(foodmaterialnutriment);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有食材配料和营养物质关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(foodmaterialnutrimentService.findAll(currentPage,limit));
    }

}