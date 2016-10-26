package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceClassesMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesExample;
import com.idea.nursing.servicemodule.web.service.ServiceClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ServiceClassesServiceImpl extends GenericServiceImpl<ServiceClasses, Long,ServiceClassesExample> implements ServiceClassesService {
    @Autowired
    private ServiceClassesMapper serviceclassesDao;
    @Override
    public GenericDao<ServiceClasses, Long,ServiceClassesExample> getDao() {
        return serviceclassesDao;
    }

    //添加服务级别
    @Override
    public int insert(ServiceClasses serviceClasses) {


        //获取父级类型
        ServiceClasses serviceClassesSuper = selectById(serviceClasses.getTid());
        if(notNullObject(serviceClassesSuper)){

            serviceClasses.setServeClasslevel((byte)0);
            serviceClasses.setTid(0l);
        }else{
            serviceClasses.setServeClasslevel((byte)(serviceClassesSuper.getServeClasslevel()+1));
        }
        return super.insert(serviceClasses);
    }

    @Override
    public int delete(Long id) {

        ServiceClassesExample serviceClassesExample = new ServiceClassesExample();
        serviceClassesExample.createCriteria().andTidEqualTo(id);
        serviceclassesDao.deleteByExample(serviceClassesExample);

        return super.delete(id);
    }

    @Override
    public List<List<ServiceClasses>> findTree() {

        List<List<ServiceClasses>> result = new ArrayList<>();
        ServiceClassesExample example = new ServiceClassesExample();
        List<ServiceClasses> list = serviceclassesDao.selectByExample(example);
        if(list.size()==0){
            return result;
        }
        int maxLeave = 0;
        /**
         * 找到最小级别
         */
        for (ServiceClasses serviceClasses : list){
            if (serviceClasses.getServeClasslevel()>maxLeave){
                maxLeave=serviceClasses.getServeClasslevel();
            }
        }
        /**
         * 封装级别
         */
        for (int i=0;i<maxLeave;i++){
            List<ServiceClasses> leaveList = new ArrayList<>();
            for (ServiceClasses serviceClasses:list
                    ) {
                if(serviceClasses.getServeClasslevel()==i){
                    leaveList.add(serviceClasses);
                }
            }
            result.add(leaveList);
        }

        return result;
    }
}
