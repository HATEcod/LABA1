import com.google.gson.Gson;
import java.io.IOException;


public class Program {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Object jack = new Person("Jack", 20);
        Object alan = new Person("alan", 32);
        String jsonInString = gson.toJson(jack);

        System.out.println(jsonInString);
        Person alina2 = gson.fromJson(jsonInString, Person.class);
        System.out.println(alina2.getName() + ", " + alina2.getAge());

        System.out.println(jack.equals(jack2)); //до і після серіалізациї true
        System.out.println(jack.equals(alan)); //2 різних без серіалізації false
        System.out.println(alina2.equals(jack)); //після і до серіалізації true
        System.out.println(alina2.equals(alan)); //після серіалізації і інше взагалі false





        String jsonInString2 = "{'name' : 'mkyong'}";
        jack = gson.fromJson(jsonInString2, Person.class);


        JsonElement json = gson.fromJson(new FileReader("D:\\jAVA\\laba2Java\\file.json"), JsonElement.class);
        String result = gson.toJson(json);

    }
}


