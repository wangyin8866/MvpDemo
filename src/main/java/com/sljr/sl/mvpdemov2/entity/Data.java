package com.sljr.sl.mvpdemov2.entity;

/**
 * Created by wy on 2016/9/1.
 */
public class Data {
  private int id;
    private String name;
    private String picSmall;
    private String picBig;
    private String description;
    private int learner;
    public Data(int id, String name, String picSmall, String picBig, String description, int learner) {
        this.id = id;
        this.name = name;
        this.picSmall = picSmall;
        this.picBig = picBig;
        this.description = description;
        this.learner = learner;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picSmall='" + picSmall + '\'' +
                ", picBig='" + picBig + '\'' +
                ", description='" + description + '\'' +
                ", learner=" + learner +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPicBig() {
        return picBig;
    }

    public void setPicBig(String picBig) {
        this.picBig = picBig;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLearner() {
        return learner;
    }

    public void setLearner(int learner) {
        this.learner = learner;
    }
}
