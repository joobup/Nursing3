package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicePackPictureMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPictureExample;
import com.idea.nursing.servicemodule.web.service.ServicePackPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicePackPictureServiceImpl extends GenericServiceImpl<ServicePackPicture, Long,ServicePackPictureExample> implements ServicePackPictureService {
    @Autowired
    private ServicePackPictureMapper servicepackpictureDao;
    @Override
    public GenericDao<ServicePackPicture, Long,ServicePackPictureExample> getDao() {
        return servicepackpictureDao;
    }

}
