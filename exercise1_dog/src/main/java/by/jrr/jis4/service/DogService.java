package by.jrr.jis4.service;





public class DogService {

public static final String DOG_VOICE = "Woof - woof - woof!";
public static final String DOG_EAT = "Mute - mute - mute!";
public static final String DOG_SLEEP = "Zzz... Zzz...Zzz.";

        public String voice(){
            return DOG_VOICE;
    }

    public String eat() {
        return DOG_EAT;
    }


    public String sleep() {
            return DOG_SLEEP;
    }
}

