package com.example.webpos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    public String name;
    private double price;
    private String image;

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getPrice();
    }

    public String getProductName(){return name;}
}
