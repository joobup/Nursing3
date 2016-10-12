package com.idea.nursing.servicemodule.web.domain.pojo;

public class ServiceClassesValuationRelation {
    private Long id;

    private Long serveId;

    private Long valuationId;

    private Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServeId() {
        return serveId;
    }

    public void setServeId(Long serveId) {
        this.serveId = serveId;
    }

    public Long getValuationId() {
        return valuationId;
    }

    public void setValuationId(Long valuationId) {
        this.valuationId = valuationId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}