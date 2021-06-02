package test;

public class testArrayReview {
    public static void main(String[] args) {
        /*
        * En memoria el array ocupa un gran bloque de memoria todo junto sin cortar
        * Cada elemento del array ocupa el mismo tamaño de memoria
        * Si un array empeza en memoria X, y el tamaño de cada elemento es Y, podemos calcular donde va a estar parado en cada elemento usando
          x + i * y
        * Si sabemos el index del elemento, sabemos donde va a estar ubicado en memoria
        
        PUNTOS POSITIVOS:
        1. Multiplica el tamaño por el elemento de su index
        2. Agarra donde empieza el array
        3. Añade la ubicacion haciendo el calculo x + i * y
        
        POSITIVO DEL ARRAY:
        * Entonces el array toma 3 pasos para hacer el calculo, no importa la cantidad de elementos = O(1)
        
        NEGATIVO DEL ARRAY:
        * Cuando no conocemos el index tiene que recorrer todo el array en el peor escenario = O(n)
        
        Empieza en la memoria = 12, cada elemento ocupa = 4 bytes
        
        Adress of array[0] = 12 + (0 * 4) = 12
        Adress of array[1] = 12 + (1 * 4) = 16
        Adress of array[2] = 12 + (2 * 4) = 20
        Adress of array[3] = 12 + (3 * 4) = 24
        Adress of array[4] = 12 + (4 * 4) = 28
        Adress of array[5] = 12 + (5 * 4) = 32
        Adress of array[6] = 12 + (6 * 4) = 36
        
        */
        
        
        int[] intArray = new int[7]; // El array necesita un tamaño, no se puede incrementar o decrementar su tamaño
        
        intArray[0] = 20; // El primero elemento vale 20
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        
        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
