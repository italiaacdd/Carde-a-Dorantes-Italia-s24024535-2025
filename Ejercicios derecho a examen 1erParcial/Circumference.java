import java.util.Scanner;
class Circumference{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		System.out.println ("Escriba el radio del circulo");
		double Radio=s.nextDouble();

		double Longitud= 2*3.1416*Radio;
		double Area= 3.1416*(Radio*Radio);

		System.out.println("La longitud del circulo es de: " +Longitud);
		System.out.println("El area del circulo es de: " +Area);
	}
}