package com.example.reco.database;

import java.sql.Blob;

public class RECODE {
    public String recode_grade;
    public Integer recode_exp;
    public Integer recode_percent;
    public Blob recode_image;

    public RECODE() {
    }

    public String getRecode_grade() {
        return recode_grade;
    }

    public void setRecode_grade(String recode_grade) {
        this.recode_grade = recode_grade;
    }

    public Integer getRecode_exp() {
        return recode_exp;
    }

    public void setRecode_exp(Integer recode_exp) {
        this.recode_exp = recode_exp;
    }

    public Integer getRecode_percent() {
        return recode_percent;
    }

    public void setRecode_percent(Integer recode_percent) {
        this.recode_percent = recode_percent;
    }

    public Blob getRecode_image() {
        return recode_image;
    }

    public void setRecode_image(Blob recode_image) {
        this.recode_image = recode_image;
    }
}
