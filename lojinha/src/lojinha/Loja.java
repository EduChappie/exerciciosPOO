package lojinha;

public class Loja {
	public static void main(String args[]) {
		// Definição do Banco
		Carteira cofre = new Carteira();
		cofre.dinheiro = (float) 10.50;
		
		//Definição do Produto que estará no estoque
		Estoque prod1 = new Estoque(); // Criação da Coca-cola
		prod1.nome = "Coca-cola";
		prod1.valor = (float) 10.50;
		prod1.quant = 4;
		
		Estoque prod2 = new Estoque(); // Criação da Pizza
		prod2.nome = "Pizza";
		prod2.valor = (float) 34.50;
		prod2.quant = 10;
		
		
		
		// Console de execução *testes*
		prod1.status();
		prod2.status();
		cofre.status();
		
		cofre.venda(prod1, 2);
		cofre.venda(prod2, 5);
		cofre.venda(prod1, 3);
		
	}
}
