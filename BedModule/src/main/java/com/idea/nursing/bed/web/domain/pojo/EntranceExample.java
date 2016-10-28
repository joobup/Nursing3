package com.idea.nursing.bed.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class EntranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntranceExample() {
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

        public Criteria andEntranceNameIsNull() {
            addCriterion("entrance_name is null");
            return (Criteria) this;
        }

        public Criteria andEntranceNameIsNotNull() {
            addCriterion("entrance_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceNameEqualTo(String value) {
            addCriterion("entrance_name =", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotEqualTo(String value) {
            addCriterion("entrance_name <>", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameGreaterThan(String value) {
            addCriterion("entrance_name >", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("entrance_name >=", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameLessThan(String value) {
            addCriterion("entrance_name <", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameLessThanOrEqualTo(String value) {
            addCriterion("entrance_name <=", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameLike(String value) {
            addCriterion("entrance_name like", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotLike(String value) {
            addCriterion("entrance_name not like", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameIn(List<String> values) {
            addCriterion("entrance_name in", values, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotIn(List<String> values) {
            addCriterion("entrance_name not in", values, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameBetween(String value1, String value2) {
            addCriterion("entrance_name between", value1, value2, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotBetween(String value1, String value2) {
            addCriterion("entrance_name not between", value1, value2, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumIsNull() {
            addCriterion("entrance_toal_num is null");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumIsNotNull() {
            addCriterion("entrance_toal_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumEqualTo(Byte value) {
            addCriterion("entrance_toal_num =", value, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumNotEqualTo(Byte value) {
            addCriterion("entrance_toal_num <>", value, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumGreaterThan(Byte value) {
            addCriterion("entrance_toal_num >", value, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("entrance_toal_num >=", value, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumLessThan(Byte value) {
            addCriterion("entrance_toal_num <", value, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumLessThanOrEqualTo(Byte value) {
            addCriterion("entrance_toal_num <=", value, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumIn(List<Byte> values) {
            addCriterion("entrance_toal_num in", values, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumNotIn(List<Byte> values) {
            addCriterion("entrance_toal_num not in", values, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumBetween(Byte value1, Byte value2) {
            addCriterion("entrance_toal_num between", value1, value2, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceToalNumNotBetween(Byte value1, Byte value2) {
            addCriterion("entrance_toal_num not between", value1, value2, "entranceToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumIsNull() {
            addCriterion("floor_toal_num is null");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumIsNotNull() {
            addCriterion("floor_toal_num is not null");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumEqualTo(Byte value) {
            addCriterion("floor_toal_num =", value, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumNotEqualTo(Byte value) {
            addCriterion("floor_toal_num <>", value, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumGreaterThan(Byte value) {
            addCriterion("floor_toal_num >", value, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("floor_toal_num >=", value, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumLessThan(Byte value) {
            addCriterion("floor_toal_num <", value, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumLessThanOrEqualTo(Byte value) {
            addCriterion("floor_toal_num <=", value, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumIn(List<Byte> values) {
            addCriterion("floor_toal_num in", values, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumNotIn(List<Byte> values) {
            addCriterion("floor_toal_num not in", values, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumBetween(Byte value1, Byte value2) {
            addCriterion("floor_toal_num between", value1, value2, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andFloorToalNumNotBetween(Byte value1, Byte value2) {
            addCriterion("floor_toal_num not between", value1, value2, "floorToalNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumIsNull() {
            addCriterion("entrance_num is null");
            return (Criteria) this;
        }

        public Criteria andEntranceNumIsNotNull() {
            addCriterion("entrance_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceNumEqualTo(Byte value) {
            addCriterion("entrance_num =", value, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumNotEqualTo(Byte value) {
            addCriterion("entrance_num <>", value, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumGreaterThan(Byte value) {
            addCriterion("entrance_num >", value, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("entrance_num >=", value, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumLessThan(Byte value) {
            addCriterion("entrance_num <", value, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumLessThanOrEqualTo(Byte value) {
            addCriterion("entrance_num <=", value, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumIn(List<Byte> values) {
            addCriterion("entrance_num in", values, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumNotIn(List<Byte> values) {
            addCriterion("entrance_num not in", values, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumBetween(Byte value1, Byte value2) {
            addCriterion("entrance_num between", value1, value2, "entranceNum");
            return (Criteria) this;
        }

        public Criteria andEntranceNumNotBetween(Byte value1, Byte value2) {
            addCriterion("entrance_num not between", value1, value2, "entranceNum");
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