package by.jrr.jis4.service;

import by.jrr.jis4.bean.Circle;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleServiceTest {

    @Test
    public void calculateArea() {
        Circle circle = new Circle();
       CircleService circleService = new CircleService();
       circle.setRadius(4.2);

        double expected = 55.41769440932395;
        double actual = circleService.calculateArea(circle);
        double delta = 0;
        assertEquals(expected, actual, delta);
    }
}