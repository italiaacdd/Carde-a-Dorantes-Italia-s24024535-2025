import java.util.Scanner;
class Grades{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		float grade=0, average=0;
		int approved=0, failed=0;

		System.out.println("Escriba la calificación de 5 alumnos:");
			for(int i=1;i<=5;i++){
				System.out.println("Escribaa calificación del alumno " +i + " fue de: ");
				grade=sc.nextFloat();
		
				if(grade<6.0)
					failed++;
				else
					approved++;
				average+=grade;
			}
			average=(average/5);
			System.out.println("El promedio del grupo es: " +average);
			System.out.println("El número de aprobados es de: " +approved);
			System.out.println("El número de reprobados es de: "+failed);
		sc.close();
	}
}

