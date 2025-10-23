import java.util.Scanner;
 class Coefficients{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	double A=0.0, B=0.0, C=0.0;

		System.out.println("Escriba el primer número:");
		A=sc.nextDouble();
		System.out.println("Escriba el segundo coeficiente:");
		B=sc.nextDouble();
		System.out.println("Escriba el tercer coeficiente:");
		C=sc.nextDouble();
		
		if (A==0){
			System.out.println("Error: el coeficiente A es 0. La ecuación no es cuadrática");
		} else {
		double discriminante=((B*B) -(4*A*C));
			System.out.println("El discriminante es: " +discriminante);	
		if (discriminante < 0){
			System.out.println("Error. El discriminante es negativo. Las raíces son imaginarias");
		} else {
		double raiz1, raiz2;
		
		raiz1=(-B +Math.sqrt(discriminante))/(2*A);
		raiz2=(-B -Math.sqrt(discriminante))/(2*A);
			System.out.println("La ecuación tiene raíces reales");
			System.out.println("Raiz1 (*1): " +raiz1);
			System.out.println("Raiz2 (*2): " +raiz2);
			}
		}

	}
}