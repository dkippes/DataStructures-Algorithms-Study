# Counting Sort
- O(n)  - asumimos los elementos que hay que ordenar
- NOT in-place algorithm -> Crece el uso de memoria
- No es estable, si queremos que sea estable hay que hacer mas pasos
- No hace comparasiones
- Cuenta las ocurrencias encontradas en numero
- No funciona con numeros negativos, numeros flotantes o strings
- Los valores deben tener un rango especifico

## Array Inicial:
<table>
  <tr>
    <td>2</td>
    <td>5</td>
    <td>9</td>
    <td>8</td>
    <td>2</td>
    <td>8</td>
    <td>7</td>
    <td>10</td>
    <td>4</td>
    <td>3</td>
  </tr>
</table>

## Array al contar inicial:
- i = 0 -> Se pone 1 en 2, porque el primer elemento del array es 2, entonces se suma 1
<table>
  <tr>
    <td>0 (Este representa 1)</td>
    <td>1 (Este representa 2)</td>
    <td>0 (Este representa 3)</td>
    <td>0 (Este representa 4)</td>
    <td>0 (Este representa 5)</td>
    <td>0 (Este representa 6)</td>
    <td>0 (Este representa 7)</td>
    <td>0 (Este representa 8)</td>
    <td>0 (Este representa 9)</td>
    <td>0 (Este representa 10)</td>
  </tr>
</table>

## Nuestro array inicial dividido:
<img src="https://i.imgur.com/nJObrps.png">
