import java.util.Scanner;
class Age{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("Escribe tu año de nacimiento");
		int Año=sc.nextInt(),
		Edad=(2025-Año);
		System.out.println("Tu edad es: " +Edad);
	}
}