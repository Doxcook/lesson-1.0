package animal;

import srategy.CanSpeak;
import srategy.Speak;

public abstract class Mammals {
    int age;
    String name;

    public Mammals(){
        age = 0;
        name = "none";
    }
    public Mammals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Speak speakBehavior = new CanSpeak();

    public void setSpeak(Speak speak){
        this.speakBehavior = speak;
    }

    public void speak(){
        speakBehavior.speak();
    }

}
