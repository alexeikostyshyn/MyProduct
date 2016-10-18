package main.test;

import main.controller.ProductController;
import main.exception.ProductException;
import main.exception.ProductNotfoundException;

import main.model.Product;
import java.util.List;

/**
 * Created by Admin on 16.10.2016.
 */
public class TestProductController {


    private static ProductController productController = new ProductController();


    public static void main(String[] args) throws ProductException {
        Product product = new Product(1,"Product",24);
        Product product1 = new Product(2,"Product1",25);
        Product product2 = new Product(3,"Product2",26);
        Product product3 = new Product(4,"Product3",27);
        Product product4 = new Product(5,"Product4",28);
        Product product5 = new Product(6,"Product5",29);
        Product product6 = new Product(7,"Product6",30);

        productController.addProduct(product);
        productController.addProduct(product1);
        productController.addProduct(product2);
        productController.addProduct(product3);
        productController.addProduct(product4);
        productController.addProduct(product5);
        productController.addProduct(product6);

        Product prod = productController.getProductById(2);

        System.out.println("Test add product " + testAddProduct(product));
        System.out.println("Test list prduct " + testListProduct(productController.listProducts()));
        System.out.println("Test remove product " + testRemoveProduct(product));
        System.out.println("Test get product by id " + prod.toString());

    }

    public static boolean testAddProduct(Product product){

        List<Product> products =  productController.listProducts();
        return products.contains(product);

    }

    public static boolean testListProduct(List<Product> products){

        return !products.isEmpty();

    }

    public static boolean testRemoveProduct(Product product) throws ProductNotfoundException {

        return productController.removeProduct(product);

    }



}
