package com.text.model;

import java.util.Date;

public class UserSearch {
    private Integer id;

    private Date seacherTime;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSeacherTime() {
        return seacherTime;
    }

    public void setSeacherTime(Date seacherTime) {
        this.seacherTime = seacherTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}