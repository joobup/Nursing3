package com.idea.nursing.inspection.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class InspectionItemSelectValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionItemSelectValueExample() {
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

        public Criteria andInspectionItemIdIsNull() {
            addCriterion("inspection_item_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdIsNotNull() {
            addCriterion("inspection_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdEqualTo(Long value) {
            addCriterion("inspection_item_id =", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdNotEqualTo(Long value) {
            addCriterion("inspection_item_id <>", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdGreaterThan(Long value) {
            addCriterion("inspection_item_id >", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspection_item_id >=", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdLessThan(Long value) {
            addCriterion("inspection_item_id <", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdLessThanOrEqualTo(Long value) {
            addCriterion("inspection_item_id <=", value, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdIn(List<Long> values) {
            addCriterion("inspection_item_id in", values, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdNotIn(List<Long> values) {
            addCriterion("inspection_item_id not in", values, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdBetween(Long value1, Long value2) {
            addCriterion("inspection_item_id between", value1, value2, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andInspectionItemIdNotBetween(Long value1, Long value2) {
            addCriterion("inspection_item_id not between", value1, value2, "inspectionItemId");
            return (Criteria) this;
        }

        public Criteria andSelectNameIsNull() {
            addCriterion("select_name is null");
            return (Criteria) this;
        }

        public Criteria andSelectNameIsNotNull() {
            addCriterion("select_name is not null");
            return (Criteria) this;
        }

        public Criteria andSelectNameEqualTo(String value) {
            addCriterion("select_name =", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameNotEqualTo(String value) {
            addCriterion("select_name <>", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameGreaterThan(String value) {
            addCriterion("select_name >", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameGreaterThanOrEqualTo(String value) {
            addCriterion("select_name >=", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameLessThan(String value) {
            addCriterion("select_name <", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameLessThanOrEqualTo(String value) {
            addCriterion("select_name <=", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameLike(String value) {
            addCriterion("select_name like", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameNotLike(String value) {
            addCriterion("select_name not like", value, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameIn(List<String> values) {
            addCriterion("select_name in", values, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameNotIn(List<String> values) {
            addCriterion("select_name not in", values, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameBetween(String value1, String value2) {
            addCriterion("select_name between", value1, value2, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectNameNotBetween(String value1, String value2) {
            addCriterion("select_name not between", value1, value2, "selectName");
            return (Criteria) this;
        }

        public Criteria andSelectValueIsNull() {
            addCriterion("select_value is null");
            return (Criteria) this;
        }

        public Criteria andSelectValueIsNotNull() {
            addCriterion("select_value is not null");
            return (Criteria) this;
        }

        public Criteria andSelectValueEqualTo(Integer value) {
            addCriterion("select_value =", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotEqualTo(Integer value) {
            addCriterion("select_value <>", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueGreaterThan(Integer value) {
            addCriterion("select_value >", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("select_value >=", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueLessThan(Integer value) {
            addCriterion("select_value <", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueLessThanOrEqualTo(Integer value) {
            addCriterion("select_value <=", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueIn(List<Integer> values) {
            addCriterion("select_value in", values, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotIn(List<Integer> values) {
            addCriterion("select_value not in", values, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueBetween(Integer value1, Integer value2) {
            addCriterion("select_value between", value1, value2, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotBetween(Integer value1, Integer value2) {
            addCriterion("select_value not between", value1, value2, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyIsNull() {
            addCriterion("select_name_key is null");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyIsNotNull() {
            addCriterion("select_name_key is not null");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyEqualTo(String value) {
            addCriterion("select_name_key =", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyNotEqualTo(String value) {
            addCriterion("select_name_key <>", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyGreaterThan(String value) {
            addCriterion("select_name_key >", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyGreaterThanOrEqualTo(String value) {
            addCriterion("select_name_key >=", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyLessThan(String value) {
            addCriterion("select_name_key <", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyLessThanOrEqualTo(String value) {
            addCriterion("select_name_key <=", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyLike(String value) {
            addCriterion("select_name_key like", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyNotLike(String value) {
            addCriterion("select_name_key not like", value, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyIn(List<String> values) {
            addCriterion("select_name_key in", values, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyNotIn(List<String> values) {
            addCriterion("select_name_key not in", values, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyBetween(String value1, String value2) {
            addCriterion("select_name_key between", value1, value2, "selectNameKey");
            return (Criteria) this;
        }

        public Criteria andSelectNameKeyNotBetween(String value1, String value2) {
            addCriterion("select_name_key not between", value1, value2, "selectNameKey");
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