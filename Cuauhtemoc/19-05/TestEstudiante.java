import java.util.Date;
import java.util.Scanner;

public class TestEstudiante {
    
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Sistema de Registro de Estudiantes ===");
        
        // Ingresar datos del estudiante
        System.out.print("Ingrese el ID del estudiante: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el apellido paterno: ");
        String apellidoPaterno = sc.nextLine();
        
        System.out.print("Ingrese el apellido materno: ");
        String apellidoMaterno = sc.nextLine();
        
        System.out.print("Ingrese la carrera: ");
        String carrera = sc.nextLine();
        
        // Crear estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(
            nombre, 
            apellidoPaterno, 
            apellidoMaterno, 
            new Date(), 
            id, 
            "", 
            carrera
        );
        
        // Usar el método Scanner para ingresar calificación
        estudiante.ingresarCalificacionConScanner();
        
        // Mostrar datos del estudiante
        System.out.println("\n=== Datos del Estudiante Registrado ===");
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Calificación: " + estudiante.calcularPromedioCalificaciones());

    
        System.out.println("Quieres cambiar carrera?: (SI:1 NO:Otro numero)");
        int decision = sc.nextInt();
        if(decision ==1){
        System.out.println("Escribe tu nueva carrera");
        sc.nextLine();
        String cambioCarrera = sc.nextLine();
        System.out.println("Carrera cambiada exitosamente a: " + cambioCarrera);
        }else{
           System.out.println("Suerte en tu Carrera");
        }

        
    
    }
     
    
}
