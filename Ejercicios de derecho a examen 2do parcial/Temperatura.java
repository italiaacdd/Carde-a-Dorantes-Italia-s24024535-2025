import java.util.Scanner;
public class Temperatura{
    public static void main(String args[] ) {
    Scanner sc = new Scanner(System.in);

        	System.out.print("Escriba sus 4 países: ");
        	int cantidad = sc.nextInt();
       		sc.nextLine(); 

        	String[] paises = new String[cantidad];
        	double[][] temperaturas = new double[cantidad][4];
        	double[] promedio = new double[cantidad];

        	System.out.println("\nRegistro de países");
        	for (int i = 0; i < cantidad; i++) {
            		System.out.print("Nombre del país " + (i + 1) + ": ");
            		paises[i] = sc.nextLine();

            		double suma = 0;
            		for (int mes = 0; mes < 4; mes++) {
                		System.out.print("  Temperatura mes " + (mes + 1) + ": ");
                		temperaturas[i][mes] = sc.nextDouble();
                		suma += temperaturas[i][mes];
            		}
            		promedio[i] = suma / 4.0;
            		sc.nextLine();
            		System.out.println();
        	}

        	System.out.println("\nPaís      	Mes1	Mes2   Mes3	Mes4   Promedio");
        	for (int i = 0; i < cantidad; i++) {
			System.out.print(paises[i] + "          ");
            		for (int j = 0; j < 4; j++) {
                		System.out.print(temperaturas[i][j] + "     ");
            		}
            		System.out.println(promedio[i]);
        	}

	sc.close();
    	}
}