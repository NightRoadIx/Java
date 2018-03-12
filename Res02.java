import java.util.Scanner;

public class Res02 {
    public static void main(String[] args)
    {
		// Variables
		int A;
		
		// Se instancia un objeto Scanner
		Scanner s = new Scanner(System.in);
		
		// Aceptar el número
		System.out.println("Ingrese un numero: ");
		A = s.nextInt();
		
		// Mostrar la respuesta
		System.out.println("El numero es: " + (((A%2)==0) ? "Par" : "Impar") );
       
    }
}