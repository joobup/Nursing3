package com.idea.nursing.order.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdIsNull() {
            addCriterion("package_service_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdIsNotNull() {
            addCriterion("package_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdEqualTo(Long value) {
            addCriterion("package_service_id =", value, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdNotEqualTo(Long value) {
            addCriterion("package_service_id <>", value, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdGreaterThan(Long value) {
            addCriterion("package_service_id >", value, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("package_service_id >=", value, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdLessThan(Long value) {
            addCriterion("package_service_id <", value, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdLessThanOrEqualTo(Long value) {
            addCriterion("package_service_id <=", value, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdIn(List<Long> values) {
            addCriterion("package_service_id in", values, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdNotIn(List<Long> values) {
            addCriterion("package_service_id not in", values, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdBetween(Long value1, Long value2) {
            addCriterion("package_service_id between", value1, value2, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andPackageServiceIdNotBetween(Long value1, Long value2) {
            addCriterion("package_service_id not between", value1, value2, "packageServiceId");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Long value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Long value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Long value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Long value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Long value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Long> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Long> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Long value1, Long value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Long value1, Long value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Long value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Long value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Long value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Long value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Long value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Long> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Long> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Long value1, Long value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Long value1, Long value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateIsNull() {
            addCriterion("accept_service_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateIsNotNull() {
            addCriterion("accept_service_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateEqualTo(Date value) {
            addCriterion("accept_service_date =", value, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateNotEqualTo(Date value) {
            addCriterion("accept_service_date <>", value, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateGreaterThan(Date value) {
            addCriterion("accept_service_date >", value, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("accept_service_date >=", value, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateLessThan(Date value) {
            addCriterion("accept_service_date <", value, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateLessThanOrEqualTo(Date value) {
            addCriterion("accept_service_date <=", value, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateIn(List<Date> values) {
            addCriterion("accept_service_date in", values, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateNotIn(List<Date> values) {
            addCriterion("accept_service_date not in", values, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateBetween(Date value1, Date value2) {
            addCriterion("accept_service_date between", value1, value2, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptServiceDateNotBetween(Date value1, Date value2) {
            addCriterion("accept_service_date not between", value1, value2, "acceptServiceDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateIsNull() {
            addCriterion("service_end_date is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateIsNotNull() {
            addCriterion("service_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateEqualTo(Date value) {
            addCriterion("service_end_date =", value, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateNotEqualTo(Date value) {
            addCriterion("service_end_date <>", value, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateGreaterThan(Date value) {
            addCriterion("service_end_date >", value, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("service_end_date >=", value, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateLessThan(Date value) {
            addCriterion("service_end_date <", value, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateLessThanOrEqualTo(Date value) {
            addCriterion("service_end_date <=", value, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateIn(List<Date> values) {
            addCriterion("service_end_date in", values, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateNotIn(List<Date> values) {
            addCriterion("service_end_date not in", values, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateBetween(Date value1, Date value2) {
            addCriterion("service_end_date between", value1, value2, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceEndDateNotBetween(Date value1, Date value2) {
            addCriterion("service_end_date not between", value1, value2, "serviceEndDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateIsNull() {
            addCriterion("service_start_date is null");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateIsNotNull() {
            addCriterion("service_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateEqualTo(Date value) {
            addCriterion("service_start_date =", value, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateNotEqualTo(Date value) {
            addCriterion("service_start_date <>", value, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateGreaterThan(Date value) {
            addCriterion("service_start_date >", value, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("service_start_date >=", value, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateLessThan(Date value) {
            addCriterion("service_start_date <", value, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateLessThanOrEqualTo(Date value) {
            addCriterion("service_start_date <=", value, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateIn(List<Date> values) {
            addCriterion("service_start_date in", values, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateNotIn(List<Date> values) {
            addCriterion("service_start_date not in", values, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateBetween(Date value1, Date value2) {
            addCriterion("service_start_date between", value1, value2, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andServiceStartDateNotBetween(Date value1, Date value2) {
            addCriterion("service_start_date not between", value1, value2, "serviceStartDate");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNull() {
            addCriterion("contact_id is null");
            return (Criteria) this;
        }

        public Criteria andContactIdIsNotNull() {
            addCriterion("contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdEqualTo(Long value) {
            addCriterion("contact_id =", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotEqualTo(Long value) {
            addCriterion("contact_id <>", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThan(Long value) {
            addCriterion("contact_id >", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdGreaterThanOrEqualTo(Long value) {
            addCriterion("contact_id >=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThan(Long value) {
            addCriterion("contact_id <", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdLessThanOrEqualTo(Long value) {
            addCriterion("contact_id <=", value, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdIn(List<Long> values) {
            addCriterion("contact_id in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotIn(List<Long> values) {
            addCriterion("contact_id not in", values, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdBetween(Long value1, Long value2) {
            addCriterion("contact_id between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andContactIdNotBetween(Long value1, Long value2) {
            addCriterion("contact_id not between", value1, value2, "contactId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNull() {
            addCriterion("insurance_id is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("insurance_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(Long value) {
            addCriterion("insurance_id =", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(Long value) {
            addCriterion("insurance_id <>", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThan(Long value) {
            addCriterion("insurance_id >", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance_id >=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(Long value) {
            addCriterion("insurance_id <", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(Long value) {
            addCriterion("insurance_id <=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<Long> values) {
            addCriterion("insurance_id in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<Long> values) {
            addCriterion("insurance_id not in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(Long value1, Long value2) {
            addCriterion("insurance_id between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(Long value1, Long value2) {
            addCriterion("insurance_id not between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNull() {
            addCriterion("service_count is null");
            return (Criteria) this;
        }

        public Criteria andServiceCountIsNotNull() {
            addCriterion("service_count is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCountEqualTo(Integer value) {
            addCriterion("service_count =", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotEqualTo(Integer value) {
            addCriterion("service_count <>", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThan(Integer value) {
            addCriterion("service_count >", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_count >=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThan(Integer value) {
            addCriterion("service_count <", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountLessThanOrEqualTo(Integer value) {
            addCriterion("service_count <=", value, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountIn(List<Integer> values) {
            addCriterion("service_count in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotIn(List<Integer> values) {
            addCriterion("service_count not in", values, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountBetween(Integer value1, Integer value2) {
            addCriterion("service_count between", value1, value2, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andServiceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("service_count not between", value1, value2, "serviceCount");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}