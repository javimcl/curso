import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Javier Lucero
 *
 */
public class Busqueda {

	public static void main(String[] args) {
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");

		// Verificamos si TODOS los elementos cumplen una condicion
		boolean logitud = meses.stream().allMatch(s -> s.length() > 5);
		String mensajeLongitud = logitud ? "Todos los meses tienen mas de 5 caracteres"
				: "Hay algun mes con menos de 5 caracteres";
		System.out.println(mensajeLongitud);
		
		// Verificamos si ALGUNO de los elementos cumple con una condicion
		boolean junio = meses.stream().anyMatch(s -> s.equalsIgnoreCase("junio"));
		String mensajeJunio = junio ? "Junio esta en la lista"
				: "Junio no esta en la lista";
		System.out.println(mensajeJunio);
		
		// La inversa de allMatch es noneMatch
		boolean noneLogitud = meses.stream().noneMatch(s -> s.length() > 5);
		String mensajeNoneLongitud = noneLogitud ? "Todos los meses tienen menos de 5 caracteres"
				: "Hay algun mes con mas de 5 caracteres";
		System.out.println(mensajeNoneLongitud);
		
		// Localiza algun elemento (cualquiera) del Stream. Recomendado para streams paralelos
		
		Optional<String> unMes = meses.parallelStream().findAny();
		System.out.println(unMes.orElse("No quedan meses en el Stream"));
		
		// Localiza el primer elemento del Stream. NO RECOMENDADO para streams paralelos
		Optional<String> primerMes = meses.stream().findFirst();
		System.out.println(primerMes.orElse("No quedan meses en el Stream"));

	}

}
