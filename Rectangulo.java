import java.util.Scanner;
public class Rectangulo{	
	public static void main (String [] args) {
		int base, altura, area;
		String nomb="";
			Scanner entrada= new Scanner(System.in);
			System.out.println("Hola bienvenidos a calculo del área Rectangulo");
			System.out.println("Ingresa tu nombre");
			nomb=entrada.nextLine();
			System.out.println("Ingrese la base");
			base=entrada.nextInt();
			System.out.println("Ingrese la altura");
			altura=entrada.nextInt();
			area= base*altura;		
			System.out.println("El area del rectangulo es:" + area);
				
	}
}