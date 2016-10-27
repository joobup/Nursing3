package com.idea.nursing.servicemodule.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.common.web.dao.CommentPictureMapper;
import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.common.web.domain.pojo.CommentPictureExample;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicesMapper;
import com.idea.nursing.servicemodule.web.dao.ServicesPictureMapper;
import com.idea.nursing.servicemodule.web.dao.myself.ServiceMapperMyself;
import com.idea.nursing.servicemodule.web.dao.myself.ServiceStaffMapperMyself;
import com.idea.nursing.servicemodule.web.domain.pojo.Services;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesExample;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPictureExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceVO;
import com.idea.nursing.servicemodule.web.service.ServicesPictureService;
import com.idea.nursing.servicemodule.web.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicesServiceImpl extends GenericServiceImpl<Services, Long,ServicesExample> implements ServicesService {
    @Autowired
    private ServicesMapper servicesDao;
    @Autowired
    private ServiceMapperMyself serviceMapperMyself;
    @Autowired
    private ServicesPictureMapper servicesPictureMapper;
    @Autowired
    private CommentPictureMapper commentPictureMapper;


    @Override
    public GenericDao<Services, Long,ServicesExample> getDao() {
        return servicesDao;
    }


    @Override
    public Page<ServiceVO> findAllVO(Integer currentPage, Integer limit) {
        if(currentPage==null){
            currentPage=1;
        }
        if(limit==null){
            limit=10;
        }
        PageHelper.startPage(currentPage,limit);
        Page<ServiceVO> serviceVOs = (Page<ServiceVO>) serviceMapperMyself.findAllVO();

        return serviceVOs;
    }

    /**
     * 查询服务项目所有图片
     * @param serviceId 服务id
     * @return
     */
    @Override
    public List<CommentPicture> showAllPicture(Long serviceId) {
        //查询所有图片id 通过服务id
        ServicesPictureExample servicesPictureExample =  new ServicesPictureExample();
        servicesPictureExample.createCriteria().andServeIdEqualTo(serviceId);
        List<ServicesPicture> servicesPictures =servicesPictureMapper.selectByExample(servicesPictureExample);

        if(servicesPictures.size()==0){
            return new ArrayList<CommentPicture>();
        }
        /**
         * 分解出图片id
         */
        List<Long> pictureIdList = new ArrayList<>();
        for (ServicesPicture servicePicture:servicesPictures
             ) {
            pictureIdList.add(servicePicture.getPictureId());
        }

        /**
         * 根据图片id 查询图片
         */
        CommentPictureExample commentPictureExample = new CommentPictureExample();
        commentPictureExample.createCriteria().andIdIn(pictureIdList);

        return  commentPictureMapper.selectByExample(commentPictureExample);
    }
}
