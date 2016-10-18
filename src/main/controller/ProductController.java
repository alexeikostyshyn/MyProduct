package main.controller;

import main.db.ProductsDB;
import main.exception.NullProductException;
import main.exception.ProductException;
import main.exception.ProductNotfoundException;
import main.model.Product;

import java.util.List;

/**
 * Created by Admin on 16.10.2016.
 */
public class ProductController  {

    private ProductsDB productsDB;


    public ProductController() {
        productsDB = new ProductsDB();
    }

    public  boolean addProduct(Product product) throws ProductException {

            if (product != null){
                productsDB.addProduct(product);
            }else {
                throw  new NullProductException("Product is emty");

            }



        if(productsDB.listProducts().contains(product)){
            return true;
        }
        return false;
    }

    public List<Product> listProducts(){
        return productsDB.listProducts();

    }

    public boolean removeProduct(Product product) throws ProductNotfoundException {
        if (productsDB.listProducts().contains(product)){
           return productsDB.removeProduct(product);
        }else{
            throw new ProductNotfoundException("List not have product");
        }

    }

    public Product getProductById(int id) {
        Product product = null;
        List<Product> listProducts =  productsDB.listProducts();
        for (Product listProduct : listProducts) {
            if (listProduct.getId() == id) {
                product = listProduct;
            }

        }

        return product;

    }
}
