package srategy;

public class CanSpeak implements Speak{

    @Override
    public void say() {
        System.out.println("I can't speak");
    }
}
