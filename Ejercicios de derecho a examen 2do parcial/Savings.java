import java.util.Scanner;
class Savings{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		double depositomensual=500, tasanual=0.09;
		int meses=11;
		
		System.out.println("Cada mes ahorraste $500, más el 9% de interés. ");
		for(int mes=0;mes<=meses;mes++){
			depositomensual+=500;
			depositomensual=depositomensual+(depositomensual*tasanual);
		}
		System.out.println("El total ahorrado fue " +depositomensual);
	}
}