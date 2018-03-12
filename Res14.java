import java.util.Scanner;

class Res14 {
	
	public static void main(String[] args) {
		
		int A, B;
		
		Res14 obj = new Res14();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingresar 2 numeros para calcular el maximo comun divisor");
		System.out.print("Ingresar numero A: ");
		A = s.nextInt();
		System.out.print("Ingresar numero B: ");
		B = s.nextInt();
		
		System.out.println("El maximo comun divisor es: " + obj.sacar_mcd(A,B));
		
	}
	
    int sacar_mcd(int a, int b) {
        if(b==0)
            return a;
        else
            return sacar_mcd(b, a % b);
    }
	
}