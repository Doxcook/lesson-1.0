import Toys.ToyDog;
import animal.*;
import srategy.Speak;

//123456fekfje
public class Main {
    public static void main(String[] args) {
        Speak cat = new Cat(1,"Muska");
        Speak dog = new Dog(2,"bublic");
        Speak toyDog = new ToyDog();
        Speak []home = new Speak[3];
        home[0] = cat;
        home[1] = dog;
        home[2] = toyDog;
        for(Speak x: home){
            x.speak();
        }
    }

}