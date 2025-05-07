package piramides;

public class pirSec {

    public static void Piramide(int altura){
        for (int i = 1; i < altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
