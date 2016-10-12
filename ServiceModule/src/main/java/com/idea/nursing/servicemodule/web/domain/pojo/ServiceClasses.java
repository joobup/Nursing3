package com.idea.nursing.servicemodule.web.domain.pojo;

public class ServiceClasses {
    private Long id;

    private String serveClassname;

    private Byte serveClasslevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServeClassname() {
        return serveClassname;
    }

    public void setServeClassname(String serveClassname) {
        this.serveClassname = serveClassname == null ? null : serveClassname.trim();
    }

    public Byte getServeClasslevel() {
        return serveClasslevel;
    }

    public void setServeClasslevel(Byte serveClasslevel) {
        this.serveClasslevel = serveClasslevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}