package Exs;

public class Motocicleta extends Veiculo{

    @Override
	public void Ligar() {
		super.Ligar();
		System.out.println("A Motocicleta est� ligada!!");
	}
	public void Desligar() {
		super.Desligar();
		System.out.println("A Motocicleta est� desligada!!");
	}
}
