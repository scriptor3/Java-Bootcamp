package dia5;

public class ejercicio3 {

    // Ejercicio 3: Uso de for-each.
    //  Crea una función llamada mostrarNombres que reciba un array de nombres y los imprima uno por uno utilizando un bucle for-each.

    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ana", "Luis"};
        mostrarNombres(nombres);
    }
    public static void mostrarNombres(String[] nombres){
        for (String nombre : nombres)
            System.out.println(nombre);
    }
}
