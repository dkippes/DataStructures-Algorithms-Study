# Bubble Sort - O(n^2)
- O(n^2) - Quadratic
- Es Stable Sort por el >
- Es de los algoritmos menos eficientes
- 100 pasos para ordenar 10 elementos.
- No se necesita otro array, particiona el mismo array

## Pasos:
- Separa el array en partes, una ordenada y otra desordenada a medida que progresa
- Empieza en el index 0
- Si el index 0 es mayor al index 1, cambia los elementos, si es menos no lo cambia
- Orden ascendente
- Pasa a la siguiente posicion, hasta terrminar el array
- Una vez completado el array, se hace array.length-1 porque el maximo elemento ya estaria en la ultima posicion del array

Array Inicial:
<table>
  <tr>
    <td>20</td>
    <td><b>35</b></td>
    <td>-15</td>
    <td>7</td>
    <td><b>55</b></td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

Array Luego de que el maximo elemento este en la ultima posicion:
<table>
  <tr>
    <td>20</td>
    <td>-15</td>
    <td>7</td>
    <td>35</td>
    <td>1</td>
    <td>-22</td>
    <td>55</td>
  </tr>
</table>

Segunda vuelta al pasar trasversalmente todo el array:
<table>
  <tr>
    <td>-15</td>
    <td>-7</td>
    <td>20</td>
    <td>1</td>
    <td>-22</td>
    <td>35</td>
    <td>55</td>
  </tr>
</table>