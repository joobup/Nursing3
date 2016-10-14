package ${packageName};

import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.generic.GenericController;
import ${modelpackageName}.${className};
import ${ImplpackageName};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/${urlName?lower_case}")
public class ${className}Controller extends GenericController {
    @Autowired
    private ${className}Service ${className?lower_case}Service;

    /**
        * 添加${chinaName}
        * @param ${className?lower_case}
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(${className} ${className?lower_case}){

        try {
                ${className?lower_case}Service.insert(${className?lower_case});

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除${chinaName}
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                ${className?lower_case}Service.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改${chinaName}
    * @param ${className?lower_case}
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(${className} ${className?lower_case}){
        try {
            ${className?lower_case}Service.update(${className?lower_case});

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有${chinaName}
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(${className?lower_case}Service.findAll(currentPage,limit));
    }

}