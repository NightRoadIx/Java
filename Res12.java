import java.util.Scanner;

class Fibonacci {
	
	// ATRIBUTOS
	
	// METODOS
	// Resolvewr Fibonacci con recursividad
	long fibo(long numero) {
		// Los primeros dos numeros de la serie son 1's
		if(numero < 2)
			return numero;
		// sino entonces regresa la suma de los numeros previos
		return fibo(numero-2)+fibo(numero-1);
	}
}

class Res12 {
	
	public static void main(String args[]) {
		
		long num;
		
		//Instancias
		Fibonacci obj = new Fibonacci();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Que numero de la serie de Fibonacci deseas obtener: ");
		num = s.nextInt();
		
		System.out.println("El numero " + num + "de la serie Fibonacci es " + obj.fibo(num));
		
	}
	
}