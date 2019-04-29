package com.BuyingSystem.dao;

import com.BuyingSystem.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    void insertProduct(@Param("product")Product product);

    void deleteProduct(int prod_id);

    void updateProduct(@Param("product_new")Product product);

    Product selectProductById(int prod_id);

    List<Product> selectAll();

    Product selectProductByName(String prod_name);

    int selectProductCount();
}
