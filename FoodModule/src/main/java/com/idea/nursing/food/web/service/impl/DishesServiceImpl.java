package com.idea.nursing.food.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.DishesMapper;
import com.idea.nursing.food.web.domain.pojo.Dishes;
import com.idea.nursing.food.web.domain.pojo.DishesExample;
import com.idea.nursing.food.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DishesServiceImpl extends GenericServiceImpl<Dishes, Long,DishesExample> implements DishesService {
    @Autowired
    private DishesMapper dishesDao;
    @Override
    public GenericDao<Dishes, Long,DishesExample> getDao() {
        return dishesDao;
    }

}
