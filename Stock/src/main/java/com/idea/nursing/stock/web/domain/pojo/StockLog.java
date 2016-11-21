package com.idea.nursing.stock.web.domain.pojo;

import java.util.Date;

public class StockLog {
    private Long id;

    private Long stockId;

    private Byte stockInOut;

    private Date logDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Byte getStockInOut() {
        return stockInOut;
    }

    public void setStockInOut(Byte stockInOut) {
        this.stockInOut = stockInOut;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}