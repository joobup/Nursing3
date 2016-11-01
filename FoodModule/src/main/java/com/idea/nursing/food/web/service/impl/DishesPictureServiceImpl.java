package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.DishesPictureMapper;
import com.idea.nursing.food.web.domain.pojo.DishesPicture;
import com.idea.nursing.food.web.domain.pojo.DishesPictureExample;
import com.idea.nursing.food.web.service.DishesPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DishesPictureServiceImpl extends GenericServiceImpl<DishesPicture, Long,DishesPictureExample> implements DishesPictureService {
    @Autowired
    private DishesPictureMapper dishespictureDao;
    @Override
    public GenericDao<DishesPicture, Long,DishesPictureExample> getDao() {
        return dishespictureDao;
    }

}
