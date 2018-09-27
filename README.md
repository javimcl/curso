# Interfaces Funcionales

Son interfaces que implementamos mediante una clase anónima.

Caracteristicas

-Solamente tenga la definición de un método abstracto.

-Pueden tener uno o varios métodos por defecto o estáticos. 

Ejemplo de interface funcional Comparator.

Collections.sort(lista, new Comparator<String>() {

    //Ordenamos la cadena por su longitud
    @Override
    public int compare(String str1, String str2) {
        return str1.length()-str2.length();
    }

});
