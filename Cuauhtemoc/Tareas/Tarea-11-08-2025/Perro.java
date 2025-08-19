public class Perro extends Animal{

    private String ladrido = "woof";
    private double peso;

   public Perro(String nombre, String raza, String color, double peso) {
    super(nombre, raza, color);
    this.peso = peso;
   }

   public Perro(String nombre, String raza, double peso, String ladrido, String color) {
    super(nombre, raza, color);
    this.peso = peso;
    this.ladrido = ladrido;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getLadrido() {
        return ladrido;
    }
    
    public void ladrido(){
        System.out.println(ladrido);
    }

    
}
