package com.idea.nursing.oldpeople.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicePeopleRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicePeopleRegisterExample() {
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

        public Criteria andServicePeopleIdIsNull() {
            addCriterion("service_people_id is null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdIsNotNull() {
            addCriterion("service_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdEqualTo(Long value) {
            addCriterion("service_people_id =", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdNotEqualTo(Long value) {
            addCriterion("service_people_id <>", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdGreaterThan(Long value) {
            addCriterion("service_people_id >", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_people_id >=", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdLessThan(Long value) {
            addCriterion("service_people_id <", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdLessThanOrEqualTo(Long value) {
            addCriterion("service_people_id <=", value, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdIn(List<Long> values) {
            addCriterion("service_people_id in", values, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdNotIn(List<Long> values) {
            addCriterion("service_people_id not in", values, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdBetween(Long value1, Long value2) {
            addCriterion("service_people_id between", value1, value2, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andServicePeopleIdNotBetween(Long value1, Long value2) {
            addCriterion("service_people_id not between", value1, value2, "servicePeopleId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNull() {
            addCriterion("identity_card is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNotNull() {
            addCriterion("identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEqualTo(String value) {
            addCriterion("identity_card =", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotEqualTo(String value) {
            addCriterion("identity_card <>", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThan(String value) {
            addCriterion("identity_card >", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card >=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThan(String value) {
            addCriterion("identity_card <", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("identity_card <=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLike(String value) {
            addCriterion("identity_card like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotLike(String value) {
            addCriterion("identity_card not like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIn(List<String> values) {
            addCriterion("identity_card in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotIn(List<String> values) {
            addCriterion("identity_card not in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBetween(String value1, String value2) {
            addCriterion("identity_card between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotBetween(String value1, String value2) {
            addCriterion("identity_card not between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andLiveConditionIsNull() {
            addCriterion("live_condition is null");
            return (Criteria) this;
        }

        public Criteria andLiveConditionIsNotNull() {
            addCriterion("live_condition is not null");
            return (Criteria) this;
        }

        public Criteria andLiveConditionEqualTo(String value) {
            addCriterion("live_condition =", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotEqualTo(String value) {
            addCriterion("live_condition <>", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionGreaterThan(String value) {
            addCriterion("live_condition >", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionGreaterThanOrEqualTo(String value) {
            addCriterion("live_condition >=", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionLessThan(String value) {
            addCriterion("live_condition <", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionLessThanOrEqualTo(String value) {
            addCriterion("live_condition <=", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionLike(String value) {
            addCriterion("live_condition like", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotLike(String value) {
            addCriterion("live_condition not like", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionIn(List<String> values) {
            addCriterion("live_condition in", values, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotIn(List<String> values) {
            addCriterion("live_condition not in", values, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionBetween(String value1, String value2) {
            addCriterion("live_condition between", value1, value2, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotBetween(String value1, String value2) {
            addCriterion("live_condition not between", value1, value2, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityIsNull() {
            addCriterion("self_care_ability is null");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityIsNotNull() {
            addCriterion("self_care_ability is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityEqualTo(String value) {
            addCriterion("self_care_ability =", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityNotEqualTo(String value) {
            addCriterion("self_care_ability <>", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityGreaterThan(String value) {
            addCriterion("self_care_ability >", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("self_care_ability >=", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityLessThan(String value) {
            addCriterion("self_care_ability <", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityLessThanOrEqualTo(String value) {
            addCriterion("self_care_ability <=", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityLike(String value) {
            addCriterion("self_care_ability like", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityNotLike(String value) {
            addCriterion("self_care_ability not like", value, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityIn(List<String> values) {
            addCriterion("self_care_ability in", values, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityNotIn(List<String> values) {
            addCriterion("self_care_ability not in", values, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityBetween(String value1, String value2) {
            addCriterion("self_care_ability between", value1, value2, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andSelfCareAbilityNotBetween(String value1, String value2) {
            addCriterion("self_care_ability not between", value1, value2, "selfCareAbility");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyIsNull() {
            addCriterion("personal_classify is null");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyIsNotNull() {
            addCriterion("personal_classify is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyEqualTo(String value) {
            addCriterion("personal_classify =", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyNotEqualTo(String value) {
            addCriterion("personal_classify <>", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyGreaterThan(String value) {
            addCriterion("personal_classify >", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("personal_classify >=", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyLessThan(String value) {
            addCriterion("personal_classify <", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyLessThanOrEqualTo(String value) {
            addCriterion("personal_classify <=", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyLike(String value) {
            addCriterion("personal_classify like", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyNotLike(String value) {
            addCriterion("personal_classify not like", value, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyIn(List<String> values) {
            addCriterion("personal_classify in", values, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyNotIn(List<String> values) {
            addCriterion("personal_classify not in", values, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyBetween(String value1, String value2) {
            addCriterion("personal_classify between", value1, value2, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPersonalClassifyNotBetween(String value1, String value2) {
            addCriterion("personal_classify not between", value1, value2, "personalClassify");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("politics_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("politics_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(String value) {
            addCriterion("politics_status =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(String value) {
            addCriterion("politics_status <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(String value) {
            addCriterion("politics_status >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("politics_status >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(String value) {
            addCriterion("politics_status <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("politics_status <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLike(String value) {
            addCriterion("politics_status like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotLike(String value) {
            addCriterion("politics_status not like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<String> values) {
            addCriterion("politics_status in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<String> values) {
            addCriterion("politics_status not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(String value1, String value2) {
            addCriterion("politics_status between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("politics_status not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIsNull() {
            addCriterion("culture_level is null");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIsNotNull() {
            addCriterion("culture_level is not null");
            return (Criteria) this;
        }

        public Criteria andCultureLevelEqualTo(String value) {
            addCriterion("culture_level =", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotEqualTo(String value) {
            addCriterion("culture_level <>", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelGreaterThan(String value) {
            addCriterion("culture_level >", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelGreaterThanOrEqualTo(String value) {
            addCriterion("culture_level >=", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLessThan(String value) {
            addCriterion("culture_level <", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLessThanOrEqualTo(String value) {
            addCriterion("culture_level <=", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLike(String value) {
            addCriterion("culture_level like", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotLike(String value) {
            addCriterion("culture_level not like", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIn(List<String> values) {
            addCriterion("culture_level in", values, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotIn(List<String> values) {
            addCriterion("culture_level not in", values, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelBetween(String value1, String value2) {
            addCriterion("culture_level between", value1, value2, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotBetween(String value1, String value2) {
            addCriterion("culture_level not between", value1, value2, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andMedicalWayIsNull() {
            addCriterion("medical_way is null");
            return (Criteria) this;
        }

        public Criteria andMedicalWayIsNotNull() {
            addCriterion("medical_way is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalWayEqualTo(String value) {
            addCriterion("medical_way =", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayNotEqualTo(String value) {
            addCriterion("medical_way <>", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayGreaterThan(String value) {
            addCriterion("medical_way >", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayGreaterThanOrEqualTo(String value) {
            addCriterion("medical_way >=", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayLessThan(String value) {
            addCriterion("medical_way <", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayLessThanOrEqualTo(String value) {
            addCriterion("medical_way <=", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayLike(String value) {
            addCriterion("medical_way like", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayNotLike(String value) {
            addCriterion("medical_way not like", value, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayIn(List<String> values) {
            addCriterion("medical_way in", values, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayNotIn(List<String> values) {
            addCriterion("medical_way not in", values, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayBetween(String value1, String value2) {
            addCriterion("medical_way between", value1, value2, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMedicalWayNotBetween(String value1, String value2) {
            addCriterion("medical_way not between", value1, value2, "medicalWay");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNull() {
            addCriterion("month_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNotNull() {
            addCriterion("month_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeEqualTo(String value) {
            addCriterion("month_income =", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotEqualTo(String value) {
            addCriterion("month_income <>", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThan(String value) {
            addCriterion("month_income >", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("month_income >=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThan(String value) {
            addCriterion("month_income <", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThanOrEqualTo(String value) {
            addCriterion("month_income <=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLike(String value) {
            addCriterion("month_income like", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotLike(String value) {
            addCriterion("month_income not like", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIn(List<String> values) {
            addCriterion("month_income in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotIn(List<String> values) {
            addCriterion("month_income not in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeBetween(String value1, String value2) {
            addCriterion("month_income between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotBetween(String value1, String value2) {
            addCriterion("month_income not between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNull() {
            addCriterion("marriage_status is null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNotNull() {
            addCriterion("marriage_status is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusEqualTo(String value) {
            addCriterion("marriage_status =", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotEqualTo(String value) {
            addCriterion("marriage_status <>", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThan(String value) {
            addCriterion("marriage_status >", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_status >=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThan(String value) {
            addCriterion("marriage_status <", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThanOrEqualTo(String value) {
            addCriterion("marriage_status <=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLike(String value) {
            addCriterion("marriage_status like", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotLike(String value) {
            addCriterion("marriage_status not like", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIn(List<String> values) {
            addCriterion("marriage_status in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotIn(List<String> values) {
            addCriterion("marriage_status not in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusBetween(String value1, String value2) {
            addCriterion("marriage_status between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotBetween(String value1, String value2) {
            addCriterion("marriage_status not between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andFaithIsNull() {
            addCriterion("faith is null");
            return (Criteria) this;
        }

        public Criteria andFaithIsNotNull() {
            addCriterion("faith is not null");
            return (Criteria) this;
        }

        public Criteria andFaithEqualTo(String value) {
            addCriterion("faith =", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotEqualTo(String value) {
            addCriterion("faith <>", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithGreaterThan(String value) {
            addCriterion("faith >", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithGreaterThanOrEqualTo(String value) {
            addCriterion("faith >=", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithLessThan(String value) {
            addCriterion("faith <", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithLessThanOrEqualTo(String value) {
            addCriterion("faith <=", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithLike(String value) {
            addCriterion("faith like", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotLike(String value) {
            addCriterion("faith not like", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithIn(List<String> values) {
            addCriterion("faith in", values, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotIn(List<String> values) {
            addCriterion("faith not in", values, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithBetween(String value1, String value2) {
            addCriterion("faith between", value1, value2, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotBetween(String value1, String value2) {
            addCriterion("faith not between", value1, value2, "faith");
            return (Criteria) this;
        }

        public Criteria andCall1NameIsNull() {
            addCriterion("call1_name is null");
            return (Criteria) this;
        }

        public Criteria andCall1NameIsNotNull() {
            addCriterion("call1_name is not null");
            return (Criteria) this;
        }

        public Criteria andCall1NameEqualTo(String value) {
            addCriterion("call1_name =", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameNotEqualTo(String value) {
            addCriterion("call1_name <>", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameGreaterThan(String value) {
            addCriterion("call1_name >", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameGreaterThanOrEqualTo(String value) {
            addCriterion("call1_name >=", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameLessThan(String value) {
            addCriterion("call1_name <", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameLessThanOrEqualTo(String value) {
            addCriterion("call1_name <=", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameLike(String value) {
            addCriterion("call1_name like", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameNotLike(String value) {
            addCriterion("call1_name not like", value, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameIn(List<String> values) {
            addCriterion("call1_name in", values, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameNotIn(List<String> values) {
            addCriterion("call1_name not in", values, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameBetween(String value1, String value2) {
            addCriterion("call1_name between", value1, value2, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1NameNotBetween(String value1, String value2) {
            addCriterion("call1_name not between", value1, value2, "call1Name");
            return (Criteria) this;
        }

        public Criteria andCall1OldIsNull() {
            addCriterion("call1_old is null");
            return (Criteria) this;
        }

        public Criteria andCall1OldIsNotNull() {
            addCriterion("call1_old is not null");
            return (Criteria) this;
        }

        public Criteria andCall1OldEqualTo(String value) {
            addCriterion("call1_old =", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldNotEqualTo(String value) {
            addCriterion("call1_old <>", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldGreaterThan(String value) {
            addCriterion("call1_old >", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldGreaterThanOrEqualTo(String value) {
            addCriterion("call1_old >=", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldLessThan(String value) {
            addCriterion("call1_old <", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldLessThanOrEqualTo(String value) {
            addCriterion("call1_old <=", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldLike(String value) {
            addCriterion("call1_old like", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldNotLike(String value) {
            addCriterion("call1_old not like", value, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldIn(List<String> values) {
            addCriterion("call1_old in", values, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldNotIn(List<String> values) {
            addCriterion("call1_old not in", values, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldBetween(String value1, String value2) {
            addCriterion("call1_old between", value1, value2, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1OldNotBetween(String value1, String value2) {
            addCriterion("call1_old not between", value1, value2, "call1Old");
            return (Criteria) this;
        }

        public Criteria andCall1IsNull() {
            addCriterion("call1 is null");
            return (Criteria) this;
        }

        public Criteria andCall1IsNotNull() {
            addCriterion("call1 is not null");
            return (Criteria) this;
        }

        public Criteria andCall1EqualTo(String value) {
            addCriterion("call1 =", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1NotEqualTo(String value) {
            addCriterion("call1 <>", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1GreaterThan(String value) {
            addCriterion("call1 >", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1GreaterThanOrEqualTo(String value) {
            addCriterion("call1 >=", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1LessThan(String value) {
            addCriterion("call1 <", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1LessThanOrEqualTo(String value) {
            addCriterion("call1 <=", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1Like(String value) {
            addCriterion("call1 like", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1NotLike(String value) {
            addCriterion("call1 not like", value, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1In(List<String> values) {
            addCriterion("call1 in", values, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1NotIn(List<String> values) {
            addCriterion("call1 not in", values, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1Between(String value1, String value2) {
            addCriterion("call1 between", value1, value2, "call1");
            return (Criteria) this;
        }

        public Criteria andCall1NotBetween(String value1, String value2) {
            addCriterion("call1 not between", value1, value2, "call1");
            return (Criteria) this;
        }

        public Criteria andCall2NameIsNull() {
            addCriterion("call2_name is null");
            return (Criteria) this;
        }

        public Criteria andCall2NameIsNotNull() {
            addCriterion("call2_name is not null");
            return (Criteria) this;
        }

        public Criteria andCall2NameEqualTo(String value) {
            addCriterion("call2_name =", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameNotEqualTo(String value) {
            addCriterion("call2_name <>", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameGreaterThan(String value) {
            addCriterion("call2_name >", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameGreaterThanOrEqualTo(String value) {
            addCriterion("call2_name >=", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameLessThan(String value) {
            addCriterion("call2_name <", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameLessThanOrEqualTo(String value) {
            addCriterion("call2_name <=", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameLike(String value) {
            addCriterion("call2_name like", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameNotLike(String value) {
            addCriterion("call2_name not like", value, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameIn(List<String> values) {
            addCriterion("call2_name in", values, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameNotIn(List<String> values) {
            addCriterion("call2_name not in", values, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameBetween(String value1, String value2) {
            addCriterion("call2_name between", value1, value2, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2NameNotBetween(String value1, String value2) {
            addCriterion("call2_name not between", value1, value2, "call2Name");
            return (Criteria) this;
        }

        public Criteria andCall2OldIsNull() {
            addCriterion("call2_old is null");
            return (Criteria) this;
        }

        public Criteria andCall2OldIsNotNull() {
            addCriterion("call2_old is not null");
            return (Criteria) this;
        }

        public Criteria andCall2OldEqualTo(String value) {
            addCriterion("call2_old =", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldNotEqualTo(String value) {
            addCriterion("call2_old <>", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldGreaterThan(String value) {
            addCriterion("call2_old >", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldGreaterThanOrEqualTo(String value) {
            addCriterion("call2_old >=", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldLessThan(String value) {
            addCriterion("call2_old <", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldLessThanOrEqualTo(String value) {
            addCriterion("call2_old <=", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldLike(String value) {
            addCriterion("call2_old like", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldNotLike(String value) {
            addCriterion("call2_old not like", value, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldIn(List<String> values) {
            addCriterion("call2_old in", values, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldNotIn(List<String> values) {
            addCriterion("call2_old not in", values, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldBetween(String value1, String value2) {
            addCriterion("call2_old between", value1, value2, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2OldNotBetween(String value1, String value2) {
            addCriterion("call2_old not between", value1, value2, "call2Old");
            return (Criteria) this;
        }

        public Criteria andCall2IsNull() {
            addCriterion("call2 is null");
            return (Criteria) this;
        }

        public Criteria andCall2IsNotNull() {
            addCriterion("call2 is not null");
            return (Criteria) this;
        }

        public Criteria andCall2EqualTo(String value) {
            addCriterion("call2 =", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2NotEqualTo(String value) {
            addCriterion("call2 <>", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2GreaterThan(String value) {
            addCriterion("call2 >", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2GreaterThanOrEqualTo(String value) {
            addCriterion("call2 >=", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2LessThan(String value) {
            addCriterion("call2 <", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2LessThanOrEqualTo(String value) {
            addCriterion("call2 <=", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2Like(String value) {
            addCriterion("call2 like", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2NotLike(String value) {
            addCriterion("call2 not like", value, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2In(List<String> values) {
            addCriterion("call2 in", values, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2NotIn(List<String> values) {
            addCriterion("call2 not in", values, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2Between(String value1, String value2) {
            addCriterion("call2 between", value1, value2, "call2");
            return (Criteria) this;
        }

        public Criteria andCall2NotBetween(String value1, String value2) {
            addCriterion("call2 not between", value1, value2, "call2");
            return (Criteria) this;
        }

        public Criteria andChildAllIsNull() {
            addCriterion("child_all is null");
            return (Criteria) this;
        }

        public Criteria andChildAllIsNotNull() {
            addCriterion("child_all is not null");
            return (Criteria) this;
        }

        public Criteria andChildAllEqualTo(String value) {
            addCriterion("child_all =", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllNotEqualTo(String value) {
            addCriterion("child_all <>", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllGreaterThan(String value) {
            addCriterion("child_all >", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllGreaterThanOrEqualTo(String value) {
            addCriterion("child_all >=", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllLessThan(String value) {
            addCriterion("child_all <", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllLessThanOrEqualTo(String value) {
            addCriterion("child_all <=", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllLike(String value) {
            addCriterion("child_all like", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllNotLike(String value) {
            addCriterion("child_all not like", value, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllIn(List<String> values) {
            addCriterion("child_all in", values, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllNotIn(List<String> values) {
            addCriterion("child_all not in", values, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllBetween(String value1, String value2) {
            addCriterion("child_all between", value1, value2, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildAllNotBetween(String value1, String value2) {
            addCriterion("child_all not between", value1, value2, "childAll");
            return (Criteria) this;
        }

        public Criteria andChildBoyIsNull() {
            addCriterion("child_boy is null");
            return (Criteria) this;
        }

        public Criteria andChildBoyIsNotNull() {
            addCriterion("child_boy is not null");
            return (Criteria) this;
        }

        public Criteria andChildBoyEqualTo(String value) {
            addCriterion("child_boy =", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyNotEqualTo(String value) {
            addCriterion("child_boy <>", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyGreaterThan(String value) {
            addCriterion("child_boy >", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyGreaterThanOrEqualTo(String value) {
            addCriterion("child_boy >=", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyLessThan(String value) {
            addCriterion("child_boy <", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyLessThanOrEqualTo(String value) {
            addCriterion("child_boy <=", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyLike(String value) {
            addCriterion("child_boy like", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyNotLike(String value) {
            addCriterion("child_boy not like", value, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyIn(List<String> values) {
            addCriterion("child_boy in", values, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyNotIn(List<String> values) {
            addCriterion("child_boy not in", values, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyBetween(String value1, String value2) {
            addCriterion("child_boy between", value1, value2, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildBoyNotBetween(String value1, String value2) {
            addCriterion("child_boy not between", value1, value2, "childBoy");
            return (Criteria) this;
        }

        public Criteria andChildGirlIsNull() {
            addCriterion("child_girl is null");
            return (Criteria) this;
        }

        public Criteria andChildGirlIsNotNull() {
            addCriterion("child_girl is not null");
            return (Criteria) this;
        }

        public Criteria andChildGirlEqualTo(String value) {
            addCriterion("child_girl =", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlNotEqualTo(String value) {
            addCriterion("child_girl <>", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlGreaterThan(String value) {
            addCriterion("child_girl >", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlGreaterThanOrEqualTo(String value) {
            addCriterion("child_girl >=", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlLessThan(String value) {
            addCriterion("child_girl <", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlLessThanOrEqualTo(String value) {
            addCriterion("child_girl <=", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlLike(String value) {
            addCriterion("child_girl like", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlNotLike(String value) {
            addCriterion("child_girl not like", value, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlIn(List<String> values) {
            addCriterion("child_girl in", values, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlNotIn(List<String> values) {
            addCriterion("child_girl not in", values, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlBetween(String value1, String value2) {
            addCriterion("child_girl between", value1, value2, "childGirl");
            return (Criteria) this;
        }

        public Criteria andChildGirlNotBetween(String value1, String value2) {
            addCriterion("child_girl not between", value1, value2, "childGirl");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardIsNull() {
            addCriterion("home_old_card is null");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardIsNotNull() {
            addCriterion("home_old_card is not null");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardEqualTo(String value) {
            addCriterion("home_old_card =", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardNotEqualTo(String value) {
            addCriterion("home_old_card <>", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardGreaterThan(String value) {
            addCriterion("home_old_card >", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardGreaterThanOrEqualTo(String value) {
            addCriterion("home_old_card >=", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardLessThan(String value) {
            addCriterion("home_old_card <", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardLessThanOrEqualTo(String value) {
            addCriterion("home_old_card <=", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardLike(String value) {
            addCriterion("home_old_card like", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardNotLike(String value) {
            addCriterion("home_old_card not like", value, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardIn(List<String> values) {
            addCriterion("home_old_card in", values, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardNotIn(List<String> values) {
            addCriterion("home_old_card not in", values, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardBetween(String value1, String value2) {
            addCriterion("home_old_card between", value1, value2, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andHomeOldCardNotBetween(String value1, String value2) {
            addCriterion("home_old_card not between", value1, value2, "homeOldCard");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNull() {
            addCriterion("work_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("work_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("work_name =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("work_name <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("work_name >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_name >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("work_name <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("work_name <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("work_name like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("work_name not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("work_name in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("work_name not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("work_name between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("work_name not between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleIsNull() {
            addCriterion("check_people is null");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleIsNotNull() {
            addCriterion("check_people is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleEqualTo(String value) {
            addCriterion("check_people =", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleNotEqualTo(String value) {
            addCriterion("check_people <>", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleGreaterThan(String value) {
            addCriterion("check_people >", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("check_people >=", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleLessThan(String value) {
            addCriterion("check_people <", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleLessThanOrEqualTo(String value) {
            addCriterion("check_people <=", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleLike(String value) {
            addCriterion("check_people like", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleNotLike(String value) {
            addCriterion("check_people not like", value, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleIn(List<String> values) {
            addCriterion("check_people in", values, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleNotIn(List<String> values) {
            addCriterion("check_people not in", values, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleBetween(String value1, String value2) {
            addCriterion("check_people between", value1, value2, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckPeopleNotBetween(String value1, String value2) {
            addCriterion("check_people not between", value1, value2, "checkPeople");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(String value) {
            addCriterion("check_date =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(String value) {
            addCriterion("check_date <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(String value) {
            addCriterion("check_date >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(String value) {
            addCriterion("check_date >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(String value) {
            addCriterion("check_date <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(String value) {
            addCriterion("check_date <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLike(String value) {
            addCriterion("check_date like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotLike(String value) {
            addCriterion("check_date not like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<String> values) {
            addCriterion("check_date in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<String> values) {
            addCriterion("check_date not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(String value1, String value2) {
            addCriterion("check_date between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(String value1, String value2) {
            addCriterion("check_date not between", value1, value2, "checkDate");
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