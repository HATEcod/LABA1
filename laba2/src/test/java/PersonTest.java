import com.google.gson.Gson;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class PersonTest {
    @Test
    public void equals() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).usingGetClass().verify();
   /*     Gson gson = new Gson();
        Object alina = new Person("Alina", 18);
//конвертировать Java-объект в JSON

        gson.toJson(alina);

        String jsonInString = gson.toJson(alina);
        System.out.println(jsonInString);

        Person alina2 = gson.fromJson(jsonInString, Person.class);
        System.out.println(alina2.getName() + ", " + alina2.getAge());

        System.out.println(alina.equals(alina2));
        EqualsVerifier(alina, alina2).verify();
*/
    }
}