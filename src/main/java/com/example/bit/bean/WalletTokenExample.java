package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WalletTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WalletTokenExample() {
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

        public Criteria andTitleZhIsNull() {
            addCriterion("title_zh is null");
            return (Criteria) this;
        }

        public Criteria andTitleZhIsNotNull() {
            addCriterion("title_zh is not null");
            return (Criteria) this;
        }

        public Criteria andTitleZhEqualTo(String value) {
            addCriterion("title_zh =", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotEqualTo(String value) {
            addCriterion("title_zh <>", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhGreaterThan(String value) {
            addCriterion("title_zh >", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhGreaterThanOrEqualTo(String value) {
            addCriterion("title_zh >=", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhLessThan(String value) {
            addCriterion("title_zh <", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhLessThanOrEqualTo(String value) {
            addCriterion("title_zh <=", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhLike(String value) {
            addCriterion("title_zh like", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotLike(String value) {
            addCriterion("title_zh not like", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhIn(List<String> values) {
            addCriterion("title_zh in", values, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotIn(List<String> values) {
            addCriterion("title_zh not in", values, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhBetween(String value1, String value2) {
            addCriterion("title_zh between", value1, value2, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotBetween(String value1, String value2) {
            addCriterion("title_zh not between", value1, value2, "titleZh");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andContractIsNull() {
            addCriterion("contract is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("contract is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("contract =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("contract <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("contract >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("contract >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("contract <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("contract <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("contract like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("contract not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("contract in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("contract not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("contract between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("contract not between", value1, value2, "contract");
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

        public Criteria andIsShowEqualTo(Byte value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Byte value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Byte value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Byte value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Byte value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Byte> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Byte> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Byte value1, Byte value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Byte value1, Byte value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Long value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Long value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Long value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Long value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Long value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Long> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Long> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Long value1, Long value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Long value1, Long value2) {
            addCriterion("height not between", value1, value2, "height");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTxminiIsNull() {
            addCriterion("txmini is null");
            return (Criteria) this;
        }

        public Criteria andTxminiIsNotNull() {
            addCriterion("txmini is not null");
            return (Criteria) this;
        }

        public Criteria andTxminiEqualTo(BigDecimal value) {
            addCriterion("txmini =", value, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiNotEqualTo(BigDecimal value) {
            addCriterion("txmini <>", value, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiGreaterThan(BigDecimal value) {
            addCriterion("txmini >", value, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("txmini >=", value, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiLessThan(BigDecimal value) {
            addCriterion("txmini <", value, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("txmini <=", value, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiIn(List<BigDecimal> values) {
            addCriterion("txmini in", values, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiNotIn(List<BigDecimal> values) {
            addCriterion("txmini not in", values, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txmini between", value1, value2, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxminiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txmini not between", value1, value2, "txmini");
            return (Criteria) this;
        }

        public Criteria andTxsxfIsNull() {
            addCriterion("txsxf is null");
            return (Criteria) this;
        }

        public Criteria andTxsxfIsNotNull() {
            addCriterion("txsxf is not null");
            return (Criteria) this;
        }

        public Criteria andTxsxfEqualTo(BigDecimal value) {
            addCriterion("txsxf =", value, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfNotEqualTo(BigDecimal value) {
            addCriterion("txsxf <>", value, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfGreaterThan(BigDecimal value) {
            addCriterion("txsxf >", value, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("txsxf >=", value, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfLessThan(BigDecimal value) {
            addCriterion("txsxf <", value, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("txsxf <=", value, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfIn(List<BigDecimal> values) {
            addCriterion("txsxf in", values, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfNotIn(List<BigDecimal> values) {
            addCriterion("txsxf not in", values, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txsxf between", value1, value2, "txsxf");
            return (Criteria) this;
        }

        public Criteria andTxsxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txsxf not between", value1, value2, "txsxf");
            return (Criteria) this;
        }

        public Criteria andZdfIsNull() {
            addCriterion("zdf is null");
            return (Criteria) this;
        }

        public Criteria andZdfIsNotNull() {
            addCriterion("zdf is not null");
            return (Criteria) this;
        }

        public Criteria andZdfEqualTo(BigDecimal value) {
            addCriterion("zdf =", value, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfNotEqualTo(BigDecimal value) {
            addCriterion("zdf <>", value, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfGreaterThan(BigDecimal value) {
            addCriterion("zdf >", value, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zdf >=", value, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfLessThan(BigDecimal value) {
            addCriterion("zdf <", value, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zdf <=", value, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfIn(List<BigDecimal> values) {
            addCriterion("zdf in", values, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfNotIn(List<BigDecimal> values) {
            addCriterion("zdf not in", values, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zdf between", value1, value2, "zdf");
            return (Criteria) this;
        }

        public Criteria andZdfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zdf not between", value1, value2, "zdf");
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

        public Criteria andTxmaxIsNull() {
            addCriterion("txmax is null");
            return (Criteria) this;
        }

        public Criteria andTxmaxIsNotNull() {
            addCriterion("txmax is not null");
            return (Criteria) this;
        }

        public Criteria andTxmaxEqualTo(BigDecimal value) {
            addCriterion("txmax =", value, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxNotEqualTo(BigDecimal value) {
            addCriterion("txmax <>", value, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxGreaterThan(BigDecimal value) {
            addCriterion("txmax >", value, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("txmax >=", value, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxLessThan(BigDecimal value) {
            addCriterion("txmax <", value, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("txmax <=", value, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxIn(List<BigDecimal> values) {
            addCriterion("txmax in", values, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxNotIn(List<BigDecimal> values) {
            addCriterion("txmax not in", values, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txmax between", value1, value2, "txmax");
            return (Criteria) this;
        }

        public Criteria andTxmaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txmax not between", value1, value2, "txmax");
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

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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