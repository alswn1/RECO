package com.example.reco.database;

import java.sql.Date;

public class PIC_VALIDATION {
    public Integer validation_num;
    public String pic_validation;
    public String pic;
    public Date pic_date;
    public Integer recobin_num;
    public Integer user_num;

    public PIC_VALIDATION() {
    }

    public PIC_VALIDATION(String pic) {
        this.pic = pic;
    }

    public Integer getValidation_num() {
        return validation_num;
    }

    public void setValidation_num(Integer validation_num) {
        this.validation_num = validation_num;
    }

    public String getPic_validation() {
        return pic_validation;
    }

    public void setPic_validation(String pic_validation) {
        this.pic_validation = pic_validation;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getPic_date() {
        return pic_date;
    }

    public void setPic_date(Date pic_date) {
        this.pic_date = pic_date;
    }

    public Integer getRecobin_num() {
        return recobin_num;
    }

    public void setRecobin_num(Integer recobin_num) {
        this.recobin_num = recobin_num;
    }

    public Integer getUser_num() {
        return user_num;
    }

    public void setUser_num(Integer user_num) {
        this.user_num = user_num;
    }
}
