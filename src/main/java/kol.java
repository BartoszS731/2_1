import java.util.Scanner;

public class ParzystoscLiczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Podana liczba jest parzysta.");
        } else {
            System.out.println("Podana liczba jest nieparzysta.");
        }

        scanner.close();
    }
}