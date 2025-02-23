class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto c, float r) {
        this.centro = c;
        this.radio = r;
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro en " + centro + " y radio " + radio);
    }

    @Override
    public String toString() {
        return "Circulo(Centro: " + centro + ", Radio: " + radio + ")";
    }
}

class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(5, 7);

        Linea linea = new Linea(p1, p2);
        System.out.println(linea);
        linea.dibujaLinea();

        Circulo circulo = new Circulo(p1, 4.5f);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
