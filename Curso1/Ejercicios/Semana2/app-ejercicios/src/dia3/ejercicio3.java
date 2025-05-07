package dia3;

public class ejercicio3 {

    //Ejercicio 3: Concatenación con Distinción de Mayúsculas y Minúsculas
    //Crear una función en Java que reciba dos cadenas como parámetros, una en mayúsculas y otra en minúsculas, y las concatene en un orden específico.

    public static String concatenarCadenas(String cadenaMayusculas, String cadenaMinusculas){
        return cadenaMinusculas + " " + cadenaMayusculas;
    }

    public static void main(String[] args) {
        String resultado = concatenarCadenas("MUNDO", "hola");
        System.out.println(resultado);
    }

}
