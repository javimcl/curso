import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Javier Lucero
 *
 */
public class EjemploConsumer {
	
	public static void main(String[] args) {
		//Tiene un único método que se denomina accept el cual recibe un parámetro  y no devuelve nada.
		Consumer<String> consumidor = (x) -> System.out.println(x);
		consumidor.accept("hola");
		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Consumer<Integer> consumer = i -> System.out.print(" "+i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.println(" (hemos imprimido el " + i + ")"));
		
		//Usando expresiones lambda
		imprimir(lista, System.out::print);
		
		System.out.println("\n\n");
		
		//Solo utilizamos un "consumer"
		imprimir(lista, consumer);
		
		//Usamos dos consumers concatenados
		imprimir(lista, consumerWithAndThen);

	}
	
	public static void imprimir(List<Integer> l, Consumer<Integer> consumer) {
		for(Integer i : l)
			consumer.accept(i);
		System.out.println("");
	}

}
