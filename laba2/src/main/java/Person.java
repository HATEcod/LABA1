
import com.google.gson.Gson;

import java.util.Objects;


public class Person {
    public  String name;
    public  int age;
    public static Gson gson = new Gson();
    public Person( String name, int age) {
        this.name = name;
        this.age = age;
    }
   public boolean equals(Person person) {

        return (person != null)
                && (this.name == person.name)&& (this.age == person.age);
    }
  public String toJSON() {
       return gson.toJson(this);
   }
    public static Person fromJSON(String json) {
        return gson.fromJson(json, Person.class);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && this.name.equals(person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public final int hashCode() {
        int result = 21;
        result += result * id;
        try {
            result += result * name.hashCode();

        } catch (Exception e) {
            result += result * 21;
            result += result * 21;
        }
        result += result * age;
        return result;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof Person) || obj == null) {
            return false;
        }
        Person person = (Person) obj;
        boolean strResult;
        boolean dateResult;
        if (this.birthday == person.birthday) {
            dateResult = true;
        } else {
            try{
                dateResult = this.birthday.equals(person.birthday);
            } catch (NullPointerException e) {
                dateResult = false;
            }
        }
        if (this.name == person.name) {
            strResult = true;
        } else {
            try{
                strResult = this.name.equals(person.name);
            } catch (NullPointerException e) {
                strResult = false;
            }
        }
        boolean result;

        result = person.id == this.id && strResult && person.age == this.age && dateResult;
        return result;
    }
   @Override
   public boolean equals(Object obj) {

       boolean result = false;
       if (obj == this) {
         return true;
       }
       if (obj == null || obj.getClass() != this.getClass()) {
           return false;
       }
       Person that = (Person) obj;
      return (this.age == that.age && (name == that.name || (this.getName() != null && this.name.equals(that.getName()))));

   }  foo == null ? other.foo == null : foo.equals(other.foo);
    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }
  public boolean equals(Object obj) {
       if (obj == this) {
           return true;
       }
       if (obj == null || obj.getClass() != this.getClass()) {
           return false;
       }

       Person guest = (Person) obj;
       return age == guest.age && (name == guest.name || (name != null && name.equals(guest.getName())));
   }

   @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;

        return result;
    }

  public boolean equals(Object obj) {
       if (obj == this) {
            return true;
       }
       return false;
   }


}
