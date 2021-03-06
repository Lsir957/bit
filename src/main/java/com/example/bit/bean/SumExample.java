package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SumExample() {
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

        public Criteria andBuySumIsNull() {
            addCriterion("buy_sum is null");
            return (Criteria) this;
        }

        public Criteria andBuySumIsNotNull() {
            addCriterion("buy_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBuySumEqualTo(BigDecimal value) {
            addCriterion("buy_sum =", value, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumNotEqualTo(BigDecimal value) {
            addCriterion("buy_sum <>", value, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumGreaterThan(BigDecimal value) {
            addCriterion("buy_sum >", value, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_sum >=", value, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumLessThan(BigDecimal value) {
            addCriterion("buy_sum <", value, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_sum <=", value, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumIn(List<BigDecimal> values) {
            addCriterion("buy_sum in", values, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumNotIn(List<BigDecimal> values) {
            addCriterion("buy_sum not in", values, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_sum between", value1, value2, "buySum");
            return (Criteria) this;
        }

        public Criteria andBuySumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_sum not between", value1, value2, "buySum");
            return (Criteria) this;
        }

        public Criteria andUserSumIsNull() {
            addCriterion("user_sum is null");
            return (Criteria) this;
        }

        public Criteria andUserSumIsNotNull() {
            addCriterion("user_sum is not null");
            return (Criteria) this;
        }

        public Criteria andUserSumEqualTo(Integer value) {
            addCriterion("user_sum =", value, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumNotEqualTo(Integer value) {
            addCriterion("user_sum <>", value, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumGreaterThan(Integer value) {
            addCriterion("user_sum >", value, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sum >=", value, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumLessThan(Integer value) {
            addCriterion("user_sum <", value, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumLessThanOrEqualTo(Integer value) {
            addCriterion("user_sum <=", value, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumIn(List<Integer> values) {
            addCriterion("user_sum in", values, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumNotIn(List<Integer> values) {
            addCriterion("user_sum not in", values, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumBetween(Integer value1, Integer value2) {
            addCriterion("user_sum between", value1, value2, "userSum");
            return (Criteria) this;
        }

        public Criteria andUserSumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sum not between", value1, value2, "userSum");
            return (Criteria) this;
        }

        public Criteria andDaySumIsNull() {
            addCriterion("day_sum is null");
            return (Criteria) this;
        }

        public Criteria andDaySumIsNotNull() {
            addCriterion("day_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDaySumEqualTo(Integer value) {
            addCriterion("day_sum =", value, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumNotEqualTo(Integer value) {
            addCriterion("day_sum <>", value, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumGreaterThan(Integer value) {
            addCriterion("day_sum >", value, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_sum >=", value, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumLessThan(Integer value) {
            addCriterion("day_sum <", value, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumLessThanOrEqualTo(Integer value) {
            addCriterion("day_sum <=", value, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumIn(List<Integer> values) {
            addCriterion("day_sum in", values, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumNotIn(List<Integer> values) {
            addCriterion("day_sum not in", values, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumBetween(Integer value1, Integer value2) {
            addCriterion("day_sum between", value1, value2, "daySum");
            return (Criteria) this;
        }

        public Criteria andDaySumNotBetween(Integer value1, Integer value2) {
            addCriterion("day_sum not between", value1, value2, "daySum");
            return (Criteria) this;
        }

        public Criteria andRewardSumIsNull() {
            addCriterion("reward_sum is null");
            return (Criteria) this;
        }

        public Criteria andRewardSumIsNotNull() {
            addCriterion("reward_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRewardSumEqualTo(BigDecimal value) {
            addCriterion("reward_sum =", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumNotEqualTo(BigDecimal value) {
            addCriterion("reward_sum <>", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumGreaterThan(BigDecimal value) {
            addCriterion("reward_sum >", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reward_sum >=", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumLessThan(BigDecimal value) {
            addCriterion("reward_sum <", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reward_sum <=", value, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumIn(List<BigDecimal> values) {
            addCriterion("reward_sum in", values, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumNotIn(List<BigDecimal> values) {
            addCriterion("reward_sum not in", values, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward_sum between", value1, value2, "rewardSum");
            return (Criteria) this;
        }

        public Criteria andRewardSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward_sum not between", value1, value2, "rewardSum");
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