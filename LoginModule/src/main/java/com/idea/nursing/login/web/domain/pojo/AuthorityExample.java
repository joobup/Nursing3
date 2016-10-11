package com.idea.nursing.login.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andRmsNameIsNull() {
            addCriterion("rms_name is null");
            return (Criteria) this;
        }

        public Criteria andRmsNameIsNotNull() {
            addCriterion("rms_name is not null");
            return (Criteria) this;
        }

        public Criteria andRmsNameEqualTo(String value) {
            addCriterion("rms_name =", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameNotEqualTo(String value) {
            addCriterion("rms_name <>", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameGreaterThan(String value) {
            addCriterion("rms_name >", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameGreaterThanOrEqualTo(String value) {
            addCriterion("rms_name >=", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameLessThan(String value) {
            addCriterion("rms_name <", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameLessThanOrEqualTo(String value) {
            addCriterion("rms_name <=", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameLike(String value) {
            addCriterion("rms_name like", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameNotLike(String value) {
            addCriterion("rms_name not like", value, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameIn(List<String> values) {
            addCriterion("rms_name in", values, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameNotIn(List<String> values) {
            addCriterion("rms_name not in", values, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameBetween(String value1, String value2) {
            addCriterion("rms_name between", value1, value2, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsNameNotBetween(String value1, String value2) {
            addCriterion("rms_name not between", value1, value2, "rmsName");
            return (Criteria) this;
        }

        public Criteria andRmsIconIsNull() {
            addCriterion("rms_icon is null");
            return (Criteria) this;
        }

        public Criteria andRmsIconIsNotNull() {
            addCriterion("rms_icon is not null");
            return (Criteria) this;
        }

        public Criteria andRmsIconEqualTo(String value) {
            addCriterion("rms_icon =", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconNotEqualTo(String value) {
            addCriterion("rms_icon <>", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconGreaterThan(String value) {
            addCriterion("rms_icon >", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconGreaterThanOrEqualTo(String value) {
            addCriterion("rms_icon >=", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconLessThan(String value) {
            addCriterion("rms_icon <", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconLessThanOrEqualTo(String value) {
            addCriterion("rms_icon <=", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconLike(String value) {
            addCriterion("rms_icon like", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconNotLike(String value) {
            addCriterion("rms_icon not like", value, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconIn(List<String> values) {
            addCriterion("rms_icon in", values, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconNotIn(List<String> values) {
            addCriterion("rms_icon not in", values, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconBetween(String value1, String value2) {
            addCriterion("rms_icon between", value1, value2, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsIconNotBetween(String value1, String value2) {
            addCriterion("rms_icon not between", value1, value2, "rmsIcon");
            return (Criteria) this;
        }

        public Criteria andRmsLevelIsNull() {
            addCriterion("rms_level is null");
            return (Criteria) this;
        }

        public Criteria andRmsLevelIsNotNull() {
            addCriterion("rms_level is not null");
            return (Criteria) this;
        }

        public Criteria andRmsLevelEqualTo(Byte value) {
            addCriterion("rms_level =", value, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelNotEqualTo(Byte value) {
            addCriterion("rms_level <>", value, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelGreaterThan(Byte value) {
            addCriterion("rms_level >", value, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("rms_level >=", value, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelLessThan(Byte value) {
            addCriterion("rms_level <", value, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelLessThanOrEqualTo(Byte value) {
            addCriterion("rms_level <=", value, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelIn(List<Byte> values) {
            addCriterion("rms_level in", values, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelNotIn(List<Byte> values) {
            addCriterion("rms_level not in", values, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelBetween(Byte value1, Byte value2) {
            addCriterion("rms_level between", value1, value2, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("rms_level not between", value1, value2, "rmsLevel");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdIsNull() {
            addCriterion("rms_superior_id is null");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdIsNotNull() {
            addCriterion("rms_superior_id is not null");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdEqualTo(Long value) {
            addCriterion("rms_superior_id =", value, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdNotEqualTo(Long value) {
            addCriterion("rms_superior_id <>", value, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdGreaterThan(Long value) {
            addCriterion("rms_superior_id >", value, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rms_superior_id >=", value, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdLessThan(Long value) {
            addCriterion("rms_superior_id <", value, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdLessThanOrEqualTo(Long value) {
            addCriterion("rms_superior_id <=", value, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdIn(List<Long> values) {
            addCriterion("rms_superior_id in", values, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdNotIn(List<Long> values) {
            addCriterion("rms_superior_id not in", values, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdBetween(Long value1, Long value2) {
            addCriterion("rms_superior_id between", value1, value2, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsSuperiorIdNotBetween(Long value1, Long value2) {
            addCriterion("rms_superior_id not between", value1, value2, "rmsSuperiorId");
            return (Criteria) this;
        }

        public Criteria andRmsUrlIsNull() {
            addCriterion("rms_url is null");
            return (Criteria) this;
        }

        public Criteria andRmsUrlIsNotNull() {
            addCriterion("rms_url is not null");
            return (Criteria) this;
        }

        public Criteria andRmsUrlEqualTo(String value) {
            addCriterion("rms_url =", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlNotEqualTo(String value) {
            addCriterion("rms_url <>", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlGreaterThan(String value) {
            addCriterion("rms_url >", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rms_url >=", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlLessThan(String value) {
            addCriterion("rms_url <", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlLessThanOrEqualTo(String value) {
            addCriterion("rms_url <=", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlLike(String value) {
            addCriterion("rms_url like", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlNotLike(String value) {
            addCriterion("rms_url not like", value, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlIn(List<String> values) {
            addCriterion("rms_url in", values, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlNotIn(List<String> values) {
            addCriterion("rms_url not in", values, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlBetween(String value1, String value2) {
            addCriterion("rms_url between", value1, value2, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsUrlNotBetween(String value1, String value2) {
            addCriterion("rms_url not between", value1, value2, "rmsUrl");
            return (Criteria) this;
        }

        public Criteria andRmsTypeIsNull() {
            addCriterion("rms_type is null");
            return (Criteria) this;
        }

        public Criteria andRmsTypeIsNotNull() {
            addCriterion("rms_type is not null");
            return (Criteria) this;
        }

        public Criteria andRmsTypeEqualTo(Byte value) {
            addCriterion("rms_type =", value, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeNotEqualTo(Byte value) {
            addCriterion("rms_type <>", value, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeGreaterThan(Byte value) {
            addCriterion("rms_type >", value, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("rms_type >=", value, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeLessThan(Byte value) {
            addCriterion("rms_type <", value, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("rms_type <=", value, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeIn(List<Byte> values) {
            addCriterion("rms_type in", values, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeNotIn(List<Byte> values) {
            addCriterion("rms_type not in", values, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeBetween(Byte value1, Byte value2) {
            addCriterion("rms_type between", value1, value2, "rmsType");
            return (Criteria) this;
        }

        public Criteria andRmsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("rms_type not between", value1, value2, "rmsType");
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