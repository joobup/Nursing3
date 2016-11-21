package com.idea.nursing.fixedassets.web.domain.pojo;

import java.util.Date;

public class FixedAssetsLog {
    private Long id;

    private Long fixedAssetsId;

    private Long fixedAssetsOperationTypeId;

    private Date logDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFixedAssetsId() {
        return fixedAssetsId;
    }

    public void setFixedAssetsId(Long fixedAssetsId) {
        this.fixedAssetsId = fixedAssetsId;
    }

    public Long getFixedAssetsOperationTypeId() {
        return fixedAssetsOperationTypeId;
    }

    public void setFixedAssetsOperationTypeId(Long fixedAssetsOperationTypeId) {
        this.fixedAssetsOperationTypeId = fixedAssetsOperationTypeId;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}