package com.idea.nursing.food.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.food.web.domain.pojo.WeekFood;
import com.idea.nursing.food.web.domain.pojo.WeekFoodExample;
import com.idea.nursing.food.web.domain.vo.SelectVOWeekFood;
import com.idea.nursing.food.web.domain.vo.WeekFoodVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeekFoodMapperMyself extends GenericDao {

    /**
     * 获取本周食谱
     * @param selectVOWeekFood
     * @return
     */
    public List<WeekFoodVO> findWeekFood(SelectVOWeekFood selectVOWeekFood);
}