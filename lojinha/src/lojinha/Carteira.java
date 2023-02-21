package lojinha;

public class Carteira {
	
	private float dinheiro;
	
	public void status() {
		System.out.println("Carteira da loja: R$ " + this.dinheiro);
		System.out.println("#################");
	}
	
	public void compra(Estoque prod, int qtd) {
		this.trade("saida", (qtd*2.0f));
		prod.add(qtd, "compra");
	}
	public void venda(Estoque prod, int qtd) {
		
		if (qtd > prod.quant) {
			System.out.println("Não temos tudo isso de "+prod.nome+" :(");
		} else {
			System.out.println("Foi comprado: "+qtd+" "+prod.nome);
			this.trade("entrada", (qtd*prod.valor));
			prod.add(qtd, "venda");
		}
		
	}
	
	private void trade(String action, float $) {
		// Parte de "trade" de tirar e por o dinheiro
		if (action == "entrada") {
			System.out.println("Valor total da compra: R$ " + $);
			this.dinheiro = this.dinheiro + $;
			System.out.println("-");
			
		} else if (action == "saida") {
			this.dinheiro = this.dinheiro - $;
		}
	}
}
