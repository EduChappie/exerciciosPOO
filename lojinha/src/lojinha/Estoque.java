package lojinha;

public class Estoque {
	
	public String nome;
	public float valor;
	protected int quant;
	
	public void status() {
		System.out.println("Estoque: ");
		System.out.println("  - "+this.nome+": "+this.quant+" unidades");
		System.out.println("  - Valor: R$ "+this.valor);
	}
	
	// Adição e remoção de produtos 
	void add(int qtProdut, String tipo) {
		if (tipo == "venda") {// removendo	
			this.quant = this.quant - qtProdut;
			
		} else if (tipo == "compra") { // adicionando
			this.quant = this.quant + qtProdut;
		}
	}
	
	
}
