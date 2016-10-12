package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class NurseifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseifyExample() {
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

        public Criteria andNursifyNameIsNull() {
            addCriterion("nursify_name is null");
            return (Criteria) this;
        }

        public Criteria andNursifyNameIsNotNull() {
            addCriterion("nursify_name is not null");
            return (Criteria) this;
        }

        public Criteria andNursifyNameEqualTo(String value) {
            addCriterion("nursify_name =", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameNotEqualTo(String value) {
            addCriterion("nursify_name <>", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameGreaterThan(String value) {
            addCriterion("nursify_name >", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("nursify_name >=", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameLessThan(String value) {
            addCriterion("nursify_name <", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameLessThanOrEqualTo(String value) {
            addCriterion("nursify_name <=", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameLike(String value) {
            addCriterion("nursify_name like", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameNotLike(String value) {
            addCriterion("nursify_name not like", value, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameIn(List<String> values) {
            addCriterion("nursify_name in", values, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameNotIn(List<String> values) {
            addCriterion("nursify_name not in", values, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameBetween(String value1, String value2) {
            addCriterion("nursify_name between", value1, value2, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyNameNotBetween(String value1, String value2) {
            addCriterion("nursify_name not between", value1, value2, "nursifyName");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveIsNull() {
            addCriterion("nursify_leave is null");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveIsNotNull() {
            addCriterion("nursify_leave is not null");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveEqualTo(Byte value) {
            addCriterion("nursify_leave =", value, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveNotEqualTo(Byte value) {
            addCriterion("nursify_leave <>", value, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveGreaterThan(Byte value) {
            addCriterion("nursify_leave >", value, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveGreaterThanOrEqualTo(Byte value) {
            addCriterion("nursify_leave >=", value, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveLessThan(Byte value) {
            addCriterion("nursify_leave <", value, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveLessThanOrEqualTo(Byte value) {
            addCriterion("nursify_leave <=", value, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveIn(List<Byte> values) {
            addCriterion("nursify_leave in", values, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveNotIn(List<Byte> values) {
            addCriterion("nursify_leave not in", values, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveBetween(Byte value1, Byte value2) {
            addCriterion("nursify_leave between", value1, value2, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyLeaveNotBetween(Byte value1, Byte value2) {
            addCriterion("nursify_leave not between", value1, value2, "nursifyLeave");
            return (Criteria) this;
        }

        public Criteria andNursifyTidIsNull() {
            addCriterion("nursify_tid is null");
            return (Criteria) this;
        }

        public Criteria andNursifyTidIsNotNull() {
            addCriterion("nursify_tid is not null");
            return (Criteria) this;
        }

        public Criteria andNursifyTidEqualTo(Long value) {
            addCriterion("nursify_tid =", value, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidNotEqualTo(Long value) {
            addCriterion("nursify_tid <>", value, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidGreaterThan(Long value) {
            addCriterion("nursify_tid >", value, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidGreaterThanOrEqualTo(Long value) {
            addCriterion("nursify_tid >=", value, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidLessThan(Long value) {
            addCriterion("nursify_tid <", value, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidLessThanOrEqualTo(Long value) {
            addCriterion("nursify_tid <=", value, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidIn(List<Long> values) {
            addCriterion("nursify_tid in", values, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidNotIn(List<Long> values) {
            addCriterion("nursify_tid not in", values, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidBetween(Long value1, Long value2) {
            addCriterion("nursify_tid between", value1, value2, "nursifyTid");
            return (Criteria) this;
        }

        public Criteria andNursifyTidNotBetween(Long value1, Long value2) {
            addCriterion("nursify_tid not between", value1, value2, "nursifyTid");
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