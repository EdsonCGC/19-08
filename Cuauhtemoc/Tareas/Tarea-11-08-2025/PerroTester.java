public class PerroTester {
    public static void main(String[] args) {
        // Crear objetos mediante constructores
        Perro perro1 = new Perro("Max", "Labrador", "verde" , 25.);
        Perro perro2 = new Perro("Luna", "Poodle", 8.2, "guau", "azul");

        System.out.println("Nombre del perro 1: " + perro1.getNombre());
        System.out.println("Raza del perro 1: " +  perro1.getRaza());
        System.out.println("Ladrido: ");
        perro1.ladrido();
        System.out.println("Peso del perro 1: " + perro1.getPeso());
        System.out.println("=============================================");

        System.out.println("Nombre del perro 2: " + perro2.getNombre());
        System.out.println("Raza del perro 2: " + perro2.getRaza());
        System.out.println("Ladrido 2: " + perro2.getLadrido());
        System.out.println("Peso del perro 2: " + perro2.getPeso());

}
}