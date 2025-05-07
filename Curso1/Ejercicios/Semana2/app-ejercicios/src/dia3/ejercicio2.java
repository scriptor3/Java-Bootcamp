package dia3;

public class ejercicio2 {

    //Ejercicio 2: Mostrar un mensaje personalizado
    //Crea una función llamada mostrarMensaje que reciba un nombre como parámetro y muestre en pantalla un saludo personalizado. Esta función no debe retornar ningún valor.

    public static void mostrarMensaje(String nombre) {
        System.out.println("Hola, " + nombre + ", bienvenido a Java!");

    }

    public static void main(String[] args) {
        mostrarMensaje("Carlos");
        mostrarMensaje("Jesus");
    }

}
