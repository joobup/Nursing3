package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.common.web.service.CommentPictureService;
import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPicture;
import com.idea.nursing.servicemodule.web.service.ServicePackPictureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/service_pack_picture")
public class ServicePackPictureController extends GenericController {
    @Autowired
    private ServicePackPictureService servicepackpictureService;
    @Autowired
    private CommentPictureService commentPictureService;
    /**
        * 添加服务打包图片关系
        * @param servicepackpicture
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(ServicePackPicture servicepackpicture){

        try {
                    servicepackpictureService.insert(servicepackpicture);


            }catch (Exception e){
                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
     * 批量添加服务打包图片
     * @param serviceId
     * @param pictureAddress
     * @return
     */
    @ResponseBody
    @RequestMapping(value="adds" ,method = RequestMethod.POST)
    public ResultData adds(Long serviceId,String pictureAddress){
        try {

            //添加图片
            Long[] pictureIds =  commentPictureService.insertPictures(pictureAddress, SessionConstant.PictureType.SERVICEPAGEPCITURE.key);
            servicepackpictureService.inserts(serviceId,pictureIds);


        }catch (Exception e){
            return ResultData.build().addErroe();
        }
        return ResultData.build();
    }

    /**
    * 删除服务打包图片关系
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                    servicepackpictureService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务打包图片关系
    * @param servicepackpicture
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(ServicePackPicture servicepackpicture){
        try {
            servicepackpictureService.update(servicepackpicture);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务打包图片关系
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicepackpictureService.findAll(currentPage,limit));
    }


}