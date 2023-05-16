import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
}

class Ebook extends Ksiazka {
    private int rozmiar;
    private String format;

    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

class KsiazkaPapierowa extends Ksiazka {
    private int rokWydania;

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania) {
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}

public class Zadanie_5_04 {
    public static void main(String[] args) {
        List<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ksiazka("Czy androidy marzą o elektrycznych owcach", "Philip K. Dick", 244));
        ksiazki.add(new Ksiazka("Mistrz i Małgorzata", "Michaił Bułhakow", 480));

        List<KsiazkaPapierowa> ksiazkiPapierowe = new ArrayList<>();
        ksiazkiPapierowe.add(new KsiazkaPapierowa("Solaris", "Stanisław Lem", 320, 1961));
        ksiazkiPapierowe.add(new KsiazkaPapierowa("Władca pierścieni", "J.R.R. Tolkien", 1000, 1954));

        List<Ebook> ebooki = new ArrayList<>();
        ebooki.add(new Ebook("Mały Książę", "Antoine de Saint-Exupéry", 100, 50, "pdf"));
        ebooki.add(new Ebook("Podróże Guliwera", "Jonathan Swift", 320, 120, "epub"));    ksiazki.sort(Comparator.comparing(Ksiazka::getTytul));

        System.out.println("\n\u001B[4m" + "Lista książek posortowana po tytule:" + "\u001B[0m");
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka.getTytul() + " - " + ksiazka.getAutor());
        }

        Collections.sort(ebooki, new Comparator<Ebook>() {
            @Override
            public int compare(Ebook ebook1, Ebook ebook2) {
                return ebook1.getTytul().compareTo(ebook2.getTytul());
            }
        });

        System.out.println("\n\u001B[4m" + "Lista ebooków posortowana po tytule:" + "\u001B[0m");
        for (Ebook ebook : ebooki) {
            System.out.println(ebook.getTytul() + " - " + ebook.getAutor());
        }

        Collections.sort(ksiazkiPapierowe, new Comparator<KsiazkaPapierowa>() {
            @Override
            public int compare(KsiazkaPapierowa ksiazka1, KsiazkaPapierowa ksiazka2) {
                return ksiazka1.getTytul().compareTo(ksiazka2.getTytul());
            }
        });

        System.out.println("\n\u001B[4m" + "Lista książek papierowych posortowana po tytule:" + "\u001B[0m");
        for (KsiazkaPapierowa ksiazkaPapierowa : ksiazkiPapierowe) {
            System.out.println(ksiazkaPapierowa.getTytul() + " - " + ksiazkaPapierowa.getAutor());
        }

        ksiazkiPapierowe.sort(Comparator.comparing(KsiazkaPapierowa::getRokWydania));

        System.out.println("\n\u001B[4m" + "Lista książek papierowych posortowana po roku wydania:" + "\u001B[0m");
        for (KsiazkaPapierowa ksiazkaPapierowa : ksiazkiPapierowe) {
            System.out.println(ksiazkaPapierowa.getTytul() + " - " + ksiazkaPapierowa.getAutor() + ", rok wydania: " + ksiazkaPapierowa.getRokWydania());
        }

        ksiazkiPapierowe.sort(Comparator.comparing(Ksiazka::getLiczbaStron));

        System.out.println("\n\u001B[4m" + "Lista książek papierowych posortowana według liczby stron:" + "\u001B[0m");
        for (Ksiazka ksiazka : ksiazkiPapierowe) {
            System.out.println(ksiazka.getTytul() + " - " + ksiazka.getAutor() + ", liczba stron: " + ksiazka.getLiczbaStron());
        }
    }
}