package com.idea.nursing.oldpeople.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServicePeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicePeopleExample() {
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

        public Criteria andServicePeopleNameIsNull() {
            addCriterion("service_people_name is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameIsNotNull() {
            addCriterion("service_people_name is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameEqualTo(String value) {
            addCriterion("service_people_name =", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameNotEqualTo(String value) {
            addCriterion("service_people_name <>", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameGreaterThan(String value) {
            addCriterion("service_people_name >", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_people_name >=", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameLessThan(String value) {
            addCriterion("service_people_name <", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameLessThanOrEqualTo(String value) {
            addCriterion("service_people_name <=", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameLike(String value) {
            addCriterion("service_people_name like", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameNotLike(String value) {
            addCriterion("service_people_name not like", value, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameIn(List<String> values) {
            addCriterion("service_people_name in", values, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameNotIn(List<String> values) {
            addCriterion("service_people_name not in", values, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameBetween(String value1, String value2) {
            addCriterion("service_people_name between", value1, value2, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleNameNotBetween(String value1, String value2) {
            addCriterion("service_people_name not between", value1, value2, "servicePeopleName");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeIsNull() {
            addCriterion("service_people_age is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeIsNotNull() {
            addCriterion("service_people_age is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeEqualTo(Byte value) {
            addCriterion("service_people_age =", value, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeNotEqualTo(Byte value) {
            addCriterion("service_people_age <>", value, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeGreaterThan(Byte value) {
            addCriterion("service_people_age >", value, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("service_people_age >=", value, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeLessThan(Byte value) {
            addCriterion("service_people_age <", value, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeLessThanOrEqualTo(Byte value) {
            addCriterion("service_people_age <=", value, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeIn(List<Byte> values) {
            addCriterion("service_people_age in", values, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeNotIn(List<Byte> values) {
            addCriterion("service_people_age not in", values, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeBetween(Byte value1, Byte value2) {
            addCriterion("service_people_age between", value1, value2, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("service_people_age not between", value1, value2, "servicePeopleAge");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexIsNull() {
            addCriterion("service_people_sex is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexIsNotNull() {
            addCriterion("service_people_sex is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexEqualTo(Byte value) {
            addCriterion("service_people_sex =", value, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexNotEqualTo(Byte value) {
            addCriterion("service_people_sex <>", value, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexGreaterThan(Byte value) {
            addCriterion("service_people_sex >", value, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("service_people_sex >=", value, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexLessThan(Byte value) {
            addCriterion("service_people_sex <", value, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexLessThanOrEqualTo(Byte value) {
            addCriterion("service_people_sex <=", value, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexIn(List<Byte> values) {
            addCriterion("service_people_sex in", values, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexNotIn(List<Byte> values) {
            addCriterion("service_people_sex not in", values, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexBetween(Byte value1, Byte value2) {
            addCriterion("service_people_sex between", value1, value2, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleSexNotBetween(Byte value1, Byte value2) {
            addCriterion("service_people_sex not between", value1, value2, "servicePeopleSex");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationIsNull() {
            addCriterion("service_people_relation is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationIsNotNull() {
            addCriterion("service_people_relation is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationEqualTo(Byte value) {
            addCriterion("service_people_relation =", value, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationNotEqualTo(Byte value) {
            addCriterion("service_people_relation <>", value, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationGreaterThan(Byte value) {
            addCriterion("service_people_relation >", value, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationGreaterThanOrEqualTo(Byte value) {
            addCriterion("service_people_relation >=", value, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationLessThan(Byte value) {
            addCriterion("service_people_relation <", value, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationLessThanOrEqualTo(Byte value) {
            addCriterion("service_people_relation <=", value, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationIn(List<Byte> values) {
            addCriterion("service_people_relation in", values, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationNotIn(List<Byte> values) {
            addCriterion("service_people_relation not in", values, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationBetween(Byte value1, Byte value2) {
            addCriterion("service_people_relation between", value1, value2, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeopleRelationNotBetween(Byte value1, Byte value2) {
            addCriterion("service_people_relation not between", value1, value2, "servicePeopleRelation");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureIsNull() {
            addCriterion("service_people_picture is null");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureIsNotNull() {
            addCriterion("service_people_picture is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureEqualTo(Long value) {
            addCriterion("service_people_picture =", value, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureNotEqualTo(Long value) {
            addCriterion("service_people_picture <>", value, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureGreaterThan(Long value) {
            addCriterion("service_people_picture >", value, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureGreaterThanOrEqualTo(Long value) {
            addCriterion("service_people_picture >=", value, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureLessThan(Long value) {
            addCriterion("service_people_picture <", value, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureLessThanOrEqualTo(Long value) {
            addCriterion("service_people_picture <=", value, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureIn(List<Long> values) {
            addCriterion("service_people_picture in", values, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureNotIn(List<Long> values) {
            addCriterion("service_people_picture not in", values, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureBetween(Long value1, Long value2) {
            addCriterion("service_people_picture between", value1, value2, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeoplePictureNotBetween(Long value1, Long value2) {
            addCriterion("service_people_picture not between", value1, value2, "servicePeoplePicture");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionIsNull() {
            addCriterion("service_people_attention is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionIsNotNull() {
            addCriterion("service_people_attention is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionEqualTo(String value) {
            addCriterion("service_people_attention =", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionNotEqualTo(String value) {
            addCriterion("service_people_attention <>", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionGreaterThan(String value) {
            addCriterion("service_people_attention >", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("service_people_attention >=", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionLessThan(String value) {
            addCriterion("service_people_attention <", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionLessThanOrEqualTo(String value) {
            addCriterion("service_people_attention <=", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionLike(String value) {
            addCriterion("service_people_attention like", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionNotLike(String value) {
            addCriterion("service_people_attention not like", value, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionIn(List<String> values) {
            addCriterion("service_people_attention in", values, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionNotIn(List<String> values) {
            addCriterion("service_people_attention not in", values, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionBetween(String value1, String value2) {
            addCriterion("service_people_attention between", value1, value2, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andServicePeopleAttentionNotBetween(String value1, String value2) {
            addCriterion("service_people_attention not between", value1, value2, "servicePeopleAttention");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelIsNull() {
            addCriterion("service_people_tel is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelIsNotNull() {
            addCriterion("service_people_tel is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelEqualTo(String value) {
            addCriterion("service_people_tel =", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelNotEqualTo(String value) {
            addCriterion("service_people_tel <>", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelGreaterThan(String value) {
            addCriterion("service_people_tel >", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelGreaterThanOrEqualTo(String value) {
            addCriterion("service_people_tel >=", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelLessThan(String value) {
            addCriterion("service_people_tel <", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelLessThanOrEqualTo(String value) {
            addCriterion("service_people_tel <=", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelLike(String value) {
            addCriterion("service_people_tel like", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelNotLike(String value) {
            addCriterion("service_people_tel not like", value, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelIn(List<String> values) {
            addCriterion("service_people_tel in", values, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelNotIn(List<String> values) {
            addCriterion("service_people_tel not in", values, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelBetween(String value1, String value2) {
            addCriterion("service_people_tel between", value1, value2, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTelNotBetween(String value1, String value2) {
            addCriterion("service_people_tel not between", value1, value2, "servicePeopleTel");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdIsNull() {
            addCriterion("service_people_state_id is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdIsNotNull() {
            addCriterion("service_people_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdEqualTo(Long value) {
            addCriterion("service_people_state_id =", value, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdNotEqualTo(Long value) {
            addCriterion("service_people_state_id <>", value, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdGreaterThan(Long value) {
            addCriterion("service_people_state_id >", value, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_people_state_id >=", value, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdLessThan(Long value) {
            addCriterion("service_people_state_id <", value, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdLessThanOrEqualTo(Long value) {
            addCriterion("service_people_state_id <=", value, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdIn(List<Long> values) {
            addCriterion("service_people_state_id in", values, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdNotIn(List<Long> values) {
            addCriterion("service_people_state_id not in", values, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdBetween(Long value1, Long value2) {
            addCriterion("service_people_state_id between", value1, value2, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleStateIdNotBetween(Long value1, Long value2) {
            addCriterion("service_people_state_id not between", value1, value2, "servicePeopleStateId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdIsNull() {
            addCriterion("service_people_type_id is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdIsNotNull() {
            addCriterion("service_people_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdEqualTo(Long value) {
            addCriterion("service_people_type_id =", value, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdNotEqualTo(Long value) {
            addCriterion("service_people_type_id <>", value, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdGreaterThan(Long value) {
            addCriterion("service_people_type_id >", value, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_people_type_id >=", value, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdLessThan(Long value) {
            addCriterion("service_people_type_id <", value, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("service_people_type_id <=", value, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdIn(List<Long> values) {
            addCriterion("service_people_type_id in", values, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdNotIn(List<Long> values) {
            addCriterion("service_people_type_id not in", values, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdBetween(Long value1, Long value2) {
            addCriterion("service_people_type_id between", value1, value2, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("service_people_type_id not between", value1, value2, "servicePeopleTypeId");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveIsNull() {
            addCriterion("nursing_leave is null");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveIsNotNull() {
            addCriterion("nursing_leave is not null");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveEqualTo(Long value) {
            addCriterion("nursing_leave =", value, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveNotEqualTo(Long value) {
            addCriterion("nursing_leave <>", value, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveGreaterThan(Long value) {
            addCriterion("nursing_leave >", value, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveGreaterThanOrEqualTo(Long value) {
            addCriterion("nursing_leave >=", value, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveLessThan(Long value) {
            addCriterion("nursing_leave <", value, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveLessThanOrEqualTo(Long value) {
            addCriterion("nursing_leave <=", value, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveIn(List<Long> values) {
            addCriterion("nursing_leave in", values, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveNotIn(List<Long> values) {
            addCriterion("nursing_leave not in", values, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveBetween(Long value1, Long value2) {
            addCriterion("nursing_leave between", value1, value2, "nursingLeave");
            return (Criteria) this;
        }

        public Criteria andNursingLeaveNotBetween(Long value1, Long value2) {
            addCriterion("nursing_leave not between", value1, value2, "nursingLeave");
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