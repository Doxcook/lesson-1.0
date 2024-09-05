package animal;

public class Mammals {
    int age;
    String name;

    public Mammals(){
        age = 0;
        name = "none";
    }
    public Mammals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
