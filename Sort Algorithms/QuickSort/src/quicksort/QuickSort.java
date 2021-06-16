package quicksort;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        quickSort(intArray, 0, intArray.length);
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
    }
    
    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        
        int pivotIndex = partition(input, start, end); // Todo lo que esta a la izq es < a pivot y a  la derecha es > a pivot
        quickSort(input, start, pivotIndex); // izq
        quickSort(input, pivotIndex + 1, end); // der
    }
    
    @SuppressWarnings("empty-statement")
    public static int partition(int[] input, int start, int end){
        // Estes es el primer elemento del array como pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        
        while(i < j){
            // empty loop body - no hace nada, lo queremos mover a la izq
            while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            
            // empty loop body - lo queremos mover a la derecha
            while(i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }
        }
        
        input[j] = pivot;
        return j;
    }
}
