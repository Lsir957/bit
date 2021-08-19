package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinZhiYaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinZhiYaExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCoinNameIsNull() {
            addCriterion("coin_name is null");
            return (Criteria) this;
        }

        public Criteria andCoinNameIsNotNull() {
            addCriterion("coin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoinNameEqualTo(String value) {
            addCriterion("coin_name =", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotEqualTo(String value) {
            addCriterion("coin_name <>", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameGreaterThan(String value) {
            addCriterion("coin_name >", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameGreaterThanOrEqualTo(String value) {
            addCriterion("coin_name >=", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLessThan(String value) {
            addCriterion("coin_name <", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLessThanOrEqualTo(String value) {
            addCriterion("coin_name <=", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLike(String value) {
            addCriterion("coin_name like", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotLike(String value) {
            addCriterion("coin_name not like", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameIn(List<String> values) {
            addCriterion("coin_name in", values, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotIn(List<String> values) {
            addCriterion("coin_name not in", values, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameBetween(String value1, String value2) {
            addCriterion("coin_name between", value1, value2, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotBetween(String value1, String value2) {
            addCriterion("coin_name not between", value1, value2, "coinName");
            return (Criteria) this;
        }

        public Criteria andQishuIdIsNull() {
            addCriterion("qishu_id is null");
            return (Criteria) this;
        }

        public Criteria andQishuIdIsNotNull() {
            addCriterion("qishu_id is not null");
            return (Criteria) this;
        }

        public Criteria andQishuIdEqualTo(Integer value) {
            addCriterion("qishu_id =", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdNotEqualTo(Integer value) {
            addCriterion("qishu_id <>", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdGreaterThan(Integer value) {
            addCriterion("qishu_id >", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qishu_id >=", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdLessThan(Integer value) {
            addCriterion("qishu_id <", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdLessThanOrEqualTo(Integer value) {
            addCriterion("qishu_id <=", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdIn(List<Integer> values) {
            addCriterion("qishu_id in", values, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdNotIn(List<Integer> values) {
            addCriterion("qishu_id not in", values, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdBetween(Integer value1, Integer value2) {
            addCriterion("qishu_id between", value1, value2, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qishu_id not between", value1, value2, "qishuId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSIsNull() {
            addCriterion("create_time_s is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSIsNotNull() {
            addCriterion("create_time_s is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSEqualTo(Date value) {
            addCriterion("create_time_s =", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSNotEqualTo(Date value) {
            addCriterion("create_time_s <>", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSGreaterThan(Date value) {
            addCriterion("create_time_s >", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time_s >=", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSLessThan(Date value) {
            addCriterion("create_time_s <", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSLessThanOrEqualTo(Date value) {
            addCriterion("create_time_s <=", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSIn(List<Date> values) {
            addCriterion("create_time_s in", values, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSNotIn(List<Date> values) {
            addCriterion("create_time_s not in", values, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSBetween(Date value1, Date value2) {
            addCriterion("create_time_s between", value1, value2, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSNotBetween(Date value1, Date value2) {
            addCriterion("create_time_s not between", value1, value2, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeSIsNull() {
            addCriterion("end_time_s is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeSIsNotNull() {
            addCriterion("end_time_s is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeSEqualTo(Date value) {
            addCriterion("end_time_s =", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSNotEqualTo(Date value) {
            addCriterion("end_time_s <>", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSGreaterThan(Date value) {
            addCriterion("end_time_s >", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time_s >=", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSLessThan(Date value) {
            addCriterion("end_time_s <", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSLessThanOrEqualTo(Date value) {
            addCriterion("end_time_s <=", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSIn(List<Date> values) {
            addCriterion("end_time_s in", values, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSNotIn(List<Date> values) {
            addCriterion("end_time_s not in", values, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSBetween(Date value1, Date value2) {
            addCriterion("end_time_s between", value1, value2, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSNotBetween(Date value1, Date value2) {
            addCriterion("end_time_s not between", value1, value2, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLimitDayIsNull() {
            addCriterion("limit_day is null");
            return (Criteria) this;
        }

        public Criteria andLimitDayIsNotNull() {
            addCriterion("limit_day is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDayEqualTo(Integer value) {
            addCriterion("limit_day =", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotEqualTo(Integer value) {
            addCriterion("limit_day <>", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayGreaterThan(Integer value) {
            addCriterion("limit_day >", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_day >=", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLessThan(Integer value) {
            addCriterion("limit_day <", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLessThanOrEqualTo(Integer value) {
            addCriterion("limit_day <=", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayIn(List<Integer> values) {
            addCriterion("limit_day in", values, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotIn(List<Integer> values) {
            addCriterion("limit_day not in", values, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayBetween(Integer value1, Integer value2) {
            addCriterion("limit_day between", value1, value2, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_day not between", value1, value2, "limitDay");
            return (Criteria) this;
        }

        public Criteria andNextDayIsNull() {
            addCriterion("next_day is null");
            return (Criteria) this;
        }

        public Criteria andNextDayIsNotNull() {
            addCriterion("next_day is not null");
            return (Criteria) this;
        }

        public Criteria andNextDayEqualTo(String value) {
            addCriterion("next_day =", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayNotEqualTo(String value) {
            addCriterion("next_day <>", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayGreaterThan(String value) {
            addCriterion("next_day >", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayGreaterThanOrEqualTo(String value) {
            addCriterion("next_day >=", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayLessThan(String value) {
            addCriterion("next_day <", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayLessThanOrEqualTo(String value) {
            addCriterion("next_day <=", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayLike(String value) {
            addCriterion("next_day like", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayNotLike(String value) {
            addCriterion("next_day not like", value, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayIn(List<String> values) {
            addCriterion("next_day in", values, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayNotIn(List<String> values) {
            addCriterion("next_day not in", values, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayBetween(String value1, String value2) {
            addCriterion("next_day between", value1, value2, "nextDay");
            return (Criteria) this;
        }

        public Criteria andNextDayNotBetween(String value1, String value2) {
            addCriterion("next_day not between", value1, value2, "nextDay");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIsNull() {
            addCriterion("leave_num is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIsNotNull() {
            addCriterion("leave_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumEqualTo(BigDecimal value) {
            addCriterion("leave_num =", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotEqualTo(BigDecimal value) {
            addCriterion("leave_num <>", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumGreaterThan(BigDecimal value) {
            addCriterion("leave_num >", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("leave_num >=", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumLessThan(BigDecimal value) {
            addCriterion("leave_num <", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("leave_num <=", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIn(List<BigDecimal> values) {
            addCriterion("leave_num in", values, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotIn(List<BigDecimal> values) {
            addCriterion("leave_num not in", values, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("leave_num between", value1, value2, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("leave_num not between", value1, value2, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNull() {
            addCriterion("out_day is null");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNotNull() {
            addCriterion("out_day is not null");
            return (Criteria) this;
        }

        public Criteria andOutDayEqualTo(Integer value) {
            addCriterion("out_day =", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotEqualTo(Integer value) {
            addCriterion("out_day <>", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThan(Integer value) {
            addCriterion("out_day >", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_day >=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThan(Integer value) {
            addCriterion("out_day <", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThanOrEqualTo(Integer value) {
            addCriterion("out_day <=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayIn(List<Integer> values) {
            addCriterion("out_day in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotIn(List<Integer> values) {
            addCriterion("out_day not in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayBetween(Integer value1, Integer value2) {
            addCriterion("out_day between", value1, value2, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotBetween(Integer value1, Integer value2) {
            addCriterion("out_day not between", value1, value2, "outDay");
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