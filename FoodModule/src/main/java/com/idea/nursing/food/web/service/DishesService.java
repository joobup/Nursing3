package com.idea.nursing.food.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.food.web.domain.pojo.Dishes;
import com.idea.nursing.food.web.domain.pojo.DishesExample;
import com.idea.nursing.food.web.domain.vo.DishesVO;

import java.util.List;

public interface DishesService extends GenericService<Dishes,Long,DishesExample>{
    /**
     * 查询菜品带图片
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<DishesVO> findAllVO(Integer currentPage,Integer limit);

    /**
     * 查询菜品所有图片
     * @param dishesId 菜品id
     * @return
     */
    public List<CommentPicture> showAllPicture(Long dishesId);

}
