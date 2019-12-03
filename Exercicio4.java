import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
	
		int i = 0,a[];
		int maior=0, menor = 1000000, aux;
		a = new int [10];

		for(i=0;i<10;i++) {
			System.out.println("Insira um valor:");
			a [i]=user.nextInt();
			aux= a[i];
			if (menor>aux) {
				menor=a[i];
			}
			if(maior<aux) {
				maior=a[i];
			}
		}
		System.out.println("O maior número digitado foi :"+maior+" e o menor número foi :"+menor );
		user.close();
	}

}
