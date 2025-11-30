import java.util.Scanner;
class Search{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		int i=0, busc=0;
		int[] num=new int[8];

		System.out.println ("escriba sus números");
		do{
			System.out.print((i+1) + ".- ");
			num[i]=sc.nextInt();
			i++;
		}while(i<=7);
		
		System.out.println("Buscar");
		busc=sc.nextInt();
	
		if(busc==num[i]){
			System.out.println("El número está dentro del arreglo");
		}
		else{
			System.out.println("El número no está dentro del arreglo");
		}
	}
}