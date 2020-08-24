package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getAge() {
        Dog dog = new Dog();
        dog.setAge(5);

        int expected = 5;
        int actual = dog.getAge();
        assertEquals(expected, actual);
    }



    @Test
    public void getColor() {
        Dog dog = new Dog();
        dog.setColor("black");

        String expected = "black";
        String actual = dog.getColor();
        assertEquals(expected, actual);
    }




    @Test
    public void getName() {
        Dog dog = new Dog();
        dog.setName("Izzy");

        String expected = "Izzy";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }



    @Test
    public void testEqualsTrue() {
        Dog dogFirst = new Dog();
        dogFirst.setAge(3);

        boolean expected = true;
        boolean actual = dogFirst.equals(dogFirst);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsFalse() {
        Dog dogFirst = new Dog();
        dogFirst.setAge(3);

        boolean expected = false;
        boolean actual = dogFirst.equals(false);
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCodeColor() {
       Dog bentley = new Dog();
        bentley.setColor("white");

        System.out.println(bentley.hashCode());
        Integer expected = -788779690;
        Integer actual = bentley.hashCode();
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCodeAge() {
        Dog bentley = new Dog();
        bentley.setAge(2);

        System.out.println(bentley.hashCode());
        Integer expected = 31713;
        Integer actual = bentley.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringColor() {
        Dog bentley = new Dog();
        bentley.setColor("white");

        System.out.println(bentley.toString());
        String expected = "Dog{age=0, color='white', name='null'}";
        String actual = bentley.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testToStringName() {
        Dog bentley = new Dog();
        bentley.setName("Bently");

        System.out.println(bentley.toString());
        String expected = "Dog{age=0, color='null', name='Bently'}";
        String actual = bentley.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testEquals() {
        Dog firstDog = new Dog();
        firstDog.setColor("white");

        Dog secondDog = new Dog();
        secondDog.setColor("black");

        boolean expected = false;
        boolean actual = firstDog.equals(secondDog);
        assertEquals(expected, actual);
    }
}