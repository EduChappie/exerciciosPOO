package aula01;

public class Caneta {
	
	// Criação dos Atributos
	String modelo;
	String cor;
	int quant;
	boolean tampa;
	
	
	// Parte dos metodos
	
	void status() { // Mostrar informações sobre o objeto
		System.out.println("############");
		System.out.println("Modelo " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Quantidade: " + this.quant);
		System.out.println("Tampa: " + this.tampa);
		System.out.println("############");
	}
	
	
	void destampar() { // Destampar e tampar a caneta
		if (this.tampa) {
			System.out.println("Destampado!");
			this.tampa = false;
		} else {
			System.out.println("Tampado!");
			this.tampa = true;
		}
	}
	
	
	void rabiscar(String draw) {
		if (this.tampa) {
			System.out.println("A caneta está tampada, não posso desenhar!");
			
		} else {
			
			if (this.quant >= 5) {
				System.out.println("*desenhou um " + draw);
				this.quant = this.quant - 5;
				
			} else {
				System.out.println("Não tem mais tinta :-(");
			}
		}
	}
	
	
}
