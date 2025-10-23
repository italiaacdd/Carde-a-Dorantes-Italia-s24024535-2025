import java.util.Scanner;
 class Sales{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	double totalComision=0.0, ComisionVentaActual;
	
	System.out.println("Venta número 1:");
	System.out.println("Ingrese el valor de la venta 1: ");
	double venta1=sc.nextDouble();
	if (venta1  <= 10000000) {
		ComisionVentaActual=(venta1*0.02);
	} else if (venta1  <= 10000000 && venta1 < 15000000) {
		ComisionVentaActual=(venta1*0.04);
	} else { // venta1  <= 15000000 
		ComisionVentaActual=(venta1*0.10);
	}
	totalComision=(totalComision+ComisionVentaActual);
	System.out.println("Comisioón venta1: "+ComisionVentaActual);

	System.out.println("Venta número 2:");
	System.out.println("Ingrese el valor de la venta 2: ");
	double venta2=sc.nextDouble();
	if (venta2  <= 10000000) {
		ComisionVentaActual=(venta2*0.02);
	} else if (venta2  <= 10000000 && venta1 < 15000000) {
		ComisionVentaActual=(venta2*0.04);
	} else { // venta2  <= 15000000 
		ComisionVentaActual=(venta2*0.10);
	}
	totalComision=(totalComision+ComisionVentaActual);
	System.out.println("Comisioón venta2: "+ComisionVentaActual);

	System.out.println("Venta número 3:");
	System.out.println("Ingrese el valor de la venta 3: ");
	double venta3=sc.nextDouble();
	if (venta3  <= 10000000) {
		ComisionVentaActual=(venta3*0.02);
	} else if (venta3  <= 10000000 && venta1 < 15000000) {
		ComisionVentaActual=(venta3*0.04);
	} else { // venta3  <= 15000000 
		ComisionVentaActual=(venta3*0.10);
	}
	totalComision=(totalComision+ComisionVentaActual);
	System.out.println("Comisioón venta3: "+ComisionVentaActual);

	System.out.println("Venta número 4:");
	System.out.println("Ingrese el valor de la venta 4: ");
	double venta4=sc.nextDouble();
	if (venta2  <= 10000000) {
		ComisionVentaActual=(venta4*0.02);
	} else if (venta4 <= 10000000 && venta1 < 15000000) {
		ComisionVentaActual=(venta4*0.04);
	} else { // venta4  <= 15000000 
		ComisionVentaActual=(venta4*0.10);
	}
	totalComision=(totalComision+ComisionVentaActual);
	System.out.println("Comisioón venta4: "+ComisionVentaActual);

	System.out.println("el vendedror ganó un total por las 4 ventas: " +totalComision);


	}
}