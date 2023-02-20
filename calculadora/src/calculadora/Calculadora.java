package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		TwoNumbers event1 = new TwoNumbers();
		Tabuada event2 = new Tabuada();
		
		Scanner scanner = new Scanner(System.in);
		int answer1;
		
		while (true) {
			System.out.println("-----------------------------");
			System.out.println(" O que você deseja fazer?");
			System.out.println(" [1] Calculos entre dois números");
			System.out.println(" [2] Tabuada ");
			answer1 = scanner.nextInt();
			
			if (answer1 == 1) { // Direcionando para área do (evento 1)
				event1.calc(scanner);
				
			} else if (answer1 == 2) { // Área de (evento 2)
				
				event2.calc(scanner);
			}
			
		}
		
	}

}
