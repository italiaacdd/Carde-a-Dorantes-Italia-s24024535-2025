import java.util.Scanner;
class Multiplications{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		char eleccion='s';
		do{
			System.out.println("Escriba el número que quiere multiplicar:");
			double num=sc.nextDouble();
			for(int i=1;i<11;i++){
				System.out.println((num*i));
			}
			System.out.println("¿Quiere saber alguna otra tabla? Si sí, escriba S y si no, escriba N");
			eleccion=sc.next().charAt(0);

		}while(eleccion=='S' || eleccion=='s');
	}
}

