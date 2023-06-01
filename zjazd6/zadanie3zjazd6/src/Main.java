import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // a. Tworzenie i wypełnianie drzewa tree1
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Czerwony");
        tree1.add("Zielony");
        tree1.add("Niebieski");
        tree1.add("Żółty");
        tree1.add("Pomarańczowy");

        // b. Iteracja i wypisanie elementów drzewa tree1
        System.out.println("Elementy drzewa tree1:");
        Iterator<String> iterator1 = tree1.iterator();
        while (iterator1.hasNext()) {
            String kolor = iterator1.next();
            System.out.println(kolor);
        }

        // c. Tworzenie i wypełnianie drzewa tree2
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Biały");
        tree2.add("Czarny");
        tree2.add("Fioletowy");

        // Wypisanie elementów drzewa tree2
        System.out.println("Elementy drzewa tree2:");
        for (String kolor : tree2) {
            System.out.println(kolor);
        }

        // Dodawanie elementów z drzewa tree2 do drzewa tree1
        tree1.addAll(tree2);

        // Wypisanie elementów po dodaniu do drzewa tree1
        System.out.println("Elementy drzewa tree1 po dodaniu tree2:");
        for (String kolor : tree1) {
            System.out.println(kolor);
        }

        // d. Wypisanie elementów z drzewa tree1 w odwrotnej kolejności
        System.out.println("Elementy drzewa tree1 w odwrotnej kolejności:");
        Iterator<String> descendingIterator = tree1.descendingIterator();
        while (descendingIterator.hasNext()) {
            String kolor = descendingIterator.next();
            System.out.println(kolor);
        }

        // e. Wypisanie pierwszego i ostatniego elementu drzewa tree1
        System.out.println("Pierwszy element drzewa tree1: " + tree1.first());
        System.out.println("Ostatni element drzewa tree1: " + tree1.last());

        // f. Klonowanie drzewa tree1 do tree3
        TreeSet<String> tree3 = (TreeSet<String>) tree1.clone();

        // g. Wypisanie liczby elementów w drzewie tree1
        System.out.println("Liczba elementów w drzewie tree1: " + tree1.size());

        // h. Porównanie elementów drzewa tree1 i tree2
        System.out.println("Czy drzewa tree1 i tree2 są równe? " + tree1.equals(tree2));
    }
}