public class Triangulo extends Figuras{
    private double base;
    private double altura;
    private double lado;

    public Triangulo (double area, double perimetro, double base, double altura, double lado){
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularAreaTri(){
        return (this.base * this.altura) / 2;
        }

    public double calcularPerimetroTri(){
        return this.lado * 3 ;
        } 
}
