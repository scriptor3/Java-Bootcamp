package dia2;

public class ejercicio2 {

    // Ejercicio Nº 2 - Tipos de Datos.
    //  a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.
    //  b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso.

    public static void main(String[] args) {
        int numeroEntero = 10;
        double numeroDecimal = 1.25;
        boolean verdadero = true;
        String bienvenida = "Bienvenido";
        System.out.println("INT: " + numeroEntero);
        System.out.println("DOUBLE: " + numeroDecimal);
        System.out.println("BOOLEAN: " + verdadero);
        System.out.println("STRING: " + bienvenida);



        //b:

        //int numero = "Caracol"; NO - es String, no una variable tipo numero
        //double decimal = "1.25" NO - es String de nuevo, no número real.
        //boolean verdadero = "true" NO - es String x3, no valor boolean real.
        //String bienvenida = 125 NO - es un valor de numero. Pero sería válido si se ponen "".

        //En cambio:
        /*int numero2 = 300;
        double decimal = 21.21;
        boolean falso = false;
        String despedida = "Adios";

        System.out.println(numero2 + decimal + falso + despedida);*/


    }


}