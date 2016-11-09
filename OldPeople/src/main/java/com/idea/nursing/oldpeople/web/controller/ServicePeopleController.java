package com.idea.nursing.oldpeople.web.controller;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.common.web.service.CommentPictureService;
import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;
import com.idea.nursing.oldpeople.web.service.ServicePeopleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_people")
public class ServicePeopleController extends GenericController {
    @Autowired
    private ServicePeopleService servicepeopleService;
    @Autowired
    private CommentPictureService commentPictureService;
    /**
        * 添加服务对象信息
        * @param servicepeople
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServicePeople servicepeople){

        try {
                servicepeopleService.insert(servicepeople);

            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务对象信息
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                servicepeopleService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务对象信息
    * @param servicepeople
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServicePeople servicepeople,CommentPicture commentPicture){
        try {

            if (commentPicture.getPictureAddress() != null) {
                commentPicture.setPictureAddress(commentPicture.getPictureAddress().split(",")[0]);
                commentPicture.setPictureType(SessionConstant.PictureType.STAFFHEAD.key);
                commentPictureService.insert(commentPicture);
                servicepeople.setServicePeoplePicture(commentPicture.getId());
                servicepeopleService.update(servicepeople);
            } else {
                servicepeopleService.update(servicepeople);
            }


        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务对象信息
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicepeopleService.findAllVO(currentPage,limit));
    }

}