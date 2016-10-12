package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicesExample() {
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

        public Criteria andServeClassifyIsNull() {
            addCriterion("serve_classify is null");
            return (Criteria) this;
        }

        public Criteria andServeClassifyIsNotNull() {
            addCriterion("serve_classify is not null");
            return (Criteria) this;
        }

        public Criteria andServeClassifyEqualTo(Long value) {
            addCriterion("serve_classify =", value, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyNotEqualTo(Long value) {
            addCriterion("serve_classify <>", value, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyGreaterThan(Long value) {
            addCriterion("serve_classify >", value, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyGreaterThanOrEqualTo(Long value) {
            addCriterion("serve_classify >=", value, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyLessThan(Long value) {
            addCriterion("serve_classify <", value, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyLessThanOrEqualTo(Long value) {
            addCriterion("serve_classify <=", value, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyIn(List<Long> values) {
            addCriterion("serve_classify in", values, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyNotIn(List<Long> values) {
            addCriterion("serve_classify not in", values, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyBetween(Long value1, Long value2) {
            addCriterion("serve_classify between", value1, value2, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeClassifyNotBetween(Long value1, Long value2) {
            addCriterion("serve_classify not between", value1, value2, "serveClassify");
            return (Criteria) this;
        }

        public Criteria andServeNameIsNull() {
            addCriterion("serve_name is null");
            return (Criteria) this;
        }

        public Criteria andServeNameIsNotNull() {
            addCriterion("serve_name is not null");
            return (Criteria) this;
        }

        public Criteria andServeNameEqualTo(String value) {
            addCriterion("serve_name =", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotEqualTo(String value) {
            addCriterion("serve_name <>", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameGreaterThan(String value) {
            addCriterion("serve_name >", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameGreaterThanOrEqualTo(String value) {
            addCriterion("serve_name >=", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameLessThan(String value) {
            addCriterion("serve_name <", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameLessThanOrEqualTo(String value) {
            addCriterion("serve_name <=", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameLike(String value) {
            addCriterion("serve_name like", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotLike(String value) {
            addCriterion("serve_name not like", value, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameIn(List<String> values) {
            addCriterion("serve_name in", values, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotIn(List<String> values) {
            addCriterion("serve_name not in", values, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameBetween(String value1, String value2) {
            addCriterion("serve_name between", value1, value2, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeNameNotBetween(String value1, String value2) {
            addCriterion("serve_name not between", value1, value2, "serveName");
            return (Criteria) this;
        }

        public Criteria andServeBirefIsNull() {
            addCriterion("serve_biref is null");
            return (Criteria) this;
        }

        public Criteria andServeBirefIsNotNull() {
            addCriterion("serve_biref is not null");
            return (Criteria) this;
        }

        public Criteria andServeBirefEqualTo(String value) {
            addCriterion("serve_biref =", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefNotEqualTo(String value) {
            addCriterion("serve_biref <>", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefGreaterThan(String value) {
            addCriterion("serve_biref >", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefGreaterThanOrEqualTo(String value) {
            addCriterion("serve_biref >=", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefLessThan(String value) {
            addCriterion("serve_biref <", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefLessThanOrEqualTo(String value) {
            addCriterion("serve_biref <=", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefLike(String value) {
            addCriterion("serve_biref like", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefNotLike(String value) {
            addCriterion("serve_biref not like", value, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefIn(List<String> values) {
            addCriterion("serve_biref in", values, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefNotIn(List<String> values) {
            addCriterion("serve_biref not in", values, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefBetween(String value1, String value2) {
            addCriterion("serve_biref between", value1, value2, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeBirefNotBetween(String value1, String value2) {
            addCriterion("serve_biref not between", value1, value2, "serveBiref");
            return (Criteria) this;
        }

        public Criteria andServeLimitIsNull() {
            addCriterion("serve_limit is null");
            return (Criteria) this;
        }

        public Criteria andServeLimitIsNotNull() {
            addCriterion("serve_limit is not null");
            return (Criteria) this;
        }

        public Criteria andServeLimitEqualTo(String value) {
            addCriterion("serve_limit =", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitNotEqualTo(String value) {
            addCriterion("serve_limit <>", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitGreaterThan(String value) {
            addCriterion("serve_limit >", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("serve_limit >=", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitLessThan(String value) {
            addCriterion("serve_limit <", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitLessThanOrEqualTo(String value) {
            addCriterion("serve_limit <=", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitLike(String value) {
            addCriterion("serve_limit like", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitNotLike(String value) {
            addCriterion("serve_limit not like", value, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitIn(List<String> values) {
            addCriterion("serve_limit in", values, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitNotIn(List<String> values) {
            addCriterion("serve_limit not in", values, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitBetween(String value1, String value2) {
            addCriterion("serve_limit between", value1, value2, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServeLimitNotBetween(String value1, String value2) {
            addCriterion("serve_limit not between", value1, value2, "serveLimit");
            return (Criteria) this;
        }

        public Criteria andServePeoplesIsNull() {
            addCriterion("serve_peoples is null");
            return (Criteria) this;
        }

        public Criteria andServePeoplesIsNotNull() {
            addCriterion("serve_peoples is not null");
            return (Criteria) this;
        }

        public Criteria andServePeoplesEqualTo(Integer value) {
            addCriterion("serve_peoples =", value, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesNotEqualTo(Integer value) {
            addCriterion("serve_peoples <>", value, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesGreaterThan(Integer value) {
            addCriterion("serve_peoples >", value, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesGreaterThanOrEqualTo(Integer value) {
            addCriterion("serve_peoples >=", value, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesLessThan(Integer value) {
            addCriterion("serve_peoples <", value, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesLessThanOrEqualTo(Integer value) {
            addCriterion("serve_peoples <=", value, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesIn(List<Integer> values) {
            addCriterion("serve_peoples in", values, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesNotIn(List<Integer> values) {
            addCriterion("serve_peoples not in", values, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesBetween(Integer value1, Integer value2) {
            addCriterion("serve_peoples between", value1, value2, "servePeoples");
            return (Criteria) this;
        }

        public Criteria andServePeoplesNotBetween(Integer value1, Integer value2) {
            addCriterion("serve_peoples not between", value1, value2, "servePeoples");
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