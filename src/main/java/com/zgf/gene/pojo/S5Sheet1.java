package com.zgf.gene.pojo;

public class S5Sheet1 {
    private Integer id;

    private String human;

    private String mouse;

    private String chicken;

    private String xenopus;

    private String zebrafish;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getXenopus() {
        return xenopus;
    }

    public void setXenopus(String xenopus) {
        this.xenopus = xenopus == null ? null : xenopus.trim();
    }

    public String getZebrafish() {
        return zebrafish;
    }

    public void setZebrafish(String zebrafish) {
        this.zebrafish = zebrafish == null ? null : zebrafish.trim();
    }
}