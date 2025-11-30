import java.util.Scanner;
class Names{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		char continuar ='s';
		do{
			System.out.println("Escribe el primer nombre:");
			String nom1=sc.nextLine();
			System.out.println("Escribe el segundo nombre:");
			String nom2=sc.nextLine();
			System.out.println("Escribe el tercer nombre:");
			String nom3=sc.nextLine();
			System.out.println("Escribe el cuarto nombre:");
			String nom4=sc.nextLine();
			System.out.println("Escribe el quinto nombre:");
			String nom5=sc.nextLine();
			System.out.println("Escribe el sexto nombre:");
			String nom6=sc.nextLine();
			System.out.println("Escribe el séptimo nombre:");
			String nom7=sc.nextLine();
			System.out.println("Escribe el octavo nombre:");
			String nom8=sc.nextLine();
			System.out.println("Escribe el noveno nombre:");
			String nom9=sc.nextLine();
			System.out.println("Escribe el décimo nombre:");
			String nom10=sc.nextLine();
			System.out.println("Los 10 nombres que escribiste, fueron: ");
			System.out.print(nom1 +",");
			System.out.print(nom2 +",");
			System.out.print(nom3 +",");
			System.out.print(nom4 +",");
			System.out.print(nom5 +",");
			System.out.print(nom6 +",");
			System.out.print(nom7 +",");
			System.out.print(nom8 +",");
			System.out.print(nom9 +",");
			System.out.println(nom10);
			System.out.print(" ");


			System.out.println("¿Quieres cambiar de nombres? (solo responde S si sí, N si no.");
			continuar=sc.nextLine().charAt(0);
		}while(continuar=='s' || continuar=='S');
		System.out.println("Fin");
	sc.close();
	}
}

