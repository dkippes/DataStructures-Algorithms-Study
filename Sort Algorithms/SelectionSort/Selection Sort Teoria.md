# Selection Sort Teoria - O(n^2)
- O(n^2) - Quadratic
- Seleccion el mayor elemento y lo pone al final del array
- No requierer tanto swap como Bubble Sort
- - Es Unstable Sort, porque selecciona el primer elemento mas grande (sin respetar el orden de los duplicados)

## Pasos:

- Un for inicial para recorrer cada elemento
- Segundo for para rercorrer todo el array y agarrar el elemento mas grande
- Cambiar el elemento mas grande por la ultima posicion

Array Inicial:
<table>
  <tr>
    <td>20</td>
    <td>35</td>
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
    <td><b>35</b></td>
    <td>-15</td>
    <td>7</td>
    <td>-22</td>
    <td>1</td>
    <td>55</td>
  </tr>
</table>

Segunda vuelta al pasar trasversalmente todo el array:
<table>
  <tr>
    <td>20</td>
    <td>1</td>
    <td>-15</td>
    <td>7</td>
    <td>-22</td>
    <td><b>35</b></td>
    <td><b>55</b></td>
  </tr>
</table>