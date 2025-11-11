import java.util.Scanner;
class Secuencias{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Escriba número entero positivo: ");
        int n = sc.nextInt();
        System.out.println("Escriba la potencia de dicho número");
        int potencia = sc.nextInt();

        System.out.println("La potencia de " +n +" desde " +n+ "^0 hasta "+n+"^" + n + " es:");

        for (int i = 1; i <= potencia; i++) {
            System.out.println(n+"^" + i + " = " + Math.pow(n, i));

        }
        sc.close();
    }
}