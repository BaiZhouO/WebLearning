package com.BuyingSystem.service;

import com.BuyingSystem.model.Product;

import java.util.List;

public interface ProductService {

    void insertProduct(Product product);

    void deleteProduct(int prod_id);

    void updateProduct(Product product);

    Product selectProductById(int prod_id);

    List<Product> selectAll();

    Product selectProductByName(String prod_name);

    int selectProductCount();
}
