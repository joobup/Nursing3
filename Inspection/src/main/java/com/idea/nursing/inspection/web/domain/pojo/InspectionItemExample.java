package com.idea.nursing.inspection.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class InspectionItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectionItemExample() {
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

        public Criteria andInspectionItemNameIsNull() {
            addCriterion("inspection_item_name is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameIsNotNull() {
            addCriterion("inspection_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameEqualTo(String value) {
            addCriterion("inspection_item_name =", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameNotEqualTo(String value) {
            addCriterion("inspection_item_name <>", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameGreaterThan(String value) {
            addCriterion("inspection_item_name >", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_item_name >=", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameLessThan(String value) {
            addCriterion("inspection_item_name <", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameLessThanOrEqualTo(String value) {
            addCriterion("inspection_item_name <=", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameLike(String value) {
            addCriterion("inspection_item_name like", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameNotLike(String value) {
            addCriterion("inspection_item_name not like", value, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameIn(List<String> values) {
            addCriterion("inspection_item_name in", values, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameNotIn(List<String> values) {
            addCriterion("inspection_item_name not in", values, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameBetween(String value1, String value2) {
            addCriterion("inspection_item_name between", value1, value2, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameNotBetween(String value1, String value2) {
            addCriterion("inspection_item_name not between", value1, value2, "inspectionItemName");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitIsNull() {
            addCriterion("normal_value_upper_limit is null");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitIsNotNull() {
            addCriterion("normal_value_upper_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitEqualTo(Integer value) {
            addCriterion("normal_value_upper_limit =", value, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitNotEqualTo(Integer value) {
            addCriterion("normal_value_upper_limit <>", value, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitGreaterThan(Integer value) {
            addCriterion("normal_value_upper_limit >", value, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("normal_value_upper_limit >=", value, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitLessThan(Integer value) {
            addCriterion("normal_value_upper_limit <", value, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitLessThanOrEqualTo(Integer value) {
            addCriterion("normal_value_upper_limit <=", value, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitIn(List<Integer> values) {
            addCriterion("normal_value_upper_limit in", values, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitNotIn(List<Integer> values) {
            addCriterion("normal_value_upper_limit not in", values, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitBetween(Integer value1, Integer value2) {
            addCriterion("normal_value_upper_limit between", value1, value2, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("normal_value_upper_limit not between", value1, value2, "normalValueUpperLimit");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorIsNull() {
            addCriterion("normal_value_upper_floor is null");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorIsNotNull() {
            addCriterion("normal_value_upper_floor is not null");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorEqualTo(Integer value) {
            addCriterion("normal_value_upper_floor =", value, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorNotEqualTo(Integer value) {
            addCriterion("normal_value_upper_floor <>", value, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorGreaterThan(Integer value) {
            addCriterion("normal_value_upper_floor >", value, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("normal_value_upper_floor >=", value, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorLessThan(Integer value) {
            addCriterion("normal_value_upper_floor <", value, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorLessThanOrEqualTo(Integer value) {
            addCriterion("normal_value_upper_floor <=", value, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorIn(List<Integer> values) {
            addCriterion("normal_value_upper_floor in", values, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorNotIn(List<Integer> values) {
            addCriterion("normal_value_upper_floor not in", values, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorBetween(Integer value1, Integer value2) {
            addCriterion("normal_value_upper_floor between", value1, value2, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andNormalValueUpperFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("normal_value_upper_floor not between", value1, value2, "normalValueUpperFloor");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeIsNull() {
            addCriterion("inspection_item_value_type is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeIsNotNull() {
            addCriterion("inspection_item_value_type is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeEqualTo(Byte value) {
            addCriterion("inspection_item_value_type =", value, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeNotEqualTo(Byte value) {
            addCriterion("inspection_item_value_type <>", value, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeGreaterThan(Byte value) {
            addCriterion("inspection_item_value_type >", value, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("inspection_item_value_type >=", value, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeLessThan(Byte value) {
            addCriterion("inspection_item_value_type <", value, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeLessThanOrEqualTo(Byte value) {
            addCriterion("inspection_item_value_type <=", value, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeIn(List<Byte> values) {
            addCriterion("inspection_item_value_type in", values, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeNotIn(List<Byte> values) {
            addCriterion("inspection_item_value_type not in", values, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeBetween(Byte value1, Byte value2) {
            addCriterion("inspection_item_value_type between", value1, value2, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andInspectionItemValueTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("inspection_item_value_type not between", value1, value2, "inspectionItemValueType");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyIsNull() {
            addCriterion("inspection_item_name_key is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyIsNotNull() {
            addCriterion("inspection_item_name_key is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyEqualTo(String value) {
            addCriterion("inspection_item_name_key =", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyNotEqualTo(String value) {
            addCriterion("inspection_item_name_key <>", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyGreaterThan(String value) {
            addCriterion("inspection_item_name_key >", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_item_name_key >=", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyLessThan(String value) {
            addCriterion("inspection_item_name_key <", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyLessThanOrEqualTo(String value) {
            addCriterion("inspection_item_name_key <=", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyLike(String value) {
            addCriterion("inspection_item_name_key like", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyNotLike(String value) {
            addCriterion("inspection_item_name_key not like", value, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyIn(List<String> values) {
            addCriterion("inspection_item_name_key in", values, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyNotIn(List<String> values) {
            addCriterion("inspection_item_name_key not in", values, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyBetween(String value1, String value2) {
            addCriterion("inspection_item_name_key between", value1, value2, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemNameKeyNotBetween(String value1, String value2) {
            addCriterion("inspection_item_name_key not between", value1, value2, "inspectionItemNameKey");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeIsNull() {
            addCriterion("inspection_item_describe is null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeIsNotNull() {
            addCriterion("inspection_item_describe is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeEqualTo(String value) {
            addCriterion("inspection_item_describe =", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeNotEqualTo(String value) {
            addCriterion("inspection_item_describe <>", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeGreaterThan(String value) {
            addCriterion("inspection_item_describe >", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_item_describe >=", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeLessThan(String value) {
            addCriterion("inspection_item_describe <", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeLessThanOrEqualTo(String value) {
            addCriterion("inspection_item_describe <=", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeLike(String value) {
            addCriterion("inspection_item_describe like", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeNotLike(String value) {
            addCriterion("inspection_item_describe not like", value, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeIn(List<String> values) {
            addCriterion("inspection_item_describe in", values, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeNotIn(List<String> values) {
            addCriterion("inspection_item_describe not in", values, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeBetween(String value1, String value2) {
            addCriterion("inspection_item_describe between", value1, value2, "inspectionItemDescribe");
            return (Criteria) this;
        }

        public Criteria andInspectionItemDescribeNotBetween(String value1, String value2) {
            addCriterion("inspection_item_describe not between", value1, value2, "inspectionItemDescribe");
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