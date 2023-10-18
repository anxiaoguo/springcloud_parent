package com.axg.product.dto;

import com.axg.product.entity.Product;

import java.util.List;

public class CollectionDaraDTO {

    private List<String> list;


    private List<Product> productList;




    public CollectionDaraDTO() {
    }

    public CollectionDaraDTO(List<String> list, List<Product> productList) {
        this.list = list;
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "CollectionDaraDTO{" +
                "list=" + list +
                ", productList=" + productList +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
