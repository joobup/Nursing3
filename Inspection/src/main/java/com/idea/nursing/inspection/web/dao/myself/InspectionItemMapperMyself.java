package com.idea.nursing.inspection.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItem;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemExample;
import com.idea.nursing.inspection.web.domain.vo.InspectionItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectionItemMapperMyself extends GenericDao {
    /**
     * 查询VO
     * @return
     */
    public List<InspectionItemVO> selectAllVO();
}