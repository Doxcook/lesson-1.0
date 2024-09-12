import Toys.ToyDog;
import animal.*;
import srategy.CanSpeak;
import srategy.CantSpeak;
import srategy.Speak;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1,"Muska");
        Dog dog = new Dog(2,"bublic");
        //Speak toyDog = new ToyDog();
        Mammals []home = new Mammals[2];
        home[0] = cat;
        home[1] = dog;

        Speak speak = new CantSpeak();
        cat.setSpeak(speak);

        //home[2] = toyDog;
        for(Mammals x: home){
            x.speak();
        }
    }

}