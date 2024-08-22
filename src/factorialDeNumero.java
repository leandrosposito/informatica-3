public class factorialDeNumero {
    public static void main(String[] args) {

        int resultado = factorial(5);

        System.out.println("El factorial del numero 5 es: " + resultado);

    }

    private static int factorial(int n) {
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }

}