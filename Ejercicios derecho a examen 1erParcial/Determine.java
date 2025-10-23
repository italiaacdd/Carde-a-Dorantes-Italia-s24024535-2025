import java.util.Scanner;
class Determine{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		double menor=0;

		System.out.print("Escriba los tres valores a evaluar: ");
		System.out.println("");
		System.out.print("Escriba el primer valor: ");
		double Num1=sc.nextDouble();
		System.out.print("Escriba el segundo valor: ");
		double Num2=sc.nextDouble();
		System.out.print("Escriba el tercer valor:");
		double Num3=sc.nextDouble();

		if (Num1==Num2&&Num2==Num3)
			System.out.println("Los tres valores son iguales");
		else{
			if (Num1>Num2&&Num1>Num3)
				System.out.println("El numero " + Num1 + " es el mayor");
			else{
				if (Num2>Num1&&Num2>Num3)
					System.out.println("El numero " + Num2 + " es el mayor");
				else
					System.out.println("El numero " + Num3 + " es el mayor");
				//Calcular el numero menor
				if (Num1<=Num2&&Num1<Num3)
					menor=Num1;
				else{
					if (Num2<Num1&&Num2<Num3)
						menor=Num2;
					else
						menor=Num3;
				}
			}
		}

		System.out.println("El numero menor es " + menor);

		double promedio=(Num1+Num2+Num3)/3;
		System.out.println("El promedio de los números es: " + promedio);
	}
}