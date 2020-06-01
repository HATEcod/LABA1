public abstract class Bird extends Animal
{

    private int wingspawn;

    public Bird(String name, String classification, int age, int wingspawn) {
        super(name, classification, age);
        this.wingspawn = wingspawn;
    }

    public int getWingspawn() {
        return wingspawn;
    }


}
