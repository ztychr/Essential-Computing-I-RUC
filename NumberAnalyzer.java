import java.util.Scanner;

/* Number “Analyzer” Enter a number and the programs tells if the number is odd or even and if the number is positive, negative or zero (deadline Oct 3) */

public class Main {

    public static void main(String[] args) {

        while (1 < 2) {

            int tal;
            Scanner in = new Scanner(System.in);
            System.out.print("Indtast et tal: ");
            tal = in.nextInt();

            if ((tal % 2) == 0) {
                System.out.println("Det indtastede tal er lige.");
            }
            else
                System.out.println("Det indtastede tal er ulige.");
        }
    }
}

