import java.util.Scanner;
class NewSalary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Double SalarioAnterior=0.0, SalarioNuevo=0.0, Incremento=0.0;	
		
		System.out.println("Escriba su salario anterior: ");	
		SalarioAnterior=sc.nextDouble();

		Incremento=(SalarioAnterior*0.25);
		SalarioNuevo=(Incremento +SalarioAnterior);
		System.out.println("El incremento es de: " +Incremento);
		System.out.println("Su nuevo salario con incremento incluido es de: " +SalarioNuevo);
	}
}