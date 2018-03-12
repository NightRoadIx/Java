import java.util.Scanner;
public class Res04 {

    public static void main(String[] args)
    {
		int A;		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n Ingresa un numero: ");
		A = s.nextInt();
		System.out.println("El doble del numero es: " + (A*2));
		System.out.println("El triple del numero es: " + (A*3));
    }
    
}