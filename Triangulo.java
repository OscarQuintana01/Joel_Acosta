import 	java.util.Scanner;
public class Triangulo{
	public static void main(String [] args) {
	int base, altura;
	double area;
		String nomb="";
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese la base");
		base=entrada.nextInt();
		System.out.println("Ingrese la altura");
		altura=entrada.nextInt();
                area= (base*altura)/2;
		System.out.println("El area del triangulo es:" + area);
		
	}
}