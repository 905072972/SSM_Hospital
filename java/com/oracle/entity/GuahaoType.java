package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class GuahaoType {
    private int  guahao_type;
    private String type;
    private String price;

    @Override
    public String toString() {
        return "GuahaoType{" +
                "guahao_type=" + guahao_type +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public int getGuahao_type() {
        return guahao_type;
    }

    public void setGuahao_type(int guahao_type) {
        this.guahao_type = guahao_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
