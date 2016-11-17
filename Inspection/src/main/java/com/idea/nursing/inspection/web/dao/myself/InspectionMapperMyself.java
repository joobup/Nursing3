package com.idea.nursing.inspection.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionExample;
import com.idea.nursing.inspection.web.domain.vo.InspectionVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectionMapperMyself extends GenericDao {
    /**
     * 获取VO
     * @return
     */
    public List<InspectionVO> selectAllVO();
}