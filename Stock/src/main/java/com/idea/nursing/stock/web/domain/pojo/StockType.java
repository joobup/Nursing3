package com.idea.nursing.stock.web.domain.pojo;

public class StockType {
    private Long id;

    private String stockTypeName;

    private Byte stockTypeLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockTypeName() {
        return stockTypeName;
    }

    public void setStockTypeName(String stockTypeName) {
        this.stockTypeName = stockTypeName == null ? null : stockTypeName.trim();
    }

    public Byte getStockTypeLevel() {
        return stockTypeLevel;
    }

    public void setStockTypeLevel(Byte stockTypeLevel) {
        this.stockTypeLevel = stockTypeLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}