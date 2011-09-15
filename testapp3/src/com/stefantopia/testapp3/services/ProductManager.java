package com.stefantopia.testapp3.services;


import java.io.Serializable;
import java.util.List;

import com.stefantopia.testapp3.models.Product;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}