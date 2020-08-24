package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
       Circle circle = new Circle();
        circle.setRadius(2.2);

        double expected = 2.2;
        double actual = circle.getRadius();
        double delta = 0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testEquals() {
        Circle firstCircle = new Circle();
        firstCircle.setRadius(2.2);

        Circle secondCircle = new Circle();
        secondCircle.setRadius(5.2);

        boolean expected = false;
        boolean actual = firstCircle.equals(secondCircle);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsTrue() {
       Circle circle = new Circle();
        circle.setRadius(4.3);

        boolean expected = true;
        boolean actual = circle.equals(circle);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsFalse() {
        Circle circle = new Circle();
        circle.setRadius(5.3);

        boolean expected = false;
        boolean actual = circle.equals(false);
        assertEquals(expected, actual);
    }


    @Test
    public void testHashCode() {
        Circle circle = new Circle();
        circle.setRadius(48.3);

        Integer expected = 640565279;
        Integer actual = circle.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle();
        circle.setRadius(1.2);

        String expected = "Circle{radius=1.2}";
        String actual =circle.toString();
        assertEquals(expected, actual);
    }
}