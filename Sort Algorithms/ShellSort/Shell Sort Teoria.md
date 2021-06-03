# Shell Sort - O(n^2)
- O(n^2) - Quadratic - En el peor caso
- Es la version mejorada de Insertion Sort
- Trata de mejorar las veces que se cambia un elemento por otro
- Cada vez que progresa necesita menos tiempo
- No intercambia con el elemento vecino hasta que el gap es muy chico
- Usa un gap value para ordenar
- Es Unstable Sort porque compara elementos lejanos entre si
- Lo ordena preliminarmente y va achicando el gap

## Gap Value
- Hay distintos gap value, uno usado es el Knuth Sequence
- Gap = (3^k - 1) / 2
- k = longitud del array
<table>
  <tr>
    <th>k</th>
    <th>gap (interval)</th>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
  </tr>
    <tr>
    <td>2</td>
    <td>4</td>
  </tr>
    <tr>
    <td>3</td>
    <td>13</td>
  </tr>
    <tr>
    <td>4</td>
    <td>40</td>
  </tr>
  <tr>
    <td>5</td>
    <td>121</td>
  </tr>
</table>

## Pasos (sin usar knuth sequence):
- g = array.length / 2
- Se divide el gap por 2 en cada iteraccion
- Para nuesro array el gap empieza en 3

1. Array inicial:
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

- i = gap = 3
- j = i = 3
- newElement = intArray[i] = 7
- compara -> intArray[j - gap ] con el newElement

2. 7 < 20 -> Entonces lo intercambia
<table>
  <tr>
    <td><b>7</b></td>
    <td>35</td>
    <td>-15</td>
    <td><b>20</b></td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

- i = gap = 3
- j = j - gap = 0
- newElement = intArray[i] = 7

3. 35 < 55 -> Esta a 3 elementos de el, no se hace nada
- i  5
- j = i = 5
- newElement = intArray[i] = i
- Compara intArray[j - gap] con el newElement
<table>
  <tr>
    <td>7</td>
    <td><b>35</b></td>
    <td>-15</td>
    <td>20</td>
    <td><b>55</b></td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

4. Compara -15 < 1, no hace nada
<table>
  <tr>
    <td>7</td>
    <td>35</td>
    <td><b>-15</b></td>
    <td>20</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

5. 22 < 20 -> Lo intercambia
<table>
  <tr>
    <td>7</td>
    <td>35</td>
    <td>-15</td>
    <td><b>-22</b></td>
    <td>55</td>
    <td>1</td>
    <td><b>20</b></td>
  </tr>
</table>

6. -22 < 7 -> Lo intercambia, no hay mas para comparar
<table>
  <tr>
    <td><b>-22</b></td>
    <td>35</td>
    <td>-15</td>
    <td><b>7</b></td>
    <td>55</td>
    <td>1</td>
    <td><b>20</b></td>
  </tr>
</table>

7. Aca termina la primera iteracion con gap = 3, ahora gap se divide en dos -> gap = 3 / 2 = 1

8. El array ahora esta mas ordenado, "preliminary work". Hace menos intercambios