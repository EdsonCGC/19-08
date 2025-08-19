public class AnimalTest {
    public static void main(String[] args) {
    Perro perrodorro1 = new Perro("Max", "Labrador", "verde" , 25.);
    Perro perrodorro2 = new Perro("Luna", "Poodle", 8.2, "guau", "azul");
    
        System.out.println("Nombre del perro 1: " + perrodorro1.getNombre());
        System.out.println("Raza del perro 1: " +  perrodorro1.getRaza());
        System.out.println("Ladrido: ");
        perrodorro1.ladrido();
        System.out.println("Peso del perro 1: " + perrodorro1.getPeso());
        System.out.println("=============================================");
        System.out.println("Nombre del perro 2: " + perrodorro2.getNombre());
        System.out.println("Raza del perro 2: " + perrodorro2.getRaza());
        System.out.println("Ladrido 2: " + perrodorro2.getLadrido());
        System.out.println("Peso del perro 2: " + perrodorro2.getPeso());

    Pez pez1 = new Pez("Nemo", "Pez de colores","azul","Dulce");
    Pez pez2 = new Pez("Goliat", "Pez de col", "verde", "Salado");
   
        System.out.println("Nombre del pez 1: " + pez1.getNombre());
        System.out.println("Raza del pez 1: " + pez1.getRaza());
        System.out.println("Color del pez 1: " + pez1.getColor());
        System.out.println("Tipo de agua del pez 1: " + pez1.getTipoAgua());
        System.out.println("=============================================");
        System.out.println("Nombre del pez 2: " + pez2.getNombre());
        System.out.println("Raza del pez 1: " + pez2.getRaza());
        System.out.println("Color del pez 1: " + pez2.getColor());
        System.out.println("Tipo de agua del pez 1: " + pez2.getTipoAgua());
        
        System.out.println("Cambiar ladrido del perro 2: ");
        perrodorro2.ladrido();
    }
        }
        
