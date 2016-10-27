package com.idea.nursing.servicemodule.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.Services;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceVO;

import java.util.List;


public interface ServicesService extends GenericService<Services,Long,ServicesExample>{
    /**
     * 查询服务项目 带主图
     * @param currentPage 当前页
     * @param limit 每页显示条数
     * @return
     */
    public Page<ServiceVO> findAllVO(Integer currentPage,Integer limit);

    /**
     * 查询服务项目所有图片
     * @param serviceId 服务id
     * @return
     */
    public List<CommentPicture> showAllPicture(Long serviceId);

}
