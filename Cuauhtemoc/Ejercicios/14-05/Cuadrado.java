public class Cuadrado extends Figuras {
    
    private double lado;

    public Cuadrado(double area, double perimetro, double lado) {
        super(area, perimetro);
        this.lado = lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularAreaCua(){
        return this.lado * this.lado;
        }
    
    public double calcularPerimetroCua(){
        return this.lado * 4;
        }
}
