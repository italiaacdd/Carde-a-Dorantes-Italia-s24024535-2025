import java.util.Scanner;
class MoneyWithdrawal{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		double balance=5000, amount=0;
		char eleccion='s';
		do{
			System.out.println("Bienvenido a la sección de retiro de dinero. Por favor ingrese su tarjeta");				
			System.out.println("¿Cuánto desea retirar?");	
			amount=sc.nextDouble();
			if(amount>5000){
				System.out.println("Saldo insuficiente.");}
			System.out.println("La cantidad que retiró fue de: " +amount);
			System.out.println("¿Desea retirar otra cantidad?");
			eleccion=sc.next().charAt(0);		

		}while(eleccion=='S' || eleccion=='s');

	}
}