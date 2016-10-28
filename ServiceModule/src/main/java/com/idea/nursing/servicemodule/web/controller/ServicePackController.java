package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.common.web.service.CommentPictureService;
import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.service.ServicePackItemService;
import com.idea.nursing.servicemodule.web.service.ServicePackPictureService;
import com.idea.nursing.servicemodule.web.service.ServicePackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10238 on 2016/10/12.
 */
@Controller
@RequestMapping("serve/service_pack")
public class ServicePackController extends GenericController {
    @Autowired
    private ServicePackService servicepackService;
    @Autowired
    private CommentPictureService commentPictureService;
    @Autowired
    private ServicePackPictureService servicePackPictureService;
    @Autowired
    private ServicePackItemService servicePackItemService;

    /**
     * 获取服务项 见服务项
     */
    /**
     * 添加服务打包
     *
     * @param servicepack
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultData add(ServicePack servicepack, String pictureAddress) {

        try {
            servicepack =servicepackService.insert(servicepack);
            Long[] pictureIds = commentPictureService.insertPictures(pictureAddress, SessionConstant.PictureType.SERVICEPAGEPCITURE.key);
            servicePackPictureService.inserts(servicepack.getId(),pictureIds);
            //添加服务项关系
            servicePackItemService.inserts(servicepack);
        } catch (Exception e) {
            return ResultData.build().addErroe();
        }
        return ResultData.build();

    }

    /**
     * 删除服务打包
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "del", method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
            servicepackService.delete(id);
        } catch (Exception e) {
            return ResultData.build().delError();
        }
        return ResultData.build();

    }

    /**
     * 修改服务打包
     *
     * @param servicepack
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultData update(ServicePack servicepack) {
        try {
            servicepackService.update(servicepack);

        } catch (Exception e) {
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
     * 分页查询所有服务打包
     *
     * @param currentPage
     * @param limit
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage, Integer limit) {
        return ResultData.build().
                parsePageBean(servicepackService.findAllVO(currentPage, limit));
    }

}