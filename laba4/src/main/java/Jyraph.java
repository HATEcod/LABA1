public class Jyraph extends Ungulates
{
    public String getColor() {
        return color;
    }

    private String color;

    public Jyraph(String name, String classification, int age, int gestationPeriod, int fingersInHoof, String color) {
        super(name, classification, age, gestationPeriod, fingersInHoof);
        this.color = color;
    }
}
