package aula02;

public class Main {

	public static void main(String[] args) {
		Canetaprivada c1 = new Canetaprivada();
		c1.modelo = "bick";
		c1.cor = "red";
		
		//c1.tampa = true; => não é póssivel alterar, pois ela é private
		c1.status();
		c1.rabiscar();
		//mas...
		c1.tampar();
		c1.rabiscar();
	}

}
