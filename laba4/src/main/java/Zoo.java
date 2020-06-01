import java.util.HashSet;
import java.util.Set;

public class Zoo
{
    public Set<Aviary> aviaries = new HashSet<Aviary>();

    public int GetAmountOfAnimals(){
        int amount = 0;
        for (Aviary aviary : aviaries){
            amount += aviary.GetAmountOfOccupiedPlaces();
        }
        return amount;
    }

    public <T extends  Aviary> void AddAviary(T aviary){
        aviaries.add(aviary);
    }
}
