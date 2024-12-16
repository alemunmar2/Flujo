import Clases.Person;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Person> Personas = new ArrayList<>();

        Person personas = new Person("Alex", "Muñoz", 1962);
        Personas.add(personas);
        Person personas1 = new Person("Manuel", "Perez", 1996);
        Personas.add(personas1);
        Person personas2 = new Person("Manolo", "Lopez", 1952);
        Personas.add(personas2);
        Person personas3 = new Person("David", "Garcia", 2001);
        Personas.add(personas3);

        Collections.sort(Personas, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        Personas.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));


    }
}
