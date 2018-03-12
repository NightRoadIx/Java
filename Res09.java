import java.util.Scanner;

class Res09 {
	
	// ATRIBUTOS
	int numero;
	
	// METODOS
	public static void main(String args[]) {
		
		// Instanciar
		Res09 obj = new Res09();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese un numero entre 0 y 9999: ");
		obj.numero = s.nextInt();
		
		System.out.println("El numero " + obj.numero + " se divide en:");
		System.out.println(obj.obtener(obj.numero,1) + " unidades");
		System.out.println(obj.obtener(obj.numero,10) + " decenas");
		System.out.println(obj.obtener(obj.numero,100) + " centenas");
		System.out.println(obj.obtener(obj.numero,1000) + " millares");
		
	}
	
	public int obtener(int num, int uni) {
		return (num/uni)%10;
	}
	
}