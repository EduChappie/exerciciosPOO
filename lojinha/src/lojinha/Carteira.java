package lojinha;

public class Carteira {
	
	float dinheiro;
	
	void status() {
		System.out.println("Carteira da loja: R$ " + this.dinheiro);
		System.out.println("#################");
	}
	
	void venda(Estoque stock, int qtBuy) {
		if (stock.quant >= qtBuy) { // Verificando se tem a quantidade suficiente
			
			// Efetudo a compra e tirada do estoque
			stock.add(qtBuy, "venda");
			this.trade("entrada", (qtBuy*stock.valor));
			System.out.println(stock.nome+" vendidos: " + qtBuy);			
			
		} else {
			System.out.println("Não temos tudo isso de "+stock.nome+" :(");
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
