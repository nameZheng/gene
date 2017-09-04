package com.zgf.gene.pojo;

import java.util.ArrayList;
import java.util.List;

public class S5Sheet1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public S5Sheet1Example() {
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

        public Criteria andHumanIsNull() {
            addCriterion("Human is null");
            return (Criteria) this;
        }

        public Criteria andHumanIsNotNull() {
            addCriterion("Human is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEqualTo(String value) {
            addCriterion("Human =", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotEqualTo(String value) {
            addCriterion("Human <>", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanGreaterThan(String value) {
            addCriterion("Human >", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanGreaterThanOrEqualTo(String value) {
            addCriterion("Human >=", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLessThan(String value) {
            addCriterion("Human <", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLessThanOrEqualTo(String value) {
            addCriterion("Human <=", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLike(String value) {
            addCriterion("Human like", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotLike(String value) {
            addCriterion("Human not like", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanIn(List<String> values) {
            addCriterion("Human in", values, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotIn(List<String> values) {
            addCriterion("Human not in", values, "human");
            return (Criteria) this;
        }

        public Criteria andHumanBetween(String value1, String value2) {
            addCriterion("Human between", value1, value2, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotBetween(String value1, String value2) {
            addCriterion("Human not between", value1, value2, "human");
            return (Criteria) this;
        }

        public Criteria andMouseIsNull() {
            addCriterion("Mouse is null");
            return (Criteria) this;
        }

        public Criteria andMouseIsNotNull() {
            addCriterion("Mouse is not null");
            return (Criteria) this;
        }

        public Criteria andMouseEqualTo(String value) {
            addCriterion("Mouse =", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotEqualTo(String value) {
            addCriterion("Mouse <>", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseGreaterThan(String value) {
            addCriterion("Mouse >", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseGreaterThanOrEqualTo(String value) {
            addCriterion("Mouse >=", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLessThan(String value) {
            addCriterion("Mouse <", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLessThanOrEqualTo(String value) {
            addCriterion("Mouse <=", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLike(String value) {
            addCriterion("Mouse like", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotLike(String value) {
            addCriterion("Mouse not like", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseIn(List<String> values) {
            addCriterion("Mouse in", values, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotIn(List<String> values) {
            addCriterion("Mouse not in", values, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseBetween(String value1, String value2) {
            addCriterion("Mouse between", value1, value2, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotBetween(String value1, String value2) {
            addCriterion("Mouse not between", value1, value2, "mouse");
            return (Criteria) this;
        }

        public Criteria andChickenIsNull() {
            addCriterion("Chicken is null");
            return (Criteria) this;
        }

        public Criteria andChickenIsNotNull() {
            addCriterion("Chicken is not null");
            return (Criteria) this;
        }

        public Criteria andChickenEqualTo(String value) {
            addCriterion("Chicken =", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotEqualTo(String value) {
            addCriterion("Chicken <>", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenGreaterThan(String value) {
            addCriterion("Chicken >", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenGreaterThanOrEqualTo(String value) {
            addCriterion("Chicken >=", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenLessThan(String value) {
            addCriterion("Chicken <", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenLessThanOrEqualTo(String value) {
            addCriterion("Chicken <=", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenLike(String value) {
            addCriterion("Chicken like", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotLike(String value) {
            addCriterion("Chicken not like", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenIn(List<String> values) {
            addCriterion("Chicken in", values, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotIn(List<String> values) {
            addCriterion("Chicken not in", values, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenBetween(String value1, String value2) {
            addCriterion("Chicken between", value1, value2, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotBetween(String value1, String value2) {
            addCriterion("Chicken not between", value1, value2, "chicken");
            return (Criteria) this;
        }

        public Criteria andXenopusIsNull() {
            addCriterion("Xenopus is null");
            return (Criteria) this;
        }

        public Criteria andXenopusIsNotNull() {
            addCriterion("Xenopus is not null");
            return (Criteria) this;
        }

        public Criteria andXenopusEqualTo(String value) {
            addCriterion("Xenopus =", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusNotEqualTo(String value) {
            addCriterion("Xenopus <>", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusGreaterThan(String value) {
            addCriterion("Xenopus >", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusGreaterThanOrEqualTo(String value) {
            addCriterion("Xenopus >=", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusLessThan(String value) {
            addCriterion("Xenopus <", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusLessThanOrEqualTo(String value) {
            addCriterion("Xenopus <=", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusLike(String value) {
            addCriterion("Xenopus like", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusNotLike(String value) {
            addCriterion("Xenopus not like", value, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusIn(List<String> values) {
            addCriterion("Xenopus in", values, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusNotIn(List<String> values) {
            addCriterion("Xenopus not in", values, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusBetween(String value1, String value2) {
            addCriterion("Xenopus between", value1, value2, "xenopus");
            return (Criteria) this;
        }

        public Criteria andXenopusNotBetween(String value1, String value2) {
            addCriterion("Xenopus not between", value1, value2, "xenopus");
            return (Criteria) this;
        }

        public Criteria andZebrafishIsNull() {
            addCriterion("Zebrafish is null");
            return (Criteria) this;
        }

        public Criteria andZebrafishIsNotNull() {
            addCriterion("Zebrafish is not null");
            return (Criteria) this;
        }

        public Criteria andZebrafishEqualTo(String value) {
            addCriterion("Zebrafish =", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishNotEqualTo(String value) {
            addCriterion("Zebrafish <>", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishGreaterThan(String value) {
            addCriterion("Zebrafish >", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishGreaterThanOrEqualTo(String value) {
            addCriterion("Zebrafish >=", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishLessThan(String value) {
            addCriterion("Zebrafish <", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishLessThanOrEqualTo(String value) {
            addCriterion("Zebrafish <=", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishLike(String value) {
            addCriterion("Zebrafish like", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishNotLike(String value) {
            addCriterion("Zebrafish not like", value, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishIn(List<String> values) {
            addCriterion("Zebrafish in", values, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishNotIn(List<String> values) {
            addCriterion("Zebrafish not in", values, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishBetween(String value1, String value2) {
            addCriterion("Zebrafish between", value1, value2, "zebrafish");
            return (Criteria) this;
        }

        public Criteria andZebrafishNotBetween(String value1, String value2) {
            addCriterion("Zebrafish not between", value1, value2, "zebrafish");
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