import java.util.Scanner;
 class NumberC{
    	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

		int num;
		System.out.println("Ingrese un número");
		num=sc.nextInt();
		if (num<=1)
			System.out.println("El número no es primo");
		else{
			if (num%2==0)
				System.out.println("El número  no es primo");
		else
			if (num%num==0 || num%1==0)
				System.out.println("El número es primo");
		}
	}
}
