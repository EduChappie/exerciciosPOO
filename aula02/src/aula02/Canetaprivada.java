package aula02;

public class Canetaprivada {
	public String modelo;
	public String cor;
	private boolean tampa;
	
	
	public void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Tampa: "+ this.tampa);
	}
	
	
	public void tampar() {
		if (this.tampa) {
			this.tampa = false;
		} else {
			this.tampa = true;
		}
	}
	
	public void rabiscar() {
		if (this.tampa) {
			System.out.println("ERRO, a caneta está tampada!");
		} else {
			System.out.println("**rabiscando");
		}
	}
}
