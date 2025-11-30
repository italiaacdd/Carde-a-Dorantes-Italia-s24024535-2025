import java.util.Scanner;

public class Ropa{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas prendas deseas registrar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] prenda = new String[n];
        double[] precio = new double[n];
        int[] vendidos = new int[n];
        double[] ingreso = new double[n];

        System.out.println("\nRegistro de prendas");
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre de la prenda " + (i + 1) + ": ");
            prenda[i] = sc.nextLine();

            System.out.print("  Precio unitario: ");
            precio[i] = sc.nextDouble();

            System.out.print("  Unidades vendidas: ");
            vendidos[i] = sc.nextInt();

            ingreso[i] = precio[i] * vendidos[i];
            sc.nextLine();
            System.out.println();
        }

        // Tabla
        System.out.println("\nPrenda        Precio    Vendidos     Ingreso");
        for (int i = 0; i < n; i++) {
            System.out.print(prenda[i] + "    ");
            System.out.print(precio[i] + "       ");
            System.out.print(vendidos[i] + "          ");
            System.out.println(ingreso[i]);
        }

        sc.close();
    }
}