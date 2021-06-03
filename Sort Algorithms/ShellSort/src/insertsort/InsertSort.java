package insertsort;

public class InsertSort {
    public static void main(String[] args) {
        
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        for( int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++ ){
            int newElement = intArray[firstUnsortedIndex]; // Agarramos el elemento
            
            int i;
            // El elemento busca en donde posicionarse
            for ( i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) { // Izquierda a derecha recorre
                // Cuando llegamos al frente del array y es menor al elemento i - 1
                // Encontramos la posicion donde colocar el elemento
                intArray[i] = intArray[i - 1]; // Izquierda a derecha insertamos
            }
            
            intArray[i] = newElement; // Ahora pasamos el elemento a la posicion donde deberia ir (si no se mueve i queda donde esta)
        }
        
        
        // Mostramos el array
        imprimirArray(intArray);
    }
    
    
    public static void imprimirArray(int[] array) {
        for ( int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }
}
