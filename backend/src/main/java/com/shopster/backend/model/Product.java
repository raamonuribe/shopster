package com.shopster.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private String description;
    private String brand;
    private String category;
    private Double price;
    private Long countInStock;
    private Double rating;
    private Long numReviews;

    public Product() {}

    public Product(Long id, String name, String image, String description, String brand, String category, Double price, Long countInStock, Double rating, Long numReviews) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.countInStock = countInStock;
        this.rating = rating;
        this.numReviews = numReviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCountInStock() {
        return countInStock;
    }

    public void setCountInStock(Long countInStock) {
        this.countInStock = countInStock;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Long getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Long numReviews) {
        this.numReviews = numReviews;
    }
}
