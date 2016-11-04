package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.servicemodule.web.dao.NurseifyMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.Nurseify;
import com.idea.nursing.servicemodule.web.domain.pojo.NurseifyExample;
import com.idea.nursing.servicemodule.web.service.NurseifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class NurseifyServiceImpl extends GenericServiceLevelImpl<Nurseify, Long,NurseifyExample> implements NurseifyService {


        @Autowired
        private NurseifyMapper nurseifyDao;
        @Override
        public GenericDao<Nurseify, Long,NurseifyExample> getDao() {
            return nurseifyDao;
        }

        @Override
        public NurseifyExample getModelExamplTidEqualTo(Long tid) {
            NurseifyExample nurseifyExample = new NurseifyExample();
            nurseifyExample.createCriteria().andNursifyTidEqualTo(tid);
            return nurseifyExample;
        }

        @Override
        public byte getLevel(Nurseify nurseify) {

            return nurseify.getNursifyLevel();
        }

        @Override
        public Long getTid(Nurseify nurseify) {
            return nurseify.getNursifyTid();
        }

        @Override
        public void setLevel(Nurseify nurseify, Byte level) {
            nurseify.setNursifyLevel(level);
        }

        @Override
        public void setTid(Nurseify nurseify) {
            nurseify.setNursifyTid(0L);
        }


}
