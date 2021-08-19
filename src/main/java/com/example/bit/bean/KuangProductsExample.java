package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class KuangProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KuangProductsExample() {
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

        public Criteria andTitleEnIsNull() {
            addCriterion("title_en is null");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNotNull() {
            addCriterion("title_en is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEnEqualTo(String value) {
            addCriterion("title_en =", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotEqualTo(String value) {
            addCriterion("title_en <>", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThan(String value) {
            addCriterion("title_en >", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("title_en >=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThan(String value) {
            addCriterion("title_en <", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThanOrEqualTo(String value) {
            addCriterion("title_en <=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLike(String value) {
            addCriterion("title_en like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotLike(String value) {
            addCriterion("title_en not like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnIn(List<String> values) {
            addCriterion("title_en in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotIn(List<String> values) {
            addCriterion("title_en not in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnBetween(String value1, String value2) {
            addCriterion("title_en between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotBetween(String value1, String value2) {
            addCriterion("title_en not between", value1, value2, "titleEn");
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

        public Criteria andDayOutIsNull() {
            addCriterion("day_out is null");
            return (Criteria) this;
        }

        public Criteria andDayOutIsNotNull() {
            addCriterion("day_out is not null");
            return (Criteria) this;
        }

        public Criteria andDayOutEqualTo(BigDecimal value) {
            addCriterion("day_out =", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutNotEqualTo(BigDecimal value) {
            addCriterion("day_out <>", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutGreaterThan(BigDecimal value) {
            addCriterion("day_out >", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("day_out >=", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutLessThan(BigDecimal value) {
            addCriterion("day_out <", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("day_out <=", value, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutIn(List<BigDecimal> values) {
            addCriterion("day_out in", values, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutNotIn(List<BigDecimal> values) {
            addCriterion("day_out not in", values, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_out between", value1, value2, "dayOut");
            return (Criteria) this;
        }

        public Criteria andDayOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_out not between", value1, value2, "dayOut");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIsNull() {
            addCriterion("buy_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIsNotNull() {
            addCriterion("buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPriceEqualTo(BigDecimal value) {
            addCriterion("buy_price =", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotEqualTo(BigDecimal value) {
            addCriterion("buy_price <>", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceGreaterThan(BigDecimal value) {
            addCriterion("buy_price >", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_price >=", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLessThan(BigDecimal value) {
            addCriterion("buy_price <", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_price <=", value, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceIn(List<BigDecimal> values) {
            addCriterion("buy_price in", values, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotIn(List<BigDecimal> values) {
            addCriterion("buy_price not in", values, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_price between", value1, value2, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andBuyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_price not between", value1, value2, "buyPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceIsNull() {
            addCriterion("usdt_price is null");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceIsNotNull() {
            addCriterion("usdt_price is not null");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceEqualTo(BigDecimal value) {
            addCriterion("usdt_price =", value, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceNotEqualTo(BigDecimal value) {
            addCriterion("usdt_price <>", value, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceGreaterThan(BigDecimal value) {
            addCriterion("usdt_price >", value, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usdt_price >=", value, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceLessThan(BigDecimal value) {
            addCriterion("usdt_price <", value, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usdt_price <=", value, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceIn(List<BigDecimal> values) {
            addCriterion("usdt_price in", values, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceNotIn(List<BigDecimal> values) {
            addCriterion("usdt_price not in", values, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usdt_price between", value1, value2, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andUsdtPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usdt_price not between", value1, value2, "usdtPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceIsNull() {
            addCriterion("bed_price is null");
            return (Criteria) this;
        }

        public Criteria andBedPriceIsNotNull() {
            addCriterion("bed_price is not null");
            return (Criteria) this;
        }

        public Criteria andBedPriceEqualTo(BigDecimal value) {
            addCriterion("bed_price =", value, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceNotEqualTo(BigDecimal value) {
            addCriterion("bed_price <>", value, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceGreaterThan(BigDecimal value) {
            addCriterion("bed_price >", value, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bed_price >=", value, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceLessThan(BigDecimal value) {
            addCriterion("bed_price <", value, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bed_price <=", value, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceIn(List<BigDecimal> values) {
            addCriterion("bed_price in", values, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceNotIn(List<BigDecimal> values) {
            addCriterion("bed_price not in", values, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bed_price between", value1, value2, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andBedPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bed_price not between", value1, value2, "bedPrice");
            return (Criteria) this;
        }

        public Criteria andMaxKucunIsNull() {
            addCriterion("max_kucun is null");
            return (Criteria) this;
        }

        public Criteria andMaxKucunIsNotNull() {
            addCriterion("max_kucun is not null");
            return (Criteria) this;
        }

        public Criteria andMaxKucunEqualTo(Integer value) {
            addCriterion("max_kucun =", value, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunNotEqualTo(Integer value) {
            addCriterion("max_kucun <>", value, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunGreaterThan(Integer value) {
            addCriterion("max_kucun >", value, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_kucun >=", value, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunLessThan(Integer value) {
            addCriterion("max_kucun <", value, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunLessThanOrEqualTo(Integer value) {
            addCriterion("max_kucun <=", value, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunIn(List<Integer> values) {
            addCriterion("max_kucun in", values, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunNotIn(List<Integer> values) {
            addCriterion("max_kucun not in", values, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunBetween(Integer value1, Integer value2) {
            addCriterion("max_kucun between", value1, value2, "maxKucun");
            return (Criteria) this;
        }

        public Criteria andMaxKucunNotBetween(Integer value1, Integer value2) {
            addCriterion("max_kucun not between", value1, value2, "maxKucun");
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

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
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

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMinCountIsNull() {
            addCriterion("min_count is null");
            return (Criteria) this;
        }

        public Criteria andMinCountIsNotNull() {
            addCriterion("min_count is not null");
            return (Criteria) this;
        }

        public Criteria andMinCountEqualTo(String value) {
            addCriterion("min_count =", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountNotEqualTo(String value) {
            addCriterion("min_count <>", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountGreaterThan(String value) {
            addCriterion("min_count >", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountGreaterThanOrEqualTo(String value) {
            addCriterion("min_count >=", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountLessThan(String value) {
            addCriterion("min_count <", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountLessThanOrEqualTo(String value) {
            addCriterion("min_count <=", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountLike(String value) {
            addCriterion("min_count like", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountNotLike(String value) {
            addCriterion("min_count not like", value, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountIn(List<String> values) {
            addCriterion("min_count in", values, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountNotIn(List<String> values) {
            addCriterion("min_count not in", values, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountBetween(String value1, String value2) {
            addCriterion("min_count between", value1, value2, "minCount");
            return (Criteria) this;
        }

        public Criteria andMinCountNotBetween(String value1, String value2) {
            addCriterion("min_count not between", value1, value2, "minCount");
            return (Criteria) this;
        }

        public Criteria andWaitDayIsNull() {
            addCriterion("wait_day is null");
            return (Criteria) this;
        }

        public Criteria andWaitDayIsNotNull() {
            addCriterion("wait_day is not null");
            return (Criteria) this;
        }

        public Criteria andWaitDayEqualTo(String value) {
            addCriterion("wait_day =", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayNotEqualTo(String value) {
            addCriterion("wait_day <>", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayGreaterThan(String value) {
            addCriterion("wait_day >", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayGreaterThanOrEqualTo(String value) {
            addCriterion("wait_day >=", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayLessThan(String value) {
            addCriterion("wait_day <", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayLessThanOrEqualTo(String value) {
            addCriterion("wait_day <=", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayLike(String value) {
            addCriterion("wait_day like", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayNotLike(String value) {
            addCriterion("wait_day not like", value, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayIn(List<String> values) {
            addCriterion("wait_day in", values, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayNotIn(List<String> values) {
            addCriterion("wait_day not in", values, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayBetween(String value1, String value2) {
            addCriterion("wait_day between", value1, value2, "waitDay");
            return (Criteria) this;
        }

        public Criteria andWaitDayNotBetween(String value1, String value2) {
            addCriterion("wait_day not between", value1, value2, "waitDay");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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