package animal;
public class Dog extends Mammals {
    public Dog() {
        super();
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }
}
