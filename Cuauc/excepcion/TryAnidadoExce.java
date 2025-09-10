public class TryAnidadoExce {
    public static void main(String[] args) {
        try {
            int c = args.length;
            int a = 10/c;
            System.out.println("Valor de a: "+a);

        try{
        if (c==1)
        a = a/(c-1);
        if (c==2){
        int []
        b = {100,5};
        b [3] = 0;
        }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Segunda excepcion, indice fuera del limite" +e);
    }catch(Exception e){
        System.out.println("Ta mal"+" Excepcion generica"+e);
    }
        }catch(ArithmeticException e){
        System.out.println("Primera excepcion No se puede dividir entre 0"+e);
}
}
}