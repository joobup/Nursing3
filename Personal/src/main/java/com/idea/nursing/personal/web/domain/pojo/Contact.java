package com.idea.nursing.personal.web.domain.pojo;

public class Contact {
    private Long id;

    private String contactAddress;

    private String contactTel;

    private String contactPeople;

    private Byte contactSex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getContactPeople() {
        return contactPeople;
    }

    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople == null ? null : contactPeople.trim();
    }

    public Byte getContactSex() {
        return contactSex;
    }

    public void setContactSex(Byte contactSex) {
        this.contactSex = contactSex;
    }
}