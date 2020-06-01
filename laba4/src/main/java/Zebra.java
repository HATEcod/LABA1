public class Zebra extends Ungulates
{
    private String color;

    public Zebra(String name, String classification, int age, int gestationPeriod, int fingersInHoof, String color) {
        super(name, classification, age, gestationPeriod, fingersInHoof);
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
