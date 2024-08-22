public class fibonacci {
    public static void main(String[] args) {

        int resultado = fibonacci(6);

        System.out.println("El resultado es: " + resultado);

    }

    private static int fibonacci(int n) {
        if(n == 0){
            return 0;
        } else if (n==1) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

}
