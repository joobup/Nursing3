package com.idea.nursing.servicemodule.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackVO;

import java.util.List;

/**
 * Created by 10238 on 2016/10/27.
 */
public interface ServicePackMapperMyself extends GenericDao {

    public List<ServicePackVO> selectAllVO();
}
