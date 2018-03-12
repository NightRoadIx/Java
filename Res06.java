import java.util.Scanner;

public class Res06 {

	public static void main(String[] args) 
    {
		double a, b, c;
		Scanner s = new Scanner (System.in);
		
		System.out.println("Ingrese el valor a: ");
		a = s.nextDouble();
		System.out.println("Ingrese el valor b: ");
		b = s.nextDouble();
		System.out.println("Ingrese el valor c: ");
		c = s.nextDouble();
		
		// Determinar si es un triángulo
		if( ((a+b)>c)&&((a+c)>b)&&((b+c)>a) )
		{
			// si es así se calcula su área
			System.out.println("Si es un triangulo");
			System.out.println("Perimetro: " + (a+b+c));
			System.out.println("Area: " + Math.sqrt( (a+b-c)*(a-b+c)*(-a+b+c)*(a+b+c) ) );
		}
		else
			System.out.println("No es un triangulo");
    } 
}