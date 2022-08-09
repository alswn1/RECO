package com.example.reco.database;

import java.sql.Blob;
import java.util.Date;

public class GIFTICON {
    public Integer gifticon_num;
    public String gifticon_type;
    public String gifticon_name;
    public Integer gifticon_price;
    public Date gifticon_expirydate;
    public Integer gifticon_uniquenumber;
    public Blob gifticon_image;
    public String gifticon_detail;
    public String gifticon_brand;

    public GIFTICON() {
    }

    public Integer getGifticon_num() {
        return gifticon_num;
    }

    public void setGifticon_num(Integer gifticon_num) {
        this.gifticon_num = gifticon_num;
    }

    public String getGifticon_type() {
        return gifticon_type;
    }

    public void setGifticon_type(String gifticon_type) {
        this.gifticon_type = gifticon_type;
    }

    public String getGifticon_name() {
        return gifticon_name;
    }

    public void setGifticon_name(String gifticon_name) {
        this.gifticon_name = gifticon_name;
    }

    public Integer getGifticon_price() {
        return gifticon_price;
    }

    public void setGifticon_price(Integer gifticon_price) {
        this.gifticon_price = gifticon_price;
    }

    public Date getGifticon_expirydate() {
        return gifticon_expirydate;
    }

    public void setGifticon_expirydate(Date gifticon_expirydate) {
        this.gifticon_expirydate = gifticon_expirydate;
    }

    public Integer getGifticon_uniquenumber() {
        return gifticon_uniquenumber;
    }

    public void setGifticon_uniquenumber(Integer gifticon_uniquenumber) {
        this.gifticon_uniquenumber = gifticon_uniquenumber;
    }

    public Blob getGifticon_image() {
        return gifticon_image;
    }

    public void setGifticon_image(Blob gifticon_image) {
        this.gifticon_image = gifticon_image;
    }

    public String getGifticon_detail() {
        return gifticon_detail;
    }

    public void setGifticon_detail(String gifticon_detail) {
        this.gifticon_detail = gifticon_detail;
    }

    public String getGifticon_brand() {
        return gifticon_brand;
    }

    public void setGifticon_brand(String gifticon_brand) {
        this.gifticon_brand = gifticon_brand;
    }
}
