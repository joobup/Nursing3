package com.idea.nursing.oldpeople.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleExample;
import com.idea.nursing.oldpeople.web.domain.vo.ServicePeopleVO;

public interface ServicePeopleService extends GenericService<ServicePeople,Long,ServicePeopleExample>{

    /**
     * 获取老人信息带图片
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<ServicePeopleVO> findAllVO(Integer currentPage, Integer limit);

}
