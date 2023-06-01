import java.util.HashSet;
public class Main {



        public static void main(String[] args) {
            // Tworzenie i wypełnianie zbioru HashSet
            HashSet<String> set = new HashSet<>();
            set.add("jabłko");
            set.add("banan");
            set.add("pomarańcza");
            set.add("gruszka");
            set.add("wiśnia");

            // Wyświetlanie zawartości zbioru HashSet
            System.out.println("Zawartość zbioru HashSet: " + set);

            // Konwersja zbioru HashSet na tablicę
            String[] array = set.toArray(new String[set.size()]);

            // Wyświetlanie zawartości tablicy
            System.out.println("Zawartość tablicy:");
            for (String element : array) {
                System.out.println(element);
            }
        }

}