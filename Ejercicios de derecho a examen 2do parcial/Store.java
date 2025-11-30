import java.util.Scanner;
class Store{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		double venta[];
		venta=new double[7];
		double total=0;
		int diama=0;
		System.out.println("Escriba sus ventas totales de la semana");
		for(int i=0;i<=6;i++){
			System.out.println("Venta del día " +(i+1));
			venta[i]=sc.nextDouble();
			total+=venta[i];
			if (venta[i]>venta[diama])
				diama=i;
		}
		System.out.println("Total: " + total);
		System.out.println("La dia con mayor dinero fue de " + venta[diama]);
	}
}