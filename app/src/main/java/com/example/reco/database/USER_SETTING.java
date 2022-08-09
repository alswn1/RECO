package com.example.reco.database;

public class USER_SETTING {
    public Integer user_setting_num;
    public Integer user_num;
    public boolean autologin;
    public boolean pushalarm;
    public boolean locationagree;
    public boolean personalagree;

    public USER_SETTING() {
    }

    public Integer getUser_setting_num() {
        return user_setting_num;
    }

    public void setUser_setting_num(Integer user_setting_num) {
        this.user_setting_num = user_setting_num;
    }

    public Integer getUser_num() {
        return user_num;
    }

    public void setUser_num(Integer user_num) {
        this.user_num = user_num;
    }

    public boolean isAutologin() {
        return autologin;
    }

    public void setAutologin(boolean autologin) {
        this.autologin = autologin;
    }

    public boolean isPushalarm() {
        return pushalarm;
    }

    public void setPushalarm(boolean pushalarm) {
        this.pushalarm = pushalarm;
    }

    public boolean isLocationagree() {
        return locationagree;
    }

    public void setLocationagree(boolean locationagree) {
        this.locationagree = locationagree;
    }

    public boolean isPersonalagree() {
        return personalagree;
    }

    public void setPersonalagree(boolean personalagree) {
        this.personalagree = personalagree;
    }
}
