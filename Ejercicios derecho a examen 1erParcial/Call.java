import java.util.Scanner;
 class Call{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int costo;
		System.out.println("Escriba en números el tiempo que duró su llamada");
		int min=sc.nextInt();
		if (min<=3)
			System.out.println("Su llamada tendrá un costo de $10");
		else{
			costo=10 +(min-3);
			System.out.println("Su llamada tendrá un cobro de $" +costo );
		}
	}
}