package com.zgf.gene.pojo;

import java.util.ArrayList;
import java.util.List;

public class S2KeggExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public S2KeggExample() {
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

        public Criteria andTermIsNull() {
            addCriterion("Term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("Term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("Term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("Term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("Term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("Term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("Term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("Term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("Term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("Term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("Term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("Term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("Term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("Term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("Count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("Count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("Count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("Count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("Count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("Count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("Count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("Count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("Count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("Count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("perCent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("perCent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(String value) {
            addCriterion("perCent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(String value) {
            addCriterion("perCent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(String value) {
            addCriterion("perCent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(String value) {
            addCriterion("perCent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(String value) {
            addCriterion("perCent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(String value) {
            addCriterion("perCent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLike(String value) {
            addCriterion("perCent like", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotLike(String value) {
            addCriterion("perCent not like", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<String> values) {
            addCriterion("perCent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<String> values) {
            addCriterion("perCent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(String value1, String value2) {
            addCriterion("perCent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(String value1, String value2) {
            addCriterion("perCent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPvalueIsNull() {
            addCriterion("PValue is null");
            return (Criteria) this;
        }

        public Criteria andPvalueIsNotNull() {
            addCriterion("PValue is not null");
            return (Criteria) this;
        }

        public Criteria andPvalueEqualTo(String value) {
            addCriterion("PValue =", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotEqualTo(String value) {
            addCriterion("PValue <>", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueGreaterThan(String value) {
            addCriterion("PValue >", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueGreaterThanOrEqualTo(String value) {
            addCriterion("PValue >=", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueLessThan(String value) {
            addCriterion("PValue <", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueLessThanOrEqualTo(String value) {
            addCriterion("PValue <=", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueLike(String value) {
            addCriterion("PValue like", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotLike(String value) {
            addCriterion("PValue not like", value, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueIn(List<String> values) {
            addCriterion("PValue in", values, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotIn(List<String> values) {
            addCriterion("PValue not in", values, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueBetween(String value1, String value2) {
            addCriterion("PValue between", value1, value2, "pvalue");
            return (Criteria) this;
        }

        public Criteria andPvalueNotBetween(String value1, String value2) {
            addCriterion("PValue not between", value1, value2, "pvalue");
            return (Criteria) this;
        }

        public Criteria andGenesIsNull() {
            addCriterion("Genes is null");
            return (Criteria) this;
        }

        public Criteria andGenesIsNotNull() {
            addCriterion("Genes is not null");
            return (Criteria) this;
        }

        public Criteria andGenesEqualTo(String value) {
            addCriterion("Genes =", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesNotEqualTo(String value) {
            addCriterion("Genes <>", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesGreaterThan(String value) {
            addCriterion("Genes >", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesGreaterThanOrEqualTo(String value) {
            addCriterion("Genes >=", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesLessThan(String value) {
            addCriterion("Genes <", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesLessThanOrEqualTo(String value) {
            addCriterion("Genes <=", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesLike(String value) {
            addCriterion("Genes like", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesNotLike(String value) {
            addCriterion("Genes not like", value, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesIn(List<String> values) {
            addCriterion("Genes in", values, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesNotIn(List<String> values) {
            addCriterion("Genes not in", values, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesBetween(String value1, String value2) {
            addCriterion("Genes between", value1, value2, "genes");
            return (Criteria) this;
        }

        public Criteria andGenesNotBetween(String value1, String value2) {
            addCriterion("Genes not between", value1, value2, "genes");
            return (Criteria) this;
        }

        public Criteria andListtotalIsNull() {
            addCriterion("ListTotal is null");
            return (Criteria) this;
        }

        public Criteria andListtotalIsNotNull() {
            addCriterion("ListTotal is not null");
            return (Criteria) this;
        }

        public Criteria andListtotalEqualTo(String value) {
            addCriterion("ListTotal =", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalNotEqualTo(String value) {
            addCriterion("ListTotal <>", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalGreaterThan(String value) {
            addCriterion("ListTotal >", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalGreaterThanOrEqualTo(String value) {
            addCriterion("ListTotal >=", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalLessThan(String value) {
            addCriterion("ListTotal <", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalLessThanOrEqualTo(String value) {
            addCriterion("ListTotal <=", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalLike(String value) {
            addCriterion("ListTotal like", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalNotLike(String value) {
            addCriterion("ListTotal not like", value, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalIn(List<String> values) {
            addCriterion("ListTotal in", values, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalNotIn(List<String> values) {
            addCriterion("ListTotal not in", values, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalBetween(String value1, String value2) {
            addCriterion("ListTotal between", value1, value2, "listtotal");
            return (Criteria) this;
        }

        public Criteria andListtotalNotBetween(String value1, String value2) {
            addCriterion("ListTotal not between", value1, value2, "listtotal");
            return (Criteria) this;
        }

        public Criteria andPophitsIsNull() {
            addCriterion("PopHits is null");
            return (Criteria) this;
        }

        public Criteria andPophitsIsNotNull() {
            addCriterion("PopHits is not null");
            return (Criteria) this;
        }

        public Criteria andPophitsEqualTo(String value) {
            addCriterion("PopHits =", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsNotEqualTo(String value) {
            addCriterion("PopHits <>", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsGreaterThan(String value) {
            addCriterion("PopHits >", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsGreaterThanOrEqualTo(String value) {
            addCriterion("PopHits >=", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsLessThan(String value) {
            addCriterion("PopHits <", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsLessThanOrEqualTo(String value) {
            addCriterion("PopHits <=", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsLike(String value) {
            addCriterion("PopHits like", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsNotLike(String value) {
            addCriterion("PopHits not like", value, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsIn(List<String> values) {
            addCriterion("PopHits in", values, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsNotIn(List<String> values) {
            addCriterion("PopHits not in", values, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsBetween(String value1, String value2) {
            addCriterion("PopHits between", value1, value2, "pophits");
            return (Criteria) this;
        }

        public Criteria andPophitsNotBetween(String value1, String value2) {
            addCriterion("PopHits not between", value1, value2, "pophits");
            return (Criteria) this;
        }

        public Criteria andPoptotalIsNull() {
            addCriterion("PopTotal is null");
            return (Criteria) this;
        }

        public Criteria andPoptotalIsNotNull() {
            addCriterion("PopTotal is not null");
            return (Criteria) this;
        }

        public Criteria andPoptotalEqualTo(String value) {
            addCriterion("PopTotal =", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalNotEqualTo(String value) {
            addCriterion("PopTotal <>", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalGreaterThan(String value) {
            addCriterion("PopTotal >", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalGreaterThanOrEqualTo(String value) {
            addCriterion("PopTotal >=", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalLessThan(String value) {
            addCriterion("PopTotal <", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalLessThanOrEqualTo(String value) {
            addCriterion("PopTotal <=", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalLike(String value) {
            addCriterion("PopTotal like", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalNotLike(String value) {
            addCriterion("PopTotal not like", value, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalIn(List<String> values) {
            addCriterion("PopTotal in", values, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalNotIn(List<String> values) {
            addCriterion("PopTotal not in", values, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalBetween(String value1, String value2) {
            addCriterion("PopTotal between", value1, value2, "poptotal");
            return (Criteria) this;
        }

        public Criteria andPoptotalNotBetween(String value1, String value2) {
            addCriterion("PopTotal not between", value1, value2, "poptotal");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentIsNull() {
            addCriterion("FoldEnrichment is null");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentIsNotNull() {
            addCriterion("FoldEnrichment is not null");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentEqualTo(String value) {
            addCriterion("FoldEnrichment =", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentNotEqualTo(String value) {
            addCriterion("FoldEnrichment <>", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentGreaterThan(String value) {
            addCriterion("FoldEnrichment >", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentGreaterThanOrEqualTo(String value) {
            addCriterion("FoldEnrichment >=", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentLessThan(String value) {
            addCriterion("FoldEnrichment <", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentLessThanOrEqualTo(String value) {
            addCriterion("FoldEnrichment <=", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentLike(String value) {
            addCriterion("FoldEnrichment like", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentNotLike(String value) {
            addCriterion("FoldEnrichment not like", value, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentIn(List<String> values) {
            addCriterion("FoldEnrichment in", values, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentNotIn(List<String> values) {
            addCriterion("FoldEnrichment not in", values, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentBetween(String value1, String value2) {
            addCriterion("FoldEnrichment between", value1, value2, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andFoldenrichmentNotBetween(String value1, String value2) {
            addCriterion("FoldEnrichment not between", value1, value2, "foldenrichment");
            return (Criteria) this;
        }

        public Criteria andBonferroniIsNull() {
            addCriterion("Bonferroni is null");
            return (Criteria) this;
        }

        public Criteria andBonferroniIsNotNull() {
            addCriterion("Bonferroni is not null");
            return (Criteria) this;
        }

        public Criteria andBonferroniEqualTo(String value) {
            addCriterion("Bonferroni =", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniNotEqualTo(String value) {
            addCriterion("Bonferroni <>", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniGreaterThan(String value) {
            addCriterion("Bonferroni >", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniGreaterThanOrEqualTo(String value) {
            addCriterion("Bonferroni >=", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniLessThan(String value) {
            addCriterion("Bonferroni <", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniLessThanOrEqualTo(String value) {
            addCriterion("Bonferroni <=", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniLike(String value) {
            addCriterion("Bonferroni like", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniNotLike(String value) {
            addCriterion("Bonferroni not like", value, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniIn(List<String> values) {
            addCriterion("Bonferroni in", values, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniNotIn(List<String> values) {
            addCriterion("Bonferroni not in", values, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniBetween(String value1, String value2) {
            addCriterion("Bonferroni between", value1, value2, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBonferroniNotBetween(String value1, String value2) {
            addCriterion("Bonferroni not between", value1, value2, "bonferroni");
            return (Criteria) this;
        }

        public Criteria andBenjaminiIsNull() {
            addCriterion("Benjamini is null");
            return (Criteria) this;
        }

        public Criteria andBenjaminiIsNotNull() {
            addCriterion("Benjamini is not null");
            return (Criteria) this;
        }

        public Criteria andBenjaminiEqualTo(String value) {
            addCriterion("Benjamini =", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiNotEqualTo(String value) {
            addCriterion("Benjamini <>", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiGreaterThan(String value) {
            addCriterion("Benjamini >", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiGreaterThanOrEqualTo(String value) {
            addCriterion("Benjamini >=", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiLessThan(String value) {
            addCriterion("Benjamini <", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiLessThanOrEqualTo(String value) {
            addCriterion("Benjamini <=", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiLike(String value) {
            addCriterion("Benjamini like", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiNotLike(String value) {
            addCriterion("Benjamini not like", value, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiIn(List<String> values) {
            addCriterion("Benjamini in", values, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiNotIn(List<String> values) {
            addCriterion("Benjamini not in", values, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiBetween(String value1, String value2) {
            addCriterion("Benjamini between", value1, value2, "benjamini");
            return (Criteria) this;
        }

        public Criteria andBenjaminiNotBetween(String value1, String value2) {
            addCriterion("Benjamini not between", value1, value2, "benjamini");
            return (Criteria) this;
        }

        public Criteria andFdrIsNull() {
            addCriterion("FDR is null");
            return (Criteria) this;
        }

        public Criteria andFdrIsNotNull() {
            addCriterion("FDR is not null");
            return (Criteria) this;
        }

        public Criteria andFdrEqualTo(String value) {
            addCriterion("FDR =", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotEqualTo(String value) {
            addCriterion("FDR <>", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrGreaterThan(String value) {
            addCriterion("FDR >", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrGreaterThanOrEqualTo(String value) {
            addCriterion("FDR >=", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrLessThan(String value) {
            addCriterion("FDR <", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrLessThanOrEqualTo(String value) {
            addCriterion("FDR <=", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrLike(String value) {
            addCriterion("FDR like", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotLike(String value) {
            addCriterion("FDR not like", value, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrIn(List<String> values) {
            addCriterion("FDR in", values, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotIn(List<String> values) {
            addCriterion("FDR not in", values, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrBetween(String value1, String value2) {
            addCriterion("FDR between", value1, value2, "fdr");
            return (Criteria) this;
        }

        public Criteria andFdrNotBetween(String value1, String value2) {
            addCriterion("FDR not between", value1, value2, "fdr");
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