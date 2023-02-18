package aula01;

public class Main {
	public static void main(String[] args) {
		
		Caneta p1 = new Caneta();
		p1.modelo = "bic";
		p1.cor = "azul";
		p1.quant = 5;
		p1.tampa = true;
		
		
		p1.status();
		p1.destampar();
		p1.rabiscar("PATO");
		p1.status();
		p1.rabiscar("O.V.N.I.");
	}
}
