// Definicja interfejsu Movable
interface Movable {
    // Metody interfejsu - każda klasa implementująca ten interfejs musi je zaimplementować
    void moveUp(); // Przesuwa obiekt w górę o jedną jednostkę
    void moveDown(); // Przesuwa obiekt w dół o jedną jednostkę
    void moveLeft(); // Przesuwa obiekt w lewo o jedną jednostkę
    void moveRight(); // Przesuwa obiekt w prawo o jedną jednostkę
}

// Implementacja klasy MovablePoint, która implementuje interfejs Movable
class MovablePoint implements Movable {
    // Prywatne pola klasy - x i y reprezentują położenie punktu na płaszczyźnie
    private int x;
    private int y;

    // Konstruktor klasy, który ustawia początkowe położenie punktu
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metoda toString, która zwraca łańcuch znaków opisujący położenie punktu
    public String toString() {
        return String.format("MovablePoint at (%d, %d)", x, y);
    }

    // Implementacje metod interfejsu Movable
    // Każda metoda zmienia położenie punktu w zależności od kierunku ruchu
    @Override
    public void moveUp() {
        y--; // Przesuwa punkt w górę o jedną jednostkę
    }

    @Override
    public void moveDown() {
        y++; // Przesuwa punkt w dół o jedną jednostkę
    }

    @Override
    public void moveLeft() {
        x--; // Przesuwa punkt w lewo o jedną jednostkę
    }

    @Override
    public void moveRight() {
        x++; // Przesuwa punkt w prawo o jedną jednostkę
    }
}

// Implementacja klasy TestMovable, w której testujemy klasy Movable i MovablePoint
class TestMovable {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy MovablePoint i przypisujemy mu początkowe położenie (0, 0)
        MovablePoint point = new MovablePoint(0, 0);
        System.out.println(point); // Powinno wyświetlić "MovablePoint at (0, 0)"

        // Przesuwamy punkt w górę o jedną jednostkę i w prawo o jedną jednostkę
        point.moveUp();
        point.moveRight();

        // Wyświetlamy aktualne położenie punktu
        System.out.println(point); // Powinno wyświetlić "MovablePoint at (1, -1)"
    }
}
