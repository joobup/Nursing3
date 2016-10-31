package com.idea.nursing.order.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvaluateNameIsNull() {
            addCriterion("evaluate_name is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameIsNotNull() {
            addCriterion("evaluate_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameEqualTo(String value) {
            addCriterion("evaluate_name =", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotEqualTo(String value) {
            addCriterion("evaluate_name <>", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameGreaterThan(String value) {
            addCriterion("evaluate_name >", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_name >=", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameLessThan(String value) {
            addCriterion("evaluate_name <", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameLessThanOrEqualTo(String value) {
            addCriterion("evaluate_name <=", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameLike(String value) {
            addCriterion("evaluate_name like", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotLike(String value) {
            addCriterion("evaluate_name not like", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameIn(List<String> values) {
            addCriterion("evaluate_name in", values, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotIn(List<String> values) {
            addCriterion("evaluate_name not in", values, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameBetween(String value1, String value2) {
            addCriterion("evaluate_name between", value1, value2, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotBetween(String value1, String value2) {
            addCriterion("evaluate_name not between", value1, value2, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxIsNull() {
            addCriterion("evaluate_grade_max is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxIsNotNull() {
            addCriterion("evaluate_grade_max is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxEqualTo(Byte value) {
            addCriterion("evaluate_grade_max =", value, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxNotEqualTo(Byte value) {
            addCriterion("evaluate_grade_max <>", value, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxGreaterThan(Byte value) {
            addCriterion("evaluate_grade_max >", value, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxGreaterThanOrEqualTo(Byte value) {
            addCriterion("evaluate_grade_max >=", value, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxLessThan(Byte value) {
            addCriterion("evaluate_grade_max <", value, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxLessThanOrEqualTo(Byte value) {
            addCriterion("evaluate_grade_max <=", value, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxIn(List<Byte> values) {
            addCriterion("evaluate_grade_max in", values, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxNotIn(List<Byte> values) {
            addCriterion("evaluate_grade_max not in", values, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxBetween(Byte value1, Byte value2) {
            addCriterion("evaluate_grade_max between", value1, value2, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMaxNotBetween(Byte value1, Byte value2) {
            addCriterion("evaluate_grade_max not between", value1, value2, "evaluateGradeMax");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinIsNull() {
            addCriterion("evaluate_grade_min is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinIsNotNull() {
            addCriterion("evaluate_grade_min is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinEqualTo(Byte value) {
            addCriterion("evaluate_grade_min =", value, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinNotEqualTo(Byte value) {
            addCriterion("evaluate_grade_min <>", value, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinGreaterThan(Byte value) {
            addCriterion("evaluate_grade_min >", value, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinGreaterThanOrEqualTo(Byte value) {
            addCriterion("evaluate_grade_min >=", value, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinLessThan(Byte value) {
            addCriterion("evaluate_grade_min <", value, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinLessThanOrEqualTo(Byte value) {
            addCriterion("evaluate_grade_min <=", value, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinIn(List<Byte> values) {
            addCriterion("evaluate_grade_min in", values, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinNotIn(List<Byte> values) {
            addCriterion("evaluate_grade_min not in", values, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinBetween(Byte value1, Byte value2) {
            addCriterion("evaluate_grade_min between", value1, value2, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andEvaluateGradeMinNotBetween(Byte value1, Byte value2) {
            addCriterion("evaluate_grade_min not between", value1, value2, "evaluateGradeMin");
            return (Criteria) this;
        }

        public Criteria andSpanValueIsNull() {
            addCriterion("span_value is null");
            return (Criteria) this;
        }

        public Criteria andSpanValueIsNotNull() {
            addCriterion("span_value is not null");
            return (Criteria) this;
        }

        public Criteria andSpanValueEqualTo(Byte value) {
            addCriterion("span_value =", value, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueNotEqualTo(Byte value) {
            addCriterion("span_value <>", value, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueGreaterThan(Byte value) {
            addCriterion("span_value >", value, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueGreaterThanOrEqualTo(Byte value) {
            addCriterion("span_value >=", value, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueLessThan(Byte value) {
            addCriterion("span_value <", value, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueLessThanOrEqualTo(Byte value) {
            addCriterion("span_value <=", value, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueIn(List<Byte> values) {
            addCriterion("span_value in", values, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueNotIn(List<Byte> values) {
            addCriterion("span_value not in", values, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueBetween(Byte value1, Byte value2) {
            addCriterion("span_value between", value1, value2, "spanValue");
            return (Criteria) this;
        }

        public Criteria andSpanValueNotBetween(Byte value1, Byte value2) {
            addCriterion("span_value not between", value1, value2, "spanValue");
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