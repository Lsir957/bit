package com.example.bit.bean;

import java.util.ArrayList;
import java.util.List;

public class ThAwardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThAwardExample() {
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

        public Criteria andThLvIsNull() {
            addCriterion("th_lv is null");
            return (Criteria) this;
        }

        public Criteria andThLvIsNotNull() {
            addCriterion("th_lv is not null");
            return (Criteria) this;
        }

        public Criteria andThLvEqualTo(Integer value) {
            addCriterion("th_lv =", value, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvNotEqualTo(Integer value) {
            addCriterion("th_lv <>", value, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvGreaterThan(Integer value) {
            addCriterion("th_lv >", value, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("th_lv >=", value, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvLessThan(Integer value) {
            addCriterion("th_lv <", value, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvLessThanOrEqualTo(Integer value) {
            addCriterion("th_lv <=", value, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvIn(List<Integer> values) {
            addCriterion("th_lv in", values, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvNotIn(List<Integer> values) {
            addCriterion("th_lv not in", values, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvBetween(Integer value1, Integer value2) {
            addCriterion("th_lv between", value1, value2, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvNotBetween(Integer value1, Integer value2) {
            addCriterion("th_lv not between", value1, value2, "thLv");
            return (Criteria) this;
        }

        public Criteria andThLvnameIsNull() {
            addCriterion("th_lvname is null");
            return (Criteria) this;
        }

        public Criteria andThLvnameIsNotNull() {
            addCriterion("th_lvname is not null");
            return (Criteria) this;
        }

        public Criteria andThLvnameEqualTo(String value) {
            addCriterion("th_lvname =", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameNotEqualTo(String value) {
            addCriterion("th_lvname <>", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameGreaterThan(String value) {
            addCriterion("th_lvname >", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameGreaterThanOrEqualTo(String value) {
            addCriterion("th_lvname >=", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameLessThan(String value) {
            addCriterion("th_lvname <", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameLessThanOrEqualTo(String value) {
            addCriterion("th_lvname <=", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameLike(String value) {
            addCriterion("th_lvname like", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameNotLike(String value) {
            addCriterion("th_lvname not like", value, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameIn(List<String> values) {
            addCriterion("th_lvname in", values, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameNotIn(List<String> values) {
            addCriterion("th_lvname not in", values, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameBetween(String value1, String value2) {
            addCriterion("th_lvname between", value1, value2, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThLvnameNotBetween(String value1, String value2) {
            addCriterion("th_lvname not between", value1, value2, "thLvname");
            return (Criteria) this;
        }

        public Criteria andThNumIsNull() {
            addCriterion("th_num is null");
            return (Criteria) this;
        }

        public Criteria andThNumIsNotNull() {
            addCriterion("th_num is not null");
            return (Criteria) this;
        }

        public Criteria andThNumEqualTo(Integer value) {
            addCriterion("th_num =", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumNotEqualTo(Integer value) {
            addCriterion("th_num <>", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumGreaterThan(Integer value) {
            addCriterion("th_num >", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("th_num >=", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumLessThan(Integer value) {
            addCriterion("th_num <", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumLessThanOrEqualTo(Integer value) {
            addCriterion("th_num <=", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumIn(List<Integer> values) {
            addCriterion("th_num in", values, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumNotIn(List<Integer> values) {
            addCriterion("th_num not in", values, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumBetween(Integer value1, Integer value2) {
            addCriterion("th_num between", value1, value2, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumNotBetween(Integer value1, Integer value2) {
            addCriterion("th_num not between", value1, value2, "thNum");
            return (Criteria) this;
        }

        public Criteria andThZtRateIsNull() {
            addCriterion("th_zt_rate is null");
            return (Criteria) this;
        }

        public Criteria andThZtRateIsNotNull() {
            addCriterion("th_zt_rate is not null");
            return (Criteria) this;
        }

        public Criteria andThZtRateEqualTo(String value) {
            addCriterion("th_zt_rate =", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateNotEqualTo(String value) {
            addCriterion("th_zt_rate <>", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateGreaterThan(String value) {
            addCriterion("th_zt_rate >", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateGreaterThanOrEqualTo(String value) {
            addCriterion("th_zt_rate >=", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateLessThan(String value) {
            addCriterion("th_zt_rate <", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateLessThanOrEqualTo(String value) {
            addCriterion("th_zt_rate <=", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateLike(String value) {
            addCriterion("th_zt_rate like", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateNotLike(String value) {
            addCriterion("th_zt_rate not like", value, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateIn(List<String> values) {
            addCriterion("th_zt_rate in", values, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateNotIn(List<String> values) {
            addCriterion("th_zt_rate not in", values, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateBetween(String value1, String value2) {
            addCriterion("th_zt_rate between", value1, value2, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThZtRateNotBetween(String value1, String value2) {
            addCriterion("th_zt_rate not between", value1, value2, "thZtRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateIsNull() {
            addCriterion("th_team_rate is null");
            return (Criteria) this;
        }

        public Criteria andThTeamRateIsNotNull() {
            addCriterion("th_team_rate is not null");
            return (Criteria) this;
        }

        public Criteria andThTeamRateEqualTo(String value) {
            addCriterion("th_team_rate =", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateNotEqualTo(String value) {
            addCriterion("th_team_rate <>", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateGreaterThan(String value) {
            addCriterion("th_team_rate >", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateGreaterThanOrEqualTo(String value) {
            addCriterion("th_team_rate >=", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateLessThan(String value) {
            addCriterion("th_team_rate <", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateLessThanOrEqualTo(String value) {
            addCriterion("th_team_rate <=", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateLike(String value) {
            addCriterion("th_team_rate like", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateNotLike(String value) {
            addCriterion("th_team_rate not like", value, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateIn(List<String> values) {
            addCriterion("th_team_rate in", values, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateNotIn(List<String> values) {
            addCriterion("th_team_rate not in", values, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateBetween(String value1, String value2) {
            addCriterion("th_team_rate between", value1, value2, "thTeamRate");
            return (Criteria) this;
        }

        public Criteria andThTeamRateNotBetween(String value1, String value2) {
            addCriterion("th_team_rate not between", value1, value2, "thTeamRate");
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