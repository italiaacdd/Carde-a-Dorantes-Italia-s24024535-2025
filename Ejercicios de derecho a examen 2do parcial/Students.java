import java.util.Scanner;
class Students{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int[][] alumnos=new int[3][4];
		
		System.out.println("¿Cual es tu nivel en escala del 0-2");
		System.out.println("0.-Basico, 1.-Medio, 2.-Perfeccionamiento");
		
		for(int i=0;i<12;i++){
			System.out.println("Alumno" +(i+1));
			int nivel=sc.nextInt();
			alumnos[nivel][0]++;
		}
		
		System.out.println("Idioma:");
		System.out.println("0.- Inglés");
		System.out.println("1.- Francés");
		System.out.println("2.- Alemán");
		System.out.println("3.- Ruso");
	
		for(int i=0;i<12;i++){
			System.out.println("Alumno " +(i+1));
			int idioma=sc.nextInt();
			alumnos[0][idioma]++;
		}
		
		System.out.println("La Matriz es: ");
		for(int i=0;i<alumnos.length;i++){
			for(int j=0;j<alumnos.length;j++){
				System.out.print(alumnos[i][j] +"  ");
			}
			System.out.println("");
		}

	sc.close();

		
	}
}