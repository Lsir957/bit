package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TjBlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TjBlExample() {
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

        public Criteria andSyblIsNull() {
            addCriterion("sybl is null");
            return (Criteria) this;
        }

        public Criteria andSyblIsNotNull() {
            addCriterion("sybl is not null");
            return (Criteria) this;
        }

        public Criteria andSyblEqualTo(BigDecimal value) {
            addCriterion("sybl =", value, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblNotEqualTo(BigDecimal value) {
            addCriterion("sybl <>", value, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblGreaterThan(BigDecimal value) {
            addCriterion("sybl >", value, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sybl >=", value, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblLessThan(BigDecimal value) {
            addCriterion("sybl <", value, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sybl <=", value, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblIn(List<BigDecimal> values) {
            addCriterion("sybl in", values, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblNotIn(List<BigDecimal> values) {
            addCriterion("sybl not in", values, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sybl between", value1, value2, "sybl");
            return (Criteria) this;
        }

        public Criteria andSyblNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sybl not between", value1, value2, "sybl");
            return (Criteria) this;
        }

        public Criteria andSxztIsNull() {
            addCriterion("sxzt is null");
            return (Criteria) this;
        }

        public Criteria andSxztIsNotNull() {
            addCriterion("sxzt is not null");
            return (Criteria) this;
        }

        public Criteria andSxztEqualTo(Integer value) {
            addCriterion("sxzt =", value, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztNotEqualTo(Integer value) {
            addCriterion("sxzt <>", value, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztGreaterThan(Integer value) {
            addCriterion("sxzt >", value, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztGreaterThanOrEqualTo(Integer value) {
            addCriterion("sxzt >=", value, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztLessThan(Integer value) {
            addCriterion("sxzt <", value, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztLessThanOrEqualTo(Integer value) {
            addCriterion("sxzt <=", value, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztIn(List<Integer> values) {
            addCriterion("sxzt in", values, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztNotIn(List<Integer> values) {
            addCriterion("sxzt not in", values, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztBetween(Integer value1, Integer value2) {
            addCriterion("sxzt between", value1, value2, "sxzt");
            return (Criteria) this;
        }

        public Criteria andSxztNotBetween(Integer value1, Integer value2) {
            addCriterion("sxzt not between", value1, value2, "sxzt");
            return (Criteria) this;
        }

        public Criteria andTjdsIsNull() {
            addCriterion("tjds is null");
            return (Criteria) this;
        }

        public Criteria andTjdsIsNotNull() {
            addCriterion("tjds is not null");
            return (Criteria) this;
        }

        public Criteria andTjdsEqualTo(Integer value) {
            addCriterion("tjds =", value, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsNotEqualTo(Integer value) {
            addCriterion("tjds <>", value, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsGreaterThan(Integer value) {
            addCriterion("tjds >", value, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjds >=", value, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsLessThan(Integer value) {
            addCriterion("tjds <", value, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsLessThanOrEqualTo(Integer value) {
            addCriterion("tjds <=", value, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsIn(List<Integer> values) {
            addCriterion("tjds in", values, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsNotIn(List<Integer> values) {
            addCriterion("tjds not in", values, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsBetween(Integer value1, Integer value2) {
            addCriterion("tjds between", value1, value2, "tjds");
            return (Criteria) this;
        }

        public Criteria andTjdsNotBetween(Integer value1, Integer value2) {
            addCriterion("tjds not between", value1, value2, "tjds");
            return (Criteria) this;
        }

        public Criteria andSxLvIsNull() {
            addCriterion("sx_lv is null");
            return (Criteria) this;
        }

        public Criteria andSxLvIsNotNull() {
            addCriterion("sx_lv is not null");
            return (Criteria) this;
        }

        public Criteria andSxLvEqualTo(Integer value) {
            addCriterion("sx_lv =", value, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvNotEqualTo(Integer value) {
            addCriterion("sx_lv <>", value, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvGreaterThan(Integer value) {
            addCriterion("sx_lv >", value, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("sx_lv >=", value, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvLessThan(Integer value) {
            addCriterion("sx_lv <", value, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvLessThanOrEqualTo(Integer value) {
            addCriterion("sx_lv <=", value, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvIn(List<Integer> values) {
            addCriterion("sx_lv in", values, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvNotIn(List<Integer> values) {
            addCriterion("sx_lv not in", values, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvBetween(Integer value1, Integer value2) {
            addCriterion("sx_lv between", value1, value2, "sxLv");
            return (Criteria) this;
        }

        public Criteria andSxLvNotBetween(Integer value1, Integer value2) {
            addCriterion("sx_lv not between", value1, value2, "sxLv");
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