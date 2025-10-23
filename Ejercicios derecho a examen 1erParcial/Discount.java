import java.util.Scanner;
	class Discount{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			Double Total=0.0, PrecioFinal=0.0;

			System.out.println("Escriba el total de su compra");
			Total=sc.nextDouble();
			PrecioFinal=(Total * (1 - 15.0 / 100));
			System.out.print("Su total con el 15% de descuento es de: "+PrecioFinal);
	}
}