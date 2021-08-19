package com.example.bit.bean;

import java.util.ArrayList;
import java.util.List;

public class UserBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBankExample() {
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

        public Criteria andSmsidIsNull() {
            addCriterion("smsid is null");
            return (Criteria) this;
        }

        public Criteria andSmsidIsNotNull() {
            addCriterion("smsid is not null");
            return (Criteria) this;
        }

        public Criteria andSmsidEqualTo(Integer value) {
            addCriterion("smsid =", value, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidNotEqualTo(Integer value) {
            addCriterion("smsid <>", value, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidGreaterThan(Integer value) {
            addCriterion("smsid >", value, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smsid >=", value, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidLessThan(Integer value) {
            addCriterion("smsid <", value, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidLessThanOrEqualTo(Integer value) {
            addCriterion("smsid <=", value, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidIn(List<Integer> values) {
            addCriterion("smsid in", values, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidNotIn(List<Integer> values) {
            addCriterion("smsid not in", values, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidBetween(Integer value1, Integer value2) {
            addCriterion("smsid between", value1, value2, "smsid");
            return (Criteria) this;
        }

        public Criteria andSmsidNotBetween(Integer value1, Integer value2) {
            addCriterion("smsid not between", value1, value2, "smsid");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNull() {
            addCriterion("usname is null");
            return (Criteria) this;
        }

        public Criteria andUsnameIsNotNull() {
            addCriterion("usname is not null");
            return (Criteria) this;
        }

        public Criteria andUsnameEqualTo(String value) {
            addCriterion("usname =", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotEqualTo(String value) {
            addCriterion("usname <>", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThan(String value) {
            addCriterion("usname >", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameGreaterThanOrEqualTo(String value) {
            addCriterion("usname >=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThan(String value) {
            addCriterion("usname <", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLessThanOrEqualTo(String value) {
            addCriterion("usname <=", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameLike(String value) {
            addCriterion("usname like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotLike(String value) {
            addCriterion("usname not like", value, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameIn(List<String> values) {
            addCriterion("usname in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotIn(List<String> values) {
            addCriterion("usname not in", values, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameBetween(String value1, String value2) {
            addCriterion("usname between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andUsnameNotBetween(String value1, String value2) {
            addCriterion("usname not between", value1, value2, "usname");
            return (Criteria) this;
        }

        public Criteria andCointypeIsNull() {
            addCriterion("cointype is null");
            return (Criteria) this;
        }

        public Criteria andCointypeIsNotNull() {
            addCriterion("cointype is not null");
            return (Criteria) this;
        }

        public Criteria andCointypeEqualTo(String value) {
            addCriterion("cointype =", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeNotEqualTo(String value) {
            addCriterion("cointype <>", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeGreaterThan(String value) {
            addCriterion("cointype >", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeGreaterThanOrEqualTo(String value) {
            addCriterion("cointype >=", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeLessThan(String value) {
            addCriterion("cointype <", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeLessThanOrEqualTo(String value) {
            addCriterion("cointype <=", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeLike(String value) {
            addCriterion("cointype like", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeNotLike(String value) {
            addCriterion("cointype not like", value, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeIn(List<String> values) {
            addCriterion("cointype in", values, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeNotIn(List<String> values) {
            addCriterion("cointype not in", values, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeBetween(String value1, String value2) {
            addCriterion("cointype between", value1, value2, "cointype");
            return (Criteria) this;
        }

        public Criteria andCointypeNotBetween(String value1, String value2) {
            addCriterion("cointype not between", value1, value2, "cointype");
            return (Criteria) this;
        }

        public Criteria andBankdisIsNull() {
            addCriterion("bankdis is null");
            return (Criteria) this;
        }

        public Criteria andBankdisIsNotNull() {
            addCriterion("bankdis is not null");
            return (Criteria) this;
        }

        public Criteria andBankdisEqualTo(String value) {
            addCriterion("bankdis =", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisNotEqualTo(String value) {
            addCriterion("bankdis <>", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisGreaterThan(String value) {
            addCriterion("bankdis >", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisGreaterThanOrEqualTo(String value) {
            addCriterion("bankdis >=", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisLessThan(String value) {
            addCriterion("bankdis <", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisLessThanOrEqualTo(String value) {
            addCriterion("bankdis <=", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisLike(String value) {
            addCriterion("bankdis like", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisNotLike(String value) {
            addCriterion("bankdis not like", value, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisIn(List<String> values) {
            addCriterion("bankdis in", values, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisNotIn(List<String> values) {
            addCriterion("bankdis not in", values, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisBetween(String value1, String value2) {
            addCriterion("bankdis between", value1, value2, "bankdis");
            return (Criteria) this;
        }

        public Criteria andBankdisNotBetween(String value1, String value2) {
            addCriterion("bankdis not between", value1, value2, "bankdis");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(Integer value) {
            addCriterion("statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(Integer value) {
            addCriterion("statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(Integer value) {
            addCriterion("statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(Integer value) {
            addCriterion("statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(Integer value) {
            addCriterion("statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<Integer> values) {
            addCriterion("statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<Integer> values) {
            addCriterion("statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(Integer value1, Integer value2) {
            addCriterion("statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(Integer value1, Integer value2) {
            addCriterion("statu not between", value1, value2, "statu");
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