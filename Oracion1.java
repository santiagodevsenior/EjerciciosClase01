import java.util.Scanner;

public class Oracion1 {
    public static void main(String[] args) {
        
            
    var entrada = new Scanner (System.in);
    
    System.out.print("Ingrese la primera palabra: ");
    var palabra1  = entrada.next( );
    System.out.print("Ingrese la segunda palabra: ");
    var palabra2  = entrada.next( );
    System.out.print("Ingrese la tercera palabra: ");
    var palabra3  = entrada.next( );

    System.out.println(palabra1 + " " + palabra2 + " " + palabra3);


    entrada.close();
    }
}
