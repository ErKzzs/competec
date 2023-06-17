package Exs;

public class Automovel extends Veiculo {

	@Override
	public void Ligar() {
		super.Ligar();
		System.out.println("O autom�vel est� ligado!!");
	}
	public void Desligar() {
		super.Desligar();
		System.out.println("O autom�vel est� desligado!!");
	}
}
