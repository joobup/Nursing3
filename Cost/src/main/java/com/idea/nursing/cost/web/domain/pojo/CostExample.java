package com.idea.nursing.cost.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostExample() {
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

        public Criteria andCostNumIsNull() {
            addCriterion("cost_num is null");
            return (Criteria) this;
        }

        public Criteria andCostNumIsNotNull() {
            addCriterion("cost_num is not null");
            return (Criteria) this;
        }

        public Criteria andCostNumEqualTo(Long value) {
            addCriterion("cost_num =", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumNotEqualTo(Long value) {
            addCriterion("cost_num <>", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumGreaterThan(Long value) {
            addCriterion("cost_num >", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumGreaterThanOrEqualTo(Long value) {
            addCriterion("cost_num >=", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumLessThan(Long value) {
            addCriterion("cost_num <", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumLessThanOrEqualTo(Long value) {
            addCriterion("cost_num <=", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumIn(List<Long> values) {
            addCriterion("cost_num in", values, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumNotIn(List<Long> values) {
            addCriterion("cost_num not in", values, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumBetween(Long value1, Long value2) {
            addCriterion("cost_num between", value1, value2, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumNotBetween(Long value1, Long value2) {
            addCriterion("cost_num not between", value1, value2, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(Byte value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(Byte value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(Byte value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(Byte value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(Byte value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<Byte> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<Byte> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(Byte value1, Byte value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostInOutIsNull() {
            addCriterion("cost_in_out is null");
            return (Criteria) this;
        }

        public Criteria andCostInOutIsNotNull() {
            addCriterion("cost_in_out is not null");
            return (Criteria) this;
        }

        public Criteria andCostInOutEqualTo(Byte value) {
            addCriterion("cost_in_out =", value, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutNotEqualTo(Byte value) {
            addCriterion("cost_in_out <>", value, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutGreaterThan(Byte value) {
            addCriterion("cost_in_out >", value, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutGreaterThanOrEqualTo(Byte value) {
            addCriterion("cost_in_out >=", value, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutLessThan(Byte value) {
            addCriterion("cost_in_out <", value, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutLessThanOrEqualTo(Byte value) {
            addCriterion("cost_in_out <=", value, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutIn(List<Byte> values) {
            addCriterion("cost_in_out in", values, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutNotIn(List<Byte> values) {
            addCriterion("cost_in_out not in", values, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutBetween(Byte value1, Byte value2) {
            addCriterion("cost_in_out between", value1, value2, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostInOutNotBetween(Byte value1, Byte value2) {
            addCriterion("cost_in_out not between", value1, value2, "costInOut");
            return (Criteria) this;
        }

        public Criteria andCostDateIsNull() {
            addCriterion("cost_date is null");
            return (Criteria) this;
        }

        public Criteria andCostDateIsNotNull() {
            addCriterion("cost_date is not null");
            return (Criteria) this;
        }

        public Criteria andCostDateEqualTo(Date value) {
            addCriterion("cost_date =", value, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateNotEqualTo(Date value) {
            addCriterion("cost_date <>", value, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateGreaterThan(Date value) {
            addCriterion("cost_date >", value, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cost_date >=", value, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateLessThan(Date value) {
            addCriterion("cost_date <", value, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateLessThanOrEqualTo(Date value) {
            addCriterion("cost_date <=", value, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateIn(List<Date> values) {
            addCriterion("cost_date in", values, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateNotIn(List<Date> values) {
            addCriterion("cost_date not in", values, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateBetween(Date value1, Date value2) {
            addCriterion("cost_date between", value1, value2, "costDate");
            return (Criteria) this;
        }

        public Criteria andCostDateNotBetween(Date value1, Date value2) {
            addCriterion("cost_date not between", value1, value2, "costDate");
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