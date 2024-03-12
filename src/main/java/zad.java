public class SumaLiczb {
    public static void main(String[] args) {
        int suma = 0;

        // Pętla dodająca liczby od 1 do 10 do sumy
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }

        // Wyświetlenie wyniku
        System.out.println("Suma liczb od 1 do 10 wynosi: " + suma);
    }
}