import java.util.Scanner;
public class Res08 {

    public static void main(String[] args) 
    {
		int dd, mm, aa;
        Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese su fecha de nacimiento");
		System.out.print("Dia: ");
		dd = s.nextInt();
		System.out.print("Mes: ");
		mm = s.nextInt();
		System.out.print("Año: ");
		aa = s.nextInt();
		
		System.out.println("Su numero de la suerte es: " + (dd+mm+aa));
		
    }
    
    
}