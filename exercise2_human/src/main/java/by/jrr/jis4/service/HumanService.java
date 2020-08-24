package by.jrr.jis4.service;

import by.jrr.jis4.bean.Human;

public class HumanService {

    public String greet(Human human){

        return "Hi! My name is " + human.getName() + ", I'm " + human.getAge() + " years old";
    }
}
