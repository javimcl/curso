import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * @author Javier Lucero
 *
 */
public class Datos {

	public static void main(String[] args) {

		int[] array = { 800, 100, 500, 600, 300, 700, 900, 1000, 500, 200, 400 };
		// Imprimir Array
		System.out.println(Arrays.toString(array));

		System.out.println("Total de elementos: " + Arrays.stream(array).count());

		double maximo = Arrays.stream(array).max().orElse(0);
		double minimo = Arrays.stream(array).min().orElse(0);

		System.out.printf("El valor maxino es %.2f y el valor minimo es %.2f%n", maximo, minimo);

		double suma = Arrays.stream(array).sum();

		System.out.println("La suma de todos los elementos es: " + suma);

		// Reduccion

		OptionalInt maximoReducer = Arrays.stream(array).reduce(Integer::max);

		String mensajeMaximo = maximoReducer.isPresent() ? "El valor maximo es " + maximoReducer.getAsInt()
				: "No hay valor maximo";
		System.out.println(mensajeMaximo);

		double sumaReduce = Arrays.stream(array).reduce(0, (x, y) -> x + y);
		System.out.println("La suma con reduce es: " + sumaReduce);

		// Uso de max con String
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");

		String palabraLarga = meses.stream().max((s1, s2) -> s1.length() - s2.length()).get();

		System.out.println("La mes con mas caracteres es: " + palabraLarga);

		// Ordenacion

		// Los streams derivados para tipos enteros, double o long
		// tienen un metodo de ordenacion con el orden natural
		
		System.out.println("Array Sin Ordenar");
		System.out.println(Arrays.toString(array));
		
		
		int[] arrayOrdenado = Arrays.stream(array).sorted().toArray();
		
		System.out.println("Array Ordenado");
		System.out.println(Arrays.toString(arrayOrdenado));
		
		System.out.println("Meses en orden alfabetico");
		//Ordenamos los meses por orden alfabetico
		meses.stream().sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);

	}
}
