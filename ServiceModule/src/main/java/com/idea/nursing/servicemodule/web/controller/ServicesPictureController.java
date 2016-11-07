package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.common.web.service.CommentPictureService;
import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPicture;
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
@RequestMapping("serve/services_picture")
public class ServicesPictureController extends GenericController {
    @Autowired
    private ServicesPictureService servicespictureService;
    @Autowired
    private CommentPictureService commentPictureService;
    /**
        * 添加服务图片关系
        * @param servicespicture
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServicesPicture servicespicture){

        try {
                    servicespictureService.insert(servicespicture);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
     * 批量添加服务图片
     * @param serviceId
     * @param pictureAddress
     * @return
     */
    @ResponseBody
    @RequestMapping(value="adds" ,method = RequestMethod.POST)
    public ResultData adds(Long serviceId,String pictureAddress){
        try {

            //添加图片
            Long[] pictureIds =  commentPictureService.insertPictures(pictureAddress, SessionConstant.PictureType.SERVICEPICTURE.key);
            servicespictureService.inserts(serviceId,pictureIds);


        }catch (Exception e){
            return ResultData.build().addErroe();
        }
        return ResultData.build();
    }
    /**
    * 删除服务图片关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    servicespictureService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务图片关系
    * @param servicespicture
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServicesPicture servicespicture){
        try {
            servicespictureService.update(servicespicture);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务图片关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicespictureService.findAll(currentPage,limit));
    }


}