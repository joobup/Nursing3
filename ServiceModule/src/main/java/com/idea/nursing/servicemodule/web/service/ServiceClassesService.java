package com.idea.nursing.servicemodule.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesExample;

import java.util.List;
import java.util.Map;

public interface ServiceClassesService extends GenericService<ServiceClasses,Long,ServiceClassesExample>{
        public Map<String,List<ServiceClasses>> findTree();
}
