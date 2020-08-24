package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void getName() {
        Human human = new Human();
        human.setName("Jane");

        String expected = "Jane";
        String actual = human.getName();
        assertEquals(expected, actual);
    }



    @Test
    public void getAge() {
        Human ann = new Human();
        ann.setAge(30);

        int expected = 30;
        int actual = ann.getAge();
        assertEquals(expected, actual);
    }



    @Test
    public void testEqualsTrue() {
        Human david = new Human();
        david.setAge(22);

        boolean expected = true;
        boolean actual = david.equals(david);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsFalse() {
        Human bob = new Human();
        bob.setAge(15);

        boolean expected = false;
        boolean actual = bob.equals(false);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCodeName() {
        Human human = new Human();
       human.setName("Alex");

        System.out.println(human.hashCode());
        Integer expected = 63348035;
        Integer actual = human.hashCode();
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCodeAge() {
        Human eugene = new Human();
        eugene.setAge(48);

        System.out.println(eugene.hashCode());
        Integer expected = 1009;
        Integer actual = eugene.hashCode();
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCodeAge2() {
        Human alex = new Human();
        alex.setAge(10);

        Integer expected = 971;
        Integer actual = alex.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringName() {
        Human betty = new Human();
        betty.setName("Betty");

        String expected = "Human{name='Betty', age=0}";
        String actual = betty.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testToStringAge() {
        Human betty = new Human();
        betty.setAge(23);

        String expected = "Human{name='null', age=23}";
        String actual = betty.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testEquals() {
        Human alan = new Human();
        alan.setAge(23);

        Human jimmy = new Human();
        jimmy.setAge(14);

        boolean expected = false;
        boolean actual = alan.equals(jimmy);
        assertEquals(expected, actual);
    }
    @Test
    public void testEquals2() {
        Human alan = new Human();
        alan.setName("Alan");

        Human jimmy = new Human();
        jimmy.setName("Jimmy");

        boolean expected = false;
        boolean actual = alan.equals(jimmy);
        assertEquals(expected, actual);
    }
}