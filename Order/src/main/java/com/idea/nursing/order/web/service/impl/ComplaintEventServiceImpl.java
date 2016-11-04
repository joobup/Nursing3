package com.idea.nursing.order.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.order.web.dao.ComplaintEventMapper;
import com.idea.nursing.order.web.domain.pojo.ComplaintEvent;
import com.idea.nursing.order.web.domain.pojo.ComplaintEventExample;
import com.idea.nursing.order.web.service.ComplaintEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ComplaintEventServiceImpl extends GenericServiceLevelImpl<ComplaintEvent, Long,ComplaintEventExample> implements ComplaintEventService {


        @Autowired
        private ComplaintEventMapper complainteventDao;
        @Override
        public GenericDao<ComplaintEvent, Long,ComplaintEventExample> getDao() {
            return complainteventDao;
        }

        @Override
        public ComplaintEventExample getModelExamplTidEqualTo(Long tid) {
            ComplaintEventExample complainteventExample = new ComplaintEventExample();
            complainteventExample.createCriteria().andTidEqualTo(tid);
            return complainteventExample;
        }

        @Override
        public byte getLevel(ComplaintEvent complaintevent) {

            return complaintevent.getComplaintEventLevel();
        }

        @Override
        public Long getTid(ComplaintEvent complaintevent) {
            return complaintevent.getTid();
        }

        @Override
        public void setLevel(ComplaintEvent complaintevent, Byte level) {
            complaintevent.setComplaintEventLevel(level);
        }

        @Override
        public void setTid(ComplaintEvent complaintevent) {
            complaintevent.setTid(0L);
        }


}
