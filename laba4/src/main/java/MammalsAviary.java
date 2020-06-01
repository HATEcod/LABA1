public abstract class MammalsAviary<T extends Mammal> extends Aviary<T>
{
    private int amountOfAreas;


    public MammalsAviary(int amountOfPlaces, int amountOfAreas) {
        super(amountOfPlaces);
        this.amountOfAreas = amountOfAreas;
    }
}
