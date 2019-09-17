package com.yan.entity;

import java.util.Date;
import java.util.List;

public class Class {
    private Integer cid;

    private String classnname;

    private Date classdata;
    private Ac ac;
    private List<Sc> sc;


    public List<Sc> getSc() {
        return sc;
    }

    public void setSc(List<Sc> sc) {
        this.sc = sc;
    }

    public Ac getAc() {
        return ac;
    }

    public void setAc(Ac ac) {
        this.ac = ac;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClassnname() {
        return classnname;
    }

    public void setClassnname(String classnname) {
        this.classnname = classnname == null ? null : classnname.trim();
    }

    public Date getClassdata() {
        return classdata;
    }

    public void setClassdata(Date classdata) {
        this.classdata = classdata;
    }
}