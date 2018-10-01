
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.predicate.clase.Persona;

/**
 * @author jlucero
 *
 */
public class EjemploFunction {

	public static void main(String[] args) {
					
		List<Persona> lista = Arrays.asList(
				new Persona("1756554500", "Luis", "Fonseca", LocalDate.of(1998, 10, 25)),
				new Persona("0956456642", "Carlos", "Toapanta", LocalDate.of(1988, 10, 25)),
				new Persona("0456645687", "Maria", "Tapia", LocalDate.of(1988, 10, 25)),
				new Persona("0598632214", "Carmen", "Caiza", LocalDate.of(1988, 10, 25)),
				new Persona("0765465543", "Liliana", "Morales", LocalDate.of(1998, 10, 25))			
				);
		
		Function<Persona, String> functionPorNombre = (Persona p) -> { return p.getNombre(); };
		
		List<String> listaNombres = obtenerListaPorNombres(lista, functionPorNombre);

		System.out.println("Método con la interfaz FUNCTION");
		System.out.println(" ");
		for(String s: listaNombres)
			System.out.println(s);
		System.out.println(" ");
		
		
		
		System.out.println("***********************************");
		System.out.println(" ");
		System.out.println("Método con Lambda");
		System.out.println(" ");
		//Como expresi�n lambda
		lista
			.stream()
			.map((p) -> p.getNombre())
			.forEach(System.out::println);
		
	}

	private static List<String> obtenerListaPorNombres(List<Persona> lista,
			Function<Persona, String> functionPersonaANombre) {
		List<String> result = new ArrayList<>();
		for(Persona p : lista)
			result.add(functionPersonaANombre.apply(p));
		
		return result;
	}
}
