package com.idea.nursing.servicemodule.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackVO;

public interface ServicePackService extends GenericService<ServicePack,Long,ServicePackExample>{
    /**
     * 查询打包服务封装
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<ServicePackVO> findAllVO(Integer currentPage, Integer limit);

}
