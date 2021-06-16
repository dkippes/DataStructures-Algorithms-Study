# Radix Sort
- O(n) - puede correr mas lento que O(n log n) porque interviene muchas operaciones
- in-place algorithm -> Crece el uso de memoria
- Es stable algorithm
- Se suele usar counting sort para el radix sort
- Asume datos del array que ordena
- La informacion de ambos array edbe ser el mismo radix y width
- Solo puede ser integers o strings
- Se ordena en base a cada elemento individual, digito o posicion de la letra
- Empieza en la posicion mas derecha
- Se debe usar un stable sort para cada fase

## Ejemplo 1er ordenamiento del array:
- 1330 va primero porque tiene 0 en la posicion inicial (a la derecha de todo)
- Luego viene 8792 porque tiene un 2 al final, y asi con cada uno
- Se evalua el ultimo digito de cada elemento, y se ordena en base a este

<img src="https://i.imgur.com/0Jpo4FF.png">

## Ejemplo 2do ordenamiento del array:
- Ahora se evalua el anteultimo digito, 4725 va primero porque aparece primero y porque tiene un 2 como anteultimo digito
- Debe ser usado un stable sort

<img src="https://i.imgur.com/OWgFWvE.png">

## Ejemplo 3er ordenamiento del array:
- Lo mismo que antes pero el segundo elemento ordenado de menor a mayor
- En el caso de 4725 seria 7..  etc

<img src="https://i.imgur.com/pOQAtn7.png">

## Ejemplo 4to ordenamiento del array:
- Lo mismo que antes pero el primer elemento
- En el caso de 1330 es un 1

<img src="https://i.imgur.com/wG2Vvsd.png">