package animal;

public class Cat extends Mammals {
    //перегрузка в строку для кошки
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
