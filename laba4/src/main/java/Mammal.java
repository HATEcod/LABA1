public abstract class Mammal extends Animal
{
    public int getGestationPeriod() {
        return gestationPeriod;
    }

    private int gestationPeriod;


    public Mammal(String name, String classification, int age, int gestationPeriod) {
        super(name, classification, age);
        this.gestationPeriod = gestationPeriod;
    }
}
