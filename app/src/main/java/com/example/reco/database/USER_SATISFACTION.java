package com.example.reco.database;

public class USER_SATISFACTION {
    public Integer satisfaction_num;
    public Integer user_num;
    public Integer trashcan_num;
    public Integer recobin_num;
    public Integer satisfaction_score;
    public Integer cleaning_score;

    public USER_SATISFACTION() {
    }

    public Integer getSatisfaction_num() {
        return satisfaction_num;
    }

    public void setSatisfaction_num(Integer satisfaction_num) {
        this.satisfaction_num = satisfaction_num;
    }

    public Integer getUser_num() {
        return user_num;
    }

    public void setUser_num(Integer user_num) {
        this.user_num = user_num;
    }

    public Integer getTrashcan_num() {
        return trashcan_num;
    }

    public void setTrashcan_num(Integer trashcan_num) {
        this.trashcan_num = trashcan_num;
    }

    public Integer getRecobin_num() {
        return recobin_num;
    }

    public void setRecobin_num(Integer recobin_num) {
        this.recobin_num = recobin_num;
    }

    public Integer getSatisfaction_score() {
        return satisfaction_score;
    }

    public void setSatisfaction_score(Integer satisfaction_score) {
        this.satisfaction_score = satisfaction_score;
    }

    public Integer getCleaning_score() {
        return cleaning_score;
    }

    public void setCleaning_score(Integer cleaning_score) {
        this.cleaning_score = cleaning_score;
    }
}
