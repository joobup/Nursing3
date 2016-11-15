package com.idea.nursing.servicemodule.web.dao.myself;


import com.idea.nursing.core.generic.GenericDao;

import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackStateExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackStateVO;

import java.util.List;


/**
 * Created by Administrator on 2016/11/15.
 */
public interface ServicePackStateMapperMyself extends GenericDao {
    /**
     * 获取商城打包服务
     * @param example
     * @return
     */
     List<ServicePackStateVO> selectAllVO(ServicePackStateExample example);
}
