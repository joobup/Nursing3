package com.idea.nursing.oldpeople.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServicePeopleStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicePeopleStateExample() {
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

        public Criteria andServicePeopleStateNameIsNull() {
            addCriterion("service_people_state_name is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameIsNotNull() {
            addCriterion("service_people_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameEqualTo(String value) {
            addCriterion("service_people_state_name =", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameNotEqualTo(String value) {
            addCriterion("service_people_state_name <>", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameGreaterThan(String value) {
            addCriterion("service_people_state_name >", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_people_state_name >=", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameLessThan(String value) {
            addCriterion("service_people_state_name <", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameLessThanOrEqualTo(String value) {
            addCriterion("service_people_state_name <=", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameLike(String value) {
            addCriterion("service_people_state_name like", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameNotLike(String value) {
            addCriterion("service_people_state_name not like", value, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameIn(List<String> values) {
            addCriterion("service_people_state_name in", values, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameNotIn(List<String> values) {
            addCriterion("service_people_state_name not in", values, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameBetween(String value1, String value2) {
            addCriterion("service_people_state_name between", value1, value2, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateNameNotBetween(String value1, String value2) {
            addCriterion("service_people_state_name not between", value1, value2, "servicePeopleStateName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelIsNull() {
            addCriterion("service_people_state_level is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelIsNotNull() {
            addCriterion("service_people_state_level is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelEqualTo(Byte value) {
            addCriterion("service_people_state_level =", value, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelNotEqualTo(Byte value) {
            addCriterion("service_people_state_level <>", value, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelGreaterThan(Byte value) {
            addCriterion("service_people_state_level >", value, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("service_people_state_level >=", value, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelLessThan(Byte value) {
            addCriterion("service_people_state_level <", value, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelLessThanOrEqualTo(Byte value) {
            addCriterion("service_people_state_level <=", value, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelIn(List<Byte> values) {
            addCriterion("service_people_state_level in", values, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelNotIn(List<Byte> values) {
            addCriterion("service_people_state_level not in", values, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelBetween(Byte value1, Byte value2) {
            addCriterion("service_people_state_level between", value1, value2, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("service_people_state_level not between", value1, value2, "servicePeopleStateLevel");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("tid not between", value1, value2, "tid");
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