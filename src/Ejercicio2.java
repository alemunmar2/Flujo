import Clases.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<Person> Personas = new ArrayList<>();

        Person personas = new Person("Alex", "Muñoz", 1962);
        Personas.add(personas);
        Person personas1 = new Person("Manuel", "Aerez", 1996);
        Personas.add(personas1);
        Person personas2 = new Person("Manolo", "Lopez", 1952);
        Personas.add(personas2);
        Person personas3 = new Person("David", "Garcia", 2001);
        Personas.add(personas3);

        long contador = Personas.stream()
                .filter(person -> person.getLastName().startsWith("A"))
                .count();

        System.out.println(contador);


    }
}
