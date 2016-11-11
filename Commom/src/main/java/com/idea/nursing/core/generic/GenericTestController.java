package com.idea.nursing.core.generic;

import com.idea.nursing.core.common.ResultData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/11/11.
 */
public abstract class GenericTestController<Model,ModelExample> extends GenericController{

    public abstract GenericService getGenericService();


    /**
     * 添加床位
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Model model){

        try {
            getGenericService().insert(model);


        }catch (Exception e){
            return ResultData.build().addErroe();
        }
        return ResultData.build();

    }
}
