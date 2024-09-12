package animal;
public class Dog extends Mammals {
    public Dog() {
        super();
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

}
