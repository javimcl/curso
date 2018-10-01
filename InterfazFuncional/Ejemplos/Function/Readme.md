El método abstracto es: 
```
R apply(T t);
```

Sirve para aplicar una transformación a un objeto. El ejemplo más claro es el mapeo de objetos en otros. 

```
 .map((p) -> p.getNombre())
 ```
 
 Adicionalmente, tiene otros métodos:

- **andThen**, que permite componer funciones.
- **compose**, que compone dos funciones, a la inversa de la anterior.
- **identity**, una función que siempre devuelve el argumento que recibe

