package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicePackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicePackExample() {
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

        public Criteria andServeBriefIsNull() {
            addCriterion("serve_brief is null");
            return (Criteria) this;
        }

        public Criteria andServeBriefIsNotNull() {
            addCriterion("serve_brief is not null");
            return (Criteria) this;
        }

        public Criteria andServeBriefEqualTo(String value) {
            addCriterion("serve_brief =", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefNotEqualTo(String value) {
            addCriterion("serve_brief <>", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefGreaterThan(String value) {
            addCriterion("serve_brief >", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefGreaterThanOrEqualTo(String value) {
            addCriterion("serve_brief >=", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefLessThan(String value) {
            addCriterion("serve_brief <", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefLessThanOrEqualTo(String value) {
            addCriterion("serve_brief <=", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefLike(String value) {
            addCriterion("serve_brief like", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefNotLike(String value) {
            addCriterion("serve_brief not like", value, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefIn(List<String> values) {
            addCriterion("serve_brief in", values, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefNotIn(List<String> values) {
            addCriterion("serve_brief not in", values, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefBetween(String value1, String value2) {
            addCriterion("serve_brief between", value1, value2, "serveBrief");
            return (Criteria) this;
        }

        public Criteria andServeBriefNotBetween(String value1, String value2) {
            addCriterion("serve_brief not between", value1, value2, "serveBrief");
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

        public Criteria andServeCareIsNull() {
            addCriterion("serve_care is null");
            return (Criteria) this;
        }

        public Criteria andServeCareIsNotNull() {
            addCriterion("serve_care is not null");
            return (Criteria) this;
        }

        public Criteria andServeCareEqualTo(String value) {
            addCriterion("serve_care =", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareNotEqualTo(String value) {
            addCriterion("serve_care <>", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareGreaterThan(String value) {
            addCriterion("serve_care >", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareGreaterThanOrEqualTo(String value) {
            addCriterion("serve_care >=", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareLessThan(String value) {
            addCriterion("serve_care <", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareLessThanOrEqualTo(String value) {
            addCriterion("serve_care <=", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareLike(String value) {
            addCriterion("serve_care like", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareNotLike(String value) {
            addCriterion("serve_care not like", value, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareIn(List<String> values) {
            addCriterion("serve_care in", values, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareNotIn(List<String> values) {
            addCriterion("serve_care not in", values, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareBetween(String value1, String value2) {
            addCriterion("serve_care between", value1, value2, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeCareNotBetween(String value1, String value2) {
            addCriterion("serve_care not between", value1, value2, "serveCare");
            return (Criteria) this;
        }

        public Criteria andServeDetailedIsNull() {
            addCriterion("serve_detailed is null");
            return (Criteria) this;
        }

        public Criteria andServeDetailedIsNotNull() {
            addCriterion("serve_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andServeDetailedEqualTo(Long value) {
            addCriterion("serve_detailed =", value, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedNotEqualTo(Long value) {
            addCriterion("serve_detailed <>", value, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedGreaterThan(Long value) {
            addCriterion("serve_detailed >", value, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedGreaterThanOrEqualTo(Long value) {
            addCriterion("serve_detailed >=", value, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedLessThan(Long value) {
            addCriterion("serve_detailed <", value, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedLessThanOrEqualTo(Long value) {
            addCriterion("serve_detailed <=", value, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedIn(List<Long> values) {
            addCriterion("serve_detailed in", values, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedNotIn(List<Long> values) {
            addCriterion("serve_detailed not in", values, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedBetween(Long value1, Long value2) {
            addCriterion("serve_detailed between", value1, value2, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeDetailedNotBetween(Long value1, Long value2) {
            addCriterion("serve_detailed not between", value1, value2, "serveDetailed");
            return (Criteria) this;
        }

        public Criteria andServeRebateIsNull() {
            addCriterion("serve_rebate is null");
            return (Criteria) this;
        }

        public Criteria andServeRebateIsNotNull() {
            addCriterion("serve_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andServeRebateEqualTo(Byte value) {
            addCriterion("serve_rebate =", value, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateNotEqualTo(Byte value) {
            addCriterion("serve_rebate <>", value, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateGreaterThan(Byte value) {
            addCriterion("serve_rebate >", value, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateGreaterThanOrEqualTo(Byte value) {
            addCriterion("serve_rebate >=", value, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateLessThan(Byte value) {
            addCriterion("serve_rebate <", value, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateLessThanOrEqualTo(Byte value) {
            addCriterion("serve_rebate <=", value, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateIn(List<Byte> values) {
            addCriterion("serve_rebate in", values, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateNotIn(List<Byte> values) {
            addCriterion("serve_rebate not in", values, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateBetween(Byte value1, Byte value2) {
            addCriterion("serve_rebate between", value1, value2, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeRebateNotBetween(Byte value1, Byte value2) {
            addCriterion("serve_rebate not between", value1, value2, "serveRebate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateIsNull() {
            addCriterion("serve_enddate is null");
            return (Criteria) this;
        }

        public Criteria andServeEnddateIsNotNull() {
            addCriterion("serve_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andServeEnddateEqualTo(Date value) {
            addCriterion("serve_enddate =", value, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateNotEqualTo(Date value) {
            addCriterion("serve_enddate <>", value, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateGreaterThan(Date value) {
            addCriterion("serve_enddate >", value, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("serve_enddate >=", value, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateLessThan(Date value) {
            addCriterion("serve_enddate <", value, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateLessThanOrEqualTo(Date value) {
            addCriterion("serve_enddate <=", value, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateIn(List<Date> values) {
            addCriterion("serve_enddate in", values, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateNotIn(List<Date> values) {
            addCriterion("serve_enddate not in", values, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateBetween(Date value1, Date value2) {
            addCriterion("serve_enddate between", value1, value2, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeEnddateNotBetween(Date value1, Date value2) {
            addCriterion("serve_enddate not between", value1, value2, "serveEnddate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateIsNull() {
            addCriterion("serve_startdate is null");
            return (Criteria) this;
        }

        public Criteria andServeStartdateIsNotNull() {
            addCriterion("serve_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andServeStartdateEqualTo(Date value) {
            addCriterion("serve_startdate =", value, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateNotEqualTo(Date value) {
            addCriterion("serve_startdate <>", value, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateGreaterThan(Date value) {
            addCriterion("serve_startdate >", value, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("serve_startdate >=", value, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateLessThan(Date value) {
            addCriterion("serve_startdate <", value, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateLessThanOrEqualTo(Date value) {
            addCriterion("serve_startdate <=", value, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateIn(List<Date> values) {
            addCriterion("serve_startdate in", values, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateNotIn(List<Date> values) {
            addCriterion("serve_startdate not in", values, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateBetween(Date value1, Date value2) {
            addCriterion("serve_startdate between", value1, value2, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeStartdateNotBetween(Date value1, Date value2) {
            addCriterion("serve_startdate not between", value1, value2, "serveStartdate");
            return (Criteria) this;
        }

        public Criteria andServeServesIsNull() {
            addCriterion("serve_serves is null");
            return (Criteria) this;
        }

        public Criteria andServeServesIsNotNull() {
            addCriterion("serve_serves is not null");
            return (Criteria) this;
        }

        public Criteria andServeServesEqualTo(String value) {
            addCriterion("serve_serves =", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesNotEqualTo(String value) {
            addCriterion("serve_serves <>", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesGreaterThan(String value) {
            addCriterion("serve_serves >", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesGreaterThanOrEqualTo(String value) {
            addCriterion("serve_serves >=", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesLessThan(String value) {
            addCriterion("serve_serves <", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesLessThanOrEqualTo(String value) {
            addCriterion("serve_serves <=", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesLike(String value) {
            addCriterion("serve_serves like", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesNotLike(String value) {
            addCriterion("serve_serves not like", value, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesIn(List<String> values) {
            addCriterion("serve_serves in", values, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesNotIn(List<String> values) {
            addCriterion("serve_serves not in", values, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesBetween(String value1, String value2) {
            addCriterion("serve_serves between", value1, value2, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeServesNotBetween(String value1, String value2) {
            addCriterion("serve_serves not between", value1, value2, "serveServes");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyIsNull() {
            addCriterion("serve_nurseify is null");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyIsNotNull() {
            addCriterion("serve_nurseify is not null");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyEqualTo(Long value) {
            addCriterion("serve_nurseify =", value, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyNotEqualTo(Long value) {
            addCriterion("serve_nurseify <>", value, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyGreaterThan(Long value) {
            addCriterion("serve_nurseify >", value, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyGreaterThanOrEqualTo(Long value) {
            addCriterion("serve_nurseify >=", value, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyLessThan(Long value) {
            addCriterion("serve_nurseify <", value, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyLessThanOrEqualTo(Long value) {
            addCriterion("serve_nurseify <=", value, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyIn(List<Long> values) {
            addCriterion("serve_nurseify in", values, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyNotIn(List<Long> values) {
            addCriterion("serve_nurseify not in", values, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyBetween(Long value1, Long value2) {
            addCriterion("serve_nurseify between", value1, value2, "serveNurseify");
            return (Criteria) this;
        }

        public Criteria andServeNurseifyNotBetween(Long value1, Long value2) {
            addCriterion("serve_nurseify not between", value1, value2, "serveNurseify");
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