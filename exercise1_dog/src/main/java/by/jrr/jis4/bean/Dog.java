package by.jrr.jis4.bean;

import java.util.Objects;

public class Dog {
    private int age;
    private String color;
    private String name;


    public Dog() {
        // no args constructor
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                color.equals(dog.color) &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
