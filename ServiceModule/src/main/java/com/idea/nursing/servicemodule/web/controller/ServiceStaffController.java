package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.common.web.service.CommentPictureService;
import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaff;
import com.idea.nursing.servicemodule.web.service.ServiceStaffService;

import com.idea.nursing.servicemodule.web.service.ServiceStaffServiceMyself;
import com.idea.nursing.servicemodule.web.service.ServicesPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_staff")
public class ServiceStaffController extends GenericController {
    @Autowired
    private ServiceStaffService servicestaffService;
    @Autowired
    private ServiceStaffServiceMyself serviceStaffServiceMyself;

    @Autowired
    private CommentPictureService commentPictureService;

    /**
        * 添加服务人员
        * @param servicestaff
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServiceStaff servicestaff,CommentPicture commentPicture){

        try {
                servicestaffService.insert(servicestaff);
                commentPicture.setPictureType(SessionConstant.PictureType.STAFFHEAD.key);
                commentPictureService.insert(commentPicture);
            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务人员
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                servicestaffService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务人员
    * @param servicestaff
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServiceStaff servicestaff){
        try {
            servicestaffService.update(servicestaff);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务人员
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(serviceStaffServiceMyself.findAllVO(currentPage,limit));
    }

}