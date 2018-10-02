import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        while (1 < 2) {

            int tal = ThreadLocalRandom.current().nextInt(0, 9999 + 1);
            System.out.print("Random integer generated: " + tal + "\nPress ENTER to start bruteforce: ");

            String intro = "Press ENTER to start bruteforce";
            Scanner readinput = new Scanner(System.in);
            intro = readinput.nextLine();
            System.out.print(intro);


            if(intro.equals("")){
                for (int i = 1; i < 9999; i++)
                    if (i == tal) {
                        System.out.println("Number was bruteforced. \n" + "Number was = " + i);
                        break;
                    }
                    else System.out.println("Trying: " + i);
            }
        }
    }
}
