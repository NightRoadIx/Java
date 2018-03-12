import java.util.Scanner;

class Res07
{
	public static void main(String args[]) {
		int mes=0;
		Scanner s = new Scanner (System.in);
		
		System.out.print("Ingrese el número de mes [1-Enero, 12-Diciembre]: ");
		mes = s.nextInt();
		
		// Seleccionar la estación del año
		switch(mes) {
			case 12:
			case 1:
			case 2:
				System.out.println(" Es invierno ");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(" Es primavera ");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(" Es verano ");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(" Es otoño ");
				break;				
		}
	}
}