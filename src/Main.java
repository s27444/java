import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Long.reverse;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj!");
        zadanie1();
        zadanie1_v2();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie7();
        zadanie8();
        zadanie9();
        zadanie10();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();
        boolean zadanie11 = zadanie11(tekst);
        System.out.println(zadanie11);
        zadanie12();
        int[] tablica = {1, 2, 4, 7, 3};
        int maksimum = zadanie13(tablica, tablica.length);
        System.out.println(maksimum);
    }


    public static void zadanie1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a prostokąta: ");
        int a = scan.nextInt();
        System.out.println("Podaj bok b prostokąta: ");
        int b = scan.nextInt();
        System.out.println("Rozwiązanie zadania1: " + a * b);
    }

    public static void zadanie1_v2() {
        int a = 2;
        int b = 2;
        System.out.println("Rozwiązanie zadania1 z podanymi już danymi: " + a * b);
    }

    public static void zadanie2() {
        double pierwiastek = sqrt(PI);
        System.out.println("Rozwiązanie zadania2: " + String.format("%.2f", pierwiastek));
    }

    public static void zadanie3() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj dwa ciągi tekstowe (oddzielone spacją): ");
        String napis1 = scan.next();
        String napis2 = scan.next();
        String wynik = "%" + napis2 + " " + napis1 + "%";

        System.out.println(wynik);
    }


    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a trójkąta: ");
        int a = scan.nextInt();
        System.out.println("Podaj bok b trójkąta: ");
        int b = scan.nextInt();
        System.out.println("Podaj bok c trójkąta: ");
        int c = scan.nextInt();
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Rozwiązanie zadania4: Błąd");
        } else {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Rozwiązanie zadania4: Tak");
            } else {
                System.out.println("Rozwiązanie zadania4: Nie");
            }
        }
    }

    public static void zadanie5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz liczbę z zakresu od 1-12 aby zobaczyć jaki to miesiąc i ile ma on dni: ");
        int x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.println("Styczeń: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecień: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpień: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień: 30 dni");
                break;
            case 10:
                System.out.println("Październik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzień: 31 dni");
                break;

        }
    }

    public static void zadanie6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scan.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = scan.nextInt();
        if (a > b && b > c) {
            System.out.println(c + " " + b + " " + a);
            System.out.println(a + " " + b + " " + c);
        }
        if (a > b && c > b && a > c) {
            System.out.println(b + " " + c + " " + a);
            System.out.println(a + " " + c + " " + b);
        }
        if (b > a && a > c) {
            System.out.println(c + " " + a + " " + b);
            System.out.println(b + " " + a + " " + c);
        }
        if (b > a && c > a && b > c) {
            System.out.println(a + " " + c + " " + b);
            System.out.println(b + " " + c + " " + a);
        }
        if (c > a && a > b) {
            System.out.println(b + " " + a + " " + c);
            System.out.println(c + " " + a + " " + b);
        }
        if (c > a && b > a && c > b) {
            System.out.println(a + " " + b + " " + c);
            System.out.println(c + " " + b + " " + a);
        }

    }

    public static void zadanie7() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczby n i m:");
        int n = scan.nextInt();
        int m = scan.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD: n i m muszą być większe niż 0.");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];

        System.out.println("Podaj " + n + " liczb dla tablicy A:");
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        System.out.println("Podaj " + m + " liczb dla tablicy B:");
        for (int i = 0; i < m; i++) {
            B[i] = scan.nextInt();
        }

        int result = 0;

        if (n == m) {
            for (int i = 0; i < n; i++) {
                result += A[i] * B[i];
            }
        } else if (n < m) {
            for (int i = 0; i < n; i++) {
                result += A[i] * B[i];
            }
            System.out.println("BŁĄD: n jest mniejsze niż m.");
        } else {
            for (int i = 0; i < m; i++) {
                result += A[i] * B[i];
            }
            System.out.println("BŁĄD: m jest mniejsze niż n.");
        }

        System.out.println("Wynik iloczynu skalarnego to: " + result);
    }

    public static void zadanie8() {
        Scanner scan = new Scanner(System.in);

        int n;
        do {
            System.out.println("Podaj liczbę n:");
            n = scan.nextInt();
        } while (n <= 0);

        // Wzór 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Wzór 2
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Wzór 3
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zadanie9() {
        Scanner scan = new Scanner(System.in);
        char[] slowo = new char[100];

        System.out.println("Podaj slowo: ");
        int dlugosc = 0;
        while (scan.hasNext()) {
            char c = scan.next().charAt(0);
            if (c == '\n') {
                break;
            }
            slowo[dlugosc] = c;
            dlugosc++;
        }

        boolean palindrom = true;
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo[i] != slowo[dlugosc - i - 1]) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static void zadanie10() {
        int a, b;

        // wczytanie wymiarów macierzy
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy: ");
        a = input.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        b = input.nextInt();

        // inicjalizacja macierzy
        int[][] macierz = new int[a][b];

        // wczytanie danych do macierzy
        System.out.println("Podaj elementy macierzy:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (input.hasNextInt()) {
                    macierz[i][j] = input.nextInt();
                } else {
                    System.out.println("BŁĄD");
                    return;
                }
            }
        }

        // transpozycja macierzy
        int[][] macierzT = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                macierzT[i][j] = macierz[j][i];
            }
        }

        // wypisanie macierzy transponowanej
        System.out.println("Macierz transponowana:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(macierzT[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean zadanie11(String tekst) {

        tekst = tekst.toLowerCase();


        Set<Character> zbiorLiter = new HashSet<Character>();


        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (znak >= 'a' && znak <= 'z') {
                zbiorLiter.add(znak);
            }
        }


        return zbiorLiter.size() == 26;
    }

    public static void zadanie12() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wiek w sekundach:");
        double ageInSeconds = scan.nextDouble();

        System.out.println("Wybierz planetę:");
        System.out.println("1 - Merkury");
        System.out.println("2 - Wenus");
        System.out.println("3 - Ziemia");
        System.out.println("4 - Mars");
        System.out.println("5 - Jowisz");
        System.out.println("6 - Saturn");
        System.out.println("7 - Uran");
        System.out.println("8 - Neptun");
        int planetChoice = scan.nextInt();

        double ageInYears;
        switch (planetChoice) {
            case 1:
                ageInYears = ageInSeconds / (31557600 * 0.2408467);
                System.out.println("Wiek na Merkurym: " + ageInYears);
                break;
            case 2:
                ageInYears = ageInSeconds / (31557600 * 0.61519726);
                System.out.println("Wiek na Wenius: " + ageInYears);
                break;
            case 3:
                ageInYears = ageInSeconds / 31557600;
                System.out.println("Wiek na Ziemi: " + ageInYears);
                break;
            case 4:
                ageInYears = ageInSeconds / (31557600 * 1.8808158);
                System.out.println("Wiek na Marsie: " + ageInYears);
                break;
            case 5:
                ageInYears = ageInSeconds / (31557600 * 11.862615);
                System.out.println("Wiek na Jowiszu: " + ageInYears);
                break;
            case 6:
                ageInYears = ageInSeconds / (31557600 * 29.447498);
                System.out.println("Wiek na Saturnie: " + ageInYears);
                break;
            case 7:
                ageInYears = ageInSeconds / (31557600 * 84.016846);
                System.out.println("Wiek na Uranie: " + ageInYears);
                break;
            case 8:
                ageInYears = ageInSeconds / (31557600 * 164.79132);
                System.out.println("Wiek na Neptunie: " + ageInYears);
                break;
            default:
                System.out.println("Nieprawidłowy wybór planety.");
                break;
        }
    }

    public static int zadanie13(int[] tablica, int n) {
        if (n == 1) {
            return tablica[0];
        }
        int maks = zadanie13(tablica, n - 1);
        return Math.max(maks, tablica[n - 1]);
    }
}

