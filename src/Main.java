import animal.*;

//123456fekfje
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "Musa");
        System.out.println(cat);

        Dog dog = new Dog(2, "Gesha");
        System.out.println(dog);

        ToyDog toy = new ToyDog("green", "rubber");

       // Mammals[] homeZoo = new Mammals[3];
        Speak[] homeZoo = new Speak[3];
        homeZoo[0] = cat;
        homeZoo[1] = dog;
        homeZoo[2] = toy;
        // Для класса Speak перебрать каждый x из homezoo
        for (Speak x: homeZoo){
            x.say();
        }

    }

}