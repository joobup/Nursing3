package com.idea.nursing.oldpeople.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleExample;
import com.idea.nursing.oldpeople.web.domain.vo.ServicePeopleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicePeopleMapperMyself extends GenericDao {
    /**
     * 获取老人信息 带图片
     * @return
     */
    public List<ServicePeopleVO> findAllVO();
}