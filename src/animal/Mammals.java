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

    //возможность говорить
    Speak speakBehavior = new CanSpeak();

    //метод для смены возможности говорить
    public void setSpeak(Speak speak){
        this.speakBehavior = speak;
    }
    //метод говорить
    public void speak(){
        speakBehavior.speak();
    }

}
