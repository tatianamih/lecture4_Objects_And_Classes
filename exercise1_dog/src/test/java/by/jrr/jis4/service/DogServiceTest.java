package by.jrr.jis4.service;

import by.jrr.jis4.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceTest {

    @Test
    public void voice() {
        Dog dog = new Dog();
        DogService dogService = new DogService();
        String expected = "Woof - woof - woof!";
        String actual = dogService.voice();
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void eat() {
        Dog dog = new Dog();
        DogService dogService = new DogService();
        String expected = "Mute - mute - mute!";
        String actual = dogService.eat();
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void sleep() {
        Dog dog = new Dog();
        DogService dogService = new DogService();
        String expected = "Zzz... Zzz...Zzz.";
        String actual = dogService.sleep();
        assertEquals(expected, actual);
        System.out.println();
    }
}