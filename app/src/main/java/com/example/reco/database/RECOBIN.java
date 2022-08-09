package com.example.reco.database;

public class RECOBIN {
    public Integer recobin_num;
    public String recobin_roadname;
    public String recobin_address;
    public Integer star_score;

    public RECOBIN() {
    }

    public Integer getRecobin_num() {
        return recobin_num;
    }

    public void setRecobin_num(Integer recobin_num) {
        this.recobin_num = recobin_num;
    }

    public String getRecobin_roadname() {
        return recobin_roadname;
    }

    public void setRecobin_roadname(String recobin_roadname) {
        this.recobin_roadname = recobin_roadname;
    }

    public String getRecobin_address() {
        return recobin_address;
    }

    public void setRecobin_address(String recobin_address) {
        this.recobin_address = recobin_address;
    }

    public Integer getStar_score() {
        return star_score;
    }

    public void setStar_score(Integer star_score) {
        this.star_score = star_score;
    }
}
