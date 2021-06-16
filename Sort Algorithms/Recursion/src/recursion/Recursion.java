package recursion;

public class Recursion {
    public static void main(String[] args) {
        // Factorial 1! = 0! * 1 = 1
        // Factorial 2! = 2 * 1 = 2 * 1!
        // Factorial 3! = 3 * 2 * 1 = 3 * 2!
        // Factorial 4! = 4* 3 * 2 * 1 = 4 * 3!
        
        // n! = n * (n - 1)!
        
        System.out.println(iterativeFactorial(3));
        System.out.println("");
        System.out.println(recursiveFactorial(3));
    }
    
    public static int recursiveFactorial(int num){
        // No es mejor que un iterativo, puede dar un stackoverflow exception aunque tenga un break condition
        // La base - hasta que no llege a 0 no retorna, puede tomar mucho tiempo hacer la recursion
        // Java no usa tail recursion
        if(num == 0){
            return 1;
        }
        
        return num * recursiveFactorial(num - 1); // Lo empuja al callstack
    }
    
    // Metodo para calcular sin recursion
    public static int iterativeFactorial(int num){
        
        // La base
        if(num == 0){
            return 1;
        }
        
        int factorial = 1;
        for (int i=1; i <= num; i++){
            factorial *= i;
        }
        
        return factorial;
    }
}
