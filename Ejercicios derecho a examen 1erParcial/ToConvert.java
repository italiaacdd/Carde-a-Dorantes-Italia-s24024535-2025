import java.util.Scanner;
public class ToConvert{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Double pies=3.2808399, pulgadas=39.3700787;
		double metros=0;

		System.out.println("Escriba los metros que quiere convertir a pies y pulgadas:");	
		metros =sc.nextDouble();
		pies=(metros*pies);
		pulgadas=(metros*pulgadas);
		System.out.println("Sus metros convertidos son: ");
		System.out.print("En pies: " +pies);
		System.out.print("En pulgadas: " +pulgadas);
	}
}