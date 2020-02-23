package com.test.crud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClentInfoExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andNote1IsNull() {
            addCriterion("note1 is null");
            return (Criteria) this;
        }

        public Criteria andNote1IsNotNull() {
            addCriterion("note1 is not null");
            return (Criteria) this;
        }

        public Criteria andNote1EqualTo(String value) {
            addCriterion("note1 =", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotEqualTo(String value) {
            addCriterion("note1 <>", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1GreaterThan(String value) {
            addCriterion("note1 >", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1GreaterThanOrEqualTo(String value) {
            addCriterion("note1 >=", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1LessThan(String value) {
            addCriterion("note1 <", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1LessThanOrEqualTo(String value) {
            addCriterion("note1 <=", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1Like(String value) {
            addCriterion("note1 like", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotLike(String value) {
            addCriterion("note1 not like", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1In(List<String> values) {
            addCriterion("note1 in", values, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotIn(List<String> values) {
            addCriterion("note1 not in", values, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1Between(String value1, String value2) {
            addCriterion("note1 between", value1, value2, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotBetween(String value1, String value2) {
            addCriterion("note1 not between", value1, value2, "note1");
            return (Criteria) this;
        }

        public Criteria andNote2IsNull() {
            addCriterion("note2 is null");
            return (Criteria) this;
        }

        public Criteria andNote2IsNotNull() {
            addCriterion("note2 is not null");
            return (Criteria) this;
        }

        public Criteria andNote2EqualTo(String value) {
            addCriterion("note2 =", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotEqualTo(String value) {
            addCriterion("note2 <>", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2GreaterThan(String value) {
            addCriterion("note2 >", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2GreaterThanOrEqualTo(String value) {
            addCriterion("note2 >=", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2LessThan(String value) {
            addCriterion("note2 <", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2LessThanOrEqualTo(String value) {
            addCriterion("note2 <=", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2Like(String value) {
            addCriterion("note2 like", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotLike(String value) {
            addCriterion("note2 not like", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2In(List<String> values) {
            addCriterion("note2 in", values, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotIn(List<String> values) {
            addCriterion("note2 not in", values, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2Between(String value1, String value2) {
            addCriterion("note2 between", value1, value2, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotBetween(String value1, String value2) {
            addCriterion("note2 not between", value1, value2, "note2");
            return (Criteria) this;
        }

        public Criteria andNote3IsNull() {
            addCriterion("note3 is null");
            return (Criteria) this;
        }

        public Criteria andNote3IsNotNull() {
            addCriterion("note3 is not null");
            return (Criteria) this;
        }

        public Criteria andNote3EqualTo(String value) {
            addCriterion("note3 =", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3NotEqualTo(String value) {
            addCriterion("note3 <>", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3GreaterThan(String value) {
            addCriterion("note3 >", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3GreaterThanOrEqualTo(String value) {
            addCriterion("note3 >=", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3LessThan(String value) {
            addCriterion("note3 <", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3LessThanOrEqualTo(String value) {
            addCriterion("note3 <=", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3Like(String value) {
            addCriterion("note3 like", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3NotLike(String value) {
            addCriterion("note3 not like", value, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3In(List<String> values) {
            addCriterion("note3 in", values, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3NotIn(List<String> values) {
            addCriterion("note3 not in", values, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3Between(String value1, String value2) {
            addCriterion("note3 between", value1, value2, "note3");
            return (Criteria) this;
        }

        public Criteria andNote3NotBetween(String value1, String value2) {
            addCriterion("note3 not between", value1, value2, "note3");
            return (Criteria) this;
        }

        public Criteria andNote4IsNull() {
            addCriterion("note4 is null");
            return (Criteria) this;
        }

        public Criteria andNote4IsNotNull() {
            addCriterion("note4 is not null");
            return (Criteria) this;
        }

        public Criteria andNote4EqualTo(String value) {
            addCriterion("note4 =", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4NotEqualTo(String value) {
            addCriterion("note4 <>", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4GreaterThan(String value) {
            addCriterion("note4 >", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4GreaterThanOrEqualTo(String value) {
            addCriterion("note4 >=", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4LessThan(String value) {
            addCriterion("note4 <", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4LessThanOrEqualTo(String value) {
            addCriterion("note4 <=", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4Like(String value) {
            addCriterion("note4 like", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4NotLike(String value) {
            addCriterion("note4 not like", value, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4In(List<String> values) {
            addCriterion("note4 in", values, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4NotIn(List<String> values) {
            addCriterion("note4 not in", values, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4Between(String value1, String value2) {
            addCriterion("note4 between", value1, value2, "note4");
            return (Criteria) this;
        }

        public Criteria andNote4NotBetween(String value1, String value2) {
            addCriterion("note4 not between", value1, value2, "note4");
            return (Criteria) this;
        }

        public Criteria andNote5IsNull() {
            addCriterion("note5 is null");
            return (Criteria) this;
        }

        public Criteria andNote5IsNotNull() {
            addCriterion("note5 is not null");
            return (Criteria) this;
        }

        public Criteria andNote5EqualTo(String value) {
            addCriterion("note5 =", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5NotEqualTo(String value) {
            addCriterion("note5 <>", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5GreaterThan(String value) {
            addCriterion("note5 >", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5GreaterThanOrEqualTo(String value) {
            addCriterion("note5 >=", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5LessThan(String value) {
            addCriterion("note5 <", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5LessThanOrEqualTo(String value) {
            addCriterion("note5 <=", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5Like(String value) {
            addCriterion("note5 like", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5NotLike(String value) {
            addCriterion("note5 not like", value, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5In(List<String> values) {
            addCriterion("note5 in", values, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5NotIn(List<String> values) {
            addCriterion("note5 not in", values, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5Between(String value1, String value2) {
            addCriterion("note5 between", value1, value2, "note5");
            return (Criteria) this;
        }

        public Criteria andNote5NotBetween(String value1, String value2) {
            addCriterion("note5 not between", value1, value2, "note5");
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