package com.idea.nursing.food.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.food.web.domain.pojo.WeekFood;
import com.idea.nursing.food.web.domain.pojo.WeekFoodExample;
import com.idea.nursing.food.web.domain.vo.SelectVOWeekFood;
import com.idea.nursing.food.web.domain.vo.WeekFoodShowVO;

import java.util.Date;
import java.util.List;

public interface WeekFoodService extends GenericService<WeekFood,Long,WeekFoodExample>{
    /**
     * 添加一星期食谱
     * @param selectVOWeekFood
     */
    public void insert(SelectVOWeekFood selectVOWeekFood);

    /**
     * 获取本周食谱
     * @param selectVOWeekFood
     * @return
     */
    public WeekFoodShowVO findWeekVO(SelectVOWeekFood selectVOWeekFood);

}
