package com.idea.nursing.servicemodule.web.dao.myself;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceStaffVO;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceVO;

import java.util.List;

/**
 * Created by 10238 on 2016/10/26.
 */
public interface ServiceMapperMyself extends GenericDao {
    /**
     * 查询所有服务带图片
     * @return
     */
    public List<ServiceVO> findAllVO();

    /**
     * 查询本服务项目所有图片
     * @param serviceId
     * @return
     */
    public List<CommentPicture> selectAllPicture(Long serviceId);
}
