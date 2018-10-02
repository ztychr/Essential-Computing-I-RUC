import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        while (1 < 2){

        int tal = ThreadLocalRandom.current().nextInt(0, 99 + 1);
            System.out.print("Nyt tal genereret. ");

            while (1 < 2) {

            int guess;
            Scanner in = new Scanner(System.in);
            System.out.print("Indtast et gæt: ");
            guess = in.nextInt();

            if ((guess < tal)) {
                System.out.print("Tallet er højere. ");
            } else if ((guess > tal)) {
                System.out.print("Tallet er lavere. ");
            } else {
                System.out.println("Korrekt.");
                break;
            }

            }
        }
    }
}

