public class Potencia {
    public static void main(String[] args) {

        int resultado = potencia(2,3);
        System.out.println("La potencia es: " + resultado);

    }

    private static int potencia(int a, int b) {
        if(b==0) return 1;
        else if (b==1) return a;
        else return a*potencia(a,b-1);
    }

}
