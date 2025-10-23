import java.util.Scanner;
class Student{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Double Materia1=0.0, Materia2=0.0, Materia3=0.0, Promedio=0.0;

		System.out.println("Escribe la calificación de la primera materia difícil:");
		Materia1=sc.nextDouble();
		System.out.println("Escribe la calificación de la segunda materia mas difícil:");
		Materia2=sc.nextDouble();
		System.out.println("Escribe la calificación de la tercera materia mas difícil:");
		Materia3=sc.nextDouble();

		Promedio=(Materia1 +Materia2 +Materia3)/3;

		System.out.println("Tu promedio final es de: " +Promedio);
	}
}