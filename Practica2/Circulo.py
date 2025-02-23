import math
class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")

    def __str__(self):
        return f"Circulo(Centro: {self.centro}, Radio: {self.radio})"

if __name__ == "__main__":
    p1 = Punto(2, 3)
    p2 = Punto(5, 7)
    
    linea = Linea(p1, p2)
    print(linea)
    linea.dibujaLinea()

    circulo = Circulo(p1, 4.5)
    print(circulo)
    circulo.dibujaCirculo()
