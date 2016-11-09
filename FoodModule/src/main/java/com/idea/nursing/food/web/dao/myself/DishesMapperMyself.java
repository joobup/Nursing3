package com.idea.nursing.food.web.dao.myself;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.food.web.domain.pojo.Dishes;
import com.idea.nursing.food.web.domain.pojo.DishesExample;
import com.idea.nursing.food.web.domain.vo.DishesVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishesMapperMyself extends GenericDao {
    /**
     * 查询所有菜品带图片
     * @return
     */
    public List<DishesVO> findAllVO();

    /**
     * 查询本菜品所有图片
     * @param dishesId
     * @return
     */
    public List<CommentPicture> selectAllPicture(Long dishesId);
}