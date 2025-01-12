import java.util.Scanner;
public class PerimetroRec{
	public static void main (String [] args) {
	double base, altura, perimetro;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese el valor");
		base=entrada.nextDouble();
		System.out.println("Ingrese la altura");
		altura=entrada.nextDouble();
		perimetro= 2*(base+altura);	
		System.out.println("El perimetro es   : " + perimetro);	

	
	}
}