package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.bed.web.dao.EntranceMapper;
import com.idea.nursing.bed.web.domain.pojo.Entrance;
import com.idea.nursing.bed.web.domain.pojo.EntranceExample;
import com.idea.nursing.bed.web.service.EntranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EntranceServiceImpl extends GenericServiceImpl<Entrance, Long,EntranceExample> implements EntranceService {
    @Autowired
    private EntranceMapper entranceDao;
    @Override
    public GenericDao<Entrance, Long,EntranceExample> getDao() {
        return entranceDao;
    }

}
