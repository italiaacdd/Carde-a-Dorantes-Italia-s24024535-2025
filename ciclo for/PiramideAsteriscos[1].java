import java.util.Scanner;
class PiramideAsteriscooss{
    	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
       	 	int filas = 0;

		System.out.println("Escriba cuantas líneas quieres de altura para su piramide:");
		filas=sc.nextInt();

		for (int i = 1; i <= filas; i++) {
			for (int j = filas; j > i; j--) {
			System.out.print(" ");
            		}

			for (int k = 1; k <= (2 * i - 1); k++) {
			System.out.print("*");
			}
			System.out.println("");
        	}
    	}
}