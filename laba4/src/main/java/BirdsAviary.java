public class BirdsAviary<T extends Bird> extends Aviary<T>
{
    private int amountofNests;

    public BirdsAviary(int amountOfPlaces, int amountofNests) {
        super(amountOfPlaces);
        this.amountofNests = amountofNests;
    }
}
