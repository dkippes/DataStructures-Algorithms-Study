package selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        // Busca el mas grande y lo pone al final
        for ( int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){ // lastUnsortedIndex Empieza en 6
            
            int largest = 0;
            
            for ( int i = 1; i <= lastUnsortedIndex; i++ ) { // Queremos comparar todos los elementos, inclusive el ultimo
                if( intArray[i] > intArray[largest] ) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
        
        // Mostramos el array
        imprimirArray(intArray);
        
    }
    
    // Metodo para cambiar 2 elementos de un mismo array
    public static void swap(int[] array, int i, int j){
        
        if( i == j ) {
            return; // No hace el cambio
        }
        
        int temp = array[i];
        array[i] = array[j]; // Cambiamos el valor de i por j
        array[j] = temp;

    }
    
    public static void imprimirArray(int[] array) {
        for ( int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }
}
