package Ex1_2;

public class Aplicacao {

	public static void main(String[] args) {
	/* Observação: O método println() recebe um Object como parâmetro. Para imprimir a informação na
	 * tela, o Java chama o método toString() do objeto. Logo, se a classe do objeto sobrescreve o 
	 * método toString(), este método será chamada (polimorfismo)
	 */
		
		// Cria um ponto 2D
		Ponto2D p1 = new Ponto2D(10, 2);
		
		// Imprimir p1
		System.out.println(p1);
		
		// Cria um ponto 3D
		Ponto3D p2 = new Ponto3D(5, 2, 1);
		
		// Imprimir p2
		System.out.println(p2);
	}
}
