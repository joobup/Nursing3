package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceClassesMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesExample;
import com.idea.nursing.servicemodule.web.service.ServiceClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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
        if(serviceClasses.getServeClasslevel()==null){
            serviceClasses.setServeClasslevel((byte)0);
        }

        //获取父级类型
        ServiceClasses serviceClassesSuper = selectById(serviceClasses.getTid());
        if(serviceClassesSuper==null){

            serviceClasses.setServeClasslevel((byte)0);
            serviceClasses.setTid(0l);
        }else{
            serviceClasses.setServeClasslevel((byte)(serviceClassesSuper.getServeClasslevel()+1));
        }






        return super.insert(serviceClasses);
    }
}
