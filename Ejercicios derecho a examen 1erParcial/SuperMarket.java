import java.util.Scanner;
class SuperMarket{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		Double Descuento=0.0, Montof=0.0;

		System.out.println("Escrba su monto a pagar");
		double Monto=s.nextDouble();
		System.out.println("¡Felicidades! Haz ganado un descuento");
		System.out.println("Escoga un numero del 0 al  Infinito");
		int Num=s.nextInt();
		if (Num>=74)
		{
			Descuento=Monto*0.20;
			Montof=Monto-Descuento;
			System.out.println("Obtuviste un descuento del 20%");
			System.out.println("Ahora, tu monto a pagar será de: $" + Montof);
		}
		else
		{
			Descuento=Monto*0.15;
			Montof=Monto-Descuento;
			System.out.println("Obtuviste un descuento del 15%");
			System.out.println("Ahora, tu monto a pagar será de: $" + Montof);
		}
	}
}
