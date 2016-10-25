package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.NurseifyMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.Nurseify;
import com.idea.nursing.servicemodule.web.domain.pojo.NurseifyExample;
import com.idea.nursing.servicemodule.web.service.NurseifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NurseifyServiceImpl extends GenericServiceImpl<Nurseify, Long, NurseifyExample> implements NurseifyService {
    @Autowired
    private NurseifyMapper nurseifyDao;

    @Override
    public GenericDao<Nurseify, Long, NurseifyExample> getDao() {
        return nurseifyDao;
    }


    @Override
    public int insert(Nurseify nurseify) {
        //获取父级
        Nurseify nurseifySupper = selectById(nurseify.getNursifyTid());
        if (notNullObject(nurseifySupper)) {
            nurseify.setNursifyLeave((byte) 0);
            nurseify.setNursifyTid(0l);
        } else {
            nurseify.setNursifyLeave((byte) (nurseifySupper.getNursifyLeave() + 1));
        }
        return super.insert(nurseify);
    }


    @Override
    public int delete(Long id) {
        NurseifyExample nurseifyExample = new NurseifyExample();
        nurseifyExample.createCriteria().andNursifyTidEqualTo(id);
        nurseifyDao.deleteByExample(nurseifyExample);

        return super.delete(id);
    }
}
