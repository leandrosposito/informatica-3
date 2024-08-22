public class sumaDeNaturales {
    public static void main(String[] args) {

        int resultado = suma(5);

        System.out.println("El numero es: " + resultado);

    }

    private static int suma(int n) {
        if (n == 0) return 0;
        return n + suma(n - 1);

    }
}
