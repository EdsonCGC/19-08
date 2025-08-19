public class FigurasTester{
    public static void main(String[] args) {
        Triangulo Tri = new Triangulo(0, 0, 4, 5, 4);
        System.out.println("El área del triángulo es: " + Tri.calcularAreaTri());
        System.out.println("EL perímetro del triángulo es: " + Tri.calcularPerimetroTri());

        Cuadrado Cua = new Cuadrado(0,0, 10);
        System.out.println("El área del cuadrado es: " + Cua.calcularAreaCua());
        System.out.println("El perímetro del cuadrado es: " + Cua.calcularPerimetroCua());

        Circulo Cir = new Circulo(0, 0, 12);
        System.out.println("El área del círculo es: " + Cir.calcularAreaCir());
        System.out.println("El perímetro del círculo es: " + Cir.calcularPerimetroCir());
}
}