package com.shopster.backend.service;

import com.shopster.backend.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getById(Long id);

}
