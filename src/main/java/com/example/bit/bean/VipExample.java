package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZslIsNull() {
            addCriterion("zsl is null");
            return (Criteria) this;
        }

        public Criteria andZslIsNotNull() {
            addCriterion("zsl is not null");
            return (Criteria) this;
        }

        public Criteria andZslEqualTo(Integer value) {
            addCriterion("zsl =", value, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslNotEqualTo(Integer value) {
            addCriterion("zsl <>", value, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslGreaterThan(Integer value) {
            addCriterion("zsl >", value, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslGreaterThanOrEqualTo(Integer value) {
            addCriterion("zsl >=", value, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslLessThan(Integer value) {
            addCriterion("zsl <", value, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslLessThanOrEqualTo(Integer value) {
            addCriterion("zsl <=", value, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslIn(List<Integer> values) {
            addCriterion("zsl in", values, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslNotIn(List<Integer> values) {
            addCriterion("zsl not in", values, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslBetween(Integer value1, Integer value2) {
            addCriterion("zsl between", value1, value2, "zsl");
            return (Criteria) this;
        }

        public Criteria andZslNotBetween(Integer value1, Integer value2) {
            addCriterion("zsl not between", value1, value2, "zsl");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNull() {
            addCriterion("freeze is null");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNotNull() {
            addCriterion("freeze is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeEqualTo(BigDecimal value) {
            addCriterion("freeze =", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotEqualTo(BigDecimal value) {
            addCriterion("freeze <>", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThan(BigDecimal value) {
            addCriterion("freeze >", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze >=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThan(BigDecimal value) {
            addCriterion("freeze <", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze <=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeIn(List<BigDecimal> values) {
            addCriterion("freeze in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotIn(List<BigDecimal> values) {
            addCriterion("freeze not in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze not between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andTdrsIsNull() {
            addCriterion("tdrs is null");
            return (Criteria) this;
        }

        public Criteria andTdrsIsNotNull() {
            addCriterion("tdrs is not null");
            return (Criteria) this;
        }

        public Criteria andTdrsEqualTo(Integer value) {
            addCriterion("tdrs =", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsNotEqualTo(Integer value) {
            addCriterion("tdrs <>", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsGreaterThan(Integer value) {
            addCriterion("tdrs >", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tdrs >=", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsLessThan(Integer value) {
            addCriterion("tdrs <", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsLessThanOrEqualTo(Integer value) {
            addCriterion("tdrs <=", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsIn(List<Integer> values) {
            addCriterion("tdrs in", values, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsNotIn(List<Integer> values) {
            addCriterion("tdrs not in", values, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsBetween(Integer value1, Integer value2) {
            addCriterion("tdrs between", value1, value2, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsNotBetween(Integer value1, Integer value2) {
            addCriterion("tdrs not between", value1, value2, "tdrs");
            return (Criteria) this;
        }

        public Criteria andDsIsNull() {
            addCriterion("ds is null");
            return (Criteria) this;
        }

        public Criteria andDsIsNotNull() {
            addCriterion("ds is not null");
            return (Criteria) this;
        }

        public Criteria andDsEqualTo(Integer value) {
            addCriterion("ds =", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotEqualTo(Integer value) {
            addCriterion("ds <>", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThan(Integer value) {
            addCriterion("ds >", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ds >=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThan(Integer value) {
            addCriterion("ds <", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThanOrEqualTo(Integer value) {
            addCriterion("ds <=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsIn(List<Integer> values) {
            addCriterion("ds in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotIn(List<Integer> values) {
            addCriterion("ds not in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsBetween(Integer value1, Integer value2) {
            addCriterion("ds between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotBetween(Integer value1, Integer value2) {
            addCriterion("ds not between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andSxlvIsNull() {
            addCriterion("sxlv is null");
            return (Criteria) this;
        }

        public Criteria andSxlvIsNotNull() {
            addCriterion("sxlv is not null");
            return (Criteria) this;
        }

        public Criteria andSxlvEqualTo(Integer value) {
            addCriterion("sxlv =", value, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvNotEqualTo(Integer value) {
            addCriterion("sxlv <>", value, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvGreaterThan(Integer value) {
            addCriterion("sxlv >", value, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvGreaterThanOrEqualTo(Integer value) {
            addCriterion("sxlv >=", value, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvLessThan(Integer value) {
            addCriterion("sxlv <", value, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvLessThanOrEqualTo(Integer value) {
            addCriterion("sxlv <=", value, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvIn(List<Integer> values) {
            addCriterion("sxlv in", values, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvNotIn(List<Integer> values) {
            addCriterion("sxlv not in", values, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvBetween(Integer value1, Integer value2) {
            addCriterion("sxlv between", value1, value2, "sxlv");
            return (Criteria) this;
        }

        public Criteria andSxlvNotBetween(Integer value1, Integer value2) {
            addCriterion("sxlv not between", value1, value2, "sxlv");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("lv is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("lv is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Byte value) {
            addCriterion("lv =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Byte value) {
            addCriterion("lv <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Byte value) {
            addCriterion("lv >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Byte value) {
            addCriterion("lv >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Byte value) {
            addCriterion("lv <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Byte value) {
            addCriterion("lv <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Byte> values) {
            addCriterion("lv in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Byte> values) {
            addCriterion("lv not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Byte value1, Byte value2) {
            addCriterion("lv between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Byte value1, Byte value2) {
            addCriterion("lv not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("zt is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("zt is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(Integer value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(Integer value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(Integer value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(Integer value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(Integer value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<Integer> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<Integer> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(Integer value1, Integer value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(Integer value1, Integer value2) {
            addCriterion("zt not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andLvimg1IsNull() {
            addCriterion("lvimg1 is null");
            return (Criteria) this;
        }

        public Criteria andLvimg1IsNotNull() {
            addCriterion("lvimg1 is not null");
            return (Criteria) this;
        }

        public Criteria andLvimg1EqualTo(String value) {
            addCriterion("lvimg1 =", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1NotEqualTo(String value) {
            addCriterion("lvimg1 <>", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1GreaterThan(String value) {
            addCriterion("lvimg1 >", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1GreaterThanOrEqualTo(String value) {
            addCriterion("lvimg1 >=", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1LessThan(String value) {
            addCriterion("lvimg1 <", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1LessThanOrEqualTo(String value) {
            addCriterion("lvimg1 <=", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1Like(String value) {
            addCriterion("lvimg1 like", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1NotLike(String value) {
            addCriterion("lvimg1 not like", value, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1In(List<String> values) {
            addCriterion("lvimg1 in", values, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1NotIn(List<String> values) {
            addCriterion("lvimg1 not in", values, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1Between(String value1, String value2) {
            addCriterion("lvimg1 between", value1, value2, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg1NotBetween(String value1, String value2) {
            addCriterion("lvimg1 not between", value1, value2, "lvimg1");
            return (Criteria) this;
        }

        public Criteria andLvimg2IsNull() {
            addCriterion("lvimg2 is null");
            return (Criteria) this;
        }

        public Criteria andLvimg2IsNotNull() {
            addCriterion("lvimg2 is not null");
            return (Criteria) this;
        }

        public Criteria andLvimg2EqualTo(String value) {
            addCriterion("lvimg2 =", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2NotEqualTo(String value) {
            addCriterion("lvimg2 <>", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2GreaterThan(String value) {
            addCriterion("lvimg2 >", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2GreaterThanOrEqualTo(String value) {
            addCriterion("lvimg2 >=", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2LessThan(String value) {
            addCriterion("lvimg2 <", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2LessThanOrEqualTo(String value) {
            addCriterion("lvimg2 <=", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2Like(String value) {
            addCriterion("lvimg2 like", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2NotLike(String value) {
            addCriterion("lvimg2 not like", value, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2In(List<String> values) {
            addCriterion("lvimg2 in", values, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2NotIn(List<String> values) {
            addCriterion("lvimg2 not in", values, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2Between(String value1, String value2) {
            addCriterion("lvimg2 between", value1, value2, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andLvimg2NotBetween(String value1, String value2) {
            addCriterion("lvimg2 not between", value1, value2, "lvimg2");
            return (Criteria) this;
        }

        public Criteria andBiliJdIsNull() {
            addCriterion("bili_jd is null");
            return (Criteria) this;
        }

        public Criteria andBiliJdIsNotNull() {
            addCriterion("bili_jd is not null");
            return (Criteria) this;
        }

        public Criteria andBiliJdEqualTo(BigDecimal value) {
            addCriterion("bili_jd =", value, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdNotEqualTo(BigDecimal value) {
            addCriterion("bili_jd <>", value, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdGreaterThan(BigDecimal value) {
            addCriterion("bili_jd >", value, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bili_jd >=", value, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdLessThan(BigDecimal value) {
            addCriterion("bili_jd <", value, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bili_jd <=", value, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdIn(List<BigDecimal> values) {
            addCriterion("bili_jd in", values, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdNotIn(List<BigDecimal> values) {
            addCriterion("bili_jd not in", values, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bili_jd between", value1, value2, "biliJd");
            return (Criteria) this;
        }

        public Criteria andBiliJdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bili_jd not between", value1, value2, "biliJd");
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