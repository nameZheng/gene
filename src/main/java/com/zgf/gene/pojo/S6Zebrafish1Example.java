package com.zgf.gene.pojo;

import java.util.ArrayList;
import java.util.List;

public class S6Zebrafish1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public S6Zebrafish1Example() {
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

        public Criteria andEntrezgeneidIsNull() {
            addCriterion("EntrezGeneID is null");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidIsNotNull() {
            addCriterion("EntrezGeneID is not null");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidEqualTo(String value) {
            addCriterion("EntrezGeneID =", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidNotEqualTo(String value) {
            addCriterion("EntrezGeneID <>", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidGreaterThan(String value) {
            addCriterion("EntrezGeneID >", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidGreaterThanOrEqualTo(String value) {
            addCriterion("EntrezGeneID >=", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidLessThan(String value) {
            addCriterion("EntrezGeneID <", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidLessThanOrEqualTo(String value) {
            addCriterion("EntrezGeneID <=", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidLike(String value) {
            addCriterion("EntrezGeneID like", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidNotLike(String value) {
            addCriterion("EntrezGeneID not like", value, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidIn(List<String> values) {
            addCriterion("EntrezGeneID in", values, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidNotIn(List<String> values) {
            addCriterion("EntrezGeneID not in", values, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidBetween(String value1, String value2) {
            addCriterion("EntrezGeneID between", value1, value2, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andEntrezgeneidNotBetween(String value1, String value2) {
            addCriterion("EntrezGeneID not between", value1, value2, "entrezgeneid");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameIsNull() {
            addCriterion("AssociatedGeneName is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameIsNotNull() {
            addCriterion("AssociatedGeneName is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameEqualTo(String value) {
            addCriterion("AssociatedGeneName =", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameNotEqualTo(String value) {
            addCriterion("AssociatedGeneName <>", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameGreaterThan(String value) {
            addCriterion("AssociatedGeneName >", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameGreaterThanOrEqualTo(String value) {
            addCriterion("AssociatedGeneName >=", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameLessThan(String value) {
            addCriterion("AssociatedGeneName <", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameLessThanOrEqualTo(String value) {
            addCriterion("AssociatedGeneName <=", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameLike(String value) {
            addCriterion("AssociatedGeneName like", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameNotLike(String value) {
            addCriterion("AssociatedGeneName not like", value, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameIn(List<String> values) {
            addCriterion("AssociatedGeneName in", values, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameNotIn(List<String> values) {
            addCriterion("AssociatedGeneName not in", values, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameBetween(String value1, String value2) {
            addCriterion("AssociatedGeneName between", value1, value2, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andAssociatedgenenameNotBetween(String value1, String value2) {
            addCriterion("AssociatedGeneName not between", value1, value2, "associatedgenename");
            return (Criteria) this;
        }

        public Criteria andHumanIsNull() {
            addCriterion("human is null");
            return (Criteria) this;
        }

        public Criteria andHumanIsNotNull() {
            addCriterion("human is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEqualTo(String value) {
            addCriterion("human =", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotEqualTo(String value) {
            addCriterion("human <>", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanGreaterThan(String value) {
            addCriterion("human >", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanGreaterThanOrEqualTo(String value) {
            addCriterion("human >=", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLessThan(String value) {
            addCriterion("human <", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLessThanOrEqualTo(String value) {
            addCriterion("human <=", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLike(String value) {
            addCriterion("human like", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotLike(String value) {
            addCriterion("human not like", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanIn(List<String> values) {
            addCriterion("human in", values, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotIn(List<String> values) {
            addCriterion("human not in", values, "human");
            return (Criteria) this;
        }

        public Criteria andHumanBetween(String value1, String value2) {
            addCriterion("human between", value1, value2, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotBetween(String value1, String value2) {
            addCriterion("human not between", value1, value2, "human");
            return (Criteria) this;
        }

        public Criteria andMouseIsNull() {
            addCriterion("mouse is null");
            return (Criteria) this;
        }

        public Criteria andMouseIsNotNull() {
            addCriterion("mouse is not null");
            return (Criteria) this;
        }

        public Criteria andMouseEqualTo(String value) {
            addCriterion("mouse =", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotEqualTo(String value) {
            addCriterion("mouse <>", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseGreaterThan(String value) {
            addCriterion("mouse >", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseGreaterThanOrEqualTo(String value) {
            addCriterion("mouse >=", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLessThan(String value) {
            addCriterion("mouse <", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLessThanOrEqualTo(String value) {
            addCriterion("mouse <=", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLike(String value) {
            addCriterion("mouse like", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotLike(String value) {
            addCriterion("mouse not like", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseIn(List<String> values) {
            addCriterion("mouse in", values, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotIn(List<String> values) {
            addCriterion("mouse not in", values, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseBetween(String value1, String value2) {
            addCriterion("mouse between", value1, value2, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotBetween(String value1, String value2) {
            addCriterion("mouse not between", value1, value2, "mouse");
            return (Criteria) this;
        }

        public Criteria andChickenIsNull() {
            addCriterion("chicken is null");
            return (Criteria) this;
        }

        public Criteria andChickenIsNotNull() {
            addCriterion("chicken is not null");
            return (Criteria) this;
        }

        public Criteria andChickenEqualTo(String value) {
            addCriterion("chicken =", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotEqualTo(String value) {
            addCriterion("chicken <>", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenGreaterThan(String value) {
            addCriterion("chicken >", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenGreaterThanOrEqualTo(String value) {
            addCriterion("chicken >=", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenLessThan(String value) {
            addCriterion("chicken <", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenLessThanOrEqualTo(String value) {
            addCriterion("chicken <=", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenLike(String value) {
            addCriterion("chicken like", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotLike(String value) {
            addCriterion("chicken not like", value, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenIn(List<String> values) {
            addCriterion("chicken in", values, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotIn(List<String> values) {
            addCriterion("chicken not in", values, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenBetween(String value1, String value2) {
            addCriterion("chicken between", value1, value2, "chicken");
            return (Criteria) this;
        }

        public Criteria andChickenNotBetween(String value1, String value2) {
            addCriterion("chicken not between", value1, value2, "chicken");
            return (Criteria) this;
        }

        public Criteria andXeopusIsNull() {
            addCriterion("xeopus is null");
            return (Criteria) this;
        }

        public Criteria andXeopusIsNotNull() {
            addCriterion("xeopus is not null");
            return (Criteria) this;
        }

        public Criteria andXeopusEqualTo(String value) {
            addCriterion("xeopus =", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusNotEqualTo(String value) {
            addCriterion("xeopus <>", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusGreaterThan(String value) {
            addCriterion("xeopus >", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusGreaterThanOrEqualTo(String value) {
            addCriterion("xeopus >=", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusLessThan(String value) {
            addCriterion("xeopus <", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusLessThanOrEqualTo(String value) {
            addCriterion("xeopus <=", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusLike(String value) {
            addCriterion("xeopus like", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusNotLike(String value) {
            addCriterion("xeopus not like", value, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusIn(List<String> values) {
            addCriterion("xeopus in", values, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusNotIn(List<String> values) {
            addCriterion("xeopus not in", values, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusBetween(String value1, String value2) {
            addCriterion("xeopus between", value1, value2, "xeopus");
            return (Criteria) this;
        }

        public Criteria andXeopusNotBetween(String value1, String value2) {
            addCriterion("xeopus not between", value1, value2, "xeopus");
            return (Criteria) this;
        }

        public Criteria andParalogyIsNull() {
            addCriterion("paralogy is null");
            return (Criteria) this;
        }

        public Criteria andParalogyIsNotNull() {
            addCriterion("paralogy is not null");
            return (Criteria) this;
        }

        public Criteria andParalogyEqualTo(String value) {
            addCriterion("paralogy =", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyNotEqualTo(String value) {
            addCriterion("paralogy <>", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyGreaterThan(String value) {
            addCriterion("paralogy >", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyGreaterThanOrEqualTo(String value) {
            addCriterion("paralogy >=", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyLessThan(String value) {
            addCriterion("paralogy <", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyLessThanOrEqualTo(String value) {
            addCriterion("paralogy <=", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyLike(String value) {
            addCriterion("paralogy like", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyNotLike(String value) {
            addCriterion("paralogy not like", value, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyIn(List<String> values) {
            addCriterion("paralogy in", values, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyNotIn(List<String> values) {
            addCriterion("paralogy not in", values, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyBetween(String value1, String value2) {
            addCriterion("paralogy between", value1, value2, "paralogy");
            return (Criteria) this;
        }

        public Criteria andParalogyNotBetween(String value1, String value2) {
            addCriterion("paralogy not between", value1, value2, "paralogy");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPathwayIsNull() {
            addCriterion("pathway is null");
            return (Criteria) this;
        }

        public Criteria andPathwayIsNotNull() {
            addCriterion("pathway is not null");
            return (Criteria) this;
        }

        public Criteria andPathwayEqualTo(String value) {
            addCriterion("pathway =", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayNotEqualTo(String value) {
            addCriterion("pathway <>", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayGreaterThan(String value) {
            addCriterion("pathway >", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayGreaterThanOrEqualTo(String value) {
            addCriterion("pathway >=", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayLessThan(String value) {
            addCriterion("pathway <", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayLessThanOrEqualTo(String value) {
            addCriterion("pathway <=", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayLike(String value) {
            addCriterion("pathway like", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayNotLike(String value) {
            addCriterion("pathway not like", value, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayIn(List<String> values) {
            addCriterion("pathway in", values, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayNotIn(List<String> values) {
            addCriterion("pathway not in", values, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayBetween(String value1, String value2) {
            addCriterion("pathway between", value1, value2, "pathway");
            return (Criteria) this;
        }

        public Criteria andPathwayNotBetween(String value1, String value2) {
            addCriterion("pathway not between", value1, value2, "pathway");
            return (Criteria) this;
        }

        public Criteria andEnzymeIsNull() {
            addCriterion("enzyme is null");
            return (Criteria) this;
        }

        public Criteria andEnzymeIsNotNull() {
            addCriterion("enzyme is not null");
            return (Criteria) this;
        }

        public Criteria andEnzymeEqualTo(String value) {
            addCriterion("enzyme =", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeNotEqualTo(String value) {
            addCriterion("enzyme <>", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeGreaterThan(String value) {
            addCriterion("enzyme >", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeGreaterThanOrEqualTo(String value) {
            addCriterion("enzyme >=", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeLessThan(String value) {
            addCriterion("enzyme <", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeLessThanOrEqualTo(String value) {
            addCriterion("enzyme <=", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeLike(String value) {
            addCriterion("enzyme like", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeNotLike(String value) {
            addCriterion("enzyme not like", value, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeIn(List<String> values) {
            addCriterion("enzyme in", values, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeNotIn(List<String> values) {
            addCriterion("enzyme not in", values, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeBetween(String value1, String value2) {
            addCriterion("enzyme between", value1, value2, "enzyme");
            return (Criteria) this;
        }

        public Criteria andEnzymeNotBetween(String value1, String value2) {
            addCriterion("enzyme not between", value1, value2, "enzyme");
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