package lojinha;

public class Estoque {
	
	float valor;
	int bolos_quant;
	
	void status() {
		System.out.println("Estoque de bolo: " + this.bolos_quant + " bolos;");
		System.out.println("O valor da unidade é: R$ " + this.valor + ";");
		System.out.println("#################");
	}
	
	// Adição e remoção de produtos 
	void add(int qtProdut, String tipo) {
		if (tipo == "venda") {// removendo
			this.bolos_quant = this.bolos_quant - qtProdut;
			
		} else if (tipo == "saida") { // adicionando
			this.bolos_quant = this.bolos_quant + qtProdut;
		}
	}
	
	
}
