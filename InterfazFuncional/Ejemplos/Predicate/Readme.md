El método abstracto es: 
```
boolean test(T t);
```
Comprueba si se cumple o no una condición. Se utiliza mucho junto a expresiones lambada a la hora de filtrar: 
```
 .filter((p) -> p.getEdad() >= 35l)
 ```
 Se pueden componer predicados más complejos con sus métodos **and**, **or** y **negate**. 
