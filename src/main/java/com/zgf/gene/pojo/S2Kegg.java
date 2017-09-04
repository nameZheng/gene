package com.zgf.gene.pojo;

public class S2Kegg {
    private Integer id;

    private String term;

    private Integer count;

    private String percent;

    private String pvalue;

    private String genes;

    private String listtotal;

    private String pophits;

    private String poptotal;

    private String foldenrichment;

    private String bonferroni;

    private String benjamini;

    private String fdr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public String getListtotal() {
        return listtotal;
    }

    public void setListtotal(String listtotal) {
        this.listtotal = listtotal == null ? null : listtotal.trim();
    }

    public String getPophits() {
        return pophits;
    }

    public void setPophits(String pophits) {
        this.pophits = pophits == null ? null : pophits.trim();
    }

    public String getPoptotal() {
        return poptotal;
    }

    public void setPoptotal(String poptotal) {
        this.poptotal = poptotal == null ? null : poptotal.trim();
    }

    public String getFoldenrichment() {
        return foldenrichment;
    }

    public void setFoldenrichment(String foldenrichment) {
        this.foldenrichment = foldenrichment == null ? null : foldenrichment.trim();
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