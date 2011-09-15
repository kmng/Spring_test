package com.stefantopia.testapp3.repository;

import java.util.List;

import com.stefantopia.testapp3.models.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}