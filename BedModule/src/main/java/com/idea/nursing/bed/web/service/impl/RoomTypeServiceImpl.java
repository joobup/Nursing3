package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.bed.web.dao.RoomTypeMapper;
import com.idea.nursing.bed.web.domain.pojo.RoomType;
import com.idea.nursing.bed.web.domain.pojo.RoomTypeExample;
import com.idea.nursing.bed.web.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoomTypeServiceImpl extends GenericServiceImpl<RoomType, Long,RoomTypeExample> implements RoomTypeService {
    @Autowired
    private RoomTypeMapper roomtypeDao;
    @Override
    public GenericDao<RoomType, Long,RoomTypeExample> getDao() {
        return roomtypeDao;
    }

}
