import java.util.Arrays;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int i = 0,a[],b[],c[];
		int j=0;
		int l = 0;
		a = new int [10];
		b = new int [10];
		c = new int [10];

		for (i=0; i < a.length; i++) 
        {
	           System.out.print("Insira o "+ (i+1) + "� n�mero: "); 
	           a[i] = (user.nextInt());
	           b[i]=a[i];
	       }
        // Coloca o Array em ordem crescente
        Arrays.sort(b);
        
               System.out.print("Ordem crescente:    "); 
     	  for ( j = 0; j < b.length; j++) {
     		System.out.print(b[j]+ "  ");       
     		
     		c[j]=b[j];
		  }
     	 System.out.println("");
     	  System.out.print("Ordem decrescente:  ");
     	 for ( l = 9; l > -1; l--) {
      		System.out.print(c[l]+ "  ");       
      		
 		  }
     	 user.close();
     	
	}
}