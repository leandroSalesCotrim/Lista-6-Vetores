import java.util.Scanner;
public class Exercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner (System.in);
		int aux=2,c=0,i=0,a[];
		a = new int[10];
		
		
		for(i=0; i<a.length; i++) {
			System.out.println("Insira o " +(i+1)+ "�  valor");
			a[i]=user.nextInt();
			
			if (a[i]% aux ==0 && aux < a[i]) {
				System.out.println("o n�mero "+a[i]+" n�o � primo");
			}else {
				System.out.println("o n�mero "+a[i]+"  � primo");
				c++;
			}
		}
		System.out.println("A quantidade de n�meros primos encontrados foi de :"+c);
		user.close();
		
	}
}