package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class KuangProductOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KuangProductOrderExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andBatchcodeIsNull() {
            addCriterion("batchcode is null");
            return (Criteria) this;
        }

        public Criteria andBatchcodeIsNotNull() {
            addCriterion("batchcode is not null");
            return (Criteria) this;
        }

        public Criteria andBatchcodeEqualTo(String value) {
            addCriterion("batchcode =", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeNotEqualTo(String value) {
            addCriterion("batchcode <>", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeGreaterThan(String value) {
            addCriterion("batchcode >", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("batchcode >=", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeLessThan(String value) {
            addCriterion("batchcode <", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeLessThanOrEqualTo(String value) {
            addCriterion("batchcode <=", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeLike(String value) {
            addCriterion("batchcode like", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeNotLike(String value) {
            addCriterion("batchcode not like", value, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeIn(List<String> values) {
            addCriterion("batchcode in", values, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeNotIn(List<String> values) {
            addCriterion("batchcode not in", values, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeBetween(String value1, String value2) {
            addCriterion("batchcode between", value1, value2, "batchcode");
            return (Criteria) this;
        }

        public Criteria andBatchcodeNotBetween(String value1, String value2) {
            addCriterion("batchcode not between", value1, value2, "batchcode");
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

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
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

        public Criteria andDayOutIsNull() {
            addCriterion("day_out is null");
            return (Criteria) this;
        }

        public Criteria andDayOutIsNotNull() {
            addCriterion("day_out is not null");
            return (Criteria) this;
        }

        public Criteria andDayOutEqualTo(Integer value) {
            addCriterion("day_out =", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutNotEqualTo(Integer value) {
            addCriterion("day_out <>", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutGreaterThan(Integer value) {
            addCriterion("day_out >", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_out >=", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutLessThan(Integer value) {
            addCriterion("day_out <", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutLessThanOrEqualTo(Integer value) {
            addCriterion("day_out <=", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutIn(List<Integer> values) {
            addCriterion("day_out in", values, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutNotIn(List<Integer> values) {
            addCriterion("day_out not in", values, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutBetween(Integer value1, Integer value2) {
            addCriterion("day_out between", value1, value2, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutNotBetween(Integer value1, Integer value2) {
            addCriterion("day_out not between", value1, value2, "dayOut");
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

        public Criteria andCanReduceIsNull() {
            addCriterion("can_reduce is null");
            return (Criteria) this;
        }

        public Criteria andCanReduceIsNotNull() {
            addCriterion("can_reduce is not null");
            return (Criteria) this;
        }

        public Criteria andCanReduceEqualTo(Integer value) {
            addCriterion("can_reduce =", value, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceNotEqualTo(Integer value) {
            addCriterion("can_reduce <>", value, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceGreaterThan(Integer value) {
            addCriterion("can_reduce >", value, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_reduce >=", value, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceLessThan(Integer value) {
            addCriterion("can_reduce <", value, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceLessThanOrEqualTo(Integer value) {
            addCriterion("can_reduce <=", value, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceIn(List<Integer> values) {
            addCriterion("can_reduce in", values, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceNotIn(List<Integer> values) {
            addCriterion("can_reduce not in", values, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceBetween(Integer value1, Integer value2) {
            addCriterion("can_reduce between", value1, value2, "canReduce");
            return (Criteria) this;
        }

        public Criteria andCanReduceNotBetween(Integer value1, Integer value2) {
            addCriterion("can_reduce not between", value1, value2, "canReduce");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayIsNull() {
            addCriterion("reduce_total_day is null");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayIsNotNull() {
            addCriterion("reduce_total_day is not null");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayEqualTo(Integer value) {
            addCriterion("reduce_total_day =", value, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayNotEqualTo(Integer value) {
            addCriterion("reduce_total_day <>", value, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayGreaterThan(Integer value) {
            addCriterion("reduce_total_day >", value, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_total_day >=", value, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayLessThan(Integer value) {
            addCriterion("reduce_total_day <", value, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_total_day <=", value, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayIn(List<Integer> values) {
            addCriterion("reduce_total_day in", values, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayNotIn(List<Integer> values) {
            addCriterion("reduce_total_day not in", values, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayBetween(Integer value1, Integer value2) {
            addCriterion("reduce_total_day between", value1, value2, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andReduceTotalDayNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_total_day not between", value1, value2, "reduceTotalDay");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardIsNull() {
            addCriterion("is_dt_award is null");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardIsNotNull() {
            addCriterion("is_dt_award is not null");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardEqualTo(Integer value) {
            addCriterion("is_dt_award =", value, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardNotEqualTo(Integer value) {
            addCriterion("is_dt_award <>", value, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardGreaterThan(Integer value) {
            addCriterion("is_dt_award >", value, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_dt_award >=", value, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardLessThan(Integer value) {
            addCriterion("is_dt_award <", value, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardLessThanOrEqualTo(Integer value) {
            addCriterion("is_dt_award <=", value, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardIn(List<Integer> values) {
            addCriterion("is_dt_award in", values, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardNotIn(List<Integer> values) {
            addCriterion("is_dt_award not in", values, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardBetween(Integer value1, Integer value2) {
            addCriterion("is_dt_award between", value1, value2, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsDtAwardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_dt_award not between", value1, value2, "isDtAward");
            return (Criteria) this;
        }

        public Criteria andIsImportIsNull() {
            addCriterion("is_import is null");
            return (Criteria) this;
        }

        public Criteria andIsImportIsNotNull() {
            addCriterion("is_import is not null");
            return (Criteria) this;
        }

        public Criteria andIsImportEqualTo(Integer value) {
            addCriterion("is_import =", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotEqualTo(Integer value) {
            addCriterion("is_import <>", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportGreaterThan(Integer value) {
            addCriterion("is_import >", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_import >=", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportLessThan(Integer value) {
            addCriterion("is_import <", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportLessThanOrEqualTo(Integer value) {
            addCriterion("is_import <=", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportIn(List<Integer> values) {
            addCriterion("is_import in", values, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotIn(List<Integer> values) {
            addCriterion("is_import not in", values, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportBetween(Integer value1, Integer value2) {
            addCriterion("is_import between", value1, value2, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotBetween(Integer value1, Integer value2) {
            addCriterion("is_import not between", value1, value2, "isImport");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNull() {
            addCriterion("coin_type is null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNotNull() {
            addCriterion("coin_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeEqualTo(String value) {
            addCriterion("coin_type =", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotEqualTo(String value) {
            addCriterion("coin_type <>", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThan(String value) {
            addCriterion("coin_type >", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coin_type >=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThan(String value) {
            addCriterion("coin_type <", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThanOrEqualTo(String value) {
            addCriterion("coin_type <=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLike(String value) {
            addCriterion("coin_type like", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotLike(String value) {
            addCriterion("coin_type not like", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIn(List<String> values) {
            addCriterion("coin_type in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotIn(List<String> values) {
            addCriterion("coin_type not in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeBetween(String value1, String value2) {
            addCriterion("coin_type between", value1, value2, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotBetween(String value1, String value2) {
            addCriterion("coin_type not between", value1, value2, "coinType");
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