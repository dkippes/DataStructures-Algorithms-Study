# Insertion Sort - O(n^2)
- O(n^2) - Quadratic
- Es Stable Sort por <=
- 100 pasos para ordenar 10 elementos.
- No se necesita otro array, particiona el mismo array

## Pasos:
- Separa el array en una parte ordenada y otra sin ordenar
- Va de derecha (parte desordenada) a izquierda (parte ordenada)
- Reemplaza los valores y compara el elemento actual con todos los ordenados hasta ubicarlo en la parte del array que esta ordenado

Array Inicial: El 20 ya esta ordenado
<table>
  <tr>
    <td><b>20</b></td>
    <td>35</td>
    <td>-15</td>
    <td>7</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

2. Ahora compara el -15 <= 35 ? Si, entonces pone el 35 donde estaba el -15 y guarda el -15 en una variable temporal
<table>
  <tr>
    <td></b>20</b></td>
    <td><b>35</b></td>
    <td><b>35</b></td>
    <td>7</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

3. se compara luego la variable temporal (-15) con el 20, es -15 <= 20? Si, entonces reemplaza el elemento por el 20
<table>
  <tr>
    <td>20</td>
    <td><b>20</b></td>
    <td>35</td>
    <td>7</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

4. El -15 ya llego al lugar minimo posible
<table>
  <tr>
    <td>20</td>
    <td><b>20</b></td>
    <td>35</td>
    <td>7</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

5. Estos serian los ordenados en este momento, ahora pasa a comparar 7 con la parte ordenada del array para ubicarlo.. etc.
<table>
  <tr>
    <td><b>15</b></td>
    <td><b>20</b></td>
    <td><b>35</b></td>
    <td>7</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>