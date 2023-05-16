import java.util.ArrayList;

public class Zadanie_5_01 {
    public static void main(String[] args) {
        // zapisz czas rozpoczęcia operacji
        long czasRozpoczecia = System.currentTimeMillis();

        // utwórz obiekt ArrayList i wypełnij go 50 pierwszymi liczbami parzystymi
        ArrayList<Integer> liczbyParzyste = new ArrayList<Integer>();
        for (int i = 2; liczbyParzyste.size() < 50; i += 2) {
            liczbyParzyste.add(i);
        }

        // przejdź przez ArrayList i wypisz każdą liczbę oraz jej indeks
        for (int i = 0; i < liczbyParzyste.size(); i++) {
            System.out.println("Liczba " + liczbyParzyste.get(i) + " znajduje się pod indeksem " + i);
        }

        // zapisz czas zakończenia operacji i oblicz czas całej operacji
        long czasZakonczenia = System.currentTimeMillis();
        long czasCalkowity = czasZakonczenia - czasRozpoczecia;

        // wypisz czas całej operacji
        System.out.println("\nCzas całej operacji: " + czasCalkowity + " ms");
    }
}
