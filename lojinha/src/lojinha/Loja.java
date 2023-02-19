package lojinha;

public class Loja {
	public static void main(String args[]) {
		// Definição do Banco
		Carteira cofre = new Carteira();
		cofre.dinheiro = (float) 10.50;
		
		//Definição do Estoque
		Estoque bolo = new Estoque();
		bolo.valor = (float) 9.99;
		bolo.bolos_quant = 5;
		
		bolo.status();
		cofre.status();
		
		cofre.venda(bolo, 4);
		cofre.venda(bolo, 2);
		cofre.venda(bolo, 1);
	}
}
