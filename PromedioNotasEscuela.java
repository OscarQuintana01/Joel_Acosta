//Tarea//			//COPILAR SIEMPRE//
import java.util.Scanner;
public class PromedioNotasEscuela{
	public static void main(String [] args) {
	float numUno, numDos, numTres, proNotas;
	Scanner entrada= new Scanner(System.in);

	System.out.println("INGRESE LA PRIMERA NOTA");
	numUno=entrada.nextFloat();

	System.out.println("INGRESE LA SEGUNDA NOTA");
	numDos=entrada.nextFloat();

	System.out.println("INGRESE LA TERCERA NOTA");
	numTres=entrada.nextFloat();

	proNotas= (numUno + numDos + numTres)/3;
	System.out.println("El promedio de las tres notas es: " + proNotas);
	
	if (proNotas>= 0 && proNotas<= 4) {
	System.out.println("Su promedio es" + proNotas);
	System.out.println("¡Perdio el año!");

}	else  if (proNotas>=4.01 && proNotas<=7){
	   System.out.println("Su promedio es " + proNotas);	
	System.out.println("Usted esta suspenso");    
 }	else if(proNotas>= 7 && proNotas <=10){
	 System.out.println("Su promedio es " + proNotas);	
	System.out.println("¡Pasa el año!");    
	
		}
	
	}
}