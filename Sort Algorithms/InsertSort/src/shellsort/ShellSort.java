package shellsort;

public class ShellSort {
    public static void main(String[] args) {
        
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        // El gap se va achicando a medida que itere
        for ( int gap = intArray.length / 2; gap > 0; gap /= 2 ) {
            
            // Es lo mismo que insertion sort, solo que no empieza en 1 sino segun el gap
            for( int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                
                int j = i;
                
                // Al principio intera 3 posiciones 7 (tamaño array) / 2 = 3
                while ( j >= gap && intArray[j - gap] > newElement ) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                
                intArray[j] = newElement;
            }
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
