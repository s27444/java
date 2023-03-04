import java.util.Scanner;

import static java.lang.Long.reverse;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj Adrianie!");
//        zadanie1();
//        zadanie1_v2();
//        zadanie2();
//        zadanie3();
//        zadanie4();
//        zadanie5();
//        zadanie6();
        zadanie7();
    }

    public static void zadanie1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a prostokąta: ");
        int a = scan.nextInt();
        System.out.println("Podaj bok b prostokąta: ");
        int b = scan.nextInt();
        System.out.println("Rozwiązanie zadania1: " + a*b);
    }
    public static void zadanie1_v2(){
        int a = 2;
        int b = 2;
        System.out.println("Rozwiązanie zadania1 z podanymi już danymi: " + a*b);
    }

    public static void zadanie2() {
        double pierwiastek = sqrt(PI);
        System.out.println("Rozwiązanie zadania2: "+String.format("%.2f", pierwiastek));
    }

    public static void zadanie3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz ciąg znaków");
        String napis = scan.nextLine();

    }


    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a trójkąta: ");
        int a = scan.nextInt();
        System.out.println("Podaj bok b trójkąta: ");
        int b = scan.nextInt();
        System.out.println("Podaj bok c trójkąta: ");
        int c = scan.nextInt();
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Rozwiązanie zadania4: Błąd");
        }else{
            if(a+b>c && a+c>b && b+c>a){
                System.out.println("Rozwiązanie zadania4: Tak");
            }else{
                System.out.println("Rozwiązanie zadania4: Nie");
            }
        }
    }

    public static void zadanie5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz liczbę z zakresu od 1-12 aby zobaczyć jaki to miesiąc i ile ma on dni: ");
        int x = scan.nextInt();
        switch(x) {
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

    public static void zadanie6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scan.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = scan.nextInt();
        if(a > b && b > c){
            System.out.println(c+" "+b+" "+a);
            System.out.println(a+" "+b+" "+c);
        }
        if(a > b && c > b && a > c){
            System.out.println(b+" "+c+" "+a);
            System.out.println(a+" "+c+" "+b);
        }
        if(b > a && a > c){
            System.out.println(c+" "+a+" "+b);
            System.out.println(b+" "+a+" "+c);
        }
        if(b > a && c > a && b > c){
            System.out.println(a+" "+c+" "+b);
            System.out.println(b+" "+c+" "+a);
        }
        if(c > a && a > b){
            System.out.println(b+" "+a+" "+c);
            System.out.println(c+" "+a+" "+b);
        }
        if(c > a && b > a && c > b){
            System.out.println(a+" "+b+" "+c);
            System.out.println(c+" "+b+" "+a);
        }

    }
    public static void zadanie7(){
        
    }

}