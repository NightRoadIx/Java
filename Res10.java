import java.util.Scanner;

class Horas {
	
	// ATRIBUTOS
	int H, M, S;
	
	// METODOS
	boolean comprobar(int hh, int mm, int ss) {
		if( ( (hh>=0)&&(hh<24) )&&( (mm>=0)&&(mm<60) )&&( (ss>=0)&&(ss<60) ) )
			return true;
		else
			return false;
	}
}

class Res10 {

	public static void main(String args[])	 {
		
		// Instancias
		Horas obj = new Horas();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese la hora: ");
		obj.H = s.nextInt();
		System.out.print("Ingrese el minunto: ");
		obj.M = s.nextInt();
		System.out.print("Ingrese el segundo: ");
		obj.S = s.nextInt();
		
		System.out.println("La hora es " + (obj.comprobar(obj.H,obj.M,obj.S) ? "CORRECTA" : "INCORRECTA") );
		
	}
	
}