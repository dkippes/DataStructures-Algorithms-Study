package radixsort;

public class RadixSort {
    public static void main(String[] args) {
        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
        
        radixSort(radixArray, 10, 4);
        
        for (int i = 0; i < radixArray.length; i++) {
            System.out.println("intArray[" + i + "] = " + radixArray[i]);
        }
    }
    
    public static void radixSort(int[] input, int radix, int width){
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }
    
    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        
        int[] countArray = new int[radix];
        
        for(int value: input){
            // Este metodo retorna el digito - queremos que sea estable
            countArray[getDigit(position, value, radix)]++;
        }
        
        // Adjust the count array
        for(int j= 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }
        
        // Lo copiamos en un array temporal
        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
        
        // Lo copiamos de vuelta
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }
    
    public static int getDigit(int position, int value, int radix){
        // Retorna la posicion 4725, en este caso retorna 5 dependiendo de la posicion
        // posicion 1 -> 5, position 2 -> 2 .. etc
        return value / (int) Math.pow(radix, position) % radix;
    }
}
