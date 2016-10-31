package com.idea.nursing.inspection.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class InspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionExample() {
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

        public Criteria andInspectionNameIsNull() {
            addCriterion("inspection_name is null");
            return (Criteria) this;
        }

        public Criteria andInspectionNameIsNotNull() {
            addCriterion("inspection_name is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionNameEqualTo(String value) {
            addCriterion("inspection_name =", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameNotEqualTo(String value) {
            addCriterion("inspection_name <>", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameGreaterThan(String value) {
            addCriterion("inspection_name >", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_name >=", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameLessThan(String value) {
            addCriterion("inspection_name <", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameLessThanOrEqualTo(String value) {
            addCriterion("inspection_name <=", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameLike(String value) {
            addCriterion("inspection_name like", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameNotLike(String value) {
            addCriterion("inspection_name not like", value, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameIn(List<String> values) {
            addCriterion("inspection_name in", values, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameNotIn(List<String> values) {
            addCriterion("inspection_name not in", values, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameBetween(String value1, String value2) {
            addCriterion("inspection_name between", value1, value2, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionNameNotBetween(String value1, String value2) {
            addCriterion("inspection_name not between", value1, value2, "inspectionName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListIsNull() {
            addCriterion("inspection_item_list is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListIsNotNull() {
            addCriterion("inspection_item_list is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListEqualTo(String value) {
            addCriterion("inspection_item_list =", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListNotEqualTo(String value) {
            addCriterion("inspection_item_list <>", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListGreaterThan(String value) {
            addCriterion("inspection_item_list >", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_item_list >=", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListLessThan(String value) {
            addCriterion("inspection_item_list <", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListLessThanOrEqualTo(String value) {
            addCriterion("inspection_item_list <=", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListLike(String value) {
            addCriterion("inspection_item_list like", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListNotLike(String value) {
            addCriterion("inspection_item_list not like", value, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListIn(List<String> values) {
            addCriterion("inspection_item_list in", values, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListNotIn(List<String> values) {
            addCriterion("inspection_item_list not in", values, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListBetween(String value1, String value2) {
            addCriterion("inspection_item_list between", value1, value2, "inspectionItemList");
            return (Criteria) this;
        }

        public Criteria andInspectionItemListNotBetween(String value1, String value2) {
            addCriterion("inspection_item_list not between", value1, value2, "inspectionItemList");
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