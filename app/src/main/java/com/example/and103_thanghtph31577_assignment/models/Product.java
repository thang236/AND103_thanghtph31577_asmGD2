package com.example.and103_thanghtph31577_assignment.models;

public class Product {
    private String _id;
    private String name;
    private String desc;
    private String price;
    private String image;
    private String pdf;
    private String cateId;

    public Product() {
    }

    public Product(String _id, String name, String desc, String price, String image, String pdf, String cateId) {
        this._id = _id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = image;
        this.pdf = pdf;
        this.cateId = cateId;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }
}
