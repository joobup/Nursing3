package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.food.web.dao.NutrimentMapper;
import com.idea.nursing.food.web.domain.pojo.Nutriment;
import com.idea.nursing.food.web.domain.pojo.NutrimentExample;
import com.idea.nursing.food.web.service.NutrimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class NutrimentServiceImpl extends GenericServiceLevelImpl<Nutriment, Long,NutrimentExample> implements NutrimentService {


        @Autowired
        private NutrimentMapper nutrimentDao;
        @Override
        public GenericDao<Nutriment, Long,NutrimentExample> getDao() {
            return nutrimentDao;
        }

        @Override
        public NutrimentExample getModelExamplTidEqualTo(Long tid) {
            NutrimentExample nutrimentExample = new NutrimentExample();
            nutrimentExample.createCriteria().andTidEqualTo(tid);
            return nutrimentExample;
        }

        @Override
        public byte getLevel(Nutriment nutriment) {

            return nutriment.getNutrimentLevel();
        }

        @Override
        public Long getTid(Nutriment nutriment) {
            return nutriment.getTid();
        }

        @Override
        public void setLevel(Nutriment nutriment, Byte level) {
            nutriment.setNutrimentLevel(level);
        }

        @Override
        public void setTid(Nutriment nutriment) {
            nutriment.setTid(0L);
        }


}
