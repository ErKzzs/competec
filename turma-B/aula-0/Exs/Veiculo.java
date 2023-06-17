package Exs;

public class Veiculo {

	private boolean ligado;
	
	public void Ligar() {
		this.ligado = true;
	}
	
	public void Desligar() {
		this.ligado = false;
	}
	
	public void isLigado() {
		if(ligado == true) System.out.println("Est� ligado!");
		if(ligado == false) System.out.println("Est� desligado!");
	}
}