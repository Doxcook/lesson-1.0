package animal;

import srategy.CanSpeak;
import srategy.Speak;

public abstract class Mammals {
    int age;
    String name;
    Speak speakBehavior;
    public Mammals(){
        age = 0;
        name = "none";
        speakBehavior = new CanSpeak();
    }
    public Mammals(int age, String name) {
        this.age = age;
        this.name = name;
        speakBehavior = new CanSpeak();
    }

    //возможность говорить


    //метод для смены возможности говорить
    public void setSpeak(Speak speak){
        this.speakBehavior = speak;
    }
    //метод говорить
    public void speak(){
        speakBehavior.speak();
    }

}
