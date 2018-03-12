import java.util.Scanner;

public class Res03 {

    public static void main(String[] args) 
    {
		int C;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingresar un numero entero (positivo o negativo): ");
		C = s.nextInt();
		
		System.out.println("El numero es: ");
		System.out.println( ((C>=0)? "ES POSITIVO +" : " ES NEGATIVO -") );
		System.out.println( (((C%2)==0)? "ES PAR" : "ES IMPAR") );
		System.out.println( (((C%5)==0)? "ES MULTIPLO DE 5" : "NO ES MULTIPLO DE 5") );
		System.out.println( (((C%10)==0)? "MULTIPLO DE 10" : "NO ES MULTIPLO DE 10") );
		System.out.println( ((C>=100)? "ES MAYOR QUE 100" : "ES MENOR QUE 100") );

    }
}