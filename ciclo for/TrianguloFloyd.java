import java.util.Scanner;
class TrianguloFloyd{
    	public static void main(String args[]){
    	Scanner s=new Scanner(System.in);

    		System.out.println("Escriba cuantas líneas quiere de altura:");
    		int n=s.nextInt();

		for(int i=1;i<=n;i++){
       			 for(int j=1;j<=i;j++){
            			System.out.print((i*(i-1))/2+j+" ");
        		}
		System.out.println();
    		}
	}
}