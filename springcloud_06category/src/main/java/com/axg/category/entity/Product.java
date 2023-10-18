package com.axg.category.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private Long id;

    private String productName;

    private BigDecimal price;

    private Date date;


    public Product() {
    }

    public Product(Long id, String productName, BigDecimal price, Date date) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
