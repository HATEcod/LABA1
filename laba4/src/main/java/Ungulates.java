public abstract class Ungulates extends Mammal
{

    private int fingersInHoof;

    public Ungulates(String name, String classification, int age, int gestationPeriod, int fingersInHoof) {
        super(name, classification, age, gestationPeriod);
        this.fingersInHoof = fingersInHoof;
    }

    public int getFingersInHoof() {
        return fingersInHoof;
    }

}
