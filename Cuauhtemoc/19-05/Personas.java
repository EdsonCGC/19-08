import java.util.Date;

public class Personas {
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private Date fechaNacimineto; 
    
    //Metodo Constructor, che niño pendejo
    public Personas(String Nombre, String ApellidoPaterno, String ApellidoMaterno, Date fechaNacimiento){
        this.Nombre = Nombre;
        this.fechaNacimineto = fechaNacimiento;
        this.ApellidoMaterno = ApellidoMaterno;
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }
    
    
}
