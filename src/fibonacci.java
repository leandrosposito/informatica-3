public class fibonacci {
    public static void main(String[] args) {

        int resultado = sucesionFibonacci(6);

        System.out.println("El resultado es: " + resultado);

    }

    private static int sucesionFibonacci(int n) {
        if(n == 0){
            return 0;
        } else if (n==1) {
            return 1;
        }else{
            return sucesionFibonacci(n-1) + sucesionFibonacci(n-2);
        }

    }
}
