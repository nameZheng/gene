package com.zgf.gene.pojo;

public class S6Xeopus {
    private Integer id;

    private String ensemblgeneid;

    private String entrezgeneid;

    private String associatedgenename;

    private String human;

    private String mouse;

    private String chicken;

    private String xeopus;

    private String paralogy;

    private String description;

    private String pathway;

    private String enzyme;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnsemblgeneid() {
        return ensemblgeneid;
    }

    public void setEnsemblgeneid(String ensemblgeneid) {
        this.ensemblgeneid = ensemblgeneid == null ? null : ensemblgeneid.trim();
    }

    public String getEntrezgeneid() {
        return entrezgeneid;
    }

    public void setEntrezgeneid(String entrezgeneid) {
        this.entrezgeneid = entrezgeneid == null ? null : entrezgeneid.trim();
    }

    public String getAssociatedgenename() {
        return associatedgenename;
    }

    public void setAssociatedgenename(String associatedgenename) {
        this.associatedgenename = associatedgenename == null ? null : associatedgenename.trim();
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human == null ? null : human.trim();
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse == null ? null : mouse.trim();
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken == null ? null : chicken.trim();
    }

    public String getXeopus() {
        return xeopus;
    }

    public void setXeopus(String xeopus) {
        this.xeopus = xeopus == null ? null : xeopus.trim();
    }

    public String getParalogy() {
        return paralogy;
    }

    public void setParalogy(String paralogy) {
        this.paralogy = paralogy == null ? null : paralogy.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPathway() {
        return pathway;
    }

    public void setPathway(String pathway) {
        this.pathway = pathway == null ? null : pathway.trim();
    }

    public String getEnzyme() {
        return enzyme;
    }

    public void setEnzyme(String enzyme) {
        this.enzyme = enzyme == null ? null : enzyme.trim();
    }
}