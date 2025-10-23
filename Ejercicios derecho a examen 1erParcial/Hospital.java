import java.util.Scanner;
class Hospital{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);

		System.out.println("Las áreas que existen son: ");
		System.out.println("Ginecología cuenta con un presupuesto de 40%");
		System.out.println("Traumatologia cuenta con un presupuesto de 30%");
		System.out.println("Pediatria cuenta con un presupuesto de 30%");
		System.out.println("Escriba su presupuesto anual");
		double Pre=s.nextDouble();
		
		double preg=Pre*0.40;
		double pret=Pre*0.30;
		double prep=Pre*0.30;
		
		System.out.println("El presupuesto de la área de ginecología es de: $" + preg);
		System.out.println("El presupuesto de la área de traumatologia es de: $" + pret);
		System.out.println("El presupuesto de la área de pediatria es de: $" + prep);
	}
}


