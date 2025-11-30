import java.util.Scanner;
public class Atletas{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        System.out.print("¿Cuántos atletas deseas registrar? ");
        cantidad = sc.nextInt();
        sc.nextLine();

        String[] nom = new String[cantidad];
        String[] ape = new String[cantidad];
        String[] esp = new String[cantidad];
        double[] marca = new double[cantidad];

        System.out.println("\nRegistro de atletas");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nom[i] = sc.nextLine();

            System.out.print("Apellido " + (i + 1) + ": ");
            ape[i] = sc.nextLine();

            System.out.print("Especialidad " + (i + 1) + ": ");
            esp[i] = sc.nextLine();

            System.out.print("Tiempo: ");
            marca[i] = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("");
        }

        System.out.println("\nNombre      Apellido      Especialidad      Tiempo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(
                nom[i] + "      " +
                ape[i] + "      " +
                esp[i] + "      " +
                marca[i]
            );
        }

        sc.close();
    }
}