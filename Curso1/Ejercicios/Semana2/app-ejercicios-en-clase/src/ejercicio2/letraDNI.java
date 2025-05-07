package ejercicio2;

public class letraDNI {

    public static char calcularLetra(int dni){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);

    }

    public static void main(String[] args) {
        int numeroDNI = 78160842;
        char letra = calcularLetra(numeroDNI);
        System.out.println("Su DNI completo es: " + numeroDNI + "_" + letra);
    }
}
