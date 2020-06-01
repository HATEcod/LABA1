import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestZooWorking
{
    List<Animal> animals = new ArrayList<Animal>();
    Zoo zoo;
    BirdsAviary birdsAviary;
    LionAviary lionAviary;
    UngulatesAviary ungulatesAviary;

    @Before
    public void SetUp() throws Exception{
        zoo = new Zoo();
        birdsAviary = new BirdsAviary(3,3);
        lionAviary = new LionAviary(1,1);
        ungulatesAviary = new UngulatesAviary(3,3);
    }

    @Test
    public void TestZOO() throws Exception {
        Eagle eagle  = new Eagle("Орел", "Австралійський", 4, 210);
        Jyraph jyraph = new Jyraph("Жираф", "Австралійський", 10, 1,2,"коричневый");
        Zebra zebra = new Zebra("Зебра", "Австралійська", 3,2,1,"в чорнобылу полоску");
        Lion lion = new Lion("Лев", "Африканський", 6,3);

        ungulatesAviary.AddAnimal(zebra);
        birdsAviary.AddAnimal(eagle);
        ungulatesAviary.AddAnimal(jyraph);
        lionAviary.AddAnimal(lion);

        zoo.AddAviary(birdsAviary);
        zoo.AddAviary(ungulatesAviary);
        zoo.AddAviary(lionAviary);

        Assert.assertEquals(zoo.GetAmountOfAnimals(),4);

    }
    @Test(expected = Noplaces.class)
    public void TestNoPlaces() throws Exception{
        lionAviary.AddAnimal(new Lion("Лев","Австралійський", 5,7));
        lionAviary.AddAnimal(new Lion("Лев", "Африканський", 6,2));

    }

    @Test(expected = NotThisAnimal.class)
    public void TestNotThisAnimal() throws Exception{
        UngulatesAviary ungulatesAviary = new UngulatesAviary(5,5);
        ungulatesAviary.AddAnimal(new Zebra("Зебра", "Африканська", 5,6,3,"black-white"));
        ungulatesAviary.RemoveAnimalFromList(new Zebra("Зебра","Африканська", 5,6,3,"black-white"));
    }


}
