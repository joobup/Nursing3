package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceStaffExample() {
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

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(Byte value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(Byte value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(Byte value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(Byte value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(Byte value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<Byte> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<Byte> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(Byte value1, Byte value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(Byte value1, Byte value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffPostIsNull() {
            addCriterion("staff_post is null");
            return (Criteria) this;
        }

        public Criteria andStaffPostIsNotNull() {
            addCriterion("staff_post is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPostEqualTo(Long value) {
            addCriterion("staff_post =", value, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostNotEqualTo(Long value) {
            addCriterion("staff_post <>", value, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostGreaterThan(Long value) {
            addCriterion("staff_post >", value, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_post >=", value, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostLessThan(Long value) {
            addCriterion("staff_post <", value, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostLessThanOrEqualTo(Long value) {
            addCriterion("staff_post <=", value, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostIn(List<Long> values) {
            addCriterion("staff_post in", values, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostNotIn(List<Long> values) {
            addCriterion("staff_post not in", values, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostBetween(Long value1, Long value2) {
            addCriterion("staff_post between", value1, value2, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffPostNotBetween(Long value1, Long value2) {
            addCriterion("staff_post not between", value1, value2, "staffPost");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelIsNull() {
            addCriterion("staff_skill_level is null");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelIsNotNull() {
            addCriterion("staff_skill_level is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelEqualTo(String value) {
            addCriterion("staff_skill_level =", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelNotEqualTo(String value) {
            addCriterion("staff_skill_level <>", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelGreaterThan(String value) {
            addCriterion("staff_skill_level >", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_skill_level >=", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelLessThan(String value) {
            addCriterion("staff_skill_level <", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelLessThanOrEqualTo(String value) {
            addCriterion("staff_skill_level <=", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelLike(String value) {
            addCriterion("staff_skill_level like", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelNotLike(String value) {
            addCriterion("staff_skill_level not like", value, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelIn(List<String> values) {
            addCriterion("staff_skill_level in", values, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelNotIn(List<String> values) {
            addCriterion("staff_skill_level not in", values, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelBetween(String value1, String value2) {
            addCriterion("staff_skill_level between", value1, value2, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffSkillLevelNotBetween(String value1, String value2) {
            addCriterion("staff_skill_level not between", value1, value2, "staffSkillLevel");
            return (Criteria) this;
        }

        public Criteria andStaffPictureIsNull() {
            addCriterion("staff_picture is null");
            return (Criteria) this;
        }

        public Criteria andStaffPictureIsNotNull() {
            addCriterion("staff_picture is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPictureEqualTo(Long value) {
            addCriterion("staff_picture =", value, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureNotEqualTo(Long value) {
            addCriterion("staff_picture <>", value, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureGreaterThan(Long value) {
            addCriterion("staff_picture >", value, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_picture >=", value, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureLessThan(Long value) {
            addCriterion("staff_picture <", value, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureLessThanOrEqualTo(Long value) {
            addCriterion("staff_picture <=", value, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureIn(List<Long> values) {
            addCriterion("staff_picture in", values, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureNotIn(List<Long> values) {
            addCriterion("staff_picture not in", values, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureBetween(Long value1, Long value2) {
            addCriterion("staff_picture between", value1, value2, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffPictureNotBetween(Long value1, Long value2) {
            addCriterion("staff_picture not between", value1, value2, "staffPicture");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentIsNull() {
            addCriterion("staff_department is null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentIsNotNull() {
            addCriterion("staff_department is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentEqualTo(Long value) {
            addCriterion("staff_department =", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotEqualTo(Long value) {
            addCriterion("staff_department <>", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentGreaterThan(Long value) {
            addCriterion("staff_department >", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_department >=", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentLessThan(Long value) {
            addCriterion("staff_department <", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("staff_department <=", value, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentIn(List<Long> values) {
            addCriterion("staff_department in", values, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotIn(List<Long> values) {
            addCriterion("staff_department not in", values, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentBetween(Long value1, Long value2) {
            addCriterion("staff_department between", value1, value2, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("staff_department not between", value1, value2, "staffDepartment");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdIsNull() {
            addCriterion("staff_card_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdIsNotNull() {
            addCriterion("staff_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdEqualTo(String value) {
            addCriterion("staff_card_id =", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdNotEqualTo(String value) {
            addCriterion("staff_card_id <>", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdGreaterThan(String value) {
            addCriterion("staff_card_id >", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_card_id >=", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdLessThan(String value) {
            addCriterion("staff_card_id <", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdLessThanOrEqualTo(String value) {
            addCriterion("staff_card_id <=", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdLike(String value) {
            addCriterion("staff_card_id like", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdNotLike(String value) {
            addCriterion("staff_card_id not like", value, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdIn(List<String> values) {
            addCriterion("staff_card_id in", values, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdNotIn(List<String> values) {
            addCriterion("staff_card_id not in", values, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdBetween(String value1, String value2) {
            addCriterion("staff_card_id between", value1, value2, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCardIdNotBetween(String value1, String value2) {
            addCriterion("staff_card_id not between", value1, value2, "staffCardId");
            return (Criteria) this;
        }

        public Criteria andStaffCall1IsNull() {
            addCriterion("staff_call1 is null");
            return (Criteria) this;
        }

        public Criteria andStaffCall1IsNotNull() {
            addCriterion("staff_call1 is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCall1EqualTo(String value) {
            addCriterion("staff_call1 =", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1NotEqualTo(String value) {
            addCriterion("staff_call1 <>", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1GreaterThan(String value) {
            addCriterion("staff_call1 >", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1GreaterThanOrEqualTo(String value) {
            addCriterion("staff_call1 >=", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1LessThan(String value) {
            addCriterion("staff_call1 <", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1LessThanOrEqualTo(String value) {
            addCriterion("staff_call1 <=", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1Like(String value) {
            addCriterion("staff_call1 like", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1NotLike(String value) {
            addCriterion("staff_call1 not like", value, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1In(List<String> values) {
            addCriterion("staff_call1 in", values, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1NotIn(List<String> values) {
            addCriterion("staff_call1 not in", values, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1Between(String value1, String value2) {
            addCriterion("staff_call1 between", value1, value2, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall1NotBetween(String value1, String value2) {
            addCriterion("staff_call1 not between", value1, value2, "staffCall1");
            return (Criteria) this;
        }

        public Criteria andStaffCall2IsNull() {
            addCriterion("staff_call2 is null");
            return (Criteria) this;
        }

        public Criteria andStaffCall2IsNotNull() {
            addCriterion("staff_call2 is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCall2EqualTo(String value) {
            addCriterion("staff_call2 =", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2NotEqualTo(String value) {
            addCriterion("staff_call2 <>", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2GreaterThan(String value) {
            addCriterion("staff_call2 >", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2GreaterThanOrEqualTo(String value) {
            addCriterion("staff_call2 >=", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2LessThan(String value) {
            addCriterion("staff_call2 <", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2LessThanOrEqualTo(String value) {
            addCriterion("staff_call2 <=", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2Like(String value) {
            addCriterion("staff_call2 like", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2NotLike(String value) {
            addCriterion("staff_call2 not like", value, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2In(List<String> values) {
            addCriterion("staff_call2 in", values, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2NotIn(List<String> values) {
            addCriterion("staff_call2 not in", values, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2Between(String value1, String value2) {
            addCriterion("staff_call2 between", value1, value2, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffCall2NotBetween(String value1, String value2) {
            addCriterion("staff_call2 not between", value1, value2, "staffCall2");
            return (Criteria) this;
        }

        public Criteria andStaffRankIsNull() {
            addCriterion("staff_rank is null");
            return (Criteria) this;
        }

        public Criteria andStaffRankIsNotNull() {
            addCriterion("staff_rank is not null");
            return (Criteria) this;
        }

        public Criteria andStaffRankEqualTo(Byte value) {
            addCriterion("staff_rank =", value, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankNotEqualTo(Byte value) {
            addCriterion("staff_rank <>", value, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankGreaterThan(Byte value) {
            addCriterion("staff_rank >", value, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankGreaterThanOrEqualTo(Byte value) {
            addCriterion("staff_rank >=", value, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankLessThan(Byte value) {
            addCriterion("staff_rank <", value, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankLessThanOrEqualTo(Byte value) {
            addCriterion("staff_rank <=", value, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankIn(List<Byte> values) {
            addCriterion("staff_rank in", values, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankNotIn(List<Byte> values) {
            addCriterion("staff_rank not in", values, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankBetween(Byte value1, Byte value2) {
            addCriterion("staff_rank between", value1, value2, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffRankNotBetween(Byte value1, Byte value2) {
            addCriterion("staff_rank not between", value1, value2, "staffRank");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNull() {
            addCriterion("staff_status is null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNotNull() {
            addCriterion("staff_status is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusEqualTo(Byte value) {
            addCriterion("staff_status =", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotEqualTo(Byte value) {
            addCriterion("staff_status <>", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThan(Byte value) {
            addCriterion("staff_status >", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("staff_status >=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThan(Byte value) {
            addCriterion("staff_status <", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThanOrEqualTo(Byte value) {
            addCriterion("staff_status <=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIn(List<Byte> values) {
            addCriterion("staff_status in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotIn(List<Byte> values) {
            addCriterion("staff_status not in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusBetween(Byte value1, Byte value2) {
            addCriterion("staff_status between", value1, value2, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("staff_status not between", value1, value2, "staffStatus");
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