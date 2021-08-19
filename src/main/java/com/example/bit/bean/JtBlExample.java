package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JtBlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JtBlExample() {
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

        public Criteria andHqSlIsNull() {
            addCriterion("hq_sl is null");
            return (Criteria) this;
        }

        public Criteria andHqSlIsNotNull() {
            addCriterion("hq_sl is not null");
            return (Criteria) this;
        }

        public Criteria andHqSlEqualTo(BigDecimal value) {
            addCriterion("hq_sl =", value, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlNotEqualTo(BigDecimal value) {
            addCriterion("hq_sl <>", value, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlGreaterThan(BigDecimal value) {
            addCriterion("hq_sl >", value, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hq_sl >=", value, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlLessThan(BigDecimal value) {
            addCriterion("hq_sl <", value, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hq_sl <=", value, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlIn(List<BigDecimal> values) {
            addCriterion("hq_sl in", values, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlNotIn(List<BigDecimal> values) {
            addCriterion("hq_sl not in", values, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hq_sl between", value1, value2, "hqSl");
            return (Criteria) this;
        }

        public Criteria andHqSlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hq_sl not between", value1, value2, "hqSl");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andZzSxfIsNull() {
            addCriterion("zz_sxf is null");
            return (Criteria) this;
        }

        public Criteria andZzSxfIsNotNull() {
            addCriterion("zz_sxf is not null");
            return (Criteria) this;
        }

        public Criteria andZzSxfEqualTo(BigDecimal value) {
            addCriterion("zz_sxf =", value, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfNotEqualTo(BigDecimal value) {
            addCriterion("zz_sxf <>", value, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfGreaterThan(BigDecimal value) {
            addCriterion("zz_sxf >", value, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zz_sxf >=", value, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfLessThan(BigDecimal value) {
            addCriterion("zz_sxf <", value, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zz_sxf <=", value, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfIn(List<BigDecimal> values) {
            addCriterion("zz_sxf in", values, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfNotIn(List<BigDecimal> values) {
            addCriterion("zz_sxf not in", values, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zz_sxf between", value1, value2, "zzSxf");
            return (Criteria) this;
        }

        public Criteria andZzSxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zz_sxf not between", value1, value2, "zzSxf");
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

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(BigDecimal value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(BigDecimal value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(BigDecimal value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(BigDecimal value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<BigDecimal> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<BigDecimal> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sl not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andMaxIsNull() {
            addCriterion("max is null");
            return (Criteria) this;
        }

        public Criteria andMaxIsNotNull() {
            addCriterion("max is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEqualTo(BigDecimal value) {
            addCriterion("max =", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotEqualTo(BigDecimal value) {
            addCriterion("max <>", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThan(BigDecimal value) {
            addCriterion("max >", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max >=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThan(BigDecimal value) {
            addCriterion("max <", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max <=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxIn(List<BigDecimal> values) {
            addCriterion("max in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotIn(List<BigDecimal> values) {
            addCriterion("max not in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max not between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(BigDecimal value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(BigDecimal value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(BigDecimal value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(BigDecimal value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<BigDecimal> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<BigDecimal> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyMiniIsNull() {
            addCriterion("buy_mini is null");
            return (Criteria) this;
        }

        public Criteria andBuyMiniIsNotNull() {
            addCriterion("buy_mini is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMiniEqualTo(BigDecimal value) {
            addCriterion("buy_mini =", value, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniNotEqualTo(BigDecimal value) {
            addCriterion("buy_mini <>", value, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniGreaterThan(BigDecimal value) {
            addCriterion("buy_mini >", value, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_mini >=", value, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniLessThan(BigDecimal value) {
            addCriterion("buy_mini <", value, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_mini <=", value, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniIn(List<BigDecimal> values) {
            addCriterion("buy_mini in", values, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniNotIn(List<BigDecimal> values) {
            addCriterion("buy_mini not in", values, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_mini between", value1, value2, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMiniNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_mini not between", value1, value2, "buyMini");
            return (Criteria) this;
        }

        public Criteria andBuyMaxIsNull() {
            addCriterion("buy_max is null");
            return (Criteria) this;
        }

        public Criteria andBuyMaxIsNotNull() {
            addCriterion("buy_max is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMaxEqualTo(BigDecimal value) {
            addCriterion("buy_max =", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNotEqualTo(BigDecimal value) {
            addCriterion("buy_max <>", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxGreaterThan(BigDecimal value) {
            addCriterion("buy_max >", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_max >=", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxLessThan(BigDecimal value) {
            addCriterion("buy_max <", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_max <=", value, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxIn(List<BigDecimal> values) {
            addCriterion("buy_max in", values, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNotIn(List<BigDecimal> values) {
            addCriterion("buy_max not in", values, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_max between", value1, value2, "buyMax");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_max not between", value1, value2, "buyMax");
            return (Criteria) this;
        }

        public Criteria andFtMiniIsNull() {
            addCriterion("ft_mini is null");
            return (Criteria) this;
        }

        public Criteria andFtMiniIsNotNull() {
            addCriterion("ft_mini is not null");
            return (Criteria) this;
        }

        public Criteria andFtMiniEqualTo(BigDecimal value) {
            addCriterion("ft_mini =", value, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniNotEqualTo(BigDecimal value) {
            addCriterion("ft_mini <>", value, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniGreaterThan(BigDecimal value) {
            addCriterion("ft_mini >", value, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ft_mini >=", value, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniLessThan(BigDecimal value) {
            addCriterion("ft_mini <", value, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ft_mini <=", value, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniIn(List<BigDecimal> values) {
            addCriterion("ft_mini in", values, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniNotIn(List<BigDecimal> values) {
            addCriterion("ft_mini not in", values, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ft_mini between", value1, value2, "ftMini");
            return (Criteria) this;
        }

        public Criteria andFtMiniNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ft_mini not between", value1, value2, "ftMini");
            return (Criteria) this;
        }

        public Criteria andKaiguanIsNull() {
            addCriterion("kaiguan is null");
            return (Criteria) this;
        }

        public Criteria andKaiguanIsNotNull() {
            addCriterion("kaiguan is not null");
            return (Criteria) this;
        }

        public Criteria andKaiguanEqualTo(Integer value) {
            addCriterion("kaiguan =", value, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanNotEqualTo(Integer value) {
            addCriterion("kaiguan <>", value, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanGreaterThan(Integer value) {
            addCriterion("kaiguan >", value, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanGreaterThanOrEqualTo(Integer value) {
            addCriterion("kaiguan >=", value, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanLessThan(Integer value) {
            addCriterion("kaiguan <", value, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanLessThanOrEqualTo(Integer value) {
            addCriterion("kaiguan <=", value, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanIn(List<Integer> values) {
            addCriterion("kaiguan in", values, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanNotIn(List<Integer> values) {
            addCriterion("kaiguan not in", values, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanBetween(Integer value1, Integer value2) {
            addCriterion("kaiguan between", value1, value2, "kaiguan");
            return (Criteria) this;
        }

        public Criteria andKaiguanNotBetween(Integer value1, Integer value2) {
            addCriterion("kaiguan not between", value1, value2, "kaiguan");
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