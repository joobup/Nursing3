package com.idea.nursing.servicemodule.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPictureExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackVO;



public interface ServicePackPictureService extends GenericService<ServicePackPicture,Long,ServicePackPictureExample>{
    /**
     * 批量添加图片
     * @param servicePackId 服务打包id
     * @param pictureIds 图片id
     * @return
     */
    public boolean inserts(Long servicePackId,Long[] pictureIds);



}
