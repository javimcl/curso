# Interfaces Funcionales

Son interfaces que implementamos mediante una clase anónima.

**Caracteristicas**

- Solamente tenga la definición de un método abstracto.

- Pueden tener uno o varios métodos por defecto o estáticos. 

Ejemplo de interface funcional Comparator.

`
Collections.sort(lista, new Comparator<String>() {

    //Ordenamos la cadena por su longitud
    @Override
    public int compare(String str1, String str2) {
        return str1.length()-str2.length();
    }

});`

Java 8 añade la anotación **@FunctionalInterface** que permite al compilador comprobar si la interfaz cumple con las caracteristicas de funcional.

Ejemplo:

`
@FunctionalInterface
public interface InterfazFuncional {
	
	void imprimir(String str);
	
	boolean equals(Object o);
	
	default void defecto() {
		System.out.println("Metodo por defecto");
	}
	
	static void estatico() {
		System.out.println("Metodo estatico");
	}

}`
