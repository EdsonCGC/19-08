public class ExcepNoCaptura{
    public static void main(String[] args) {
    int a = 0;
    int b = 10/a;

    try{
        a = 0;
        b = 10/0; //Aqui ocurre la excepcion
        System.out.println("Esta linea ya no se lee");
    
    }catch(ArithmeticException e){
    System.out.println("Error aritmetico ");

        }
    System.out.println("Aqui continua el programa despues de la gestion de excepcion");
    }
}