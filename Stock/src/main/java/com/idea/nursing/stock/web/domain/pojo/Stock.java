package com.idea.nursing.stock.web.domain.pojo;

import java.util.Date;

public class Stock {
    private Long id;

    private String stockName;

    private Long stockTypeId;

    private Long stockNum;

    private Date stockUpdateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Long getStockTypeId() {
        return stockTypeId;
    }

    public void setStockTypeId(Long stockTypeId) {
        this.stockTypeId = stockTypeId;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public Date getStockUpdateDate() {
        return stockUpdateDate;
    }

    public void setStockUpdateDate(Date stockUpdateDate) {
        this.stockUpdateDate = stockUpdateDate;
    }
}