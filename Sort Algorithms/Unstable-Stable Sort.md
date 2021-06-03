# Unstable - Stable Sort

- Cuando hay duplicados
- Cuando hay que ordenar objetos

## Unstable Sort
- El 9 blanco aunque este antes se ubica luego del <b>9</b> y no preserva su posicion

Sin ordenar:
<table>
  <tr>
    <td>5</td>
    <td>9</td>
    <td>3</td>
    <td><b>9</b></td>
    <td>8</td>
    <td>4</td>
  </tr>
</table>

Ordenado:
<table>
  <tr>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>8</td>
    <td><b>9</b></td>
    <td>9</td>
  </tr>
</table>

## Stable Sort
- El 9 blanco se "preserva" atras del <b>9</b>

Sin ordenar:
<table>
  <tr>
    <td>5</td>
    <td>9</td>
    <td>3</td>
    <td><b>9</b></td>
    <td>8</td>
    <td>4</td>
  </tr>
</table>

Ordenado:
<table>
  <tr>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td>8</td>
    <td>9</td>
    <td><b>9</b></td>
  </tr>
</table>