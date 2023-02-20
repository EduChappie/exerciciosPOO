package calculadora;
import java.util.Scanner;

public class Tabuada {
	
	void calc(Scanner sc) {
		System.out.print("Digite O número: ");
		float num = sc.nextFloat();
		System.out.print("Qual o tamanho da Tabuada vc deseja?:(número inteiro) ");
		int qt = sc.nextInt();
		
		for (int i = 1; i <= qt; i++) {
			System.out.println(num+" * "+i+" = "+ (num*i));
		}
		
	}
}
