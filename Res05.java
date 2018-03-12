import java.util.Scanner;
class Res05 {
	public static void main(String[] args) 
    {
		double C;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese la temperatura en Celsius: ");
		C = s.nextFloat();
		
		System.out.println("La temperatura " + C + "Celsius es " + (32 + (9 * C/5)) + " Fahrenheit");
		   
    }
    
}