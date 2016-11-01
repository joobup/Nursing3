package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.DishesTypeMapper;
import com.idea.nursing.food.web.domain.pojo.DishesType;
import com.idea.nursing.food.web.domain.pojo.DishesTypeExample;
import com.idea.nursing.food.web.service.DishesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DishesTypeServiceImpl extends GenericServiceImpl<DishesType, Long,DishesTypeExample> implements DishesTypeService {
    @Autowired
    private DishesTypeMapper dishestypeDao;
    @Override
    public GenericDao<DishesType, Long,DishesTypeExample> getDao() {
        return dishestypeDao;
    }

}
