package bubblesort;

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        // Va por burbujas, cambia una posicion por otra
        for ( int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){ // lastUnsortedIndex Empieza en 6
            for ( int i = 0; i < lastUnsortedIndex; i++ ) { // i = 0
                if ( intArray[i] > intArray[i + 1]) { // Si intArray[0](20) > intArray[1](35) -> Falso, no hace el cambio
                    swap(intArray, i, i + 1);
                }
            }
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
