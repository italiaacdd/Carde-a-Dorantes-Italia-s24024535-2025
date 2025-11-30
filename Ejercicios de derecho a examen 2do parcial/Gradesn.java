import java.util.Scanner;
class Gradesn{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		float average=0;
		float[] grades=new float[6];
		int i;

		for(i=0;i<6;i++){
			System.out.println("Escribe la calificación del estudiante " +(i+1));
			grades[i]=sc.nextFloat();
			average+=grades[i]; 
		}
		average=average/6;
		System.out.println("En promedio, la calificación fue de: " +average);
		for(int j=0;j<6;j++){
			System.out.println("La calificación del estudiante " +(j+1) + " es de :" +grades[j]);
		}
	}
}