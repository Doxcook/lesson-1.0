package srategy;

public class CantSpeak implements Speak {

    @Override
    public void say() {
        System.out.println("I can speak");
    }
}
