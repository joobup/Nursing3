package com.idea.nursing.servicemodule.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericServiceLevel;
import com.idea.nursing.core.generic.GenericService;

import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackState;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackStateExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackStateVO;

public interface ServicePackStateService extends GenericService<ServicePackState,Long,ServicePackStateExample>{
    /**
     * 查询以上线的服务
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<ServicePackStateVO> findAllVO(Integer currentPage,Integer limit,Byte state);
}
