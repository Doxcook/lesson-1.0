import animal.Mammals;
import animal.Dog;
import animal.Cat;
import animal.ToyDog;

//123456fekfje
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "Musa");
        System.out.println(cat);

        Dog dog = new Dog(2, "Gesha");
        System.out.println(dog);

        ToyDog toy = new ToyDog("green", "rubber");

       // Mammals[] homeZoo = new Mammals[3];
        Mammals[] homeZoo = new Mammals[3];
        homeZoo[0] = cat;
        homeZoo[1] = dog;
        homeZoo[2] = toy;
        // Для класса Mammals перебрать каждый x из homezoo
        for (Mammals x: homeZoo){
            x.say();
        }

    }

}