package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.bed.web.dao.RoomTypeMapper;
import com.idea.nursing.bed.web.domain.pojo.RoomType;
import com.idea.nursing.bed.web.domain.pojo.RoomTypeExample;
import com.idea.nursing.bed.web.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class RoomTypeServiceImpl extends GenericServiceLevelImpl<RoomType, Long,RoomTypeExample> implements RoomTypeService {


        @Autowired
        private RoomTypeMapper roomtypeDao;
        @Override
        public GenericDao<RoomType, Long,RoomTypeExample> getDao() {
            return roomtypeDao;
        }

        @Override
        public RoomTypeExample getModelExamplTidEqualTo(Long tid) {
            RoomTypeExample roomtypeExample = new RoomTypeExample();
            roomtypeExample.createCriteria().andTidEqualTo(tid);
            return roomtypeExample;
        }

        @Override
        public byte getLevel(RoomType roomtype) {

            return roomtype.getRoomTypeLeave();
        }

        @Override
        public Long getTid(RoomType roomtype) {
            return roomtype.getTid();
        }

        @Override
        public void setLevel(RoomType roomtype, Byte level) {
            roomtype.setRoomTypeLeave(level);
        }

        @Override
        public void setTid(RoomType roomtype) {
            roomtype.setTid(0L);
        }


}
