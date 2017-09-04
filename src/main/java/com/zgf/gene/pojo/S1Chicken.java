package com.zgf.gene.pojo;

public class S1Chicken {
    private Integer id;

    private String ensemblgeneid;

    private String genename;

    private String transcriptstableid;

    private String proteinstableid;

    private String transcriptname;

    private String transcriptcount;

    private String transcripttype;

    private String description;

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

    public String getGenename() {
        return genename;
    }

    public void setGenename(String genename) {
        this.genename = genename == null ? null : genename.trim();
    }

    public String getTranscriptstableid() {
        return transcriptstableid;
    }

    public void setTranscriptstableid(String transcriptstableid) {
        this.transcriptstableid = transcriptstableid == null ? null : transcriptstableid.trim();
    }

    public String getProteinstableid() {
        return proteinstableid;
    }

    public void setProteinstableid(String proteinstableid) {
        this.proteinstableid = proteinstableid == null ? null : proteinstableid.trim();
    }

    public String getTranscriptname() {
        return transcriptname;
    }

    public void setTranscriptname(String transcriptname) {
        this.transcriptname = transcriptname == null ? null : transcriptname.trim();
    }

    public String getTranscriptcount() {
        return transcriptcount;
    }

    public void setTranscriptcount(String transcriptcount) {
        this.transcriptcount = transcriptcount == null ? null : transcriptcount.trim();
    }

    public String getTranscripttype() {
        return transcripttype;
    }

    public void setTranscripttype(String transcripttype) {
        this.transcripttype = transcripttype == null ? null : transcripttype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}