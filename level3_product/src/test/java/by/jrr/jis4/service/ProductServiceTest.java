package by.jrr.jis4.service;

import by.jrr.jis4.bean.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void actualPrice() {
        Product product = new Product();
        ProductService productService = new ProductService();
        product.setRegularPrice(0.8);
        product.setDiscount(20.0);

        double expected = 0.64;
        double actual = productService.actualPrice(product);
        double delta = 0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void printInformation() {
        Product product = new Product();
        ProductService productService = new ProductService();
        product.setName("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20.0);

        String expected = "Product : name = Milk, regular price = 0.8 EUR, discount = 20.0%, actual price = 0.64 EUR";
        String actual = productService.printInformation(product);
        assertEquals(expected, actual);

    }
}