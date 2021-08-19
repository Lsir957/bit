package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigExample() {
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andIsUpIsNull() {
            addCriterion("is_up is null");
            return (Criteria) this;
        }

        public Criteria andIsUpIsNotNull() {
            addCriterion("is_up is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpEqualTo(Byte value) {
            addCriterion("is_up =", value, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpNotEqualTo(Byte value) {
            addCriterion("is_up <>", value, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpGreaterThan(Byte value) {
            addCriterion("is_up >", value, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_up >=", value, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpLessThan(Byte value) {
            addCriterion("is_up <", value, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpLessThanOrEqualTo(Byte value) {
            addCriterion("is_up <=", value, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpIn(List<Byte> values) {
            addCriterion("is_up in", values, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpNotIn(List<Byte> values) {
            addCriterion("is_up not in", values, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpBetween(Byte value1, Byte value2) {
            addCriterion("is_up between", value1, value2, "isUp");
            return (Criteria) this;
        }

        public Criteria andIsUpNotBetween(Byte value1, Byte value2) {
            addCriterion("is_up not between", value1, value2, "isUp");
            return (Criteria) this;
        }

        public Criteria andSdSxfIsNull() {
            addCriterion("sd_sxf is null");
            return (Criteria) this;
        }

        public Criteria andSdSxfIsNotNull() {
            addCriterion("sd_sxf is not null");
            return (Criteria) this;
        }

        public Criteria andSdSxfEqualTo(BigDecimal value) {
            addCriterion("sd_sxf =", value, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfNotEqualTo(BigDecimal value) {
            addCriterion("sd_sxf <>", value, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfGreaterThan(BigDecimal value) {
            addCriterion("sd_sxf >", value, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sd_sxf >=", value, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfLessThan(BigDecimal value) {
            addCriterion("sd_sxf <", value, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sd_sxf <=", value, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfIn(List<BigDecimal> values) {
            addCriterion("sd_sxf in", values, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfNotIn(List<BigDecimal> values) {
            addCriterion("sd_sxf not in", values, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sd_sxf between", value1, value2, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andSdSxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sd_sxf not between", value1, value2, "sdSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfIsNull() {
            addCriterion("tx_sxf is null");
            return (Criteria) this;
        }

        public Criteria andTxSxfIsNotNull() {
            addCriterion("tx_sxf is not null");
            return (Criteria) this;
        }

        public Criteria andTxSxfEqualTo(BigDecimal value) {
            addCriterion("tx_sxf =", value, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfNotEqualTo(BigDecimal value) {
            addCriterion("tx_sxf <>", value, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfGreaterThan(BigDecimal value) {
            addCriterion("tx_sxf >", value, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tx_sxf >=", value, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfLessThan(BigDecimal value) {
            addCriterion("tx_sxf <", value, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tx_sxf <=", value, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfIn(List<BigDecimal> values) {
            addCriterion("tx_sxf in", values, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfNotIn(List<BigDecimal> values) {
            addCriterion("tx_sxf not in", values, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tx_sxf between", value1, value2, "txSxf");
            return (Criteria) this;
        }

        public Criteria andTxSxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tx_sxf not between", value1, value2, "txSxf");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("download is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("download is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(String value) {
            addCriterion("download =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(String value) {
            addCriterion("download <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(String value) {
            addCriterion("download >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("download >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(String value) {
            addCriterion("download <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(String value) {
            addCriterion("download <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLike(String value) {
            addCriterion("download like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotLike(String value) {
            addCriterion("download not like", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<String> values) {
            addCriterion("download in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<String> values) {
            addCriterion("download not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(String value1, String value2) {
            addCriterion("download between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(String value1, String value2) {
            addCriterion("download not between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andVeIsNull() {
            addCriterion("ve is null");
            return (Criteria) this;
        }

        public Criteria andVeIsNotNull() {
            addCriterion("ve is not null");
            return (Criteria) this;
        }

        public Criteria andVeEqualTo(String value) {
            addCriterion("ve =", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeNotEqualTo(String value) {
            addCriterion("ve <>", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeGreaterThan(String value) {
            addCriterion("ve >", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeGreaterThanOrEqualTo(String value) {
            addCriterion("ve >=", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeLessThan(String value) {
            addCriterion("ve <", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeLessThanOrEqualTo(String value) {
            addCriterion("ve <=", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeLike(String value) {
            addCriterion("ve like", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeNotLike(String value) {
            addCriterion("ve not like", value, "ve");
            return (Criteria) this;
        }

        public Criteria andVeIn(List<String> values) {
            addCriterion("ve in", values, "ve");
            return (Criteria) this;
        }

        public Criteria andVeNotIn(List<String> values) {
            addCriterion("ve not in", values, "ve");
            return (Criteria) this;
        }

        public Criteria andVeBetween(String value1, String value2) {
            addCriterion("ve between", value1, value2, "ve");
            return (Criteria) this;
        }

        public Criteria andVeNotBetween(String value1, String value2) {
            addCriterion("ve not between", value1, value2, "ve");
            return (Criteria) this;
        }

        public Criteria andGoldIsNull() {
            addCriterion("gold is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion("gold is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(Integer value) {
            addCriterion("gold =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(Integer value) {
            addCriterion("gold <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(Integer value) {
            addCriterion("gold >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(Integer value) {
            addCriterion("gold <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(Integer value) {
            addCriterion("gold <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Integer> values) {
            addCriterion("gold in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Integer> values) {
            addCriterion("gold not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(Integer value1, Integer value2) {
            addCriterion("gold between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("gold not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andWkdjsIsNull() {
            addCriterion("wkdjs is null");
            return (Criteria) this;
        }

        public Criteria andWkdjsIsNotNull() {
            addCriterion("wkdjs is not null");
            return (Criteria) this;
        }

        public Criteria andWkdjsEqualTo(Integer value) {
            addCriterion("wkdjs =", value, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsNotEqualTo(Integer value) {
            addCriterion("wkdjs <>", value, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsGreaterThan(Integer value) {
            addCriterion("wkdjs >", value, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsGreaterThanOrEqualTo(Integer value) {
            addCriterion("wkdjs >=", value, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsLessThan(Integer value) {
            addCriterion("wkdjs <", value, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsLessThanOrEqualTo(Integer value) {
            addCriterion("wkdjs <=", value, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsIn(List<Integer> values) {
            addCriterion("wkdjs in", values, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsNotIn(List<Integer> values) {
            addCriterion("wkdjs not in", values, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsBetween(Integer value1, Integer value2) {
            addCriterion("wkdjs between", value1, value2, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andWkdjsNotBetween(Integer value1, Integer value2) {
            addCriterion("wkdjs not between", value1, value2, "wkdjs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsIsNull() {
            addCriterion("day_txcs is null");
            return (Criteria) this;
        }

        public Criteria andDayTxcsIsNotNull() {
            addCriterion("day_txcs is not null");
            return (Criteria) this;
        }

        public Criteria andDayTxcsEqualTo(Integer value) {
            addCriterion("day_txcs =", value, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsNotEqualTo(Integer value) {
            addCriterion("day_txcs <>", value, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsGreaterThan(Integer value) {
            addCriterion("day_txcs >", value, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_txcs >=", value, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsLessThan(Integer value) {
            addCriterion("day_txcs <", value, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsLessThanOrEqualTo(Integer value) {
            addCriterion("day_txcs <=", value, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsIn(List<Integer> values) {
            addCriterion("day_txcs in", values, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsNotIn(List<Integer> values) {
            addCriterion("day_txcs not in", values, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsBetween(Integer value1, Integer value2) {
            addCriterion("day_txcs between", value1, value2, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andDayTxcsNotBetween(Integer value1, Integer value2) {
            addCriterion("day_txcs not between", value1, value2, "dayTxcs");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("stop is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("stop is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Integer value) {
            addCriterion("stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Integer value) {
            addCriterion("stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Integer value) {
            addCriterion("stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Integer value) {
            addCriterion("stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Integer value) {
            addCriterion("stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Integer> values) {
            addCriterion("stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Integer> values) {
            addCriterion("stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Integer value1, Integer value2) {
            addCriterion("stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Integer value1, Integer value2) {
            addCriterion("stop not between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andCsjwIsNull() {
            addCriterion("csjw is null");
            return (Criteria) this;
        }

        public Criteria andCsjwIsNotNull() {
            addCriterion("csjw is not null");
            return (Criteria) this;
        }

        public Criteria andCsjwEqualTo(Integer value) {
            addCriterion("csjw =", value, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwNotEqualTo(Integer value) {
            addCriterion("csjw <>", value, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwGreaterThan(Integer value) {
            addCriterion("csjw >", value, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwGreaterThanOrEqualTo(Integer value) {
            addCriterion("csjw >=", value, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwLessThan(Integer value) {
            addCriterion("csjw <", value, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwLessThanOrEqualTo(Integer value) {
            addCriterion("csjw <=", value, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwIn(List<Integer> values) {
            addCriterion("csjw in", values, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwNotIn(List<Integer> values) {
            addCriterion("csjw not in", values, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwBetween(Integer value1, Integer value2) {
            addCriterion("csjw between", value1, value2, "csjw");
            return (Criteria) this;
        }

        public Criteria andCsjwNotBetween(Integer value1, Integer value2) {
            addCriterion("csjw not between", value1, value2, "csjw");
            return (Criteria) this;
        }

        public Criteria andJwMaxIsNull() {
            addCriterion("jw_max is null");
            return (Criteria) this;
        }

        public Criteria andJwMaxIsNotNull() {
            addCriterion("jw_max is not null");
            return (Criteria) this;
        }

        public Criteria andJwMaxEqualTo(Integer value) {
            addCriterion("jw_max =", value, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxNotEqualTo(Integer value) {
            addCriterion("jw_max <>", value, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxGreaterThan(Integer value) {
            addCriterion("jw_max >", value, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("jw_max >=", value, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxLessThan(Integer value) {
            addCriterion("jw_max <", value, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxLessThanOrEqualTo(Integer value) {
            addCriterion("jw_max <=", value, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxIn(List<Integer> values) {
            addCriterion("jw_max in", values, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxNotIn(List<Integer> values) {
            addCriterion("jw_max not in", values, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxBetween(Integer value1, Integer value2) {
            addCriterion("jw_max between", value1, value2, "jwMax");
            return (Criteria) this;
        }

        public Criteria andJwMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("jw_max not between", value1, value2, "jwMax");
            return (Criteria) this;
        }

        public Criteria andTjIsNull() {
            addCriterion("tj is null");
            return (Criteria) this;
        }

        public Criteria andTjIsNotNull() {
            addCriterion("tj is not null");
            return (Criteria) this;
        }

        public Criteria andTjEqualTo(BigDecimal value) {
            addCriterion("tj =", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotEqualTo(BigDecimal value) {
            addCriterion("tj <>", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjGreaterThan(BigDecimal value) {
            addCriterion("tj >", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tj >=", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjLessThan(BigDecimal value) {
            addCriterion("tj <", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tj <=", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjIn(List<BigDecimal> values) {
            addCriterion("tj in", values, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotIn(List<BigDecimal> values) {
            addCriterion("tj not in", values, "tj");
            return (Criteria) this;
        }

        public Criteria andTjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tj between", value1, value2, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tj not between", value1, value2, "tj");
            return (Criteria) this;
        }

        public Criteria andTjxIsNull() {
            addCriterion("tjx is null");
            return (Criteria) this;
        }

        public Criteria andTjxIsNotNull() {
            addCriterion("tjx is not null");
            return (Criteria) this;
        }

        public Criteria andTjxEqualTo(BigDecimal value) {
            addCriterion("tjx =", value, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxNotEqualTo(BigDecimal value) {
            addCriterion("tjx <>", value, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxGreaterThan(BigDecimal value) {
            addCriterion("tjx >", value, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tjx >=", value, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxLessThan(BigDecimal value) {
            addCriterion("tjx <", value, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tjx <=", value, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxIn(List<BigDecimal> values) {
            addCriterion("tjx in", values, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxNotIn(List<BigDecimal> values) {
            addCriterion("tjx not in", values, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tjx between", value1, value2, "tjx");
            return (Criteria) this;
        }

        public Criteria andTjxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tjx not between", value1, value2, "tjx");
            return (Criteria) this;
        }

        public Criteria andDcBlIsNull() {
            addCriterion("dc_bl is null");
            return (Criteria) this;
        }

        public Criteria andDcBlIsNotNull() {
            addCriterion("dc_bl is not null");
            return (Criteria) this;
        }

        public Criteria andDcBlEqualTo(BigDecimal value) {
            addCriterion("dc_bl =", value, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlNotEqualTo(BigDecimal value) {
            addCriterion("dc_bl <>", value, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlGreaterThan(BigDecimal value) {
            addCriterion("dc_bl >", value, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dc_bl >=", value, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlLessThan(BigDecimal value) {
            addCriterion("dc_bl <", value, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dc_bl <=", value, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlIn(List<BigDecimal> values) {
            addCriterion("dc_bl in", values, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlNotIn(List<BigDecimal> values) {
            addCriterion("dc_bl not in", values, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dc_bl between", value1, value2, "dcBl");
            return (Criteria) this;
        }

        public Criteria andDcBlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dc_bl not between", value1, value2, "dcBl");
            return (Criteria) this;
        }

        public Criteria andFhIsNull() {
            addCriterion("fh is null");
            return (Criteria) this;
        }

        public Criteria andFhIsNotNull() {
            addCriterion("fh is not null");
            return (Criteria) this;
        }

        public Criteria andFhEqualTo(BigDecimal value) {
            addCriterion("fh =", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotEqualTo(BigDecimal value) {
            addCriterion("fh <>", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThan(BigDecimal value) {
            addCriterion("fh >", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fh >=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThan(BigDecimal value) {
            addCriterion("fh <", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fh <=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhIn(List<BigDecimal> values) {
            addCriterion("fh in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotIn(List<BigDecimal> values) {
            addCriterion("fh not in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fh between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fh not between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andJdYjIsNull() {
            addCriterion("jd_yj is null");
            return (Criteria) this;
        }

        public Criteria andJdYjIsNotNull() {
            addCriterion("jd_yj is not null");
            return (Criteria) this;
        }

        public Criteria andJdYjEqualTo(BigDecimal value) {
            addCriterion("jd_yj =", value, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjNotEqualTo(BigDecimal value) {
            addCriterion("jd_yj <>", value, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjGreaterThan(BigDecimal value) {
            addCriterion("jd_yj >", value, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jd_yj >=", value, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjLessThan(BigDecimal value) {
            addCriterion("jd_yj <", value, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jd_yj <=", value, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjIn(List<BigDecimal> values) {
            addCriterion("jd_yj in", values, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjNotIn(List<BigDecimal> values) {
            addCriterion("jd_yj not in", values, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jd_yj between", value1, value2, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdYjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jd_yj not between", value1, value2, "jdYj");
            return (Criteria) this;
        }

        public Criteria andJdsIsNull() {
            addCriterion("jds is null");
            return (Criteria) this;
        }

        public Criteria andJdsIsNotNull() {
            addCriterion("jds is not null");
            return (Criteria) this;
        }

        public Criteria andJdsEqualTo(Integer value) {
            addCriterion("jds =", value, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsNotEqualTo(Integer value) {
            addCriterion("jds <>", value, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsGreaterThan(Integer value) {
            addCriterion("jds >", value, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("jds >=", value, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsLessThan(Integer value) {
            addCriterion("jds <", value, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsLessThanOrEqualTo(Integer value) {
            addCriterion("jds <=", value, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsIn(List<Integer> values) {
            addCriterion("jds in", values, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsNotIn(List<Integer> values) {
            addCriterion("jds not in", values, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsBetween(Integer value1, Integer value2) {
            addCriterion("jds between", value1, value2, "jds");
            return (Criteria) this;
        }

        public Criteria andJdsNotBetween(Integer value1, Integer value2) {
            addCriterion("jds not between", value1, value2, "jds");
            return (Criteria) this;
        }

        public Criteria andGudongIsNull() {
            addCriterion("gudong is null");
            return (Criteria) this;
        }

        public Criteria andGudongIsNotNull() {
            addCriterion("gudong is not null");
            return (Criteria) this;
        }

        public Criteria andGudongEqualTo(Integer value) {
            addCriterion("gudong =", value, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongNotEqualTo(Integer value) {
            addCriterion("gudong <>", value, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongGreaterThan(Integer value) {
            addCriterion("gudong >", value, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongGreaterThanOrEqualTo(Integer value) {
            addCriterion("gudong >=", value, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongLessThan(Integer value) {
            addCriterion("gudong <", value, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongLessThanOrEqualTo(Integer value) {
            addCriterion("gudong <=", value, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongIn(List<Integer> values) {
            addCriterion("gudong in", values, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongNotIn(List<Integer> values) {
            addCriterion("gudong not in", values, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongBetween(Integer value1, Integer value2) {
            addCriterion("gudong between", value1, value2, "gudong");
            return (Criteria) this;
        }

        public Criteria andGudongNotBetween(Integer value1, Integer value2) {
            addCriterion("gudong not between", value1, value2, "gudong");
            return (Criteria) this;
        }

        public Criteria andThsJdIsNull() {
            addCriterion("ths_jd is null");
            return (Criteria) this;
        }

        public Criteria andThsJdIsNotNull() {
            addCriterion("ths_jd is not null");
            return (Criteria) this;
        }

        public Criteria andThsJdEqualTo(Integer value) {
            addCriterion("ths_jd =", value, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdNotEqualTo(Integer value) {
            addCriterion("ths_jd <>", value, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdGreaterThan(Integer value) {
            addCriterion("ths_jd >", value, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ths_jd >=", value, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdLessThan(Integer value) {
            addCriterion("ths_jd <", value, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdLessThanOrEqualTo(Integer value) {
            addCriterion("ths_jd <=", value, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdIn(List<Integer> values) {
            addCriterion("ths_jd in", values, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdNotIn(List<Integer> values) {
            addCriterion("ths_jd not in", values, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdBetween(Integer value1, Integer value2) {
            addCriterion("ths_jd between", value1, value2, "thsJd");
            return (Criteria) this;
        }

        public Criteria andThsJdNotBetween(Integer value1, Integer value2) {
            addCriterion("ths_jd not between", value1, value2, "thsJd");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeIsNull() {
            addCriterion("sdover_time is null");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeIsNotNull() {
            addCriterion("sdover_time is not null");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeEqualTo(String value) {
            addCriterion("sdover_time =", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeNotEqualTo(String value) {
            addCriterion("sdover_time <>", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeGreaterThan(String value) {
            addCriterion("sdover_time >", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sdover_time >=", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeLessThan(String value) {
            addCriterion("sdover_time <", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeLessThanOrEqualTo(String value) {
            addCriterion("sdover_time <=", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeLike(String value) {
            addCriterion("sdover_time like", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeNotLike(String value) {
            addCriterion("sdover_time not like", value, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeIn(List<String> values) {
            addCriterion("sdover_time in", values, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeNotIn(List<String> values) {
            addCriterion("sdover_time not in", values, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeBetween(String value1, String value2) {
            addCriterion("sdover_time between", value1, value2, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andSdoverTimeNotBetween(String value1, String value2) {
            addCriterion("sdover_time not between", value1, value2, "sdoverTime");
            return (Criteria) this;
        }

        public Criteria andKefuweixinIsNull() {
            addCriterion("kefuweixin is null");
            return (Criteria) this;
        }

        public Criteria andKefuweixinIsNotNull() {
            addCriterion("kefuweixin is not null");
            return (Criteria) this;
        }

        public Criteria andKefuweixinEqualTo(String value) {
            addCriterion("kefuweixin =", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinNotEqualTo(String value) {
            addCriterion("kefuweixin <>", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinGreaterThan(String value) {
            addCriterion("kefuweixin >", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinGreaterThanOrEqualTo(String value) {
            addCriterion("kefuweixin >=", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinLessThan(String value) {
            addCriterion("kefuweixin <", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinLessThanOrEqualTo(String value) {
            addCriterion("kefuweixin <=", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinLike(String value) {
            addCriterion("kefuweixin like", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinNotLike(String value) {
            addCriterion("kefuweixin not like", value, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinIn(List<String> values) {
            addCriterion("kefuweixin in", values, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinNotIn(List<String> values) {
            addCriterion("kefuweixin not in", values, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinBetween(String value1, String value2) {
            addCriterion("kefuweixin between", value1, value2, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andKefuweixinNotBetween(String value1, String value2) {
            addCriterion("kefuweixin not between", value1, value2, "kefuweixin");
            return (Criteria) this;
        }

        public Criteria andSigninJlIsNull() {
            addCriterion("signin_jl is null");
            return (Criteria) this;
        }

        public Criteria andSigninJlIsNotNull() {
            addCriterion("signin_jl is not null");
            return (Criteria) this;
        }

        public Criteria andSigninJlEqualTo(BigDecimal value) {
            addCriterion("signin_jl =", value, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlNotEqualTo(BigDecimal value) {
            addCriterion("signin_jl <>", value, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlGreaterThan(BigDecimal value) {
            addCriterion("signin_jl >", value, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("signin_jl >=", value, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlLessThan(BigDecimal value) {
            addCriterion("signin_jl <", value, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("signin_jl <=", value, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlIn(List<BigDecimal> values) {
            addCriterion("signin_jl in", values, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlNotIn(List<BigDecimal> values) {
            addCriterion("signin_jl not in", values, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signin_jl between", value1, value2, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSigninJlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signin_jl not between", value1, value2, "signinJl");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaIsNull() {
            addCriterion("sd_sxf_uada is null");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaIsNotNull() {
            addCriterion("sd_sxf_uada is not null");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaEqualTo(Float value) {
            addCriterion("sd_sxf_uada =", value, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaNotEqualTo(Float value) {
            addCriterion("sd_sxf_uada <>", value, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaGreaterThan(Float value) {
            addCriterion("sd_sxf_uada >", value, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaGreaterThanOrEqualTo(Float value) {
            addCriterion("sd_sxf_uada >=", value, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaLessThan(Float value) {
            addCriterion("sd_sxf_uada <", value, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaLessThanOrEqualTo(Float value) {
            addCriterion("sd_sxf_uada <=", value, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaIn(List<Float> values) {
            addCriterion("sd_sxf_uada in", values, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaNotIn(List<Float> values) {
            addCriterion("sd_sxf_uada not in", values, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaBetween(Float value1, Float value2) {
            addCriterion("sd_sxf_uada between", value1, value2, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andSdSxfUadaNotBetween(Float value1, Float value2) {
            addCriterion("sd_sxf_uada not between", value1, value2, "sdSxfUada");
            return (Criteria) this;
        }

        public Criteria andLoginstatuIsNull() {
            addCriterion("loginstatu is null");
            return (Criteria) this;
        }

        public Criteria andLoginstatuIsNotNull() {
            addCriterion("loginstatu is not null");
            return (Criteria) this;
        }

        public Criteria andLoginstatuEqualTo(Integer value) {
            addCriterion("loginstatu =", value, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuNotEqualTo(Integer value) {
            addCriterion("loginstatu <>", value, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuGreaterThan(Integer value) {
            addCriterion("loginstatu >", value, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginstatu >=", value, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuLessThan(Integer value) {
            addCriterion("loginstatu <", value, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuLessThanOrEqualTo(Integer value) {
            addCriterion("loginstatu <=", value, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuIn(List<Integer> values) {
            addCriterion("loginstatu in", values, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuNotIn(List<Integer> values) {
            addCriterion("loginstatu not in", values, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuBetween(Integer value1, Integer value2) {
            addCriterion("loginstatu between", value1, value2, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andLoginstatuNotBetween(Integer value1, Integer value2) {
            addCriterion("loginstatu not between", value1, value2, "loginstatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuIsNull() {
            addCriterion("reg_statu is null");
            return (Criteria) this;
        }

        public Criteria andRegStatuIsNotNull() {
            addCriterion("reg_statu is not null");
            return (Criteria) this;
        }

        public Criteria andRegStatuEqualTo(Integer value) {
            addCriterion("reg_statu =", value, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuNotEqualTo(Integer value) {
            addCriterion("reg_statu <>", value, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuGreaterThan(Integer value) {
            addCriterion("reg_statu >", value, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_statu >=", value, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuLessThan(Integer value) {
            addCriterion("reg_statu <", value, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuLessThanOrEqualTo(Integer value) {
            addCriterion("reg_statu <=", value, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuIn(List<Integer> values) {
            addCriterion("reg_statu in", values, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuNotIn(List<Integer> values) {
            addCriterion("reg_statu not in", values, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuBetween(Integer value1, Integer value2) {
            addCriterion("reg_statu between", value1, value2, "regStatu");
            return (Criteria) this;
        }

        public Criteria andRegStatuNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_statu not between", value1, value2, "regStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuIsNull() {
            addCriterion("tx_statu is null");
            return (Criteria) this;
        }

        public Criteria andTxStatuIsNotNull() {
            addCriterion("tx_statu is not null");
            return (Criteria) this;
        }

        public Criteria andTxStatuEqualTo(Integer value) {
            addCriterion("tx_statu =", value, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuNotEqualTo(Integer value) {
            addCriterion("tx_statu <>", value, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuGreaterThan(Integer value) {
            addCriterion("tx_statu >", value, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("tx_statu >=", value, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuLessThan(Integer value) {
            addCriterion("tx_statu <", value, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuLessThanOrEqualTo(Integer value) {
            addCriterion("tx_statu <=", value, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuIn(List<Integer> values) {
            addCriterion("tx_statu in", values, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuNotIn(List<Integer> values) {
            addCriterion("tx_statu not in", values, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuBetween(Integer value1, Integer value2) {
            addCriterion("tx_statu between", value1, value2, "txStatu");
            return (Criteria) this;
        }

        public Criteria andTxStatuNotBetween(Integer value1, Integer value2) {
            addCriterion("tx_statu not between", value1, value2, "txStatu");
            return (Criteria) this;
        }

        public Criteria andCjYzmIsNull() {
            addCriterion("cj_yzm is null");
            return (Criteria) this;
        }

        public Criteria andCjYzmIsNotNull() {
            addCriterion("cj_yzm is not null");
            return (Criteria) this;
        }

        public Criteria andCjYzmEqualTo(Integer value) {
            addCriterion("cj_yzm =", value, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmNotEqualTo(Integer value) {
            addCriterion("cj_yzm <>", value, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmGreaterThan(Integer value) {
            addCriterion("cj_yzm >", value, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmGreaterThanOrEqualTo(Integer value) {
            addCriterion("cj_yzm >=", value, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmLessThan(Integer value) {
            addCriterion("cj_yzm <", value, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmLessThanOrEqualTo(Integer value) {
            addCriterion("cj_yzm <=", value, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmIn(List<Integer> values) {
            addCriterion("cj_yzm in", values, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmNotIn(List<Integer> values) {
            addCriterion("cj_yzm not in", values, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmBetween(Integer value1, Integer value2) {
            addCriterion("cj_yzm between", value1, value2, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andCjYzmNotBetween(Integer value1, Integer value2) {
            addCriterion("cj_yzm not between", value1, value2, "cjYzm");
            return (Criteria) this;
        }

        public Criteria andPtcb2IsNull() {
            addCriterion("ptcb2 is null");
            return (Criteria) this;
        }

        public Criteria andPtcb2IsNotNull() {
            addCriterion("ptcb2 is not null");
            return (Criteria) this;
        }

        public Criteria andPtcb2EqualTo(Integer value) {
            addCriterion("ptcb2 =", value, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2NotEqualTo(Integer value) {
            addCriterion("ptcb2 <>", value, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2GreaterThan(Integer value) {
            addCriterion("ptcb2 >", value, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ptcb2 >=", value, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2LessThan(Integer value) {
            addCriterion("ptcb2 <", value, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2LessThanOrEqualTo(Integer value) {
            addCriterion("ptcb2 <=", value, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2In(List<Integer> values) {
            addCriterion("ptcb2 in", values, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2NotIn(List<Integer> values) {
            addCriterion("ptcb2 not in", values, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2Between(Integer value1, Integer value2) {
            addCriterion("ptcb2 between", value1, value2, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb2NotBetween(Integer value1, Integer value2) {
            addCriterion("ptcb2 not between", value1, value2, "ptcb2");
            return (Criteria) this;
        }

        public Criteria andPtcb3IsNull() {
            addCriterion("ptcb3 is null");
            return (Criteria) this;
        }

        public Criteria andPtcb3IsNotNull() {
            addCriterion("ptcb3 is not null");
            return (Criteria) this;
        }

        public Criteria andPtcb3EqualTo(Integer value) {
            addCriterion("ptcb3 =", value, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3NotEqualTo(Integer value) {
            addCriterion("ptcb3 <>", value, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3GreaterThan(Integer value) {
            addCriterion("ptcb3 >", value, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ptcb3 >=", value, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3LessThan(Integer value) {
            addCriterion("ptcb3 <", value, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3LessThanOrEqualTo(Integer value) {
            addCriterion("ptcb3 <=", value, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3In(List<Integer> values) {
            addCriterion("ptcb3 in", values, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3NotIn(List<Integer> values) {
            addCriterion("ptcb3 not in", values, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3Between(Integer value1, Integer value2) {
            addCriterion("ptcb3 between", value1, value2, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andPtcb3NotBetween(Integer value1, Integer value2) {
            addCriterion("ptcb3 not between", value1, value2, "ptcb3");
            return (Criteria) this;
        }

        public Criteria andTj2IsNull() {
            addCriterion("tj2 is null");
            return (Criteria) this;
        }

        public Criteria andTj2IsNotNull() {
            addCriterion("tj2 is not null");
            return (Criteria) this;
        }

        public Criteria andTj2EqualTo(BigDecimal value) {
            addCriterion("tj2 =", value, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2NotEqualTo(BigDecimal value) {
            addCriterion("tj2 <>", value, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2GreaterThan(BigDecimal value) {
            addCriterion("tj2 >", value, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tj2 >=", value, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2LessThan(BigDecimal value) {
            addCriterion("tj2 <", value, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("tj2 <=", value, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2In(List<BigDecimal> values) {
            addCriterion("tj2 in", values, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2NotIn(List<BigDecimal> values) {
            addCriterion("tj2 not in", values, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("tj2 between", value1, value2, "tj2");
            return (Criteria) this;
        }

        public Criteria andTj2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tj2 not between", value1, value2, "tj2");
            return (Criteria) this;
        }

        public Criteria andScSfIsNull() {
            addCriterion("sc_sf is null");
            return (Criteria) this;
        }

        public Criteria andScSfIsNotNull() {
            addCriterion("sc_sf is not null");
            return (Criteria) this;
        }

        public Criteria andScSfEqualTo(Float value) {
            addCriterion("sc_sf =", value, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfNotEqualTo(Float value) {
            addCriterion("sc_sf <>", value, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfGreaterThan(Float value) {
            addCriterion("sc_sf >", value, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfGreaterThanOrEqualTo(Float value) {
            addCriterion("sc_sf >=", value, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfLessThan(Float value) {
            addCriterion("sc_sf <", value, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfLessThanOrEqualTo(Float value) {
            addCriterion("sc_sf <=", value, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfIn(List<Float> values) {
            addCriterion("sc_sf in", values, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfNotIn(List<Float> values) {
            addCriterion("sc_sf not in", values, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfBetween(Float value1, Float value2) {
            addCriterion("sc_sf between", value1, value2, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSfNotBetween(Float value1, Float value2) {
            addCriterion("sc_sf not between", value1, value2, "scSf");
            return (Criteria) this;
        }

        public Criteria andScSyIsNull() {
            addCriterion("sc_sy is null");
            return (Criteria) this;
        }

        public Criteria andScSyIsNotNull() {
            addCriterion("sc_sy is not null");
            return (Criteria) this;
        }

        public Criteria andScSyEqualTo(Float value) {
            addCriterion("sc_sy =", value, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyNotEqualTo(Float value) {
            addCriterion("sc_sy <>", value, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyGreaterThan(Float value) {
            addCriterion("sc_sy >", value, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyGreaterThanOrEqualTo(Float value) {
            addCriterion("sc_sy >=", value, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyLessThan(Float value) {
            addCriterion("sc_sy <", value, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyLessThanOrEqualTo(Float value) {
            addCriterion("sc_sy <=", value, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyIn(List<Float> values) {
            addCriterion("sc_sy in", values, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyNotIn(List<Float> values) {
            addCriterion("sc_sy not in", values, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyBetween(Float value1, Float value2) {
            addCriterion("sc_sy between", value1, value2, "scSy");
            return (Criteria) this;
        }

        public Criteria andScSyNotBetween(Float value1, Float value2) {
            addCriterion("sc_sy not between", value1, value2, "scSy");
            return (Criteria) this;
        }

        public Criteria andKsTimeIsNull() {
            addCriterion("ks_time is null");
            return (Criteria) this;
        }

        public Criteria andKsTimeIsNotNull() {
            addCriterion("ks_time is not null");
            return (Criteria) this;
        }

        public Criteria andKsTimeEqualTo(String value) {
            addCriterion("ks_time =", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeNotEqualTo(String value) {
            addCriterion("ks_time <>", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeGreaterThan(String value) {
            addCriterion("ks_time >", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ks_time >=", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeLessThan(String value) {
            addCriterion("ks_time <", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeLessThanOrEqualTo(String value) {
            addCriterion("ks_time <=", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeLike(String value) {
            addCriterion("ks_time like", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeNotLike(String value) {
            addCriterion("ks_time not like", value, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeIn(List<String> values) {
            addCriterion("ks_time in", values, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeNotIn(List<String> values) {
            addCriterion("ks_time not in", values, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeBetween(String value1, String value2) {
            addCriterion("ks_time between", value1, value2, "ksTime");
            return (Criteria) this;
        }

        public Criteria andKsTimeNotBetween(String value1, String value2) {
            addCriterion("ks_time not between", value1, value2, "ksTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeIsNull() {
            addCriterion("js_time is null");
            return (Criteria) this;
        }

        public Criteria andJsTimeIsNotNull() {
            addCriterion("js_time is not null");
            return (Criteria) this;
        }

        public Criteria andJsTimeEqualTo(String value) {
            addCriterion("js_time =", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeNotEqualTo(String value) {
            addCriterion("js_time <>", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeGreaterThan(String value) {
            addCriterion("js_time >", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("js_time >=", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeLessThan(String value) {
            addCriterion("js_time <", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeLessThanOrEqualTo(String value) {
            addCriterion("js_time <=", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeLike(String value) {
            addCriterion("js_time like", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeNotLike(String value) {
            addCriterion("js_time not like", value, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeIn(List<String> values) {
            addCriterion("js_time in", values, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeNotIn(List<String> values) {
            addCriterion("js_time not in", values, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeBetween(String value1, String value2) {
            addCriterion("js_time between", value1, value2, "jsTime");
            return (Criteria) this;
        }

        public Criteria andJsTimeNotBetween(String value1, String value2) {
            addCriterion("js_time not between", value1, value2, "jsTime");
            return (Criteria) this;
        }

        public Criteria andGdfhIsNull() {
            addCriterion("gdfh is null");
            return (Criteria) this;
        }

        public Criteria andGdfhIsNotNull() {
            addCriterion("gdfh is not null");
            return (Criteria) this;
        }

        public Criteria andGdfhEqualTo(BigDecimal value) {
            addCriterion("gdfh =", value, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhNotEqualTo(BigDecimal value) {
            addCriterion("gdfh <>", value, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhGreaterThan(BigDecimal value) {
            addCriterion("gdfh >", value, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gdfh >=", value, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhLessThan(BigDecimal value) {
            addCriterion("gdfh <", value, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gdfh <=", value, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhIn(List<BigDecimal> values) {
            addCriterion("gdfh in", values, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhNotIn(List<BigDecimal> values) {
            addCriterion("gdfh not in", values, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gdfh between", value1, value2, "gdfh");
            return (Criteria) this;
        }

        public Criteria andGdfhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gdfh not between", value1, value2, "gdfh");
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

        public Criteria andDtssIsNull() {
            addCriterion("dtss is null");
            return (Criteria) this;
        }

        public Criteria andDtssIsNotNull() {
            addCriterion("dtss is not null");
            return (Criteria) this;
        }

        public Criteria andDtssEqualTo(BigDecimal value) {
            addCriterion("dtss =", value, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssNotEqualTo(BigDecimal value) {
            addCriterion("dtss <>", value, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssGreaterThan(BigDecimal value) {
            addCriterion("dtss >", value, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dtss >=", value, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssLessThan(BigDecimal value) {
            addCriterion("dtss <", value, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dtss <=", value, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssIn(List<BigDecimal> values) {
            addCriterion("dtss in", values, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssNotIn(List<BigDecimal> values) {
            addCriterion("dtss not in", values, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dtss between", value1, value2, "dtss");
            return (Criteria) this;
        }

        public Criteria andDtssNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dtss not between", value1, value2, "dtss");
            return (Criteria) this;
        }

        public Criteria andTdssIsNull() {
            addCriterion("tdss is null");
            return (Criteria) this;
        }

        public Criteria andTdssIsNotNull() {
            addCriterion("tdss is not null");
            return (Criteria) this;
        }

        public Criteria andTdssEqualTo(BigDecimal value) {
            addCriterion("tdss =", value, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssNotEqualTo(BigDecimal value) {
            addCriterion("tdss <>", value, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssGreaterThan(BigDecimal value) {
            addCriterion("tdss >", value, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tdss >=", value, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssLessThan(BigDecimal value) {
            addCriterion("tdss <", value, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tdss <=", value, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssIn(List<BigDecimal> values) {
            addCriterion("tdss in", values, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssNotIn(List<BigDecimal> values) {
            addCriterion("tdss not in", values, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tdss between", value1, value2, "tdss");
            return (Criteria) this;
        }

        public Criteria andTdssNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tdss not between", value1, value2, "tdss");
            return (Criteria) this;
        }

        public Criteria andIosDownloadIsNull() {
            addCriterion("ios_download is null");
            return (Criteria) this;
        }

        public Criteria andIosDownloadIsNotNull() {
            addCriterion("ios_download is not null");
            return (Criteria) this;
        }

        public Criteria andIosDownloadEqualTo(String value) {
            addCriterion("ios_download =", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadNotEqualTo(String value) {
            addCriterion("ios_download <>", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadGreaterThan(String value) {
            addCriterion("ios_download >", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("ios_download >=", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadLessThan(String value) {
            addCriterion("ios_download <", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadLessThanOrEqualTo(String value) {
            addCriterion("ios_download <=", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadLike(String value) {
            addCriterion("ios_download like", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadNotLike(String value) {
            addCriterion("ios_download not like", value, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadIn(List<String> values) {
            addCriterion("ios_download in", values, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadNotIn(List<String> values) {
            addCriterion("ios_download not in", values, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadBetween(String value1, String value2) {
            addCriterion("ios_download between", value1, value2, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosDownloadNotBetween(String value1, String value2) {
            addCriterion("ios_download not between", value1, value2, "iosDownload");
            return (Criteria) this;
        }

        public Criteria andIosVeIsNull() {
            addCriterion("ios_ve is null");
            return (Criteria) this;
        }

        public Criteria andIosVeIsNotNull() {
            addCriterion("ios_ve is not null");
            return (Criteria) this;
        }

        public Criteria andIosVeEqualTo(String value) {
            addCriterion("ios_ve =", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeNotEqualTo(String value) {
            addCriterion("ios_ve <>", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeGreaterThan(String value) {
            addCriterion("ios_ve >", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeGreaterThanOrEqualTo(String value) {
            addCriterion("ios_ve >=", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeLessThan(String value) {
            addCriterion("ios_ve <", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeLessThanOrEqualTo(String value) {
            addCriterion("ios_ve <=", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeLike(String value) {
            addCriterion("ios_ve like", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeNotLike(String value) {
            addCriterion("ios_ve not like", value, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeIn(List<String> values) {
            addCriterion("ios_ve in", values, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeNotIn(List<String> values) {
            addCriterion("ios_ve not in", values, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeBetween(String value1, String value2) {
            addCriterion("ios_ve between", value1, value2, "iosVe");
            return (Criteria) this;
        }

        public Criteria andIosVeNotBetween(String value1, String value2) {
            addCriterion("ios_ve not between", value1, value2, "iosVe");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadIsNull() {
            addCriterion("android_download is null");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadIsNotNull() {
            addCriterion("android_download is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadEqualTo(String value) {
            addCriterion("android_download =", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadNotEqualTo(String value) {
            addCriterion("android_download <>", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadGreaterThan(String value) {
            addCriterion("android_download >", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("android_download >=", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadLessThan(String value) {
            addCriterion("android_download <", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadLessThanOrEqualTo(String value) {
            addCriterion("android_download <=", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadLike(String value) {
            addCriterion("android_download like", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadNotLike(String value) {
            addCriterion("android_download not like", value, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadIn(List<String> values) {
            addCriterion("android_download in", values, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadNotIn(List<String> values) {
            addCriterion("android_download not in", values, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadBetween(String value1, String value2) {
            addCriterion("android_download between", value1, value2, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andAndroidDownloadNotBetween(String value1, String value2) {
            addCriterion("android_download not between", value1, value2, "androidDownload");
            return (Criteria) this;
        }

        public Criteria andU2immtIsNull() {
            addCriterion("u2immt is null");
            return (Criteria) this;
        }

        public Criteria andU2immtIsNotNull() {
            addCriterion("u2immt is not null");
            return (Criteria) this;
        }

        public Criteria andU2immtEqualTo(Float value) {
            addCriterion("u2immt =", value, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtNotEqualTo(Float value) {
            addCriterion("u2immt <>", value, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtGreaterThan(Float value) {
            addCriterion("u2immt >", value, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtGreaterThanOrEqualTo(Float value) {
            addCriterion("u2immt >=", value, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtLessThan(Float value) {
            addCriterion("u2immt <", value, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtLessThanOrEqualTo(Float value) {
            addCriterion("u2immt <=", value, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtIn(List<Float> values) {
            addCriterion("u2immt in", values, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtNotIn(List<Float> values) {
            addCriterion("u2immt not in", values, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtBetween(Float value1, Float value2) {
            addCriterion("u2immt between", value1, value2, "u2immt");
            return (Criteria) this;
        }

        public Criteria andU2immtNotBetween(Float value1, Float value2) {
            addCriterion("u2immt not between", value1, value2, "u2immt");
            return (Criteria) this;
        }

        public Criteria andAwardLv1IsNull() {
            addCriterion("award_lv1 is null");
            return (Criteria) this;
        }

        public Criteria andAwardLv1IsNotNull() {
            addCriterion("award_lv1 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLv1EqualTo(String value) {
            addCriterion("award_lv1 =", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1NotEqualTo(String value) {
            addCriterion("award_lv1 <>", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1GreaterThan(String value) {
            addCriterion("award_lv1 >", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1GreaterThanOrEqualTo(String value) {
            addCriterion("award_lv1 >=", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1LessThan(String value) {
            addCriterion("award_lv1 <", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1LessThanOrEqualTo(String value) {
            addCriterion("award_lv1 <=", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1Like(String value) {
            addCriterion("award_lv1 like", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1NotLike(String value) {
            addCriterion("award_lv1 not like", value, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1In(List<String> values) {
            addCriterion("award_lv1 in", values, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1NotIn(List<String> values) {
            addCriterion("award_lv1 not in", values, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1Between(String value1, String value2) {
            addCriterion("award_lv1 between", value1, value2, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv1NotBetween(String value1, String value2) {
            addCriterion("award_lv1 not between", value1, value2, "awardLv1");
            return (Criteria) this;
        }

        public Criteria andAwardLv2IsNull() {
            addCriterion("award_lv2 is null");
            return (Criteria) this;
        }

        public Criteria andAwardLv2IsNotNull() {
            addCriterion("award_lv2 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLv2EqualTo(String value) {
            addCriterion("award_lv2 =", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2NotEqualTo(String value) {
            addCriterion("award_lv2 <>", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2GreaterThan(String value) {
            addCriterion("award_lv2 >", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2GreaterThanOrEqualTo(String value) {
            addCriterion("award_lv2 >=", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2LessThan(String value) {
            addCriterion("award_lv2 <", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2LessThanOrEqualTo(String value) {
            addCriterion("award_lv2 <=", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2Like(String value) {
            addCriterion("award_lv2 like", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2NotLike(String value) {
            addCriterion("award_lv2 not like", value, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2In(List<String> values) {
            addCriterion("award_lv2 in", values, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2NotIn(List<String> values) {
            addCriterion("award_lv2 not in", values, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2Between(String value1, String value2) {
            addCriterion("award_lv2 between", value1, value2, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv2NotBetween(String value1, String value2) {
            addCriterion("award_lv2 not between", value1, value2, "awardLv2");
            return (Criteria) this;
        }

        public Criteria andAwardLv3IsNull() {
            addCriterion("award_lv3 is null");
            return (Criteria) this;
        }

        public Criteria andAwardLv3IsNotNull() {
            addCriterion("award_lv3 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLv3EqualTo(String value) {
            addCriterion("award_lv3 =", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3NotEqualTo(String value) {
            addCriterion("award_lv3 <>", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3GreaterThan(String value) {
            addCriterion("award_lv3 >", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3GreaterThanOrEqualTo(String value) {
            addCriterion("award_lv3 >=", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3LessThan(String value) {
            addCriterion("award_lv3 <", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3LessThanOrEqualTo(String value) {
            addCriterion("award_lv3 <=", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3Like(String value) {
            addCriterion("award_lv3 like", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3NotLike(String value) {
            addCriterion("award_lv3 not like", value, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3In(List<String> values) {
            addCriterion("award_lv3 in", values, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3NotIn(List<String> values) {
            addCriterion("award_lv3 not in", values, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3Between(String value1, String value2) {
            addCriterion("award_lv3 between", value1, value2, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv3NotBetween(String value1, String value2) {
            addCriterion("award_lv3 not between", value1, value2, "awardLv3");
            return (Criteria) this;
        }

        public Criteria andAwardLv4IsNull() {
            addCriterion("award_lv4 is null");
            return (Criteria) this;
        }

        public Criteria andAwardLv4IsNotNull() {
            addCriterion("award_lv4 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLv4EqualTo(String value) {
            addCriterion("award_lv4 =", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4NotEqualTo(String value) {
            addCriterion("award_lv4 <>", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4GreaterThan(String value) {
            addCriterion("award_lv4 >", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4GreaterThanOrEqualTo(String value) {
            addCriterion("award_lv4 >=", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4LessThan(String value) {
            addCriterion("award_lv4 <", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4LessThanOrEqualTo(String value) {
            addCriterion("award_lv4 <=", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4Like(String value) {
            addCriterion("award_lv4 like", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4NotLike(String value) {
            addCriterion("award_lv4 not like", value, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4In(List<String> values) {
            addCriterion("award_lv4 in", values, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4NotIn(List<String> values) {
            addCriterion("award_lv4 not in", values, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4Between(String value1, String value2) {
            addCriterion("award_lv4 between", value1, value2, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv4NotBetween(String value1, String value2) {
            addCriterion("award_lv4 not between", value1, value2, "awardLv4");
            return (Criteria) this;
        }

        public Criteria andAwardLv5IsNull() {
            addCriterion("award_lv5 is null");
            return (Criteria) this;
        }

        public Criteria andAwardLv5IsNotNull() {
            addCriterion("award_lv5 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLv5EqualTo(String value) {
            addCriterion("award_lv5 =", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5NotEqualTo(String value) {
            addCriterion("award_lv5 <>", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5GreaterThan(String value) {
            addCriterion("award_lv5 >", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5GreaterThanOrEqualTo(String value) {
            addCriterion("award_lv5 >=", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5LessThan(String value) {
            addCriterion("award_lv5 <", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5LessThanOrEqualTo(String value) {
            addCriterion("award_lv5 <=", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5Like(String value) {
            addCriterion("award_lv5 like", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5NotLike(String value) {
            addCriterion("award_lv5 not like", value, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5In(List<String> values) {
            addCriterion("award_lv5 in", values, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5NotIn(List<String> values) {
            addCriterion("award_lv5 not in", values, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5Between(String value1, String value2) {
            addCriterion("award_lv5 between", value1, value2, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andAwardLv5NotBetween(String value1, String value2) {
            addCriterion("award_lv5 not between", value1, value2, "awardLv5");
            return (Criteria) this;
        }

        public Criteria andBedAwardIsNull() {
            addCriterion("bed_award is null");
            return (Criteria) this;
        }

        public Criteria andBedAwardIsNotNull() {
            addCriterion("bed_award is not null");
            return (Criteria) this;
        }

        public Criteria andBedAwardEqualTo(Integer value) {
            addCriterion("bed_award =", value, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardNotEqualTo(Integer value) {
            addCriterion("bed_award <>", value, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardGreaterThan(Integer value) {
            addCriterion("bed_award >", value, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_award >=", value, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardLessThan(Integer value) {
            addCriterion("bed_award <", value, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardLessThanOrEqualTo(Integer value) {
            addCriterion("bed_award <=", value, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardIn(List<Integer> values) {
            addCriterion("bed_award in", values, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardNotIn(List<Integer> values) {
            addCriterion("bed_award not in", values, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardBetween(Integer value1, Integer value2) {
            addCriterion("bed_award between", value1, value2, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_award not between", value1, value2, "bedAward");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuIsNull() {
            addCriterion("bed_award_jishu is null");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuIsNotNull() {
            addCriterion("bed_award_jishu is not null");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuEqualTo(Integer value) {
            addCriterion("bed_award_jishu =", value, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuNotEqualTo(Integer value) {
            addCriterion("bed_award_jishu <>", value, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuGreaterThan(Integer value) {
            addCriterion("bed_award_jishu >", value, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_award_jishu >=", value, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuLessThan(Integer value) {
            addCriterion("bed_award_jishu <", value, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuLessThanOrEqualTo(Integer value) {
            addCriterion("bed_award_jishu <=", value, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuIn(List<Integer> values) {
            addCriterion("bed_award_jishu in", values, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuNotIn(List<Integer> values) {
            addCriterion("bed_award_jishu not in", values, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuBetween(Integer value1, Integer value2) {
            addCriterion("bed_award_jishu between", value1, value2, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andBedAwardJishuNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_award_jishu not between", value1, value2, "bedAwardJishu");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardIsNull() {
            addCriterion("immt_dt_award is null");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardIsNotNull() {
            addCriterion("immt_dt_award is not null");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardEqualTo(Integer value) {
            addCriterion("immt_dt_award =", value, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardNotEqualTo(Integer value) {
            addCriterion("immt_dt_award <>", value, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardGreaterThan(Integer value) {
            addCriterion("immt_dt_award >", value, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("immt_dt_award >=", value, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardLessThan(Integer value) {
            addCriterion("immt_dt_award <", value, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardLessThanOrEqualTo(Integer value) {
            addCriterion("immt_dt_award <=", value, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardIn(List<Integer> values) {
            addCriterion("immt_dt_award in", values, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardNotIn(List<Integer> values) {
            addCriterion("immt_dt_award not in", values, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardBetween(Integer value1, Integer value2) {
            addCriterion("immt_dt_award between", value1, value2, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andImmtDtAwardNotBetween(Integer value1, Integer value2) {
            addCriterion("immt_dt_award not between", value1, value2, "immtDtAward");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateIsNull() {
            addCriterion("sf_zhiya_rate is null");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateIsNotNull() {
            addCriterion("sf_zhiya_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateEqualTo(BigDecimal value) {
            addCriterion("sf_zhiya_rate =", value, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateNotEqualTo(BigDecimal value) {
            addCriterion("sf_zhiya_rate <>", value, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateGreaterThan(BigDecimal value) {
            addCriterion("sf_zhiya_rate >", value, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sf_zhiya_rate >=", value, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateLessThan(BigDecimal value) {
            addCriterion("sf_zhiya_rate <", value, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sf_zhiya_rate <=", value, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateIn(List<BigDecimal> values) {
            addCriterion("sf_zhiya_rate in", values, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateNotIn(List<BigDecimal> values) {
            addCriterion("sf_zhiya_rate not in", values, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sf_zhiya_rate between", value1, value2, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andSfZhiyaRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sf_zhiya_rate not between", value1, value2, "sfZhiyaRate");
            return (Criteria) this;
        }

        public Criteria andIsDrawIsNull() {
            addCriterion("is_draw is null");
            return (Criteria) this;
        }

        public Criteria andIsDrawIsNotNull() {
            addCriterion("is_draw is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrawEqualTo(Integer value) {
            addCriterion("is_draw =", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotEqualTo(Integer value) {
            addCriterion("is_draw <>", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawGreaterThan(Integer value) {
            addCriterion("is_draw >", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_draw >=", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawLessThan(Integer value) {
            addCriterion("is_draw <", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawLessThanOrEqualTo(Integer value) {
            addCriterion("is_draw <=", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawIn(List<Integer> values) {
            addCriterion("is_draw in", values, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotIn(List<Integer> values) {
            addCriterion("is_draw not in", values, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawBetween(Integer value1, Integer value2) {
            addCriterion("is_draw between", value1, value2, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotBetween(Integer value1, Integer value2) {
            addCriterion("is_draw not between", value1, value2, "isDraw");
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