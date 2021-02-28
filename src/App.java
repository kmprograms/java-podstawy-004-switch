import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("MENU");
        System.out.println("1. OPCJA 1");
        System.out.println("2. OPCJA 2");
        System.out.println("3. OPCJA 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("WYBIERZ OPCJE:");
        int opcja = sc.nextInt();

        // Wersja 1
        /*if ( opcja == 1 ) {
            System.out.println("OPCJA 1");
        }
        else if ( opcja == 2 ) {
            System.out.println("OPCJA 2");
        }
        else if ( opcja == 3 ) {
            System.out.println("OPCJA 3");
        }
        else {
            System.out.println("NIE MA TAKIEJ OPCJI");
        }*/

        // Wersja 2
        /*switch (opcja) {
            case 1:
                System.out.println("OPCJA 1");
                break;
            case 2:
                System.out.println("OPCJA 2");
                break;
            case 3:
                System.out.println("OPCJA 3");
                break;
            default:
                System.out.println("NIE MA TAKIEJ OPCJI");
        }*/

        // Wersja 3
        switch (opcja) {
            case 1 ->  System.out.println("OPCJA 1");
            case 2 ->  {
                System.out.println("OPCJA 2");
            }
            case 3 ->  System.out.println("OPCJA 3");
            default -> System.out.println("NIE MA TAKIEJ OPCJI");
        }
    }
}
