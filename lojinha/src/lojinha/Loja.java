package lojinha;

public class Loja {
	public static void main(String args[]) {
		// Definição do Banco
		Carteira cofre = new Carteira();
		
		//Definição do Produto que estará no estoque
		Estoque prod1 = new Estoque(); // Criação da Coca-cola
		prod1.nome = "coxinha";
		prod1.valor = (float) 5;
		cofre.compra(prod1, 4);
		
		Estoque prod2 = new Estoque(); // Criação da Pizza
		prod2.nome = "Pizza";
		prod2.valor = (float) 34.50;
		prod2.add(10, "saida");
		cofre.compra(prod2, 10);
		
		
		
		// Console de execução *testes*
		prod1.status();
		prod2.status();
		cofre.status();
		
		cofre.venda(prod1, 2);
		cofre.venda(prod2, 5);
		cofre.venda(prod1, 2);
		cofre.venda(prod1, 1);
		
		cofre.status();
		
	}
}
