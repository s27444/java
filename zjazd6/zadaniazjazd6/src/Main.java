import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
            // Tworzenie i wypełnianie listy
            LinkedList<Integer> lista = new LinkedList<>();
            lista.add(10);
            lista.add(20);
            lista.add(30);
            lista.add(40);
            lista.add(50);

            // Wyświetlanie oryginalnej listy
            System.out.println("Oryginalna lista: " + lista);

            // Usuwanie pierwszego i ostatniego elementu
            Integer pierwszyElement = lista.removeFirst();
            Integer ostatniElement = lista.removeLast();

            // Wyświetlanie usuniętych elementów
            System.out.println("Usunięte elementy: " + pierwszyElement + ", " + ostatniElement);

            // Wyświetlanie listy po usunięciu elementów
            System.out.println("Lista po usunięciu elementów: " + lista);
        }

}