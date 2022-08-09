package com.example.reco.database;

import java.util.Date;

public class USER_POINT {
    public Integer user_point_num;
    public Integer user_num;
    public Integer recobin_num;
    public Date save_point_date;
    public Integer usage_gifticon_num;
    public Date usage_usepoint_date;
    public Integer usage_point;

    public USER_POINT() {
    }

    public Integer getUser_point_num() {
        return user_point_num;
    }

    public void setUser_point_num(Integer user_point_num) {
        this.user_point_num = user_point_num;
    }

    public Integer getUser_num() {
        return user_num;
    }

    public void setUser_num(Integer user_num) {
        this.user_num = user_num;
    }

    public Integer getRecobin_num() {
        return recobin_num;
    }

    public void setRecobin_num(Integer recobin_num) {
        this.recobin_num = recobin_num;
    }

    public Date getSave_point_date() {
        return save_point_date;
    }

    public void setSave_point_date(Date save_point_date) {
        this.save_point_date = save_point_date;
    }

    public Integer getUsage_gifticon_num() {
        return usage_gifticon_num;
    }

    public void setUsage_gifticon_num(Integer usage_gifticon_num) {
        this.usage_gifticon_num = usage_gifticon_num;
    }

    public Date getUsage_usepoint_date() {
        return usage_usepoint_date;
    }

    public void setUsage_usepoint_date(Date usage_usepoint_date) {
        this.usage_usepoint_date = usage_usepoint_date;
    }

    public Integer getUsage_point() {
        return usage_point;
    }

    public void setUsage_point(Integer usage_point) {
        this.usage_point = usage_point;
    }
}
