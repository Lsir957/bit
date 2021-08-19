package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MiniGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiniGoodsExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andCoverPathIsNull() {
            addCriterion("cover_path is null");
            return (Criteria) this;
        }

        public Criteria andCoverPathIsNotNull() {
            addCriterion("cover_path is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPathEqualTo(String value) {
            addCriterion("cover_path =", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathNotEqualTo(String value) {
            addCriterion("cover_path <>", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathGreaterThan(String value) {
            addCriterion("cover_path >", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathGreaterThanOrEqualTo(String value) {
            addCriterion("cover_path >=", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathLessThan(String value) {
            addCriterion("cover_path <", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathLessThanOrEqualTo(String value) {
            addCriterion("cover_path <=", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathLike(String value) {
            addCriterion("cover_path like", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathNotLike(String value) {
            addCriterion("cover_path not like", value, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathIn(List<String> values) {
            addCriterion("cover_path in", values, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathNotIn(List<String> values) {
            addCriterion("cover_path not in", values, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathBetween(String value1, String value2) {
            addCriterion("cover_path between", value1, value2, "coverPath");
            return (Criteria) this;
        }

        public Criteria andCoverPathNotBetween(String value1, String value2) {
            addCriterion("cover_path not between", value1, value2, "coverPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1IsNull() {
            addCriterion("photo_path_1 is null");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1IsNotNull() {
            addCriterion("photo_path_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1EqualTo(String value) {
            addCriterion("photo_path_1 =", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1NotEqualTo(String value) {
            addCriterion("photo_path_1 <>", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1GreaterThan(String value) {
            addCriterion("photo_path_1 >", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1GreaterThanOrEqualTo(String value) {
            addCriterion("photo_path_1 >=", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1LessThan(String value) {
            addCriterion("photo_path_1 <", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1LessThanOrEqualTo(String value) {
            addCriterion("photo_path_1 <=", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1Like(String value) {
            addCriterion("photo_path_1 like", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1NotLike(String value) {
            addCriterion("photo_path_1 not like", value, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1In(List<String> values) {
            addCriterion("photo_path_1 in", values, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1NotIn(List<String> values) {
            addCriterion("photo_path_1 not in", values, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1Between(String value1, String value2) {
            addCriterion("photo_path_1 between", value1, value2, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath1NotBetween(String value1, String value2) {
            addCriterion("photo_path_1 not between", value1, value2, "photoPath1");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2IsNull() {
            addCriterion("photo_path_2 is null");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2IsNotNull() {
            addCriterion("photo_path_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2EqualTo(String value) {
            addCriterion("photo_path_2 =", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2NotEqualTo(String value) {
            addCriterion("photo_path_2 <>", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2GreaterThan(String value) {
            addCriterion("photo_path_2 >", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2GreaterThanOrEqualTo(String value) {
            addCriterion("photo_path_2 >=", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2LessThan(String value) {
            addCriterion("photo_path_2 <", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2LessThanOrEqualTo(String value) {
            addCriterion("photo_path_2 <=", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2Like(String value) {
            addCriterion("photo_path_2 like", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2NotLike(String value) {
            addCriterion("photo_path_2 not like", value, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2In(List<String> values) {
            addCriterion("photo_path_2 in", values, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2NotIn(List<String> values) {
            addCriterion("photo_path_2 not in", values, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2Between(String value1, String value2) {
            addCriterion("photo_path_2 between", value1, value2, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath2NotBetween(String value1, String value2) {
            addCriterion("photo_path_2 not between", value1, value2, "photoPath2");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3IsNull() {
            addCriterion("photo_path_3 is null");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3IsNotNull() {
            addCriterion("photo_path_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3EqualTo(String value) {
            addCriterion("photo_path_3 =", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3NotEqualTo(String value) {
            addCriterion("photo_path_3 <>", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3GreaterThan(String value) {
            addCriterion("photo_path_3 >", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3GreaterThanOrEqualTo(String value) {
            addCriterion("photo_path_3 >=", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3LessThan(String value) {
            addCriterion("photo_path_3 <", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3LessThanOrEqualTo(String value) {
            addCriterion("photo_path_3 <=", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3Like(String value) {
            addCriterion("photo_path_3 like", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3NotLike(String value) {
            addCriterion("photo_path_3 not like", value, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3In(List<String> values) {
            addCriterion("photo_path_3 in", values, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3NotIn(List<String> values) {
            addCriterion("photo_path_3 not in", values, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3Between(String value1, String value2) {
            addCriterion("photo_path_3 between", value1, value2, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andPhotoPath3NotBetween(String value1, String value2) {
            addCriterion("photo_path_3 not between", value1, value2, "photoPath3");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClickCountIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClickCountEqualTo(Integer value) {
            addCriterion("click_count =", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThan(Integer value) {
            addCriterion("click_count >", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThan(Integer value) {
            addCriterion("click_count <", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountIn(List<Integer> values) {
            addCriterion("click_count in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "clickCount");
            return (Criteria) this;
        }

        public Criteria andClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "clickCount");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestEqualTo(Byte value) {
            addCriterion("is_best =", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotEqualTo(Byte value) {
            addCriterion("is_best <>", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThan(Byte value) {
            addCriterion("is_best >", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_best >=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThan(Byte value) {
            addCriterion("is_best <", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThanOrEqualTo(Byte value) {
            addCriterion("is_best <=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestIn(List<Byte> values) {
            addCriterion("is_best in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotIn(List<Byte> values) {
            addCriterion("is_best not in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestBetween(Byte value1, Byte value2) {
            addCriterion("is_best between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotBetween(Byte value1, Byte value2) {
            addCriterion("is_best not between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Byte value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Byte value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Byte value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Byte value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Byte value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Byte> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Byte> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Byte value1, Byte value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Byte value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Byte value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Byte value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Byte value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Byte value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Byte> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Byte> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNull() {
            addCriterion("sell_num is null");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNotNull() {
            addCriterion("sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andSellNumEqualTo(Integer value) {
            addCriterion("sell_num =", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotEqualTo(Integer value) {
            addCriterion("sell_num <>", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThan(Integer value) {
            addCriterion("sell_num >", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_num >=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThan(Integer value) {
            addCriterion("sell_num <", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("sell_num <=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumIn(List<Integer> values) {
            addCriterion("sell_num in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotIn(List<Integer> values) {
            addCriterion("sell_num not in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumBetween(Integer value1, Integer value2) {
            addCriterion("sell_num between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_num not between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andScoreNumIsNull() {
            addCriterion("score_num is null");
            return (Criteria) this;
        }

        public Criteria andScoreNumIsNotNull() {
            addCriterion("score_num is not null");
            return (Criteria) this;
        }

        public Criteria andScoreNumEqualTo(Byte value) {
            addCriterion("score_num =", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumNotEqualTo(Byte value) {
            addCriterion("score_num <>", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumGreaterThan(Byte value) {
            addCriterion("score_num >", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("score_num >=", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumLessThan(Byte value) {
            addCriterion("score_num <", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumLessThanOrEqualTo(Byte value) {
            addCriterion("score_num <=", value, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumIn(List<Byte> values) {
            addCriterion("score_num in", values, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumNotIn(List<Byte> values) {
            addCriterion("score_num not in", values, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumBetween(Byte value1, Byte value2) {
            addCriterion("score_num between", value1, value2, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreNumNotBetween(Byte value1, Byte value2) {
            addCriterion("score_num not between", value1, value2, "scoreNum");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andYhuiIsNull() {
            addCriterion("yhui is null");
            return (Criteria) this;
        }

        public Criteria andYhuiIsNotNull() {
            addCriterion("yhui is not null");
            return (Criteria) this;
        }

        public Criteria andYhuiEqualTo(BigDecimal value) {
            addCriterion("yhui =", value, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiNotEqualTo(BigDecimal value) {
            addCriterion("yhui <>", value, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiGreaterThan(BigDecimal value) {
            addCriterion("yhui >", value, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yhui >=", value, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiLessThan(BigDecimal value) {
            addCriterion("yhui <", value, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yhui <=", value, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiIn(List<BigDecimal> values) {
            addCriterion("yhui in", values, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiNotIn(List<BigDecimal> values) {
            addCriterion("yhui not in", values, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yhui between", value1, value2, "yhui");
            return (Criteria) this;
        }

        public Criteria andYhuiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yhui not between", value1, value2, "yhui");
            return (Criteria) this;
        }

        public Criteria andZhuiIsNull() {
            addCriterion("zhui is null");
            return (Criteria) this;
        }

        public Criteria andZhuiIsNotNull() {
            addCriterion("zhui is not null");
            return (Criteria) this;
        }

        public Criteria andZhuiEqualTo(BigDecimal value) {
            addCriterion("zhui =", value, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiNotEqualTo(BigDecimal value) {
            addCriterion("zhui <>", value, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiGreaterThan(BigDecimal value) {
            addCriterion("zhui >", value, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zhui >=", value, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiLessThan(BigDecimal value) {
            addCriterion("zhui <", value, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zhui <=", value, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiIn(List<BigDecimal> values) {
            addCriterion("zhui in", values, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiNotIn(List<BigDecimal> values) {
            addCriterion("zhui not in", values, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhui between", value1, value2, "zhui");
            return (Criteria) this;
        }

        public Criteria andZhuiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhui not between", value1, value2, "zhui");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("score2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("score2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(BigDecimal value) {
            addCriterion("score2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(BigDecimal value) {
            addCriterion("score2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(BigDecimal value) {
            addCriterion("score2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(BigDecimal value) {
            addCriterion("score2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("score2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<BigDecimal> values) {
            addCriterion("score2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<BigDecimal> values) {
            addCriterion("score2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("score2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score2 not between", value1, value2, "score2");
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