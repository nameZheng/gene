package com.zgf.gene.pojo;

import java.util.ArrayList;
import java.util.List;

public class S1XenopusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public S1XenopusExample() {
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

        public Criteria andEnsemblgeneidIsNull() {
            addCriterion("EnsemblGeneID is null");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidIsNotNull() {
            addCriterion("EnsemblGeneID is not null");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidEqualTo(String value) {
            addCriterion("EnsemblGeneID =", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidNotEqualTo(String value) {
            addCriterion("EnsemblGeneID <>", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidGreaterThan(String value) {
            addCriterion("EnsemblGeneID >", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidGreaterThanOrEqualTo(String value) {
            addCriterion("EnsemblGeneID >=", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidLessThan(String value) {
            addCriterion("EnsemblGeneID <", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidLessThanOrEqualTo(String value) {
            addCriterion("EnsemblGeneID <=", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidLike(String value) {
            addCriterion("EnsemblGeneID like", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidNotLike(String value) {
            addCriterion("EnsemblGeneID not like", value, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidIn(List<String> values) {
            addCriterion("EnsemblGeneID in", values, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidNotIn(List<String> values) {
            addCriterion("EnsemblGeneID not in", values, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidBetween(String value1, String value2) {
            addCriterion("EnsemblGeneID between", value1, value2, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andEnsemblgeneidNotBetween(String value1, String value2) {
            addCriterion("EnsemblGeneID not between", value1, value2, "ensemblgeneid");
            return (Criteria) this;
        }

        public Criteria andGenenameIsNull() {
            addCriterion("GeneName is null");
            return (Criteria) this;
        }

        public Criteria andGenenameIsNotNull() {
            addCriterion("GeneName is not null");
            return (Criteria) this;
        }

        public Criteria andGenenameEqualTo(String value) {
            addCriterion("GeneName =", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameNotEqualTo(String value) {
            addCriterion("GeneName <>", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameGreaterThan(String value) {
            addCriterion("GeneName >", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameGreaterThanOrEqualTo(String value) {
            addCriterion("GeneName >=", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameLessThan(String value) {
            addCriterion("GeneName <", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameLessThanOrEqualTo(String value) {
            addCriterion("GeneName <=", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameLike(String value) {
            addCriterion("GeneName like", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameNotLike(String value) {
            addCriterion("GeneName not like", value, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameIn(List<String> values) {
            addCriterion("GeneName in", values, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameNotIn(List<String> values) {
            addCriterion("GeneName not in", values, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameBetween(String value1, String value2) {
            addCriterion("GeneName between", value1, value2, "genename");
            return (Criteria) this;
        }

        public Criteria andGenenameNotBetween(String value1, String value2) {
            addCriterion("GeneName not between", value1, value2, "genename");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidIsNull() {
            addCriterion("TranscriptStableID is null");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidIsNotNull() {
            addCriterion("TranscriptStableID is not null");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidEqualTo(String value) {
            addCriterion("TranscriptStableID =", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidNotEqualTo(String value) {
            addCriterion("TranscriptStableID <>", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidGreaterThan(String value) {
            addCriterion("TranscriptStableID >", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidGreaterThanOrEqualTo(String value) {
            addCriterion("TranscriptStableID >=", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidLessThan(String value) {
            addCriterion("TranscriptStableID <", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidLessThanOrEqualTo(String value) {
            addCriterion("TranscriptStableID <=", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidLike(String value) {
            addCriterion("TranscriptStableID like", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidNotLike(String value) {
            addCriterion("TranscriptStableID not like", value, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidIn(List<String> values) {
            addCriterion("TranscriptStableID in", values, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidNotIn(List<String> values) {
            addCriterion("TranscriptStableID not in", values, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidBetween(String value1, String value2) {
            addCriterion("TranscriptStableID between", value1, value2, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptstableidNotBetween(String value1, String value2) {
            addCriterion("TranscriptStableID not between", value1, value2, "transcriptstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidIsNull() {
            addCriterion("ProteinStableID is null");
            return (Criteria) this;
        }

        public Criteria andProteinstableidIsNotNull() {
            addCriterion("ProteinStableID is not null");
            return (Criteria) this;
        }

        public Criteria andProteinstableidEqualTo(String value) {
            addCriterion("ProteinStableID =", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidNotEqualTo(String value) {
            addCriterion("ProteinStableID <>", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidGreaterThan(String value) {
            addCriterion("ProteinStableID >", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidGreaterThanOrEqualTo(String value) {
            addCriterion("ProteinStableID >=", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidLessThan(String value) {
            addCriterion("ProteinStableID <", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidLessThanOrEqualTo(String value) {
            addCriterion("ProteinStableID <=", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidLike(String value) {
            addCriterion("ProteinStableID like", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidNotLike(String value) {
            addCriterion("ProteinStableID not like", value, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidIn(List<String> values) {
            addCriterion("ProteinStableID in", values, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidNotIn(List<String> values) {
            addCriterion("ProteinStableID not in", values, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidBetween(String value1, String value2) {
            addCriterion("ProteinStableID between", value1, value2, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andProteinstableidNotBetween(String value1, String value2) {
            addCriterion("ProteinStableID not between", value1, value2, "proteinstableid");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameIsNull() {
            addCriterion("TranscriptName is null");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameIsNotNull() {
            addCriterion("TranscriptName is not null");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameEqualTo(String value) {
            addCriterion("TranscriptName =", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameNotEqualTo(String value) {
            addCriterion("TranscriptName <>", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameGreaterThan(String value) {
            addCriterion("TranscriptName >", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameGreaterThanOrEqualTo(String value) {
            addCriterion("TranscriptName >=", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameLessThan(String value) {
            addCriterion("TranscriptName <", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameLessThanOrEqualTo(String value) {
            addCriterion("TranscriptName <=", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameLike(String value) {
            addCriterion("TranscriptName like", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameNotLike(String value) {
            addCriterion("TranscriptName not like", value, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameIn(List<String> values) {
            addCriterion("TranscriptName in", values, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameNotIn(List<String> values) {
            addCriterion("TranscriptName not in", values, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameBetween(String value1, String value2) {
            addCriterion("TranscriptName between", value1, value2, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptnameNotBetween(String value1, String value2) {
            addCriterion("TranscriptName not between", value1, value2, "transcriptname");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountIsNull() {
            addCriterion("TranscriptCount is null");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountIsNotNull() {
            addCriterion("TranscriptCount is not null");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountEqualTo(String value) {
            addCriterion("TranscriptCount =", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountNotEqualTo(String value) {
            addCriterion("TranscriptCount <>", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountGreaterThan(String value) {
            addCriterion("TranscriptCount >", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountGreaterThanOrEqualTo(String value) {
            addCriterion("TranscriptCount >=", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountLessThan(String value) {
            addCriterion("TranscriptCount <", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountLessThanOrEqualTo(String value) {
            addCriterion("TranscriptCount <=", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountLike(String value) {
            addCriterion("TranscriptCount like", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountNotLike(String value) {
            addCriterion("TranscriptCount not like", value, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountIn(List<String> values) {
            addCriterion("TranscriptCount in", values, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountNotIn(List<String> values) {
            addCriterion("TranscriptCount not in", values, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountBetween(String value1, String value2) {
            addCriterion("TranscriptCount between", value1, value2, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscriptcountNotBetween(String value1, String value2) {
            addCriterion("TranscriptCount not between", value1, value2, "transcriptcount");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeIsNull() {
            addCriterion("TranscriptType is null");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeIsNotNull() {
            addCriterion("TranscriptType is not null");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeEqualTo(String value) {
            addCriterion("TranscriptType =", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeNotEqualTo(String value) {
            addCriterion("TranscriptType <>", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeGreaterThan(String value) {
            addCriterion("TranscriptType >", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeGreaterThanOrEqualTo(String value) {
            addCriterion("TranscriptType >=", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeLessThan(String value) {
            addCriterion("TranscriptType <", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeLessThanOrEqualTo(String value) {
            addCriterion("TranscriptType <=", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeLike(String value) {
            addCriterion("TranscriptType like", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeNotLike(String value) {
            addCriterion("TranscriptType not like", value, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeIn(List<String> values) {
            addCriterion("TranscriptType in", values, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeNotIn(List<String> values) {
            addCriterion("TranscriptType not in", values, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeBetween(String value1, String value2) {
            addCriterion("TranscriptType between", value1, value2, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andTranscripttypeNotBetween(String value1, String value2) {
            addCriterion("TranscriptType not between", value1, value2, "transcripttype");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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