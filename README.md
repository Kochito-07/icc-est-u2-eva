# Evaluacion Set y Map.

## Método A: filterAndSortSupplies.

Implementación utilizada para el Set: TreeSet.

Explicación: Para el Set se utilizó un TreeSet porque debe mantener la unicidad de los elementos, sin duplicados y manteniéndolos ordenados con un comparador personalizado. 

## Método B: groupCodesByStock.

Implementación utilizada para el Map: TreeMap.

Implementación utilizada para los Sets internos: TreeSet.

Explicación: para el Map se eligió un TreeMap porque los requerimientos estan exigidos estrictamente por claves ("HIGH", "LOW", "MEDIUM"), se mantuvieron ordenados alfabéticamente.
Para las colecciones internas se eligió un TreeSet porque se tenía que asegurar que el año (yyy), no tuviera repetidos y se mantuvieran ordenados de forma ascendente dentro del grupo de stock.
