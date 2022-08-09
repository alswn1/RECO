package com.example.reco.database;

import java.util.Date;

public class USER_EXPERIENCE {
    public Integer experience_num;
    public Integer user_num;
    public Integer experience_amount;
    public Integer satisfaction_num;
    public Integer quiz_num;
    public Date experience_date;

    public USER_EXPERIENCE() {
    }

    public Integer getExperience_num() {
        return experience_num;
    }

    public void setExperience_num(Integer experience_num) {
        this.experience_num = experience_num;
    }

    public Integer getUser_num() {
        return user_num;
    }

    public void setUser_num(Integer user_num) {
        this.user_num = user_num;
    }

    public Integer getExperience_amount() {
        return experience_amount;
    }

    public void setExperience_amount(Integer experience_amount) {
        this.experience_amount = experience_amount;
    }

    public Integer getSatisfaction_num() {
        return satisfaction_num;
    }

    public void setSatisfaction_num(Integer satisfaction_num) {
        this.satisfaction_num = satisfaction_num;
    }

    public Integer getQuiz_num() {
        return quiz_num;
    }

    public void setQuiz_num(Integer quiz_num) {
        this.quiz_num = quiz_num;
    }

    public Date getExperience_date() {
        return experience_date;
    }

    public void setExperience_date(Date experience_date) {
        this.experience_date = experience_date;
    }
}
