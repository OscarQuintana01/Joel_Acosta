//Este programa permite hacer un pormedio de notas, mi nombre es Oscar Joel Quintana Acosta, cualquier duda llameme al 0987654321//

import java.util.Scanner;
public class PromQuim{
	public static void main(String [] args) {
		float numUno, numDos, promNotas;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese la primera nota");
		numUno=entrada.nextFloat();
	        System.out.println("Ingrese la segunda nota");	
		numDos=entrada.nextFloat();
		promNotas= (numUno+numDos)/2;
		
		if (promNotas>=5) {
			System.out.println("Su promedio es :  "  + promNotas);
			System.out.println("Usted pasa el año directamente");
		}		
		else if (promNotas<5){
			System.out.println("Su promedio es :" + promNotas);
			System.out.println("Usted esta suspenso");
		}
		
	}
}
