package com.idea.nursing.servicemodule.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicePackPictureMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPictureExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackVO;
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

    /**
     * 批量添加图片
     * @param servicePackId
     * @param pictureIds
     * @return
     */
    @Override
    public boolean inserts(Long servicePackId, Long[] pictureIds) {
        for (long pitcureId:pictureIds
             ) {
            ServicePackPicture servicePackPicture = new ServicePackPicture();
            servicePackPicture.setPictureId(pitcureId);
            servicePackPicture.setServicePackId(servicePackId);

            servicepackpictureDao.insert(servicePackPicture);
            if(servicePackPicture.getId()==null){
                return false;
            }
        }

        return true;
    }


}
