package com.idea.nursing.order.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComplaintEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintEventExample() {
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

        public Criteria andComplaintEventNameIsNull() {
            addCriterion("complaint_event_name is null");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameIsNotNull() {
            addCriterion("complaint_event_name is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameEqualTo(String value) {
            addCriterion("complaint_event_name =", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameNotEqualTo(String value) {
            addCriterion("complaint_event_name <>", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameGreaterThan(String value) {
            addCriterion("complaint_event_name >", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_event_name >=", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameLessThan(String value) {
            addCriterion("complaint_event_name <", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameLessThanOrEqualTo(String value) {
            addCriterion("complaint_event_name <=", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameLike(String value) {
            addCriterion("complaint_event_name like", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameNotLike(String value) {
            addCriterion("complaint_event_name not like", value, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameIn(List<String> values) {
            addCriterion("complaint_event_name in", values, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameNotIn(List<String> values) {
            addCriterion("complaint_event_name not in", values, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameBetween(String value1, String value2) {
            addCriterion("complaint_event_name between", value1, value2, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventNameNotBetween(String value1, String value2) {
            addCriterion("complaint_event_name not between", value1, value2, "complaintEventName");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelIsNull() {
            addCriterion("complaint_event_level is null");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelIsNotNull() {
            addCriterion("complaint_event_level is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelEqualTo(Byte value) {
            addCriterion("complaint_event_level =", value, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelNotEqualTo(Byte value) {
            addCriterion("complaint_event_level <>", value, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelGreaterThan(Byte value) {
            addCriterion("complaint_event_level >", value, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("complaint_event_level >=", value, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelLessThan(Byte value) {
            addCriterion("complaint_event_level <", value, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelLessThanOrEqualTo(Byte value) {
            addCriterion("complaint_event_level <=", value, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelIn(List<Byte> values) {
            addCriterion("complaint_event_level in", values, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelNotIn(List<Byte> values) {
            addCriterion("complaint_event_level not in", values, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelBetween(Byte value1, Byte value2) {
            addCriterion("complaint_event_level between", value1, value2, "complaintEventLevel");
            return (Criteria) this;
        }

        public Criteria andComplaintEventLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("complaint_event_level not between", value1, value2, "complaintEventLevel");
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