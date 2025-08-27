import java.util.Date;
import java.util.Scanner;

public class Estudiante extends Personas{

    private int Id;
    private String Calificaciones;
    private String Carrera;

    //Otro metodo constructor, idiota
    public Estudiante(String Nombre, String ApellidoPaterno, String ApellidoMaterno, Date fechaNacimiento, int Id, String Calificaciones, String Carrera) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, fechaNacimiento);
        this.Id = Id;
        this.Calificaciones = Calificaciones;
        this.Carrera = Carrera;
    }


    public int getId() {
        return Id;
    }
    public String getCalificaciones() {
        return Calificaciones;
    }

    public void setCalificaciones(String Calificaciones) {
        this.Calificaciones = Calificaciones;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String CalcularCalificaciones(){
    return (getCalificaciones());
    }
    

    //Metoco lector para multiples calificaciones
    public void ingresarCalificacionConScanner() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Ingreso de Calificaciones ===");
        System.out.print("¿Cuántas calificaciones desea ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        StringBuilder calificacionesBuilder = new StringBuilder();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la calificación " + i + " (A, B+, B, B-, C+, C, C-, D, F): ");
            String calificacion = scanner.nextLine().toUpperCase();
            
            if (!convertirCalificacionANumero(calificacion).equals("Invalida")) {
                calificacionesBuilder.append(calificacion);
                if (i < cantidad) {
                    calificacionesBuilder.append(", ");
                }
            } else {
                System.out.println("Calificación inválida, intente de nuevo.");
                i--; // Repetir esta iteración
            }
        }
        
        this.Calificaciones = calificacionesBuilder.toString();
        
        double promedio = calcularPromedioCalificaciones();
        System.out.println("Promedio de calificaciones: " + String.format("%.2f", promedio));
        
        //scanner.close();
    }
    
    public String convertirCalificacionANumero(String calificacionLetra) {
        String[] calificacionesLetras = {"A", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
        String[] calificacionesNumeros = {"4", "3.67", "3.33", "3", "2.67", "2.33", "2", "1", "0"};
        
        for (int i = 0; i < calificacionesLetras.length; i++) {
            if (calificacionLetra.equals(calificacionesLetras[i])) {
                return calificacionesNumeros[i];
            }
        }
        return "Invalida";
    }

   
    //Metodo funcional, para calcular el promedio
    public double calcularPromedioCalificaciones() {      
        //Agarra las calificaiones de la matriz de arribita
        String[] calificacionesArray = Calificaciones.split(",");
        double suma = 0.0;
        int contador = 0;
        //En que los tranforma

        for (String cal : calificacionesArray) {
            cal = cal.trim();

            //El double es para pasar las calificaciones "10.0" a 10.0 (Lo trasnforma a double) 
            double valor = Double.parseDouble(convertirCalificacionANumero(cal));
            suma += valor;
            contador++;
        }
        //operacion
        return contador > 0 ? suma / contador : 0.0;
    }
    
    //Permite que el metodo lector acumule varias calificaciones sin tener un "tapon"
    public void ingresarMultiplesCalificaciones() {
        ingresarCalificacionConScanner();
    }
    
}
