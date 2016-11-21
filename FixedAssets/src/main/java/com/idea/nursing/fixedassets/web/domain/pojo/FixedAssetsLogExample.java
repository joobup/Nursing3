package com.idea.nursing.fixedassets.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FixedAssetsLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FixedAssetsLogExample() {
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

        public Criteria andFixedAssetsIdIsNull() {
            addCriterion("fixed_assets_id is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdIsNotNull() {
            addCriterion("fixed_assets_id is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdEqualTo(Long value) {
            addCriterion("fixed_assets_id =", value, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdNotEqualTo(Long value) {
            addCriterion("fixed_assets_id <>", value, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdGreaterThan(Long value) {
            addCriterion("fixed_assets_id >", value, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_assets_id >=", value, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdLessThan(Long value) {
            addCriterion("fixed_assets_id <", value, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdLessThanOrEqualTo(Long value) {
            addCriterion("fixed_assets_id <=", value, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdIn(List<Long> values) {
            addCriterion("fixed_assets_id in", values, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdNotIn(List<Long> values) {
            addCriterion("fixed_assets_id not in", values, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdBetween(Long value1, Long value2) {
            addCriterion("fixed_assets_id between", value1, value2, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIdNotBetween(Long value1, Long value2) {
            addCriterion("fixed_assets_id not between", value1, value2, "fixedAssetsId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdIsNull() {
            addCriterion("fixed_assets_operation_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdIsNotNull() {
            addCriterion("fixed_assets_operation_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdEqualTo(Long value) {
            addCriterion("fixed_assets_operation_type_id =", value, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdNotEqualTo(Long value) {
            addCriterion("fixed_assets_operation_type_id <>", value, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdGreaterThan(Long value) {
            addCriterion("fixed_assets_operation_type_id >", value, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_assets_operation_type_id >=", value, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdLessThan(Long value) {
            addCriterion("fixed_assets_operation_type_id <", value, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("fixed_assets_operation_type_id <=", value, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdIn(List<Long> values) {
            addCriterion("fixed_assets_operation_type_id in", values, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdNotIn(List<Long> values) {
            addCriterion("fixed_assets_operation_type_id not in", values, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdBetween(Long value1, Long value2) {
            addCriterion("fixed_assets_operation_type_id between", value1, value2, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsOperationTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("fixed_assets_operation_type_id not between", value1, value2, "fixedAssetsOperationTypeId");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Date value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Date value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Date value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Date value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Date value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Date> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Date> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Date value1, Date value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Date value1, Date value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
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