import java.util.Scanner;
class MonthlyCapital{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		Double Capital=0.0, Ganancia=0.0, Total=0.0;

		System.out.println("Escriba la cantidad del Capital que depositó este mes:");
		Capital=sc.nextDouble();
		Ganancia=(Capital*0.02);
		Total=(Capital +Ganancia);
		System.out.println("Su total en este mes es de: " +Total);
		System.out.println("");
		System.out.println("Su ganancia en este mes es de: " +Ganancia);
	}
}