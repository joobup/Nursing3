package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.DishesTypeDishesMapper;
import com.idea.nursing.food.web.domain.pojo.DishesTypeDishes;
import com.idea.nursing.food.web.domain.pojo.DishesTypeDishesExample;
import com.idea.nursing.food.web.service.DishesTypeDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DishesTypeDishesServiceImpl extends GenericServiceImpl<DishesTypeDishes, Long,DishesTypeDishesExample> implements DishesTypeDishesService {
    @Autowired
    private DishesTypeDishesMapper dishestypedishesDao;
    @Override
    public GenericDao<DishesTypeDishes, Long,DishesTypeDishesExample> getDao() {
        return dishestypedishesDao;
    }

}
