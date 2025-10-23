import java.util.Scanner;
 class PayrollCalculation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	double pagof=0;

		System.out.println("Escriba la categoría del empleado:");
		System.out.println("1. Empleado que ganan $20,000");
		System.out.println("2. Empleado que ganan $15,000");
		System.out.println("3. Empleado que ganan $10,000");
		System.out.println("4. Empleado que ganan $7,500");
		System.out.print("Escriba cuanto gana su empleado por hora: ");
		int categoria=sc.nextInt();
		System.out.print("Escriba las horas trabajadas durante el mes: ");
		int horas=sc.nextInt();

			switch (categoria){
				case 20000:
				{
					float pago=20000*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("El salario sera de: " +salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Dado que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual" ); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
	
				}
				break;
				case 15000:
				{
					float pago=15000*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("El salario sera de:" +salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Dado que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual" ); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
	
				}
				break;
				case 10000:
				{
					float pago=10000*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("El salario sera de: " +salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Dado que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual" ); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
	
				}
				break;
				case 7500:
				{
					float pago=7500*horas;
					double descontar=pago*0.072;
					double salariobruto=pago-descontar;
					System.out.println("El salario sera de: " +salariobruto);
					if (salariobruto<1000000)
					{
						System.out.println("Dado que su salario no supero el Millon de pesos se le dara un 15% mas sobre su salario mensual" ); 
						pagof=(categoria*1.15)+salariobruto;
					}else
						pagof=pago;
				}
				break;


			}
						System.out.print("El pago neto que recibira sera de: " +pagof );
	sc.close();
	}
}
		