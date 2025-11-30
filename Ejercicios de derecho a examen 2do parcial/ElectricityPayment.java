import java.util.Scanner;
class ElectricityPayment{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	char otroserv='s';
	int eleccion;

		do{
			System.out.println("Bienvenido al cajero automático de pago de energía eléctrica");
			System.out.println("A continuación, nuestro meú de opciones:");
			System.out.println("1. Consulta");
			System.out.println("2. Pago del mes");
			System.out.println("3. Pago de adeudo");
			System.out.println("4. Salir");
			eleccion=sc.nextInt();

			switch (eleccion){
				case 1:
					System.out.println("Sección de Consulta:");
					System.out.println("");
					System.out.println("Usted tiene un adeudo de $1,000.00");
				break;
				case 2: 
					System.out.println("Pago del mes");
					System.out.println("");
					System.out.println("Su pago mensual es de $1,000.00 pero, tiene un adeudo de $1,000.00, su total a pagar es de $2,000.00");
				break;
				case 3:
					System.out.println("Pago de adeudo");
					System.out.println("");
					System.out.println("Su adeudo es de $1,000.00, pero se le cobrará un recargo por atraso de $250. Su total a pagar es de $1,250.00 ");
				break;
				case 4:
					System.out.println("Salir");
					otroserv='n';
				break;
				default:
					System.out.println("Gracias por utilizar nuestro cajero. Vuelva pronto.");
				break;
				}
				if(eleccion!=4){
					System.out.println("¿Desea continuar con otro servicio? Si sí, escriba S y si no, escriba N.");
					otroserv=sc.next().charAt(0);
				}
			}while(otroserv=='S' || otroserv=='s');
			System.out.println("Hasta luego");
	sc.close();
	}
}
