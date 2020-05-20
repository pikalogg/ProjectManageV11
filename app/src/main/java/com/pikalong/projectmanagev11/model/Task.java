package com.pikalong.projectmanagev11.model;

import java.sql.Time;

public class Task {

    String name, time, title, des, av_link;

    public Task() {
        this.name = "Người giao việc";
        this.time = "now";
        this.title = "Công việc mới";
        this.des = "Đừng làm gì hết, chờ chỉ thị khác đi";
        this.av_link = "http://av_link";
    }

    public Task(String name, String time, String title, String des, String av_link) {
        this.name = name;
        this.time = time;
        this.title = title;
        this.des = des;
        this.av_link = av_link;
    }

    public Task(String title, String des) {
        this.name = "Người giao việc";
        this.time = "now";
        this.title = title;
        this.des = des;
        this.av_link = "http://av_link";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setAv_link(String av_link) {
        this.av_link = av_link;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getDes() {
        return des;
    }

    public String getAv_link() {
        return av_link;
    }
}
