package com.example.reco.database;

import java.util.Date;

public class NOTICE {
    public Integer notice_num;
    public String notice_detail;
    public Date notice_time;

    public NOTICE() {
    }

    public Integer getNotice_num() {
        return notice_num;
    }

    public void setNotice_num(Integer notice_num) {
        this.notice_num = notice_num;
    }

    public String getNotice_detail() {
        return notice_detail;
    }

    public void setNotice_detail(String notice_detail) {
        this.notice_detail = notice_detail;
    }

    public Date getNotice_time() {
        return notice_time;
    }

    public void setNotice_time(Date notice_time) {
        this.notice_time = notice_time;
    }
}
