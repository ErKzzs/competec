package desafios.loop;
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int cont = 0;
        String senha;
        String senhaValida;

        System.out.println("Digite sua senha");
        senhaValida = scn.nextLine();

        while (cont == 0) {

            System.out.print("Digite uma senha : ");
            senha = scn.nextLine();

            if (senha.equals (senhaValida)) {

                System.out.println("\nAcesso Permitido");
                cont ++;
            }
            else {

                System.out.println();
                System.out.println("Senha inválida");
            }
        }

        scn.close();
    }
}
