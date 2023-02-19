package lojinha;

public class Carteira {
	
	float dinheiro;
	
	void status() {
		System.out.println("Carteira da loja: R$ " + this.dinheiro);
		System.out.println("#################");
	}
	
	void venda(Estoque stock, int qtBolo) {
		if (stock.bolos_quant >= qtBolo) { // Verificando se possui bolo suficiente
			
			// Efetudo a compra e tirada do estoque
			stock.add(qtBolo, "venda");
			this.trade("entrada", (qtBolo*stock.valor));
			System.out.println("Bolos vendidos: " + qtBolo);			
			
		} else {
			System.out.println("Não temos tudo isso de bolo :(");
		}
		// Mostrar informações após a venda
		stock.status();
		this.status();
	}
	
	void trade(String action, float $) {
		// Parte de "trade" de tirar e por o dinheiro
		if (action == "entrada") {
			System.out.println("Valor total da compra: R$ " + $);
			this.dinheiro = this.dinheiro + $;
			
		} else if (action == "saida") {
			this.dinheiro = this.dinheiro - $;
		}
	}
}
