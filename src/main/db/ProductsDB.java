package main.db;

import main.exception.NullProductException;
import main.exception.ProductNotfoundException;
import main.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 16.10.2016.
 */
public class ProductsDB {

    private List<Product> products;

    public ProductsDB() {
        products = new ArrayList<Product>();
    }

    public boolean addProduct(Product product) throws NullProductException {
//        if(product == null)
        if (product != null){
            products.add(product);
        }else {

            throw  new NullProductException("Product is emty");
        }

        if(products.contains(product)){
            return true;
        }
        return false;
    }

    public List<Product> listProducts(){
        return products;

    }

    public boolean removeProduct(Product product) throws ProductNotfoundException {
        if (products.contains(product)){
            return products.remove(product);
        }else {
            throw new ProductNotfoundException("List not have product");
        }

    }

}
