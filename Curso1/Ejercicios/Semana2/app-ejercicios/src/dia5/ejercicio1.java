package dia5;

public class ejercicio1 {


    // Ejercicio 1: Uso de if-else sin llaves.
    //  Crea una función llamada verificarNumero que reciba un número entero y determine si es positivo, negativo o cero. Debes usar una estructura if-else sin llaves.

    public static void main(String[] args) {

        verificarNumero(248);
        verificarNumero(-47);
        verificarNumero(0);
    }

    public static void verificarNumero(int numero) {
        if (numero > 0)
            System.out.println("Este número es positivo");

        else if (numero < 0)
            System.out.println("Este número es negativo");

        else
            System.out.println("Este número es cero");

    }
}
