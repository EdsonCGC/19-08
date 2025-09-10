public class Xd{
public static void main(String[] args) {
    int a;
    int [] b;
    int c = args.length;

    try {
     a = 10/c;
     System.out.println("El valor de a: " + a);   
     b = new int[5];
     for(int i=0; i<a; i++){
        b[i]=i;
        System.out.println("/t" + i);
         }
    } 
     catch(ArithmeticException e){
        System.out.println("No se puede dividir en 0");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Se ha salido de los parametros");
    }
}
}