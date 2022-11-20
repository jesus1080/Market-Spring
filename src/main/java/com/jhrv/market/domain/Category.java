package com.jhrv.market.domain;

public class Category {

    private int categoryId;
    private String cateogory;
    private boolean active;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCateogory() {
        return cateogory;
    }

    public void setCateogory(String cateogory) {
        this.cateogory = cateogory;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
