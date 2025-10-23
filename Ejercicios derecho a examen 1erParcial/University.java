import java.util.Scanner;
 class University{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

		System.out.println("Escriba su calificación es escala del 0 al 5");
		double cal=sc.nextDouble();
		if (cal <=1 && cal==0){
			System.out.println("Su calificación es pésima: " +cal);	
		}else 
			if (cal >1 && cal<=2){
				System.out.println("Su calificación es mala: " +cal);	
			}else 	
				if (cal >2 && cal<=2.9){
					System.out.println("Su calificación es regular: " +cal);	
				}else 
					if (cal >2.9 && cal<=4){
						System.out.println("Su calificación es buena: " +cal);	
					}else 
						if (cal >4.1 && cal<=5){
							System.out.println("Su calificación es excelente: " +cal);	
						}

	}
}