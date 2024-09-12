package animal;

import srategy.CanSpeak;
import srategy.CantSpeak;

public class Cat extends Mammals {

    public Cat() {
        super();
        this.speakBehavior = new CanSpeak();

    }

    public Cat(int age, String name) {
        super(age, name);
        this.speakBehavior = new CanSpeak();
    }

}
