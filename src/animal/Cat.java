package animal;

public class Cat {
    int age;
    String name;

    \\конструктор по умолчанию
    public Cat(){
        age = 0;
        name = "none";
    }

    \\конструктор с параметрами
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //перегрузка в строку
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
