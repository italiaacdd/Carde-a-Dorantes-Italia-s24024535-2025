import java.util.Scanner;
 class Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

		System.out.println("Escriba el  número que quiere saber si es par o no: ");
		double num=sc.nextDouble();
		if (num %2 ==0){
			System.out.println("Su número es par");
		}else
			System.out.println("Su número es impar");
	}
}
