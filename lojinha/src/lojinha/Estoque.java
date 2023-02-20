package lojinha;

public class Estoque {
	
	String nome;
	float valor;
	int quant;
	
	void status() {
		System.out.println("Estoque: ");
		System.out.println("  - "+this.nome+": "+this.quant+" unidades");
		System.out.println("  - Valor: R$ "+this.valor);
		System.out.println("#################");
	}
	
	// Adição e remoção de produtos 
	void add(int qtProdut, String tipo) {
		if (tipo == "venda") {// removendo
			this.quant = this.quant - qtProdut;
			
		} else if (tipo == "saida") { // adicionando
			this.quant = this.quant + qtProdut;
		}
	}
	
	
}
