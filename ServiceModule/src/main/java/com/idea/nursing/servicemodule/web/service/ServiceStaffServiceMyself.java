package com.idea.nursing.servicemodule.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceStaffVO;

/**
 * Created by 10238 on 2016/10/25.
 */
public interface ServiceStaffServiceMyself {
    public Page<ServiceStaffVO> findAllVO(Integer currentPage,Integer limit);
}
