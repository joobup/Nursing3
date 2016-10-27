package com.idea.nursing.servicemodule.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPictureExample;


public interface ServicesPictureService extends GenericService<ServicesPicture,Long,ServicesPictureExample>{
    /**
     * 添加服务图片关系批量添加
     * @param serviceId 服务id
     * @param pictureIds 图片id
     * @return
     */
    public boolean inserts(Long serviceId,Long[] pictureIds);

}
