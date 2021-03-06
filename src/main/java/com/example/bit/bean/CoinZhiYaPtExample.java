package com.example.bit.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinZhiYaPtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinZhiYaPtExample() {
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

        public Criteria andQishuIdIsNull() {
            addCriterion("qishu_id is null");
            return (Criteria) this;
        }

        public Criteria andQishuIdIsNotNull() {
            addCriterion("qishu_id is not null");
            return (Criteria) this;
        }

        public Criteria andQishuIdEqualTo(Integer value) {
            addCriterion("qishu_id =", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdNotEqualTo(Integer value) {
            addCriterion("qishu_id <>", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdGreaterThan(Integer value) {
            addCriterion("qishu_id >", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qishu_id >=", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdLessThan(Integer value) {
            addCriterion("qishu_id <", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdLessThanOrEqualTo(Integer value) {
            addCriterion("qishu_id <=", value, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdIn(List<Integer> values) {
            addCriterion("qishu_id in", values, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdNotIn(List<Integer> values) {
            addCriterion("qishu_id not in", values, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdBetween(Integer value1, Integer value2) {
            addCriterion("qishu_id between", value1, value2, "qishuId");
            return (Criteria) this;
        }

        public Criteria andQishuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qishu_id not between", value1, value2, "qishuId");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIsNull() {
            addCriterion("leave_num is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIsNotNull() {
            addCriterion("leave_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumEqualTo(Integer value) {
            addCriterion("leave_num =", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotEqualTo(Integer value) {
            addCriterion("leave_num <>", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumGreaterThan(Integer value) {
            addCriterion("leave_num >", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_num >=", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumLessThan(Integer value) {
            addCriterion("leave_num <", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumLessThanOrEqualTo(Integer value) {
            addCriterion("leave_num <=", value, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumIn(List<Integer> values) {
            addCriterion("leave_num in", values, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotIn(List<Integer> values) {
            addCriterion("leave_num not in", values, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumBetween(Integer value1, Integer value2) {
            addCriterion("leave_num between", value1, value2, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andLeaveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_num not between", value1, value2, "leaveNum");
            return (Criteria) this;
        }

        public Criteria andEndTimeSIsNull() {
            addCriterion("end_time_s is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeSIsNotNull() {
            addCriterion("end_time_s is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeSEqualTo(Date value) {
            addCriterion("end_time_s =", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSNotEqualTo(Date value) {
            addCriterion("end_time_s <>", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSGreaterThan(Date value) {
            addCriterion("end_time_s >", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time_s >=", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSLessThan(Date value) {
            addCriterion("end_time_s <", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSLessThanOrEqualTo(Date value) {
            addCriterion("end_time_s <=", value, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSIn(List<Date> values) {
            addCriterion("end_time_s in", values, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSNotIn(List<Date> values) {
            addCriterion("end_time_s not in", values, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSBetween(Date value1, Date value2) {
            addCriterion("end_time_s between", value1, value2, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andEndTimeSNotBetween(Date value1, Date value2) {
            addCriterion("end_time_s not between", value1, value2, "endTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSIsNull() {
            addCriterion("create_time_s is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSIsNotNull() {
            addCriterion("create_time_s is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSEqualTo(Date value) {
            addCriterion("create_time_s =", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSNotEqualTo(Date value) {
            addCriterion("create_time_s <>", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSGreaterThan(Date value) {
            addCriterion("create_time_s >", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time_s >=", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSLessThan(Date value) {
            addCriterion("create_time_s <", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSLessThanOrEqualTo(Date value) {
            addCriterion("create_time_s <=", value, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSIn(List<Date> values) {
            addCriterion("create_time_s in", values, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSNotIn(List<Date> values) {
            addCriterion("create_time_s not in", values, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSBetween(Date value1, Date value2) {
            addCriterion("create_time_s between", value1, value2, "createTimeS");
            return (Criteria) this;
        }

        public Criteria andCreateTimeSNotBetween(Date value1, Date value2) {
            addCriterion("create_time_s not between", value1, value2, "createTimeS");
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