package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MiniUsersDeleteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiniUsersDeleteExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andOrgPwdIsNull() {
            addCriterion("org_pwd is null");
            return (Criteria) this;
        }

        public Criteria andOrgPwdIsNotNull() {
            addCriterion("org_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPwdEqualTo(String value) {
            addCriterion("org_pwd =", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdNotEqualTo(String value) {
            addCriterion("org_pwd <>", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdGreaterThan(String value) {
            addCriterion("org_pwd >", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdGreaterThanOrEqualTo(String value) {
            addCriterion("org_pwd >=", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdLessThan(String value) {
            addCriterion("org_pwd <", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdLessThanOrEqualTo(String value) {
            addCriterion("org_pwd <=", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdLike(String value) {
            addCriterion("org_pwd like", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdNotLike(String value) {
            addCriterion("org_pwd not like", value, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdIn(List<String> values) {
            addCriterion("org_pwd in", values, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdNotIn(List<String> values) {
            addCriterion("org_pwd not in", values, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdBetween(String value1, String value2) {
            addCriterion("org_pwd between", value1, value2, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andOrgPwdNotBetween(String value1, String value2) {
            addCriterion("org_pwd not between", value1, value2, "orgPwd");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNull() {
            addCriterion("regdate is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("regdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Integer value) {
            addCriterion("regdate =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Integer value) {
            addCriterion("regdate <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Integer value) {
            addCriterion("regdate >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("regdate >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Integer value) {
            addCriterion("regdate <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Integer value) {
            addCriterion("regdate <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<Integer> values) {
            addCriterion("regdate in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<Integer> values) {
            addCriterion("regdate not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Integer value1, Integer value2) {
            addCriterion("regdate between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Integer value1, Integer value2) {
            addCriterion("regdate not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("loginip is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginip =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginip <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginip >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginip >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginip <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginip <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginip like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginip not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginip in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginip not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginip between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginip not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
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

        public Criteria andReferIsNull() {
            addCriterion("refer is null");
            return (Criteria) this;
        }

        public Criteria andReferIsNotNull() {
            addCriterion("refer is not null");
            return (Criteria) this;
        }

        public Criteria andReferEqualTo(Integer value) {
            addCriterion("refer =", value, "refer");
            return (Criteria) this;
        }

        public Criteria andReferNotEqualTo(Integer value) {
            addCriterion("refer <>", value, "refer");
            return (Criteria) this;
        }

        public Criteria andReferGreaterThan(Integer value) {
            addCriterion("refer >", value, "refer");
            return (Criteria) this;
        }

        public Criteria andReferGreaterThanOrEqualTo(Integer value) {
            addCriterion("refer >=", value, "refer");
            return (Criteria) this;
        }

        public Criteria andReferLessThan(Integer value) {
            addCriterion("refer <", value, "refer");
            return (Criteria) this;
        }

        public Criteria andReferLessThanOrEqualTo(Integer value) {
            addCriterion("refer <=", value, "refer");
            return (Criteria) this;
        }

        public Criteria andReferIn(List<Integer> values) {
            addCriterion("refer in", values, "refer");
            return (Criteria) this;
        }

        public Criteria andReferNotIn(List<Integer> values) {
            addCriterion("refer not in", values, "refer");
            return (Criteria) this;
        }

        public Criteria andReferBetween(Integer value1, Integer value2) {
            addCriterion("refer between", value1, value2, "refer");
            return (Criteria) this;
        }

        public Criteria andReferNotBetween(Integer value1, Integer value2) {
            addCriterion("refer not between", value1, value2, "refer");
            return (Criteria) this;
        }

        public Criteria andReferMobileIsNull() {
            addCriterion("refer_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReferMobileIsNotNull() {
            addCriterion("refer_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReferMobileEqualTo(String value) {
            addCriterion("refer_mobile =", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileNotEqualTo(String value) {
            addCriterion("refer_mobile <>", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileGreaterThan(String value) {
            addCriterion("refer_mobile >", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileGreaterThanOrEqualTo(String value) {
            addCriterion("refer_mobile >=", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileLessThan(String value) {
            addCriterion("refer_mobile <", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileLessThanOrEqualTo(String value) {
            addCriterion("refer_mobile <=", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileLike(String value) {
            addCriterion("refer_mobile like", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileNotLike(String value) {
            addCriterion("refer_mobile not like", value, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileIn(List<String> values) {
            addCriterion("refer_mobile in", values, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileNotIn(List<String> values) {
            addCriterion("refer_mobile not in", values, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileBetween(String value1, String value2) {
            addCriterion("refer_mobile between", value1, value2, "referMobile");
            return (Criteria) this;
        }

        public Criteria andReferMobileNotBetween(String value1, String value2) {
            addCriterion("refer_mobile not between", value1, value2, "referMobile");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Integer value) {
            addCriterion("last_login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Integer value) {
            addCriterion("last_login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Integer value) {
            addCriterion("last_login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Integer value) {
            addCriterion("last_login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Integer value) {
            addCriterion("last_login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Integer> values) {
            addCriterion("last_login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Integer> values) {
            addCriterion("last_login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Integer value1, Integer value2) {
            addCriterion("last_login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNull() {
            addCriterion("wechat_openid is null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNotNull() {
            addCriterion("wechat_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidEqualTo(String value) {
            addCriterion("wechat_openid =", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotEqualTo(String value) {
            addCriterion("wechat_openid <>", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThan(String value) {
            addCriterion("wechat_openid >", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_openid >=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThan(String value) {
            addCriterion("wechat_openid <", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThanOrEqualTo(String value) {
            addCriterion("wechat_openid <=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLike(String value) {
            addCriterion("wechat_openid like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotLike(String value) {
            addCriterion("wechat_openid not like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIn(List<String> values) {
            addCriterion("wechat_openid in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotIn(List<String> values) {
            addCriterion("wechat_openid not in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidBetween(String value1, String value2) {
            addCriterion("wechat_openid between", value1, value2, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotBetween(String value1, String value2) {
            addCriterion("wechat_openid not between", value1, value2, "wechatOpenid");
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

        public Criteria andGoldEqualTo(BigDecimal value) {
            addCriterion("gold =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(BigDecimal value) {
            addCriterion("gold <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(BigDecimal value) {
            addCriterion("gold >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gold >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(BigDecimal value) {
            addCriterion("gold <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gold <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<BigDecimal> values) {
            addCriterion("gold in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<BigDecimal> values) {
            addCriterion("gold not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gold between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gold not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("ipaddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("ipaddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("ipaddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("ipaddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("ipaddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ipaddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("ipaddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("ipaddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("ipaddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("ipaddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("ipaddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("ipaddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("ipaddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("ipaddress not between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andIncodeIsNull() {
            addCriterion("incode is null");
            return (Criteria) this;
        }

        public Criteria andIncodeIsNotNull() {
            addCriterion("incode is not null");
            return (Criteria) this;
        }

        public Criteria andIncodeEqualTo(Integer value) {
            addCriterion("incode =", value, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeNotEqualTo(Integer value) {
            addCriterion("incode <>", value, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeGreaterThan(Integer value) {
            addCriterion("incode >", value, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("incode >=", value, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeLessThan(Integer value) {
            addCriterion("incode <", value, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeLessThanOrEqualTo(Integer value) {
            addCriterion("incode <=", value, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeIn(List<Integer> values) {
            addCriterion("incode in", values, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeNotIn(List<Integer> values) {
            addCriterion("incode not in", values, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeBetween(Integer value1, Integer value2) {
            addCriterion("incode between", value1, value2, "incode");
            return (Criteria) this;
        }

        public Criteria andIncodeNotBetween(Integer value1, Integer value2) {
            addCriterion("incode not between", value1, value2, "incode");
            return (Criteria) this;
        }

        public Criteria andYejiIsNull() {
            addCriterion("yeji is null");
            return (Criteria) this;
        }

        public Criteria andYejiIsNotNull() {
            addCriterion("yeji is not null");
            return (Criteria) this;
        }

        public Criteria andYejiEqualTo(BigDecimal value) {
            addCriterion("yeji =", value, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiNotEqualTo(BigDecimal value) {
            addCriterion("yeji <>", value, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiGreaterThan(BigDecimal value) {
            addCriterion("yeji >", value, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yeji >=", value, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiLessThan(BigDecimal value) {
            addCriterion("yeji <", value, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yeji <=", value, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiIn(List<BigDecimal> values) {
            addCriterion("yeji in", values, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiNotIn(List<BigDecimal> values) {
            addCriterion("yeji not in", values, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeji between", value1, value2, "yeji");
            return (Criteria) this;
        }

        public Criteria andYejiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeji not between", value1, value2, "yeji");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("lv is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("lv is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Boolean value) {
            addCriterion("lv =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Boolean value) {
            addCriterion("lv <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Boolean value) {
            addCriterion("lv >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lv >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Boolean value) {
            addCriterion("lv <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Boolean value) {
            addCriterion("lv <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Boolean> values) {
            addCriterion("lv in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Boolean> values) {
            addCriterion("lv not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Boolean value1, Boolean value2) {
            addCriterion("lv between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lv not between", value1, value2, "lv");
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

        public Criteria andOldnumIsNull() {
            addCriterion("oldnum is null");
            return (Criteria) this;
        }

        public Criteria andOldnumIsNotNull() {
            addCriterion("oldnum is not null");
            return (Criteria) this;
        }

        public Criteria andOldnumEqualTo(BigDecimal value) {
            addCriterion("oldnum =", value, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumNotEqualTo(BigDecimal value) {
            addCriterion("oldnum <>", value, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumGreaterThan(BigDecimal value) {
            addCriterion("oldnum >", value, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oldnum >=", value, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumLessThan(BigDecimal value) {
            addCriterion("oldnum <", value, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oldnum <=", value, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumIn(List<BigDecimal> values) {
            addCriterion("oldnum in", values, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumNotIn(List<BigDecimal> values) {
            addCriterion("oldnum not in", values, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oldnum between", value1, value2, "oldnum");
            return (Criteria) this;
        }

        public Criteria andOldnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oldnum not between", value1, value2, "oldnum");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(Integer value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(Integer value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(Integer value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(Integer value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(Integer value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<Integer> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<Integer> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(Integer value1, Integer value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(Integer value1, Integer value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andTreeIsNull() {
            addCriterion("tree is null");
            return (Criteria) this;
        }

        public Criteria andTreeIsNotNull() {
            addCriterion("tree is not null");
            return (Criteria) this;
        }

        public Criteria andTreeEqualTo(String value) {
            addCriterion("tree =", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeNotEqualTo(String value) {
            addCriterion("tree <>", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeGreaterThan(String value) {
            addCriterion("tree >", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeGreaterThanOrEqualTo(String value) {
            addCriterion("tree >=", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeLessThan(String value) {
            addCriterion("tree <", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeLessThanOrEqualTo(String value) {
            addCriterion("tree <=", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeLike(String value) {
            addCriterion("tree like", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeNotLike(String value) {
            addCriterion("tree not like", value, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeIn(List<String> values) {
            addCriterion("tree in", values, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeNotIn(List<String> values) {
            addCriterion("tree not in", values, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeBetween(String value1, String value2) {
            addCriterion("tree between", value1, value2, "tree");
            return (Criteria) this;
        }

        public Criteria andTreeNotBetween(String value1, String value2) {
            addCriterion("tree not between", value1, value2, "tree");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Integer value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Integer value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Integer value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Integer value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Integer> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Integer> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Integer value1, Integer value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNull() {
            addCriterion("paypwd is null");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNotNull() {
            addCriterion("paypwd is not null");
            return (Criteria) this;
        }

        public Criteria andPaypwdEqualTo(String value) {
            addCriterion("paypwd =", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotEqualTo(String value) {
            addCriterion("paypwd <>", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThan(String value) {
            addCriterion("paypwd >", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("paypwd >=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThan(String value) {
            addCriterion("paypwd <", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThanOrEqualTo(String value) {
            addCriterion("paypwd <=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLike(String value) {
            addCriterion("paypwd like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotLike(String value) {
            addCriterion("paypwd not like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdIn(List<String> values) {
            addCriterion("paypwd in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotIn(List<String> values) {
            addCriterion("paypwd not in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdBetween(String value1, String value2) {
            addCriterion("paypwd between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotBetween(String value1, String value2) {
            addCriterion("paypwd not between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andTree2IsNull() {
            addCriterion("tree2 is null");
            return (Criteria) this;
        }

        public Criteria andTree2IsNotNull() {
            addCriterion("tree2 is not null");
            return (Criteria) this;
        }

        public Criteria andTree2EqualTo(String value) {
            addCriterion("tree2 =", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2NotEqualTo(String value) {
            addCriterion("tree2 <>", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2GreaterThan(String value) {
            addCriterion("tree2 >", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2GreaterThanOrEqualTo(String value) {
            addCriterion("tree2 >=", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2LessThan(String value) {
            addCriterion("tree2 <", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2LessThanOrEqualTo(String value) {
            addCriterion("tree2 <=", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2Like(String value) {
            addCriterion("tree2 like", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2NotLike(String value) {
            addCriterion("tree2 not like", value, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2In(List<String> values) {
            addCriterion("tree2 in", values, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2NotIn(List<String> values) {
            addCriterion("tree2 not in", values, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2Between(String value1, String value2) {
            addCriterion("tree2 between", value1, value2, "tree2");
            return (Criteria) this;
        }

        public Criteria andTree2NotBetween(String value1, String value2) {
            addCriterion("tree2 not between", value1, value2, "tree2");
            return (Criteria) this;
        }

        public Criteria andTdrsIsNull() {
            addCriterion("tdrs is null");
            return (Criteria) this;
        }

        public Criteria andTdrsIsNotNull() {
            addCriterion("tdrs is not null");
            return (Criteria) this;
        }

        public Criteria andTdrsEqualTo(Integer value) {
            addCriterion("tdrs =", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsNotEqualTo(Integer value) {
            addCriterion("tdrs <>", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsGreaterThan(Integer value) {
            addCriterion("tdrs >", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tdrs >=", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsLessThan(Integer value) {
            addCriterion("tdrs <", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsLessThanOrEqualTo(Integer value) {
            addCriterion("tdrs <=", value, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsIn(List<Integer> values) {
            addCriterion("tdrs in", values, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsNotIn(List<Integer> values) {
            addCriterion("tdrs not in", values, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsBetween(Integer value1, Integer value2) {
            addCriterion("tdrs between", value1, value2, "tdrs");
            return (Criteria) this;
        }

        public Criteria andTdrsNotBetween(Integer value1, Integer value2) {
            addCriterion("tdrs not between", value1, value2, "tdrs");
            return (Criteria) this;
        }

        public Criteria andZtrsIsNull() {
            addCriterion("ztrs is null");
            return (Criteria) this;
        }

        public Criteria andZtrsIsNotNull() {
            addCriterion("ztrs is not null");
            return (Criteria) this;
        }

        public Criteria andZtrsEqualTo(Integer value) {
            addCriterion("ztrs =", value, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsNotEqualTo(Integer value) {
            addCriterion("ztrs <>", value, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsGreaterThan(Integer value) {
            addCriterion("ztrs >", value, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ztrs >=", value, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsLessThan(Integer value) {
            addCriterion("ztrs <", value, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsLessThanOrEqualTo(Integer value) {
            addCriterion("ztrs <=", value, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsIn(List<Integer> values) {
            addCriterion("ztrs in", values, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsNotIn(List<Integer> values) {
            addCriterion("ztrs not in", values, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsBetween(Integer value1, Integer value2) {
            addCriterion("ztrs between", value1, value2, "ztrs");
            return (Criteria) this;
        }

        public Criteria andZtrsNotBetween(Integer value1, Integer value2) {
            addCriterion("ztrs not between", value1, value2, "ztrs");
            return (Criteria) this;
        }

        public Criteria andDjStatusIsNull() {
            addCriterion("dj_status is null");
            return (Criteria) this;
        }

        public Criteria andDjStatusIsNotNull() {
            addCriterion("dj_status is not null");
            return (Criteria) this;
        }

        public Criteria andDjStatusEqualTo(Boolean value) {
            addCriterion("dj_status =", value, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusNotEqualTo(Boolean value) {
            addCriterion("dj_status <>", value, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusGreaterThan(Boolean value) {
            addCriterion("dj_status >", value, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dj_status >=", value, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusLessThan(Boolean value) {
            addCriterion("dj_status <", value, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("dj_status <=", value, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusIn(List<Boolean> values) {
            addCriterion("dj_status in", values, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusNotIn(List<Boolean> values) {
            addCriterion("dj_status not in", values, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("dj_status between", value1, value2, "djStatus");
            return (Criteria) this;
        }

        public Criteria andDjStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dj_status not between", value1, value2, "djStatus");
            return (Criteria) this;
        }

        public Criteria andMaxLvIsNull() {
            addCriterion("max_lv is null");
            return (Criteria) this;
        }

        public Criteria andMaxLvIsNotNull() {
            addCriterion("max_lv is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLvEqualTo(Boolean value) {
            addCriterion("max_lv =", value, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvNotEqualTo(Boolean value) {
            addCriterion("max_lv <>", value, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvGreaterThan(Boolean value) {
            addCriterion("max_lv >", value, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvGreaterThanOrEqualTo(Boolean value) {
            addCriterion("max_lv >=", value, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvLessThan(Boolean value) {
            addCriterion("max_lv <", value, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvLessThanOrEqualTo(Boolean value) {
            addCriterion("max_lv <=", value, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvIn(List<Boolean> values) {
            addCriterion("max_lv in", values, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvNotIn(List<Boolean> values) {
            addCriterion("max_lv not in", values, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvBetween(Boolean value1, Boolean value2) {
            addCriterion("max_lv between", value1, value2, "maxLv");
            return (Criteria) this;
        }

        public Criteria andMaxLvNotBetween(Boolean value1, Boolean value2) {
            addCriterion("max_lv not between", value1, value2, "maxLv");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(Integer value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(Integer value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(Integer value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(Integer value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(Integer value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(Integer value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<Integer> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<Integer> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(Integer value1, Integer value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(Integer value1, Integer value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andYeji2IsNull() {
            addCriterion("yeji2 is null");
            return (Criteria) this;
        }

        public Criteria andYeji2IsNotNull() {
            addCriterion("yeji2 is not null");
            return (Criteria) this;
        }

        public Criteria andYeji2EqualTo(BigDecimal value) {
            addCriterion("yeji2 =", value, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2NotEqualTo(BigDecimal value) {
            addCriterion("yeji2 <>", value, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2GreaterThan(BigDecimal value) {
            addCriterion("yeji2 >", value, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yeji2 >=", value, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2LessThan(BigDecimal value) {
            addCriterion("yeji2 <", value, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("yeji2 <=", value, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2In(List<BigDecimal> values) {
            addCriterion("yeji2 in", values, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2NotIn(List<BigDecimal> values) {
            addCriterion("yeji2 not in", values, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeji2 between", value1, value2, "yeji2");
            return (Criteria) this;
        }

        public Criteria andYeji2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yeji2 not between", value1, value2, "yeji2");
            return (Criteria) this;
        }

        public Criteria andRefer2IsNull() {
            addCriterion("refer2 is null");
            return (Criteria) this;
        }

        public Criteria andRefer2IsNotNull() {
            addCriterion("refer2 is not null");
            return (Criteria) this;
        }

        public Criteria andRefer2EqualTo(String value) {
            addCriterion("refer2 =", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2NotEqualTo(String value) {
            addCriterion("refer2 <>", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2GreaterThan(String value) {
            addCriterion("refer2 >", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2GreaterThanOrEqualTo(String value) {
            addCriterion("refer2 >=", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2LessThan(String value) {
            addCriterion("refer2 <", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2LessThanOrEqualTo(String value) {
            addCriterion("refer2 <=", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2Like(String value) {
            addCriterion("refer2 like", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2NotLike(String value) {
            addCriterion("refer2 not like", value, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2In(List<String> values) {
            addCriterion("refer2 in", values, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2NotIn(List<String> values) {
            addCriterion("refer2 not in", values, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2Between(String value1, String value2) {
            addCriterion("refer2 between", value1, value2, "refer2");
            return (Criteria) this;
        }

        public Criteria andRefer2NotBetween(String value1, String value2) {
            addCriterion("refer2 not between", value1, value2, "refer2");
            return (Criteria) this;
        }

        public Criteria andGespwdIsNull() {
            addCriterion("gespwd is null");
            return (Criteria) this;
        }

        public Criteria andGespwdIsNotNull() {
            addCriterion("gespwd is not null");
            return (Criteria) this;
        }

        public Criteria andGespwdEqualTo(String value) {
            addCriterion("gespwd =", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdNotEqualTo(String value) {
            addCriterion("gespwd <>", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdGreaterThan(String value) {
            addCriterion("gespwd >", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdGreaterThanOrEqualTo(String value) {
            addCriterion("gespwd >=", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdLessThan(String value) {
            addCriterion("gespwd <", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdLessThanOrEqualTo(String value) {
            addCriterion("gespwd <=", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdLike(String value) {
            addCriterion("gespwd like", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdNotLike(String value) {
            addCriterion("gespwd not like", value, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdIn(List<String> values) {
            addCriterion("gespwd in", values, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdNotIn(List<String> values) {
            addCriterion("gespwd not in", values, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdBetween(String value1, String value2) {
            addCriterion("gespwd between", value1, value2, "gespwd");
            return (Criteria) this;
        }

        public Criteria andGespwdNotBetween(String value1, String value2) {
            addCriterion("gespwd not between", value1, value2, "gespwd");
            return (Criteria) this;
        }

        public Criteria andIsHtVipIsNull() {
            addCriterion("is_ht_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsHtVipIsNotNull() {
            addCriterion("is_ht_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsHtVipEqualTo(Integer value) {
            addCriterion("is_ht_vip =", value, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipNotEqualTo(Integer value) {
            addCriterion("is_ht_vip <>", value, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipGreaterThan(Integer value) {
            addCriterion("is_ht_vip >", value, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ht_vip >=", value, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipLessThan(Integer value) {
            addCriterion("is_ht_vip <", value, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipLessThanOrEqualTo(Integer value) {
            addCriterion("is_ht_vip <=", value, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipIn(List<Integer> values) {
            addCriterion("is_ht_vip in", values, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipNotIn(List<Integer> values) {
            addCriterion("is_ht_vip not in", values, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipBetween(Integer value1, Integer value2) {
            addCriterion("is_ht_vip between", value1, value2, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andIsHtVipNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ht_vip not between", value1, value2, "isHtVip");
            return (Criteria) this;
        }

        public Criteria andStorePointsIsNull() {
            addCriterion("store_points is null");
            return (Criteria) this;
        }

        public Criteria andStorePointsIsNotNull() {
            addCriterion("store_points is not null");
            return (Criteria) this;
        }

        public Criteria andStorePointsEqualTo(BigDecimal value) {
            addCriterion("store_points =", value, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsNotEqualTo(BigDecimal value) {
            addCriterion("store_points <>", value, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsGreaterThan(BigDecimal value) {
            addCriterion("store_points >", value, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_points >=", value, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsLessThan(BigDecimal value) {
            addCriterion("store_points <", value, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_points <=", value, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsIn(List<BigDecimal> values) {
            addCriterion("store_points in", values, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsNotIn(List<BigDecimal> values) {
            addCriterion("store_points not in", values, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_points between", value1, value2, "storePoints");
            return (Criteria) this;
        }

        public Criteria andStorePointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_points not between", value1, value2, "storePoints");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andP2IdIsNull() {
            addCriterion("p2_id is null");
            return (Criteria) this;
        }

        public Criteria andP2IdIsNotNull() {
            addCriterion("p2_id is not null");
            return (Criteria) this;
        }

        public Criteria andP2IdEqualTo(Integer value) {
            addCriterion("p2_id =", value, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdNotEqualTo(Integer value) {
            addCriterion("p2_id <>", value, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdGreaterThan(Integer value) {
            addCriterion("p2_id >", value, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2_id >=", value, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdLessThan(Integer value) {
            addCriterion("p2_id <", value, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdLessThanOrEqualTo(Integer value) {
            addCriterion("p2_id <=", value, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdIn(List<Integer> values) {
            addCriterion("p2_id in", values, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdNotIn(List<Integer> values) {
            addCriterion("p2_id not in", values, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdBetween(Integer value1, Integer value2) {
            addCriterion("p2_id between", value1, value2, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("p2_id not between", value1, value2, "p2Id");
            return (Criteria) this;
        }

        public Criteria andP3IdIsNull() {
            addCriterion("p3_id is null");
            return (Criteria) this;
        }

        public Criteria andP3IdIsNotNull() {
            addCriterion("p3_id is not null");
            return (Criteria) this;
        }

        public Criteria andP3IdEqualTo(Integer value) {
            addCriterion("p3_id =", value, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdNotEqualTo(Integer value) {
            addCriterion("p3_id <>", value, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdGreaterThan(Integer value) {
            addCriterion("p3_id >", value, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p3_id >=", value, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdLessThan(Integer value) {
            addCriterion("p3_id <", value, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdLessThanOrEqualTo(Integer value) {
            addCriterion("p3_id <=", value, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdIn(List<Integer> values) {
            addCriterion("p3_id in", values, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdNotIn(List<Integer> values) {
            addCriterion("p3_id not in", values, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdBetween(Integer value1, Integer value2) {
            addCriterion("p3_id between", value1, value2, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP3IdNotBetween(Integer value1, Integer value2) {
            addCriterion("p3_id not between", value1, value2, "p3Id");
            return (Criteria) this;
        }

        public Criteria andP4IdIsNull() {
            addCriterion("p4_id is null");
            return (Criteria) this;
        }

        public Criteria andP4IdIsNotNull() {
            addCriterion("p4_id is not null");
            return (Criteria) this;
        }

        public Criteria andP4IdEqualTo(Integer value) {
            addCriterion("p4_id =", value, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdNotEqualTo(Integer value) {
            addCriterion("p4_id <>", value, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdGreaterThan(Integer value) {
            addCriterion("p4_id >", value, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p4_id >=", value, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdLessThan(Integer value) {
            addCriterion("p4_id <", value, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdLessThanOrEqualTo(Integer value) {
            addCriterion("p4_id <=", value, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdIn(List<Integer> values) {
            addCriterion("p4_id in", values, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdNotIn(List<Integer> values) {
            addCriterion("p4_id not in", values, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdBetween(Integer value1, Integer value2) {
            addCriterion("p4_id between", value1, value2, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP4IdNotBetween(Integer value1, Integer value2) {
            addCriterion("p4_id not between", value1, value2, "p4Id");
            return (Criteria) this;
        }

        public Criteria andP5IdIsNull() {
            addCriterion("p5_id is null");
            return (Criteria) this;
        }

        public Criteria andP5IdIsNotNull() {
            addCriterion("p5_id is not null");
            return (Criteria) this;
        }

        public Criteria andP5IdEqualTo(Integer value) {
            addCriterion("p5_id =", value, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdNotEqualTo(Integer value) {
            addCriterion("p5_id <>", value, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdGreaterThan(Integer value) {
            addCriterion("p5_id >", value, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p5_id >=", value, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdLessThan(Integer value) {
            addCriterion("p5_id <", value, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdLessThanOrEqualTo(Integer value) {
            addCriterion("p5_id <=", value, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdIn(List<Integer> values) {
            addCriterion("p5_id in", values, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdNotIn(List<Integer> values) {
            addCriterion("p5_id not in", values, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdBetween(Integer value1, Integer value2) {
            addCriterion("p5_id between", value1, value2, "p5Id");
            return (Criteria) this;
        }

        public Criteria andP5IdNotBetween(Integer value1, Integer value2) {
            addCriterion("p5_id not between", value1, value2, "p5Id");
            return (Criteria) this;
        }

        public Criteria andUsdtNumIsNull() {
            addCriterion("usdt_num is null");
            return (Criteria) this;
        }

        public Criteria andUsdtNumIsNotNull() {
            addCriterion("usdt_num is not null");
            return (Criteria) this;
        }

        public Criteria andUsdtNumEqualTo(Float value) {
            addCriterion("usdt_num =", value, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumNotEqualTo(Float value) {
            addCriterion("usdt_num <>", value, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumGreaterThan(Float value) {
            addCriterion("usdt_num >", value, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumGreaterThanOrEqualTo(Float value) {
            addCriterion("usdt_num >=", value, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumLessThan(Float value) {
            addCriterion("usdt_num <", value, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumLessThanOrEqualTo(Float value) {
            addCriterion("usdt_num <=", value, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumIn(List<Float> values) {
            addCriterion("usdt_num in", values, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumNotIn(List<Float> values) {
            addCriterion("usdt_num not in", values, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumBetween(Float value1, Float value2) {
            addCriterion("usdt_num between", value1, value2, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andUsdtNumNotBetween(Float value1, Float value2) {
            addCriterion("usdt_num not between", value1, value2, "usdtNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNull() {
            addCriterion("bed_num is null");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNotNull() {
            addCriterion("bed_num is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumEqualTo(String value) {
            addCriterion("bed_num =", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotEqualTo(String value) {
            addCriterion("bed_num <>", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThan(String value) {
            addCriterion("bed_num >", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThanOrEqualTo(String value) {
            addCriterion("bed_num >=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThan(String value) {
            addCriterion("bed_num <", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThanOrEqualTo(String value) {
            addCriterion("bed_num <=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLike(String value) {
            addCriterion("bed_num like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotLike(String value) {
            addCriterion("bed_num not like", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIn(List<String> values) {
            addCriterion("bed_num in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotIn(List<String> values) {
            addCriterion("bed_num not in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumBetween(String value1, String value2) {
            addCriterion("bed_num between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotBetween(String value1, String value2) {
            addCriterion("bed_num not between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumIsNull() {
            addCriterion("immt_num is null");
            return (Criteria) this;
        }

        public Criteria andImmtNumIsNotNull() {
            addCriterion("immt_num is not null");
            return (Criteria) this;
        }

        public Criteria andImmtNumEqualTo(String value) {
            addCriterion("immt_num =", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumNotEqualTo(String value) {
            addCriterion("immt_num <>", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumGreaterThan(String value) {
            addCriterion("immt_num >", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumGreaterThanOrEqualTo(String value) {
            addCriterion("immt_num >=", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumLessThan(String value) {
            addCriterion("immt_num <", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumLessThanOrEqualTo(String value) {
            addCriterion("immt_num <=", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumLike(String value) {
            addCriterion("immt_num like", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumNotLike(String value) {
            addCriterion("immt_num not like", value, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumIn(List<String> values) {
            addCriterion("immt_num in", values, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumNotIn(List<String> values) {
            addCriterion("immt_num not in", values, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumBetween(String value1, String value2) {
            addCriterion("immt_num between", value1, value2, "immtNum");
            return (Criteria) this;
        }

        public Criteria andImmtNumNotBetween(String value1, String value2) {
            addCriterion("immt_num not between", value1, value2, "immtNum");
            return (Criteria) this;
        }

        public Criteria andThAwardLvIsNull() {
            addCriterion("th_award_lv is null");
            return (Criteria) this;
        }

        public Criteria andThAwardLvIsNotNull() {
            addCriterion("th_award_lv is not null");
            return (Criteria) this;
        }

        public Criteria andThAwardLvEqualTo(Integer value) {
            addCriterion("th_award_lv =", value, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvNotEqualTo(Integer value) {
            addCriterion("th_award_lv <>", value, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvGreaterThan(Integer value) {
            addCriterion("th_award_lv >", value, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("th_award_lv >=", value, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvLessThan(Integer value) {
            addCriterion("th_award_lv <", value, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvLessThanOrEqualTo(Integer value) {
            addCriterion("th_award_lv <=", value, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvIn(List<Integer> values) {
            addCriterion("th_award_lv in", values, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvNotIn(List<Integer> values) {
            addCriterion("th_award_lv not in", values, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvBetween(Integer value1, Integer value2) {
            addCriterion("th_award_lv between", value1, value2, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andThAwardLvNotBetween(Integer value1, Integer value2) {
            addCriterion("th_award_lv not between", value1, value2, "thAwardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvIsNull() {
            addCriterion("award_lv is null");
            return (Criteria) this;
        }

        public Criteria andAwardLvIsNotNull() {
            addCriterion("award_lv is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLvEqualTo(Integer value) {
            addCriterion("award_lv =", value, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvNotEqualTo(Integer value) {
            addCriterion("award_lv <>", value, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvGreaterThan(Integer value) {
            addCriterion("award_lv >", value, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_lv >=", value, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvLessThan(Integer value) {
            addCriterion("award_lv <", value, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvLessThanOrEqualTo(Integer value) {
            addCriterion("award_lv <=", value, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvIn(List<Integer> values) {
            addCriterion("award_lv in", values, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvNotIn(List<Integer> values) {
            addCriterion("award_lv not in", values, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvBetween(Integer value1, Integer value2) {
            addCriterion("award_lv between", value1, value2, "awardLv");
            return (Criteria) this;
        }

        public Criteria andAwardLvNotBetween(Integer value1, Integer value2) {
            addCriterion("award_lv not between", value1, value2, "awardLv");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayIsNull() {
            addCriterion("dt_award_day is null");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayIsNotNull() {
            addCriterion("dt_award_day is not null");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayEqualTo(String value) {
            addCriterion("dt_award_day =", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayNotEqualTo(String value) {
            addCriterion("dt_award_day <>", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayGreaterThan(String value) {
            addCriterion("dt_award_day >", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayGreaterThanOrEqualTo(String value) {
            addCriterion("dt_award_day >=", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayLessThan(String value) {
            addCriterion("dt_award_day <", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayLessThanOrEqualTo(String value) {
            addCriterion("dt_award_day <=", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayLike(String value) {
            addCriterion("dt_award_day like", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayNotLike(String value) {
            addCriterion("dt_award_day not like", value, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayIn(List<String> values) {
            addCriterion("dt_award_day in", values, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayNotIn(List<String> values) {
            addCriterion("dt_award_day not in", values, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayBetween(String value1, String value2) {
            addCriterion("dt_award_day between", value1, value2, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andDtAwardDayNotBetween(String value1, String value2) {
            addCriterion("dt_award_day not between", value1, value2, "dtAwardDay");
            return (Criteria) this;
        }

        public Criteria andTbNumIsNull() {
            addCriterion("tb_num is null");
            return (Criteria) this;
        }

        public Criteria andTbNumIsNotNull() {
            addCriterion("tb_num is not null");
            return (Criteria) this;
        }

        public Criteria andTbNumEqualTo(Integer value) {
            addCriterion("tb_num =", value, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumNotEqualTo(Integer value) {
            addCriterion("tb_num <>", value, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumGreaterThan(Integer value) {
            addCriterion("tb_num >", value, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_num >=", value, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumLessThan(Integer value) {
            addCriterion("tb_num <", value, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumLessThanOrEqualTo(Integer value) {
            addCriterion("tb_num <=", value, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumIn(List<Integer> values) {
            addCriterion("tb_num in", values, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumNotIn(List<Integer> values) {
            addCriterion("tb_num not in", values, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumBetween(Integer value1, Integer value2) {
            addCriterion("tb_num between", value1, value2, "tbNum");
            return (Criteria) this;
        }

        public Criteria andTbNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_num not between", value1, value2, "tbNum");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayIsNull() {
            addCriterion("buy_tb_day is null");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayIsNotNull() {
            addCriterion("buy_tb_day is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayEqualTo(String value) {
            addCriterion("buy_tb_day =", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayNotEqualTo(String value) {
            addCriterion("buy_tb_day <>", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayGreaterThan(String value) {
            addCriterion("buy_tb_day >", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayGreaterThanOrEqualTo(String value) {
            addCriterion("buy_tb_day >=", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayLessThan(String value) {
            addCriterion("buy_tb_day <", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayLessThanOrEqualTo(String value) {
            addCriterion("buy_tb_day <=", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayLike(String value) {
            addCriterion("buy_tb_day like", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayNotLike(String value) {
            addCriterion("buy_tb_day not like", value, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayIn(List<String> values) {
            addCriterion("buy_tb_day in", values, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayNotIn(List<String> values) {
            addCriterion("buy_tb_day not in", values, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayBetween(String value1, String value2) {
            addCriterion("buy_tb_day between", value1, value2, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andBuyTbDayNotBetween(String value1, String value2) {
            addCriterion("buy_tb_day not between", value1, value2, "buyTbDay");
            return (Criteria) this;
        }

        public Criteria andThNumIsNull() {
            addCriterion("th_num is null");
            return (Criteria) this;
        }

        public Criteria andThNumIsNotNull() {
            addCriterion("th_num is not null");
            return (Criteria) this;
        }

        public Criteria andThNumEqualTo(Integer value) {
            addCriterion("th_num =", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumNotEqualTo(Integer value) {
            addCriterion("th_num <>", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumGreaterThan(Integer value) {
            addCriterion("th_num >", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("th_num >=", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumLessThan(Integer value) {
            addCriterion("th_num <", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumLessThanOrEqualTo(Integer value) {
            addCriterion("th_num <=", value, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumIn(List<Integer> values) {
            addCriterion("th_num in", values, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumNotIn(List<Integer> values) {
            addCriterion("th_num not in", values, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumBetween(Integer value1, Integer value2) {
            addCriterion("th_num between", value1, value2, "thNum");
            return (Criteria) this;
        }

        public Criteria andThNumNotBetween(Integer value1, Integer value2) {
            addCriterion("th_num not between", value1, value2, "thNum");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayIsNull() {
            addCriterion("bed_award_day is null");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayIsNotNull() {
            addCriterion("bed_award_day is not null");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayEqualTo(String value) {
            addCriterion("bed_award_day =", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayNotEqualTo(String value) {
            addCriterion("bed_award_day <>", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayGreaterThan(String value) {
            addCriterion("bed_award_day >", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayGreaterThanOrEqualTo(String value) {
            addCriterion("bed_award_day >=", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayLessThan(String value) {
            addCriterion("bed_award_day <", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayLessThanOrEqualTo(String value) {
            addCriterion("bed_award_day <=", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayLike(String value) {
            addCriterion("bed_award_day like", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayNotLike(String value) {
            addCriterion("bed_award_day not like", value, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayIn(List<String> values) {
            addCriterion("bed_award_day in", values, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayNotIn(List<String> values) {
            addCriterion("bed_award_day not in", values, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayBetween(String value1, String value2) {
            addCriterion("bed_award_day between", value1, value2, "bedAwardDay");
            return (Criteria) this;
        }

        public Criteria andBedAwardDayNotBetween(String value1, String value2) {
            addCriterion("bed_award_day not between", value1, value2, "bedAwardDay");
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