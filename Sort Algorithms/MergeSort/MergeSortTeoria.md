# Merge Sort
- O(n log n) - base 2.
- NOT in-place algorithm -> Crece el uso de memoria
- Divide y venceras (Algoritmo)
- Usa recursive algorithm
- 2 fases: Splitting y merging
- Spliting: no crea un nuevo array, es logica. La fase splitting hace que el ordenamiento sea mas rapido cuando se hace la fase merging

## Splitting Phase
- Empieza con un array desordenado
- Divide el array  en 2, los cuales estan desordenados. El primer array es el de la izq y el segundo el de la derecha.
- Vuelve a dividir el primer y segundo array en 2
- Sigue dividiendo hasta que cada array tiene un elemento - estos array estan ordenados

## Merging Phase
- Mergea cada par izq/der en los array en los hermanos que estan en un array ordenado
- Despues del primer merge, tenemos 2 elementos ordenados
- Despues mergea esos 2 ordenados con otros 2, y hace 4 elementos ordenados
- Repite hasta que tiene un solo array ordenado
- Usa array temporales

## Ejemplos:
<table>
  <tr>
    <td>20</td>
    <td>-35</td>
    <td>-15</td>
    <td>7</td>
    <td>55</td>
    <td>1</td>
    <td>-22</td>
  </tr>
</table>

- Start = 0, end = 7 (array.length)
- puntoMedio = (start + end) / 2 = 3
- Elemento 0 a 2 va a ser izq, y elemento 3 a 6 va a ser derecho (negro)
<table>
  <tr>
    <td>20</td>
    <td>-35</td>
    <td>-15</td>
    <td><b>7</b></td>
    <td><b>55</b></td>
    <td><b>1</b></td>
    <td><b>-22</b></td>
  </tr>
</table>

- Ahora se dividen en hermanos, los hermanos son los colores parecidos
- 35 y -15 son hermanos izq/der array
- 7 y 55 son hermanos izq/der array
- 1 y -22 son hermanos izq/der array
- Los demas izq/der estan ordenamos
<table>
  <tr>
    <td style="background: #5DADE2">20</td>
    <td style="background: #0E6655">-35</td>
    <td style="background: #196F3D">-15</td>
    <td style="background: #B7950B"><b>7</b></td>
    <td style="background: #B9770E"><b>55</b></td>
    <td style="background: #909497"><b>1</b></td>
    <td style="background: #B3B6B7"><b>-22</b></td>
  </tr>
</table>

## Nuestro array inicial dividido:
<img src="https://i.imgur.com/pMDlsEO.png">

## Merging process

- Se repite el proceso hasta que todos los elementos estan en 2 arrays
- El array temporal contiene todo lo mergeado y ordenado
- Copiamos lo temporal al original con las posiciones correctas
- Si el array izq esta en la posicion x de y, y el array der esta en la posicion y + 1 de z, entonces lo copiamos, la posicion x a z va a ser ordenada en el array original

### Como empezamos:
- Se mergea los 2 hermanos de la izq (35 y -15)
- Creamos un array temporal de 2 elementos
- i = 1 y j = 2
- Comparamos array[i] con array[j]. -15 < 35, entonces copiamos en el array original
- Copiamos 35 en el array original
- array temporal = {-15, 35}

## Asi quedaria las comparaciones del merging:
<img src="https://i.imgur.com/d3Vbq53.png">