package by.jrr.jis4.service;

import by.jrr.jis4.bean.Human;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanServiceTest {

    @Test
    public void greetingFromMark() {
        Human human = new Human();
        HumanService humanService = new HumanService();
        human.setName("Mark");
        human.setAge(33);
        String expected = "Hi! My name is Mark, I'm 33 years old";
        String actual = humanService.greet(human);
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void greetingFromFrank() {
        Human human = new Human();
        HumanService humanService = new HumanService();
        human.setName("Frank");
        human.setAge(28);
        String expected = "Hi! My name is Frank, I'm 28 years old";
        String actual = humanService.greet(human);
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void greetingFromWalter() {
        Human human = new Human();
        HumanService humanService = new HumanService();
        human.setName("Walter");
        human.setAge(65);
        String expected = "Hi! My name is Walter, I'm 65 years old";
        String actual = humanService.greet(human);
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void greetingFromLouisa() {
        Human human = new Human();
        HumanService humanService = new HumanService();
        human.setName("Louisa");
        human.setAge(29);
        String expected = "Hi! My name is Louisa, I'm 29 years old";
        String actual = humanService.greet(human);
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void greetingFromKate() {
        Human human = new Human();
        HumanService humanService = new HumanService();
        human.setName("Kate");
        human.setAge(21);
        String expected = "Hi! My name is Kate, I'm 21 years old";
        String actual = humanService.greet(human);
        assertEquals(expected, actual);
        System.out.println();
    }

    @Test
    public void greetingFromVictor() {
        Human human = new Human();
        HumanService humanService = new HumanService();
        human.setName("Victor");
        human.setAge(45);
        String expected = "Hi! My name is Victor, I'm 45 years old";
        String actual = humanService.greet(human);
        assertEquals(expected, actual);
        System.out.println();
    }
}