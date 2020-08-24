package by.jrr.jis4.service;

import by.jrr.jis4.bean.Circle;


public class CircleService {
    public double calculateArea(Circle circle) {
        return  (Math.PI * circle.getRadius() * circle.getRadius());
    }
}
