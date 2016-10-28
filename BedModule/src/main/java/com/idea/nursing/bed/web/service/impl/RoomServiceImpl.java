package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.bed.web.dao.RoomMapper;
import com.idea.nursing.bed.web.domain.pojo.Room;
import com.idea.nursing.bed.web.domain.pojo.RoomExample;
import com.idea.nursing.bed.web.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoomServiceImpl extends GenericServiceImpl<Room, Long,RoomExample> implements RoomService {
    @Autowired
    private RoomMapper roomDao;
    @Override
    public GenericDao<Room, Long,RoomExample> getDao() {
        return roomDao;
    }

}
