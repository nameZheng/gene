package com.zgf.gene.pojo;

public class S3OmimDisease {
    private Integer id;

    private String category;

    private String term;

    private String count;

    private String percent;

    private String pvalue;

    private String genes;

    private String listTotal;

    private String popHits;

    private String popTotal;

    private String foldEnrichment;

    private String bonferroni;

    private String benjamini;

    private String fdr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent == null ? null : percent.trim();
    }

    public String getPvalue() {
        return pvalue;
    }

    public void setPvalue(String pvalue) {
        this.pvalue = pvalue == null ? null : pvalue.trim();
    }

    public String getGenes() {
        return genes;
    }

    public void setGenes(String genes) {
        this.genes = genes == null ? null : genes.trim();
    }

    public String getListTotal() {
        return listTotal;
    }

    public void setListTotal(String listTotal) {
        this.listTotal = listTotal == null ? null : listTotal.trim();
    }

    public String getPopHits() {
        return popHits;
    }

    public void setPopHits(String popHits) {
        this.popHits = popHits == null ? null : popHits.trim();
    }

    public String getPopTotal() {
        return popTotal;
    }

    public void setPopTotal(String popTotal) {
        this.popTotal = popTotal == null ? null : popTotal.trim();
    }

    public String getFoldEnrichment() {
        return foldEnrichment;
    }

    public void setFoldEnrichment(String foldEnrichment) {
        this.foldEnrichment = foldEnrichment == null ? null : foldEnrichment.trim();
    }

    public String getBonferroni() {
        return bonferroni;
    }

    public void setBonferroni(String bonferroni) {
        this.bonferroni = bonferroni == null ? null : bonferroni.trim();
    }

    public String getBenjamini() {
        return benjamini;
    }

    public void setBenjamini(String benjamini) {
        this.benjamini = benjamini == null ? null : benjamini.trim();
    }

    public String getFdr() {
        return fdr;
    }

    public void setFdr(String fdr) {
        this.fdr = fdr == null ? null : fdr.trim();
    }
}