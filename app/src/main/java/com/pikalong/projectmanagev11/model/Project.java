package com.pikalong.projectmanagev11.model;

import java.util.List;

public class Project {
    List<Task> tasks;
    String title, des, imgLink;
    public Project() {
        this.tasks = null;
        this.title = "Tên dự án";
        this.des = "Mô tả chi tiết";
        this.imgLink = "http:pi";
    }
    public Project(String title, String des) {
        this.tasks = null;
        this.title = title;
        this.des = des;
        this.imgLink = "http:pi";
    }
    public Project(List<Task> tasks, String title, String des, String imgLink) {
        this.tasks = tasks;
        this.title = title;
        this.des = des;
        this.imgLink = imgLink;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getTitle() {
        return title;
    }

    public String getDes() {
        return des;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getImgLink() {
        return imgLink;
    }
}
