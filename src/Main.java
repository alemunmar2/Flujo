import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Clases.Person;
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> Personas = new ArrayList<Person>();

        Person personas = new Person("Alex", "Muñoz", 1972);
        Personas.add(personas);
        Person personas1 = new Person("Manuel", "Perez", 1996);
        Personas.add(personas1);
        Person personas2 = new Person("Manolo", "Lopez", 1952);
        Personas.add(personas2);
        Person personas3 = new Person("David", "Garcia", 2001);
        Personas.add(personas3);

       String manines = Personas.stream()
                .filter(person -> person.getBirthYear() < 1970)

        System.out.println(manines);
    }
}