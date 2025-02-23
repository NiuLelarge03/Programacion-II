public class Punto {
    public int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}