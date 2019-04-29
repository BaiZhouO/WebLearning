package com.BuyingSystem.service.impl;
import com.BuyingSystem.dao.ProductDao;
import com.BuyingSystem.model.Product;
import com.BuyingSystem.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductDao productDao;

    public void insertProduct(Product product)
    {
        productDao.insertProduct(product);
    }

    public void deleteProduct(int prod_id)
    {
        productDao.deleteProduct(prod_id);
    }

    public void updateProduct(Product product)
    {
        productDao.updateProduct(product);
    }

    public Product selectProductById(int prod_id)
    {
        return productDao.selectProductById(prod_id);
    }

    public List<Product> selectAll()
    {
        return productDao.selectAll();
    }

    public Product selectProductByName(String prod_name)
    {
        return productDao.selectProductByName(prod_name);
    }

    public int selectProductCount()
    {
        return productDao.selectProductCount();
    }
}
