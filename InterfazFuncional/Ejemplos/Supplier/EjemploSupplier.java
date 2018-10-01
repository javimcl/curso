import java.time.LocalDate;
import java.util.function.Supplier;

import com.predicate.clase.Persona;

/**
 * @author Javier Lucero
 *
 */
public class EjemploSupplier {

	public static void main(String[] args) {
		Supplier<String> supplier1 = () -> { return new String("Hola Mundo!"); };
		String valor = supplier1.get();
		System.out.println("Obtención de un valor: " + valor);
		
 
		Supplier<Persona> supplier2 = EjemploSupplier::llenarPersona;
		Persona per = supplier2.get();
		System.out.println("El nombre es : " + per.getNombre());
	}

	public static Persona llenarPersona() {
		return new Persona("1756554500", "Luis", "Fonseca", LocalDate.of(1998, 10, 25));
	}
}
