package dia5;

public class ejercicio2 {

    // Ejercicio 2: Uso de Operador Ternario.
    //  Crea una función llamada esPar que reciba un número entero y devuelva un mensaje indicando si el número es par o impar utilizando el operador ternario ? :.

    public static void main(String[] args) {
        String resultado = esPar(32);
        System.out.println(resultado);

        System.out.println(esPar(91));

    }
    public static String esPar(int numero){
        return (numero % 2 == 0) ? "Este número es par." : "Este número es impar.";

    }
}
