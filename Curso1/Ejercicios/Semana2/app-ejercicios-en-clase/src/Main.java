import ejercicio1.ej1a_quinielarandom;
import ejercicio1.ej1b_quinielaprob;
import ejercicio2.letraDNI;
import piramides.pirEmoji;
import piramides.pirRep;
import piramides.pirSec;

public class Main {
    public static void main(String[] args) {

        //1a:
        ej1a_quinielarandom.quinielaResultadosRandom(20);

        //1b:
        ej1b_quinielaprob.quinielaResultadosProbabilidad(20);

        //2:
        int dni = 78160842;
        char letra = letraDNI.calcularLetra(dni);
        System.out.println("Su DNI es: " + dni + "_" + letra);

        //3a:
        System.out.println("LA PIRÁMIDE DE EMOJIS: ");
        pirEmoji.Piramide(8);

        //3b:
        System.out.println("La pirámide de números reps: ");
        pirRep.Piramide(6);

        //3c:
        System.out.println("La pirámide de numeros sec: ");
        pirSec.Piramide(7);
    }
}