import animal.Mammals;
import animal.Dog;
import animal.Cat;
//123456fekfje
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "Musa");
        System.out.println(cat);

        Dog dog = new Dog(2, "Gesha");
        System.out.println(dog);

        Mammals[] homeZoo = new Mammals[2];
        homeZoo[0] = cat;
        homeZoo[1] = dog;
        // Для класса Mammals перебрать каждый x из homezoo
        for (Mammals x: homeZoo){
            x.say();
        }
    }
}