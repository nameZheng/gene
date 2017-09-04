package com.zgf.gene.pojo;

import java.util.ArrayList;
import java.util.List;

public class S3OmimDiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public S3OmimDiseaseExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("Category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("Category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("Category not between", value1, value2, "category");
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

        public Criteria andCountEqualTo(String value) {
            addCriterion("Count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(String value) {
            addCriterion("Count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(String value) {
            addCriterion("Count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(String value) {
            addCriterion("Count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(String value) {
            addCriterion("Count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(String value) {
            addCriterion("Count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLike(String value) {
            addCriterion("Count like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotLike(String value) {
            addCriterion("Count not like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<String> values) {
            addCriterion("Count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<String> values) {
            addCriterion("Count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(String value1, String value2) {
            addCriterion("Count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(String value1, String value2) {
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

        public Criteria andListTotalIsNull() {
            addCriterion("\"List Total\" is null");
            return (Criteria) this;
        }

        public Criteria andListTotalIsNotNull() {
            addCriterion("\"List Total\" is not null");
            return (Criteria) this;
        }

        public Criteria andListTotalEqualTo(String value) {
            addCriterion("\"List Total\" =", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalNotEqualTo(String value) {
            addCriterion("\"List Total\" <>", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalGreaterThan(String value) {
            addCriterion("\"List Total\" >", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalGreaterThanOrEqualTo(String value) {
            addCriterion("\"List Total\" >=", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalLessThan(String value) {
            addCriterion("\"List Total\" <", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalLessThanOrEqualTo(String value) {
            addCriterion("\"List Total\" <=", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalLike(String value) {
            addCriterion("\"List Total\" like", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalNotLike(String value) {
            addCriterion("\"List Total\" not like", value, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalIn(List<String> values) {
            addCriterion("\"List Total\" in", values, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalNotIn(List<String> values) {
            addCriterion("\"List Total\" not in", values, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalBetween(String value1, String value2) {
            addCriterion("\"List Total\" between", value1, value2, "listTotal");
            return (Criteria) this;
        }

        public Criteria andListTotalNotBetween(String value1, String value2) {
            addCriterion("\"List Total\" not between", value1, value2, "listTotal");
            return (Criteria) this;
        }

        public Criteria andPopHitsIsNull() {
            addCriterion("\"Pop Hits\" is null");
            return (Criteria) this;
        }

        public Criteria andPopHitsIsNotNull() {
            addCriterion("\"Pop Hits\" is not null");
            return (Criteria) this;
        }

        public Criteria andPopHitsEqualTo(String value) {
            addCriterion("\"Pop Hits\" =", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsNotEqualTo(String value) {
            addCriterion("\"Pop Hits\" <>", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsGreaterThan(String value) {
            addCriterion("\"Pop Hits\" >", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsGreaterThanOrEqualTo(String value) {
            addCriterion("\"Pop Hits\" >=", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsLessThan(String value) {
            addCriterion("\"Pop Hits\" <", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsLessThanOrEqualTo(String value) {
            addCriterion("\"Pop Hits\" <=", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsLike(String value) {
            addCriterion("\"Pop Hits\" like", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsNotLike(String value) {
            addCriterion("\"Pop Hits\" not like", value, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsIn(List<String> values) {
            addCriterion("\"Pop Hits\" in", values, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsNotIn(List<String> values) {
            addCriterion("\"Pop Hits\" not in", values, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsBetween(String value1, String value2) {
            addCriterion("\"Pop Hits\" between", value1, value2, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopHitsNotBetween(String value1, String value2) {
            addCriterion("\"Pop Hits\" not between", value1, value2, "popHits");
            return (Criteria) this;
        }

        public Criteria andPopTotalIsNull() {
            addCriterion("\"Pop Total\" is null");
            return (Criteria) this;
        }

        public Criteria andPopTotalIsNotNull() {
            addCriterion("\"Pop Total\" is not null");
            return (Criteria) this;
        }

        public Criteria andPopTotalEqualTo(String value) {
            addCriterion("\"Pop Total\" =", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalNotEqualTo(String value) {
            addCriterion("\"Pop Total\" <>", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalGreaterThan(String value) {
            addCriterion("\"Pop Total\" >", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalGreaterThanOrEqualTo(String value) {
            addCriterion("\"Pop Total\" >=", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalLessThan(String value) {
            addCriterion("\"Pop Total\" <", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalLessThanOrEqualTo(String value) {
            addCriterion("\"Pop Total\" <=", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalLike(String value) {
            addCriterion("\"Pop Total\" like", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalNotLike(String value) {
            addCriterion("\"Pop Total\" not like", value, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalIn(List<String> values) {
            addCriterion("\"Pop Total\" in", values, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalNotIn(List<String> values) {
            addCriterion("\"Pop Total\" not in", values, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalBetween(String value1, String value2) {
            addCriterion("\"Pop Total\" between", value1, value2, "popTotal");
            return (Criteria) this;
        }

        public Criteria andPopTotalNotBetween(String value1, String value2) {
            addCriterion("\"Pop Total\" not between", value1, value2, "popTotal");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentIsNull() {
            addCriterion("\"Fold Enrichment\" is null");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentIsNotNull() {
            addCriterion("\"Fold Enrichment\" is not null");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentEqualTo(String value) {
            addCriterion("\"Fold Enrichment\" =", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentNotEqualTo(String value) {
            addCriterion("\"Fold Enrichment\" <>", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentGreaterThan(String value) {
            addCriterion("\"Fold Enrichment\" >", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentGreaterThanOrEqualTo(String value) {
            addCriterion("\"Fold Enrichment\" >=", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentLessThan(String value) {
            addCriterion("\"Fold Enrichment\" <", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentLessThanOrEqualTo(String value) {
            addCriterion("\"Fold Enrichment\" <=", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentLike(String value) {
            addCriterion("\"Fold Enrichment\" like", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentNotLike(String value) {
            addCriterion("\"Fold Enrichment\" not like", value, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentIn(List<String> values) {
            addCriterion("\"Fold Enrichment\" in", values, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentNotIn(List<String> values) {
            addCriterion("\"Fold Enrichment\" not in", values, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentBetween(String value1, String value2) {
            addCriterion("\"Fold Enrichment\" between", value1, value2, "foldEnrichment");
            return (Criteria) this;
        }

        public Criteria andFoldEnrichmentNotBetween(String value1, String value2) {
            addCriterion("\"Fold Enrichment\" not between", value1, value2, "foldEnrichment");
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