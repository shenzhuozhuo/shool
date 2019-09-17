package com.yan.entity;

public class Students {
    private Integer sid;

    private String sname;

    private String home;
    //表连接
    private Sc sc;

    public Sc getSc() {
        return sc;
    }

    public void setSc(Sc sc) {
        this.sc = sc;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }
}