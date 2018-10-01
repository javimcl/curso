
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Javier Lucero
 *
 */
public class EjemploPredicate {
	
	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		
		listaPersonas.add(new Persona("1756554500", "Luis", "Fonseca", LocalDate.of(1998, 10, 25)));
		listaPersonas.add(new Persona("0956456642", "Carlos", "Toapanta", LocalDate.of(1988, 10, 25)));
		listaPersonas.add(new Persona("0456645687", "Maria", "Tapia", LocalDate.of(1988, 10, 25)));
		listaPersonas.add(new Persona("0598632214", "Carmen", "Caiza", LocalDate.of(1988, 10, 25)));
		listaPersonas.add(new Persona("0765465543", "Liliana", "Morales", LocalDate.of(1998, 10, 25)));
		
		listaPersonas.stream().filter(p -> p.getEdad() >=25).forEach(System.out::println);
		
		Predicate<Persona> edad = p -> p.getEdad() >=25;
		Predicate<Persona> nombre = p -> p.getApellido().contains("i");
		Predicate<Persona> resultado = edad.and(nombre);
		
		System.out.println("");
		
		listaPersonas.stream().filter(resultado).forEach(System.out::println);
		
		
		
	}

}
