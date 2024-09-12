package srategy;

public class CantSpeak implements Speak {

    @Override
    public void speak() {
        System.out.println("I cant speak");
    }
}
