import java.util.Scanner;
class Emplooyes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba a sus 4 trabajadores: ");
        int total = sc.nextInt();
        sc.nextLine(); 

        String[] empNombre = new String[total];
        double[][] ingresos = new double[total][3];
        double[] acumulado = new double[total];

        System.out.println("\nRegistro de empleados");
        for (int i = 0; i < total; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            empNombre[i] = sc.nextLine();

            double suma = 0;
            for (int mes = 0; mes < 3; mes++) {
                System.out.print("  Sueldo mes " + (mes + 1) + ": ");
                ingresos[i][mes] = sc.nextDouble();
                suma += ingresos[i][mes];
            }
            acumulado[i] = suma;
            sc.nextLine();
            System.out.println();
        }

        System.out.println("\nEmpleado	      Mes1   Mes2   Mes3   Total");
        for (int i = 0; i < total; i++) {
            System.out.print(empNombre[i] + "   ");
            for (int m = 0; m < 3; m++) {
                System.out.print(ingresos[i][m] + "   ");
            }
            System.out.println(acumulado[i]);
        }

        sc.close();
    }
}