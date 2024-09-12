package animal;

public class ToyDog implements Speak{
    String color;
    String material;

    public ToyDog(){
        color = "none";
        material = "none";
    }
    public ToyDog(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void say(){
        System.out.println("Pip");
    }


}
