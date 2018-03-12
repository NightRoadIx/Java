import java.util.Scanner;

class Estaciona {
	
	// ATRIBUTOS
	private int tiempo;		// Atributo del tipo privado
	
	// METODOS
	// Getters
	public int gettiempo() {
		return tiempo;
	}
	// Setters
	public void settiempo(int tt) {
		this.tiempo = tt;
	}
	
	// Calculo del tiempo
	double calculo() {
		
		// La variable "tiempo" puede utilizarse dentro de la clase Estaciona
		
		//Si se estaciona solo hasta 3 horas
		if(tiempo <= 3)
			return 2.0;
		// Máximo de 24 horas
		else if(tiempo == 24)
			return 10.0;
		// Tiempo entre 3 y 24 horas
		else if((tiempo > 3)&&(tiempo < 24))
			return (2.0 + ((tiempo-3.0)*0.50));
		else	// En caso de que el tiempo no sea el correcto
			return 0;
	}
	
}

class Res15 {
	public static void main(String args[]) {
		
		int time=0;
		
		Estaciona obj = new Estaciona();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese el numero de horas en estacionamiento: ");
		time = s.nextInt();
		
		// Hacer la asiganción mediante el setter
		obj.settiempo(time);
		
		// Obtener el valor de la variable privada mediante el getter
		System.out.println("\n" + obj.gettiempo() + " horas es $" + obj.calculo());
		
	}
}