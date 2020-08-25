package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getName() {
        Product product = new Product();
        product.setName("apple");

        String expected = "apple";
        String actual = product.getName();
        assertEquals(expected, actual);

    }

    @Test
    public void getRegularPrice() {
        Product product = new Product();
        product.setRegularPrice(2.2);

        double expected = 2.2;
        double actual = product.getRegularPrice();
        double delta = 0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void getDiscount() {
        Product product = new Product();
        product.setDiscount(5.5);

        double expected = 5.5;
        double actual = product.getDiscount();
        double delta = 0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testEqualsNames() {
        Product firstProduct = new Product();
        firstProduct.setName("milk chocolate");

        Product secondProduct = new Product();
        secondProduct.setName("dark chocolate");

        boolean expected = false;
        boolean actual = firstProduct.equals(secondProduct);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsRegularRrice() {
        Product milkChocolate = new Product();
        milkChocolate.setRegularPrice(5.5);

        Product darkChocolate = new Product();
        darkChocolate.setRegularPrice(5.5);

        boolean expected = true;
        boolean actual = milkChocolate.equals(darkChocolate);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsDiscount() {
        Product milkChocolate = new Product();
        milkChocolate.setDiscount(10.3);

        Product darkChocolate = new Product();
        darkChocolate.setDiscount(7.5);

        boolean expected = false;
        boolean actual = milkChocolate.equals(darkChocolate);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsTrue() {
        Product milkChocolate = new Product();
        milkChocolate.setRegularPrice(5.5);

        boolean expected = true;
        boolean actual = milkChocolate.equals(milkChocolate);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsFalse() {
        Product darkChocolate = new Product();
        darkChocolate.setDiscount(10.5);

        boolean expected = false;
        boolean actual = darkChocolate.equals(false);
        assertEquals(expected, actual);
    }


    @Test
    public void testHashCode() {
        Product product = new Product();
        product.setName("milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20.0);

        Integer expected = 666828311;
        Integer actual = product.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Product product = new Product();
        product.setName("milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20.0);

        String expected = "Product{name='milk', regularPrice=0.8, discount=20.0}";
        String actual = product.toString();
        assertEquals(expected, actual);

    }
}