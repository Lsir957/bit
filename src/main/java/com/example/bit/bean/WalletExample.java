package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WalletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WalletExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNull() {
            addCriterion("token_id is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("token_id is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(Integer value) {
            addCriterion("token_id =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(Integer value) {
            addCriterion("token_id <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(Integer value) {
            addCriterion("token_id >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("token_id >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(Integer value) {
            addCriterion("token_id <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(Integer value) {
            addCriterion("token_id <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<Integer> values) {
            addCriterion("token_id in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<Integer> values) {
            addCriterion("token_id not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(Integer value1, Integer value2) {
            addCriterion("token_id between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("token_id not between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFinancialIsNull() {
            addCriterion("financial is null");
            return (Criteria) this;
        }

        public Criteria andFinancialIsNotNull() {
            addCriterion("financial is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialEqualTo(BigDecimal value) {
            addCriterion("financial =", value, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialNotEqualTo(BigDecimal value) {
            addCriterion("financial <>", value, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialGreaterThan(BigDecimal value) {
            addCriterion("financial >", value, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financial >=", value, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialLessThan(BigDecimal value) {
            addCriterion("financial <", value, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financial <=", value, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialIn(List<BigDecimal> values) {
            addCriterion("financial in", values, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialNotIn(List<BigDecimal> values) {
            addCriterion("financial not in", values, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financial between", value1, value2, "financial");
            return (Criteria) this;
        }

        public Criteria andFinancialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financial not between", value1, value2, "financial");
            return (Criteria) this;
        }

        public Criteria andGivingIsNull() {
            addCriterion("giving is null");
            return (Criteria) this;
        }

        public Criteria andGivingIsNotNull() {
            addCriterion("giving is not null");
            return (Criteria) this;
        }

        public Criteria andGivingEqualTo(BigDecimal value) {
            addCriterion("giving =", value, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingNotEqualTo(BigDecimal value) {
            addCriterion("giving <>", value, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingGreaterThan(BigDecimal value) {
            addCriterion("giving >", value, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("giving >=", value, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingLessThan(BigDecimal value) {
            addCriterion("giving <", value, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("giving <=", value, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingIn(List<BigDecimal> values) {
            addCriterion("giving in", values, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingNotIn(List<BigDecimal> values) {
            addCriterion("giving not in", values, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("giving between", value1, value2, "giving");
            return (Criteria) this;
        }

        public Criteria andGivingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("giving not between", value1, value2, "giving");
            return (Criteria) this;
        }

        public Criteria andDongtaiIsNull() {
            addCriterion("dongtai is null");
            return (Criteria) this;
        }

        public Criteria andDongtaiIsNotNull() {
            addCriterion("dongtai is not null");
            return (Criteria) this;
        }

        public Criteria andDongtaiEqualTo(BigDecimal value) {
            addCriterion("dongtai =", value, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiNotEqualTo(BigDecimal value) {
            addCriterion("dongtai <>", value, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiGreaterThan(BigDecimal value) {
            addCriterion("dongtai >", value, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dongtai >=", value, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiLessThan(BigDecimal value) {
            addCriterion("dongtai <", value, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dongtai <=", value, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiIn(List<BigDecimal> values) {
            addCriterion("dongtai in", values, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiNotIn(List<BigDecimal> values) {
            addCriterion("dongtai not in", values, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dongtai between", value1, value2, "dongtai");
            return (Criteria) this;
        }

        public Criteria andDongtaiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dongtai not between", value1, value2, "dongtai");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceIsNull() {
            addCriterion("truely_balance is null");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceIsNotNull() {
            addCriterion("truely_balance is not null");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceEqualTo(String value) {
            addCriterion("truely_balance =", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceNotEqualTo(String value) {
            addCriterion("truely_balance <>", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceGreaterThan(String value) {
            addCriterion("truely_balance >", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("truely_balance >=", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceLessThan(String value) {
            addCriterion("truely_balance <", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceLessThanOrEqualTo(String value) {
            addCriterion("truely_balance <=", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceLike(String value) {
            addCriterion("truely_balance like", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceNotLike(String value) {
            addCriterion("truely_balance not like", value, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceIn(List<String> values) {
            addCriterion("truely_balance in", values, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceNotIn(List<String> values) {
            addCriterion("truely_balance not in", values, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceBetween(String value1, String value2) {
            addCriterion("truely_balance between", value1, value2, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andTruelyBalanceNotBetween(String value1, String value2) {
            addCriterion("truely_balance not between", value1, value2, "truelyBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceIsNull() {
            addCriterion("guiji_balance is null");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceIsNotNull() {
            addCriterion("guiji_balance is not null");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceEqualTo(String value) {
            addCriterion("guiji_balance =", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceNotEqualTo(String value) {
            addCriterion("guiji_balance <>", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceGreaterThan(String value) {
            addCriterion("guiji_balance >", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("guiji_balance >=", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceLessThan(String value) {
            addCriterion("guiji_balance <", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceLessThanOrEqualTo(String value) {
            addCriterion("guiji_balance <=", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceLike(String value) {
            addCriterion("guiji_balance like", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceNotLike(String value) {
            addCriterion("guiji_balance not like", value, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceIn(List<String> values) {
            addCriterion("guiji_balance in", values, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceNotIn(List<String> values) {
            addCriterion("guiji_balance not in", values, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceBetween(String value1, String value2) {
            addCriterion("guiji_balance between", value1, value2, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andGuijiBalanceNotBetween(String value1, String value2) {
            addCriterion("guiji_balance not between", value1, value2, "guijiBalance");
            return (Criteria) this;
        }

        public Criteria andLastBlockIsNull() {
            addCriterion("last_block is null");
            return (Criteria) this;
        }

        public Criteria andLastBlockIsNotNull() {
            addCriterion("last_block is not null");
            return (Criteria) this;
        }

        public Criteria andLastBlockEqualTo(Integer value) {
            addCriterion("last_block =", value, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockNotEqualTo(Integer value) {
            addCriterion("last_block <>", value, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockGreaterThan(Integer value) {
            addCriterion("last_block >", value, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_block >=", value, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockLessThan(Integer value) {
            addCriterion("last_block <", value, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockLessThanOrEqualTo(Integer value) {
            addCriterion("last_block <=", value, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockIn(List<Integer> values) {
            addCriterion("last_block in", values, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockNotIn(List<Integer> values) {
            addCriterion("last_block not in", values, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockBetween(Integer value1, Integer value2) {
            addCriterion("last_block between", value1, value2, "lastBlock");
            return (Criteria) this;
        }

        public Criteria andLastBlockNotBetween(Integer value1, Integer value2) {
            addCriterion("last_block not between", value1, value2, "lastBlock");
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