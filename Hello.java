import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvad er dit navn?: ");
        String navn = scanner.nextLine();
        System.out.println("Hej med dig, " + navn + "!");
    }
}
