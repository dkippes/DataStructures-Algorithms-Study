package mergesort;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        mergeSort(intArray, 0, intArray.length);
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
    }
    
    // Este es recursivo
    public static void mergeSort(int[] input, int start, int end){
        
        if(end - start < 2){
            return;
        }
        
        // Dividimos el array
        int  mid = (start + end) / 2;
        mergeSort(input, start, mid); // la parte izquierda del array - 20, 35, -15
        mergeSort(input, mid, end); // la parte derecha del array - 7, 55, 1, -22
        merge(input, start, mid, end); // Ahora hace merging de los 2 lados
    }
    
    public static  void merge(int[] input, int start, int mid, int end){
        
        // Si la comparacion de elementos no cambia, osea no hace falta ordenar entonces lo devuelve directamente
        // sin pasarlo a un array temporal... Esta es una mejora
        if(input[mid - 1] <= input[mid]){
            return;
        }
        
        int i = start;
        int j = mid;
        int tempIndex=  0;
        
        int[] temp = new int[end - start];
        // Comparamos el izq  con el derecho, y los pasamos al array  temporal ordenados
        while( i < mid && j < end ){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
