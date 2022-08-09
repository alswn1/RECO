package com.example.reco.database;

import java.util.Date;

public class USER_SEARCH_HISTORY {
    public Integer history_num;
    public Integer user_num;
    public String search_history;
    public Date history_time;

    public USER_SEARCH_HISTORY() {
    }

    public Integer getHistory_num() {
        return history_num;
    }

    public void setHistory_num(Integer history_num) {
        this.history_num = history_num;
    }

    public Integer getUser_num() {
        return user_num;
    }

    public void setUser_num(Integer user_num) {
        this.user_num = user_num;
    }

    public String getSearch_history() {
        return search_history;
    }

    public void setSearch_history(String search_history) {
        this.search_history = search_history;
    }

    public Date getHistory_time() {
        return history_time;
    }

    public void setHistory_time(Date history_time) {
        this.history_time = history_time;
    }
}
