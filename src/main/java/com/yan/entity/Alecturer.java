package com.yan.entity;

import java.util.Date;
import java.util.List;

public class Alecturer {
    private Integer aid;

    private String aname;

    private Integer sex;

    private Integer age;

    private Date date;
    //表关系
    private List<Ac> ac;

    public List<Ac> getAc() {
        return ac;
    }

    public void setAc(List<Ac> ac) {
        this.ac = ac;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}