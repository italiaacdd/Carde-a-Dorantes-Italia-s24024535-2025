import java.util.Scanner;
public class GenderPercentage{
	public static void main(String args[]){
        	Scanner scanner = new Scanner(System.in);

 		System.out.print("Ingrese el número total de estudiantes: ");
        	int totalEstudiantes = scanner.nextInt();
        	System.out.print("Ingrese el número de hombres: ");
        	int numeroHombres = scanner.nextInt();
        	int numeroMujeres = totalEstudiantes - numeroHombres;

        	double porcentajeHombres = (double) numeroHombres / totalEstudiantes * 100;
        	double porcentajeMujeres = (double) numeroMujeres / totalEstudiantes * 100;
        	System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        	System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
	}
}