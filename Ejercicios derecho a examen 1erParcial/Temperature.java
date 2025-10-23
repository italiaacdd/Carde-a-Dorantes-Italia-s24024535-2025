import java.util.Scanner;
class Temperature{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		Double Fahrenheit= 0.0, C= 0.0, TemperaturaA= 0.0;

		System.out.println("Escriba los grados centígrados:");	
		C =sc.nextDouble();
		Fahrenheit=((C*9/5) + 32);
		TemperaturaA=(273.15-C);

		System.out.println("El cambio de grados centígrados es de: ");
		System.out.print("En Fahrenheit: " +Fahrenheit);
		System.out.print("En Temperatura Absoluta: " + TemperaturaA);
	}
}