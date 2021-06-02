# Big O Notation

## Algoritmo
1. Agarrar el jarro de azucar
2. Agarrar la cuchara
3. Sacar azucar del jarron
4. Poner azucar en el te
5. Repetir paso 3 y 4

- Los pasos 3 y 4 se repiten n veces.

<table style="width:100%">
  <tr>
    <th>Cantidad de azucar</th>
    <th>Pasos requeridos</th>
  </tr>
  <tr>
    <td>1</td>
    <td>4</td>
  </tr>
  <tr>
    <td>2</td>
    <td>6</td>
  </tr>
  <tr>
    <td>3</td>
    <td>8</td>
  </tr>
  <tr>
    <td>4</td>
    <td>10</td>
  </tr>
</table>

- Cantidad de azucar = n
- Cantidad de pasos totales = 2n + 2
- n crece segun la cantidad de pasos necesarios
- "2" en 2n y "+2" se mantienen constantes, no afectan al tiempo. El valor que determina cuanto crece es n.
- Tiempo de computo es O(n) -> Hablado en ingles es O of..
- Tiempo de computo lineal

## Funciones segun tiempo
- De menor tiempo a mayor tiempo de computo. 
- Constante es el que menos tiempo lleva, y el mejor caso posible, mientras que cuadratica lleva mucho mas tiempo de computo.
- El eje X es la cantidad de elementos en el algoritmo y el eje Y es el tiempo.

<table style="width:100%">
  <tr>
    <th>Big-O</th>
    <th></th>
  </tr>
  <tr>
    <td>O(1)</td>
    <td>Constant</td>
  </tr>
  <tr>
    <td>O(log n)</td>
    <td>Logarithmic</td>
  </tr>
  <tr>
    <td>O(n)</td>
    <td>Linear</td>
  </tr>
  <tr>
    <td>O(n log n)</td>
    <td>n log-star n</td>
  </tr>
  <tr>
    <td>O(n^2)</td>
    <td>Quadratic</td>
  </tr>
</table>

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Comparison_computational_complexity.svg/512px-Comparison_computational_complexity.svg.png" alt="funciones">

## Arrays
<table style="width:100%">
  <tr>
    <th>Operacion</th>
    <th>Time Complexity</th>
  </tr>
  <tr>
    <td>Conseguir un dato, tengo el index</td>
    <td>O(1) - Constante</td>
  </tr>
  <tr>
    <td>Conseguir un dato, no tengo el index</td>
    <td>O(n) - Linear time</td>
  </tr>
  <tr>
    <td>Añadir un elemento a un array lleno</td>
    <td>O(n)</td>
  </tr>
  <tr>
    <td>Añandir un elmento al final del array (tiene espacio)</td>
    <td>O(1)</td>
  </tr>
  <tr>
    <td>Insertar o actualizar un elemento de un index especifico</td>
    <td>O(1)</td>
  </tr>
  <tr>
    <td>Borrar un elemento seteandolo como null</td>
    <td>O(1)</td>
  </tr>
  <tr>
    <td>Borrando un elemento al cambiar elementos</td>
    <td>O(n)</td>
  </tr>
</table>