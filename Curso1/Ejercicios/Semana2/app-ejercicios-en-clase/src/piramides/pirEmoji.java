package piramides;

public class pirEmoji {

    public static void Piramide(int altura){

        for (int i = 1; i < altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println("\uD83D\uDE0E\u200B");
            }
            System.out.println();
        }
    }
}
