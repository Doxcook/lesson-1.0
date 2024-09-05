package animal;

public class Cat extends Mammals {

    public Cat() {
        super();
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    //перегрузка в строку для кошки
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void say(){
        System.out.println("myau");
    }
}
