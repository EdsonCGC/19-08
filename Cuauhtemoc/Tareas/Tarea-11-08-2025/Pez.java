public class Pez extends Animal{

    private String TipoAgua;
    
    public Pez(String nombre, String raza, String color, String TipoAgua) {
        super(nombre, raza, color);
        this.TipoAgua = TipoAgua;
    }

    public String getTipoAgua() {
        return TipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        TipoAgua = tipoAgua;
    }

    
    
}
