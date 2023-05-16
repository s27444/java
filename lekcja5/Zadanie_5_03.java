import java.util.ArrayList;
import java.util.Iterator;

public class Zadanie_5_03 {
    public static void main(String[] args) {
        ArrayList<String> listaKaw = new ArrayList<>();

        listaKaw.add("espresso");
        listaKaw.add("latte");
        listaKaw.add("cappuccino");
        listaKaw.add("mocha");
        listaKaw.add("auLait");
        listaKaw.add("macchiato");

        System.out.println("\n\u001B[4m" + "Lista kaw:" + "\u001B[0m");
        for (String kawa : listaKaw) {
            System.out.println(kawa);
        }

        System.out.println("\n\u001B[4m" + "Lista kaw używając Iteratora:" + "\u001B[0m");
        Iterator<String> iterator = listaKaw.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n\u001B[4m" + "Lista kaw w dużych literach:" + "\u001B[0m");
        for (String kawa : listaKaw) {
            System.out.println(kawa.toUpperCase());
        }

        System.out.println("\n\u001B[4m" + "4 pierwsze litery każdej kawy:" + "\u001B[0m");
        for (String kawa : listaKaw) {
            for (int i = 0; i < 4; i++) {
                if (i < kawa.length()) {
                    System.out.print(kawa.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
