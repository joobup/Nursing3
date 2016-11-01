package ${packageName};

<#if !implflag>
import com.idea.nursing.core.generic.GenericService;
import ${modelpackageName}.${className};
import ${modelpackageName}.${className}Example;

public interface ${className}Service extends GenericService<${className},Long,${className}Example>{



}
<#else>

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import ${daopackageName}.${className}Mapper;
import ${modelpackageName}.${className};
import ${modelpackageName}.${className}Example;
import ${ImplpackageName};
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ${className}ServiceImpl extends GenericServiceImpl<${className}, Long,${className}Example> implements ${className}Service {
    @Autowired
    private ${className}Mapper ${className?lower_case}Dao;
    @Override
    public GenericDao<${className}, Long,${className}Example> getDao() {
        return ${className?lower_case}Dao;
    }

}
</#if>