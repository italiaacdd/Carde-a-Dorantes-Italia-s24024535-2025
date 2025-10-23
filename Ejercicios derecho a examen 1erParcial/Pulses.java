import java.util.Scanner;
class Pulses{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println ("Escriba su edad");
		double Edad=sc.nextDouble(), pulses=0;
		pulses=(220-Edad)/10;
		System.out.println("Sus pulsaciones son de: " +pulses);
	}
}
