package calculadora;
import java.util.Scanner;

public class TwoNumbers {
	
	float n1, n2;
	
	void calc(Scanner sc) {
		
		System.out.print("Digite o 1º número: ");
		float n1 = sc.nextFloat();
		System.out.print("Digite o 2º número: ");
		float n2 = sc.nextFloat();
		
		System.out.println("-----------------------------");
		System.out.println("[+] "+n1+" + "+n2+" = "+(n1+n2));
		System.out.println("[-] "+n1+" - "+n2+" = "+(n1-n2));
		System.out.println("[*] "+n1+" * "+n2+" = "+(n1*n2));
		System.out.println("[/] "+n1+" / "+n2+" = "+(n1/n2));
		System.out.println("[%] "+n1+" % "+n2+" = "+(n1%n2));
		
	}
}
