public class invCadena {
    public static void main(String[] args) {

        String resultado = invertir("Hola");
        System.out.println(resultado);

    }
    private static String invertir(String cadena) {
        if(cadena.isEmpty()){
            return cadena;
        }else{
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
