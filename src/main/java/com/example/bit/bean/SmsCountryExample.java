package com.example.bit.bean;

import java.util.ArrayList;
import java.util.List;

public class SmsCountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsCountryExample() {
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

        public Criteria andIsoIsNull() {
            addCriterion("iso is null");
            return (Criteria) this;
        }

        public Criteria andIsoIsNotNull() {
            addCriterion("iso is not null");
            return (Criteria) this;
        }

        public Criteria andIsoEqualTo(String value) {
            addCriterion("iso =", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotEqualTo(String value) {
            addCriterion("iso <>", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoGreaterThan(String value) {
            addCriterion("iso >", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoGreaterThanOrEqualTo(String value) {
            addCriterion("iso >=", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoLessThan(String value) {
            addCriterion("iso <", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoLessThanOrEqualTo(String value) {
            addCriterion("iso <=", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoLike(String value) {
            addCriterion("iso like", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotLike(String value) {
            addCriterion("iso not like", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoIn(List<String> values) {
            addCriterion("iso in", values, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotIn(List<String> values) {
            addCriterion("iso not in", values, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoBetween(String value1, String value2) {
            addCriterion("iso between", value1, value2, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotBetween(String value1, String value2) {
            addCriterion("iso not between", value1, value2, "iso");
            return (Criteria) this;
        }

        public Criteria andIso3IsNull() {
            addCriterion("iso3 is null");
            return (Criteria) this;
        }

        public Criteria andIso3IsNotNull() {
            addCriterion("iso3 is not null");
            return (Criteria) this;
        }

        public Criteria andIso3EqualTo(String value) {
            addCriterion("iso3 =", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3NotEqualTo(String value) {
            addCriterion("iso3 <>", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3GreaterThan(String value) {
            addCriterion("iso3 >", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3GreaterThanOrEqualTo(String value) {
            addCriterion("iso3 >=", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3LessThan(String value) {
            addCriterion("iso3 <", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3LessThanOrEqualTo(String value) {
            addCriterion("iso3 <=", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3Like(String value) {
            addCriterion("iso3 like", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3NotLike(String value) {
            addCriterion("iso3 not like", value, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3In(List<String> values) {
            addCriterion("iso3 in", values, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3NotIn(List<String> values) {
            addCriterion("iso3 not in", values, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3Between(String value1, String value2) {
            addCriterion("iso3 between", value1, value2, "iso3");
            return (Criteria) this;
        }

        public Criteria andIso3NotBetween(String value1, String value2) {
            addCriterion("iso3 not between", value1, value2, "iso3");
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

        public Criteria andNameZhIsNull() {
            addCriterion("name_zh is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("name_zh =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("name_zh <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("name_zh >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("name_zh <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("name_zh <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("name_zh like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("name_zh not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("name_zh in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("name_zh not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("name_zh between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("name_zh not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNicenameIsNull() {
            addCriterion("nicename is null");
            return (Criteria) this;
        }

        public Criteria andNicenameIsNotNull() {
            addCriterion("nicename is not null");
            return (Criteria) this;
        }

        public Criteria andNicenameEqualTo(String value) {
            addCriterion("nicename =", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameNotEqualTo(String value) {
            addCriterion("nicename <>", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameGreaterThan(String value) {
            addCriterion("nicename >", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameGreaterThanOrEqualTo(String value) {
            addCriterion("nicename >=", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameLessThan(String value) {
            addCriterion("nicename <", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameLessThanOrEqualTo(String value) {
            addCriterion("nicename <=", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameLike(String value) {
            addCriterion("nicename like", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameNotLike(String value) {
            addCriterion("nicename not like", value, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameIn(List<String> values) {
            addCriterion("nicename in", values, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameNotIn(List<String> values) {
            addCriterion("nicename not in", values, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameBetween(String value1, String value2) {
            addCriterion("nicename between", value1, value2, "nicename");
            return (Criteria) this;
        }

        public Criteria andNicenameNotBetween(String value1, String value2) {
            addCriterion("nicename not between", value1, value2, "nicename");
            return (Criteria) this;
        }

        public Criteria andNumcodeIsNull() {
            addCriterion("numcode is null");
            return (Criteria) this;
        }

        public Criteria andNumcodeIsNotNull() {
            addCriterion("numcode is not null");
            return (Criteria) this;
        }

        public Criteria andNumcodeEqualTo(Short value) {
            addCriterion("numcode =", value, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeNotEqualTo(Short value) {
            addCriterion("numcode <>", value, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeGreaterThan(Short value) {
            addCriterion("numcode >", value, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeGreaterThanOrEqualTo(Short value) {
            addCriterion("numcode >=", value, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeLessThan(Short value) {
            addCriterion("numcode <", value, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeLessThanOrEqualTo(Short value) {
            addCriterion("numcode <=", value, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeIn(List<Short> values) {
            addCriterion("numcode in", values, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeNotIn(List<Short> values) {
            addCriterion("numcode not in", values, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeBetween(Short value1, Short value2) {
            addCriterion("numcode between", value1, value2, "numcode");
            return (Criteria) this;
        }

        public Criteria andNumcodeNotBetween(Short value1, Short value2) {
            addCriterion("numcode not between", value1, value2, "numcode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeIsNull() {
            addCriterion("phonecode is null");
            return (Criteria) this;
        }

        public Criteria andPhonecodeIsNotNull() {
            addCriterion("phonecode is not null");
            return (Criteria) this;
        }

        public Criteria andPhonecodeEqualTo(Integer value) {
            addCriterion("phonecode =", value, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeNotEqualTo(Integer value) {
            addCriterion("phonecode <>", value, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeGreaterThan(Integer value) {
            addCriterion("phonecode >", value, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("phonecode >=", value, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeLessThan(Integer value) {
            addCriterion("phonecode <", value, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeLessThanOrEqualTo(Integer value) {
            addCriterion("phonecode <=", value, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeIn(List<Integer> values) {
            addCriterion("phonecode in", values, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeNotIn(List<Integer> values) {
            addCriterion("phonecode not in", values, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeBetween(Integer value1, Integer value2) {
            addCriterion("phonecode between", value1, value2, "phonecode");
            return (Criteria) this;
        }

        public Criteria andPhonecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("phonecode not between", value1, value2, "phonecode");
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

        public Criteria andCoinnameIsNull() {
            addCriterion("coinname is null");
            return (Criteria) this;
        }

        public Criteria andCoinnameIsNotNull() {
            addCriterion("coinname is not null");
            return (Criteria) this;
        }

        public Criteria andCoinnameEqualTo(String value) {
            addCriterion("coinname =", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameNotEqualTo(String value) {
            addCriterion("coinname <>", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameGreaterThan(String value) {
            addCriterion("coinname >", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameGreaterThanOrEqualTo(String value) {
            addCriterion("coinname >=", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameLessThan(String value) {
            addCriterion("coinname <", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameLessThanOrEqualTo(String value) {
            addCriterion("coinname <=", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameLike(String value) {
            addCriterion("coinname like", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameNotLike(String value) {
            addCriterion("coinname not like", value, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameIn(List<String> values) {
            addCriterion("coinname in", values, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameNotIn(List<String> values) {
            addCriterion("coinname not in", values, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameBetween(String value1, String value2) {
            addCriterion("coinname between", value1, value2, "coinname");
            return (Criteria) this;
        }

        public Criteria andCoinnameNotBetween(String value1, String value2) {
            addCriterion("coinname not between", value1, value2, "coinname");
            return (Criteria) this;
        }

        public Criteria andConincodeIsNull() {
            addCriterion("conincode is null");
            return (Criteria) this;
        }

        public Criteria andConincodeIsNotNull() {
            addCriterion("conincode is not null");
            return (Criteria) this;
        }

        public Criteria andConincodeEqualTo(String value) {
            addCriterion("conincode =", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeNotEqualTo(String value) {
            addCriterion("conincode <>", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeGreaterThan(String value) {
            addCriterion("conincode >", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeGreaterThanOrEqualTo(String value) {
            addCriterion("conincode >=", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeLessThan(String value) {
            addCriterion("conincode <", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeLessThanOrEqualTo(String value) {
            addCriterion("conincode <=", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeLike(String value) {
            addCriterion("conincode like", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeNotLike(String value) {
            addCriterion("conincode not like", value, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeIn(List<String> values) {
            addCriterion("conincode in", values, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeNotIn(List<String> values) {
            addCriterion("conincode not in", values, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeBetween(String value1, String value2) {
            addCriterion("conincode between", value1, value2, "conincode");
            return (Criteria) this;
        }

        public Criteria andConincodeNotBetween(String value1, String value2) {
            addCriterion("conincode not between", value1, value2, "conincode");
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