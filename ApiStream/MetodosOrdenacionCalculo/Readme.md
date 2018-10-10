**Métodos de datos y cálculo**

Los streams nos ofrecen varios tipos de métodos terminales para realizar operaciones y cálculos con los datos. Durante el curso trabajaremos con tres tipos:

- Reducción y resumen (en esta lección)
- Agrupamiento
- Particionamiento

**Métodos de reducción**

Son métodos que reducen el stream hasta dejarlo en un solo valor.

- reduce(BinaryOperator<T>):Optional<T> realiza la reducción del Stream usando una función asociativa. Devuevle un Optional
- reduce(T, BinaryOperator<T>):T realiza la reducción usando un valor inicial y una función asociativa. Se devuelve un valor como resultado.

**Métodos de resumen**

Son métodos que resumen todos los elementos de un stream en uno solo:

- count : devuelve el número de elementos del stream.
- min(...), max(...) : devuelven el máximo o mínimo (se puede utilizar un Comparator para modificar el orden natural).

**Métodos de ordenación**

Son operaciones intermedias, que devuelven un stream con sus elementos ordenados.

- sorted() el stream se ordena según el orden natural.
- sorted(Comparator<T>) el stream se ordena según el orden indicado por la instancia de Comparator .

