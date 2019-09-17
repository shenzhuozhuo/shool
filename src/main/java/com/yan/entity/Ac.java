package com.yan.entity;

public class Ac {
    private Integer id;

    private Integer cid;

    private Integer clid;

    private Integer aid;
    //表关系
    private Class aClass;
    private Classroom classroom;
    private Alecturer alecturer;
    private Sc sc;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Alecturer getAlecturer() {
        return alecturer;
    }

    public void setAlecturer(Alecturer alecturer) {
        this.alecturer = alecturer;
    }

    public Sc getSc() {
        return sc;
    }

    public void setSc(Sc sc) {
        this.sc = sc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}