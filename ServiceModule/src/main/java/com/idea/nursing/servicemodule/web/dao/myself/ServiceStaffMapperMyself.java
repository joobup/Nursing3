package com.idea.nursing.servicemodule.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaffExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceStaffVO;

import java.util.List;

/**
 * Created by 10238 on 2016/10/25.
 */
public interface ServiceStaffMapperMyself extends GenericDao {
    List<ServiceStaffVO> selectAllVO();
}
